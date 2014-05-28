/*******************************************************************************
 * Copyright 2014 Time Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.timeInc.dps.producer.http.request.binding;


import com.timeInc.dps.producer.request.config.DeleteHtmlResourceConfig;
import com.timeInc.dps.producer.response.Status;

/**
 * The http metadata associated with a delete html resource request/response
 * see Adobe DPS documentation for more information.
 */
public class DeleteHtmlResourceRequest extends AbstractModifiableTicketRequest<Status> {
	private final DeleteHtmlResourceConfig config;
	
	
	/**
	 * Instantiates a new delete html resource request.
	 *
	 * @param baseAddress the base address
	 * @param ticket the ticket
	 * @param config the config
	 */
	public DeleteHtmlResourceRequest(String baseAddress, String ticket, DeleteHtmlResourceConfig config) {
		super(baseAddress, ticket);
		this.config = config;
	}
	
	/**
	 * Instantiates a new delete html resource request.
	 *
	 * @param config the config
	 */
	public DeleteHtmlResourceRequest(DeleteHtmlResourceConfig config) {
		this.config = config;
	}
	
	
	/* (non-Javadoc)
	 * @see com.timeInc.dps.http.request.HttpRequestMapper#getConfig()
	 */
	@Override
	public DeleteHtmlResourceConfig getConfig() {
		return config;
	}

	/* (non-Javadoc)
	 * @see com.timeInc.dps.http.request.HttpRequestMapper#getMethod()
	 */
	@Override
	public Method getMethod() {
		return Method.DELETE;
	}

	@Override
	protected ProducerPath getFolioPath() {
		return ProducerPath.deleteHtmlResource(config.getFolioId());
	}
}
