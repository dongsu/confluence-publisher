/*
 * Copyright 2016 the original author or authors.
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

package org.sahli.confluence.publisher.metadata;

import org.sahli.confluence.publisher.support.RuntimeUse;

import java.util.List;

import static java.util.Collections.emptyList;

/**
 * @author Alain Sahli
 * @since 1.0
 */
public class ConfluencePage {

    private String title;
    private String contentFilePath;
    private List<ConfluencePage> children;
    private List<String> attachments;

    public String getTitle() {
        return this.title;
    }

    @RuntimeUse
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentFilePath() {
        return this.contentFilePath;
    }

    @RuntimeUse
    public void setContentFilePath(String contentFilePath) {
        this.contentFilePath = contentFilePath;
    }

    public List<ConfluencePage> getChildren() {
        if (this.children == null) {
            return emptyList();
        } else {
            return this.children;
        }
    }

    @RuntimeUse
    public void setChildren(List<ConfluencePage> children) {
        this.children = children;
    }

    public List<String> getAttachments() {
        if (this.attachments == null) {
            return emptyList();
        } else {
            return this.attachments;
        }
    }

    @RuntimeUse
    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }
}