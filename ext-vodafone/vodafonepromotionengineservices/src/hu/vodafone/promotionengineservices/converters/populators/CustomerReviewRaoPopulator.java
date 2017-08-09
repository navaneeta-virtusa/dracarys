package hu.vodafone.promotionengineservices.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.ruleengineservices.rao.ProductRAO;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import hu.vodafone.ruleengineservices.rao.CustomerReviewRAO;
import org.springframework.beans.factory.annotation.Required;

public class CustomerReviewRaoPopulator implements Populator <CustomerReviewModel, CustomerReviewRAO> {

    private Converter <ProductModel, ProductRAO> productConverter;

    @Override

    public void populate(CustomerReviewModel source, CustomerReviewRAO target) throws ConversionException {
        target.setProduct(productConverter.convert(source.getProduct()));
    }


    public Converter<ProductModel, ProductRAO> getProductConverter() {
        return productConverter;
    }

    @Required
    public void setProductConverter(Converter<ProductModel, ProductRAO> productConverter) {
        this.productConverter = productConverter;
    }

}
