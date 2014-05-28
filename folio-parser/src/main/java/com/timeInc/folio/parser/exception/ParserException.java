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
package com.timeInc.folio.parser.exception;

/**
 * Thrown to indicate that there was a problem parsing a folio/article.
 */
public class ParserException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new parser exception.
	 *
	 * @param t the t
	 */
	public ParserException(Throwable t) {
		super(t);
	}
	
	/**
	 * Instantiates a new parser exception.
	 *
	 * @param message the message
	 */
	public ParserException(String message) {
		super(message);
	}
	
}
