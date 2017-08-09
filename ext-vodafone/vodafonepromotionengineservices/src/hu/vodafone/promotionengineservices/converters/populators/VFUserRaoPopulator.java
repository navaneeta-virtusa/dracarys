package hu.vodafone.promotionengineservices.converters.populators;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.ruleengineservices.rao.UserRAO;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import hu.vodafone.ruleengineservices.rao.CustomerReviewRAO;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;

public class VFUserRaoPopulator implements Populator<UserModel, UserRAO> {

    private Converter<CustomerReviewModel, CustomerReviewRAO> customerReviewsConverter;

    @Override
    public void populate(UserModel source, UserRAO target) throws ConversionException {
        target.setCustomerReviews(new ArrayList<>(Converters.convertAll(source.getCustomerReviews(), getCustomerReviewsConverter())));
    }

    public Converter<CustomerReviewModel, CustomerReviewRAO> getCustomerReviewsConverter() {
        return customerReviewsConverter;
    }

    @Required
    public void setCustomerReviewsConverter(Converter<CustomerReviewModel, CustomerReviewRAO> customerReviewsConverter) {
        this.customerReviewsConverter = customerReviewsConverter;
    }
}
