/*
 * $Id$
 * $Rev$
 * $Date$
 *
 * ====================================================================
 * Copyright 2001-2005 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.validator;

import junit.framework.Test;
import junit.framework.TestSuite;

/**                                                       
 * Performs Validation Test for <code>double</code> validations.
 */
public class DoubleTest extends TestNumber {

    public DoubleTest(String name) {
        super(name);
        ACTION = "double";
        FORM_KEY = "doubleForm";
    }


    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[]{DoubleTest.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(DoubleTest.class);
    }


    /**
     * Tests the double validation.
     */
    public void testDouble() throws ValidatorException {
        // Create bean to run test on.
        ValueBean info = new ValueBean();
        info.setValue("0");

        valueTest(info, true);
    }

    /**
     * Tests the double validation.
     */
    public void testDoubleMin() throws ValidatorException {
        // Create bean to run test on.
        ValueBean info = new ValueBean();
        info.setValue(new Double(Double.MIN_VALUE).toString());

        valueTest(info, true);
    }

    /**
     * Tests the double validation.
     */
    public void testDoubleMax() throws ValidatorException {
        // Create bean to run test on.
        ValueBean info = new ValueBean();
        info.setValue(new Double(Double.MAX_VALUE).toString());

        valueTest(info, true);
    }

    /**
     * Tests the double validation failure.
     */
    public void testDoubleFailure() throws ValidatorException {
        // Create bean to run test on.
        ValueBean info = new ValueBean();

        valueTest(info, false);
    }

}                                                         