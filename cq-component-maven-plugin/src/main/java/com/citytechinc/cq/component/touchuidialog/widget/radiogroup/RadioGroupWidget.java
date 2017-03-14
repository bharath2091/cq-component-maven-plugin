/**
 *    Copyright 2017 ICF Olson
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.citytechinc.cq.component.touchuidialog.widget.radiogroup;

import com.citytechinc.cq.component.touchuidialog.widget.AbstractTouchUIWidget;

public class RadioGroupWidget extends AbstractTouchUIWidget {

	public static final String RESOURCE_TYPE = "granite/ui/components/foundation/form/radiogroup";
	public static final String RADIO_RESOURCE_TYPE = "granite/ui/components/foundation/form/radio";

	private final String text;

	public RadioGroupWidget(RadioGroupWidgetParameters parameters) {

		super(parameters);

		text = parameters.getText();

	}

	public String getText() {
		return text;
	}
}
