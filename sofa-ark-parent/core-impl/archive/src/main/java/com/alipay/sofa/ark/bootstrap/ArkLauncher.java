/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.ark.bootstrap;

import com.alipay.sofa.ark.spi.archive.ExecutableArchive;

/**
 * {@link AbstractLauncher} for JAR based archives. This launcher assumes that dependency jars are
 * included inside a {@code /SOFA-ARK/container/lib} directory and that application fat jar
 * are included inside a {@code /SOFA-ARK/biz/} directory and that ark plugin fat jar are included
 * inside a {@code /SOFA-ARK/plugin/} directory
 *
 * @author qilong.zql
 * @since 0.1.0
 */
public class ArkLauncher extends BaseExecutableArchiveLauncher {

    public final String SOFA_ARK_MAIN = "com.alipay.sofa.ark.container.ArkContainer";

    /**
     * 启动类
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(" hdl custom  ArkLauncher main " + args);
        new ArkLauncher().launch(args);
    }

    public ArkLauncher() {
    }

    public ArkLauncher(ExecutableArchive executableArchive) {
        super(executableArchive);
    }

    @Override
    protected String getMainClass() {
        return SOFA_ARK_MAIN;
    }
}