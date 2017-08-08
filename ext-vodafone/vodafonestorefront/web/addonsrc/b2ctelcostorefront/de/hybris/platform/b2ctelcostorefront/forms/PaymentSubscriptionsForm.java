/*
* [y] hybris Platform
*
* Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
*
* This software is the confidential and proprietary information of SAP
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with SAP.
*
*/
package de.hybris.platform.b2ctelcostorefront.forms;

import java.util.List;


/**
 * Payment Subscriptions Form object.
 *
 */
public class PaymentSubscriptionsForm
{
	List<String> subscriptionsToChange;
	String newPaymentMethodId;

	public List<String> getSubscriptionsToChange()
	{
		return subscriptionsToChange;
	}

	public void setSubscriptionsToChange(final List<String> subscriptionsToChange)
	{
		this.subscriptionsToChange = subscriptionsToChange;
	}

	public String getNewPaymentMethodId()
	{
		return newPaymentMethodId;
	}

	public void setNewPaymentMethodId(final String newPaymentMethodId)
	{
		this.newPaymentMethodId = newPaymentMethodId;
	}
}
