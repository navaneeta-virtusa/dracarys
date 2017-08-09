/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package hu.vodafone.promotionengineservices.setup;

import static hu.vodafone.promotionengineservices.constants.VodafonepromotionengineservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import hu.vodafone.promotionengineservices.constants.VodafonepromotionengineservicesConstants;
import hu.vodafone.promotionengineservices.service.VodafonepromotionengineservicesService;


@SystemSetup(extension = VodafonepromotionengineservicesConstants.EXTENSIONNAME)
public class VodafonepromotionengineservicesSystemSetup
{
	private final VodafonepromotionengineservicesService vodafonepromotionengineservicesService;

	public VodafonepromotionengineservicesSystemSetup(final VodafonepromotionengineservicesService vodafonepromotionengineservicesService)
	{
		this.vodafonepromotionengineservicesService = vodafonepromotionengineservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		vodafonepromotionengineservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return VodafonepromotionengineservicesSystemSetup.class.getResourceAsStream("/vodafonepromotionengineservices/sap-hybris-platform.png");
	}
}
