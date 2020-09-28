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

import java.io.File;
import java.util.List;

/**
 * 文件（夹）工具类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public class FileUtils {

    /**
     * 根据 文件（夹）、文件（夹）列表、是否为文件夹 递归获取所有 文件（夹）
     *
     * @param path      文件（夹）路径，根据 directory 与 当前路径对应的 文件（夹），综合判断后，会决定在 fileList 是否添加自身文件（夹）
     * @param fileList  最终结果，不为空
     * @param directory 返回结果是否包括文件（夹），true：仅包括文件夹，false：仅包括文件，空：包括文件与文件夹
     */
    public static void file(String path, List<File> fileList, Boolean directory) {

        File file = new File(path);

        add(fileList, directory, file);
    }

    /**
     * 根据 文件（夹）、文件（夹）列表、是否为文件夹 递归获取所有 文件（夹）
     *
     * @param file      文件（夹），若为文件夹，fileList 不会添加数据
     * @param fileList  最终结果，不为空
     * @param directory 返回结果是否包括文件（夹），true：仅包括文件夹，false：仅包括文件，空：包括文件与文件夹
     */
    public static void file(File file, List<File> fileList, Boolean directory) {

        // 获取文件夹下的所有文件（夹）
        File[] listFiles = file.listFiles();

        // 存在文件夹
        if (listFiles != null) {

            // 遍历文件夹
            for (File f : listFiles) {

                // 返回结果中添加文件
                add(fileList, directory, f);
            }
        }
    }

    /**
     * 根据条件将文件（夹）添加到返回结果中
     *
     * @param fileList  最终结果，不为空
     * @param directory 最终结果，不为空
     * @param file      文件（夹）
     */
    private static void add(List<File> fileList, Boolean directory, File file) {
        boolean d = file.isDirectory();

        if (directory == null) {
            // 返回结果包括文件和文件夹
            fileList.add(file);
        } else if (directory) {
            if (d) {
                // 返回结果仅包括文件夹
                fileList.add(file);
            }
        } else {
            if (!d) {
                // 返回结果仅包括文件
                fileList.add(file);
            }
        }

        file(file, fileList, directory);
    }

}
