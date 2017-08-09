package hu.vodafone.promotionengineservices.rao.providers;

import com.google.common.base.Preconditions;
import de.hybris.platform.ruleengineservices.rao.CartRAO;
import de.hybris.platform.ruleengineservices.rao.providers.RAOFactsExtractor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CustomerReviewRaoExtractor implements RAOFactsExtractor {

    public static final String TRIGGER_OPTION = "EXPAND_CUSTOMER_REVIEWS";

    @Override
    public Set <?> expandFact(Object fact) {
        Preconditions.checkArgument(fact instanceof CartRAO, "expected CartRAO, found " + fact.getClass());
        Set <Object> facts = new HashSet<>();
        final CartRAO cartRAO = (CartRAO) fact;
        if (Objects.nonNull(cartRAO.getUser())) {
            facts.addAll(cartRAO.getUser().getCustomerReviews());
        }
        return facts;
    }

    @Override
    public String getTriggeringOption() {
        return TRIGGER_OPTION;
    }

    @Override
    public boolean isMinOption() {
        return false;
    }

    @Override
    public boolean isDefault() {
        return true;
    }
}
