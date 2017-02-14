/*
 * ARX: Powerful Data Anonymization
 * Copyright 2012 - 2017 Fabian Prasser, Florian Kohlmayer and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.deidentifier.arx.gui.view.impl.masking;

import org.apache.commons.math3.distribution.GeometricDistribution;
import org.deidentifier.arx.masking.variable.DiscreteDistribution;
import org.deidentifier.arx.masking.variable.Distribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DistributionCompositeGeometric extends DistributionComposite {

    public DistributionCompositeGeometric(Composite parent) {

        super(parent);

        Label l1 = new Label(parent, SWT.NONE);
        l1.setText("Probability");

        Text t1 = new Text(parent, SWT.NONE);
        t1.setText("0.2");

    }

    @Override
    public Distribution<Integer> getResultingDistribution() {

        return new DiscreteDistribution(0, 20, new GeometricDistribution(0.2));

    }

}
