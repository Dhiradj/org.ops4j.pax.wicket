/**
 * Copyright OPS4J
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.wicket.test;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.ops4j.pax.wicket.api.PaxWicketBean;

/**
 * Very simple example page to validate if injection for spring and blueprint works as expected.
 */
public class ExamplePage extends WebPage {

    @PaxWicketBean
    private TestInjectionBean test;

    public ExamplePage() {
        super();
        add(new Label("test", test.getContent()));
    }

    public static class TestInjectionBean {
        private String content;

        public TestInjectionBean() {
        }

        public TestInjectionBean(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

    }

}
