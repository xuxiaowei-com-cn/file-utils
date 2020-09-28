/*
 * Copyright 2020 the original author or authors.
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
 */
package cn.com.xuxiaowei.util;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件（夹）工具类 测试类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public class FileUtilsTests {

    /**
     * 读取文件（夹）
     */
    @Test
    public void file() {
        List<File> fileList = new ArrayList<>();

        FileUtils.file("E:\\GitHub\\Spring-MVC\\Spring-MVC-Simple-java\\src\\main\\java", fileList, null);

        for (File f : fileList) {
            System.out.println(f);
        }
    }

}
