package cn.com.xuxiaowei.util;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtilsTests {

    @Test
    public void file() {
        List<File> fileList = new ArrayList<>();

        FileUtils.file("E:\\GitHub\\Spring-MVC\\Spring-MVC-Simple-java\\src\\main\\java", fileList, null);

        for (File f : fileList) {
            System.out.println(f);
        }
    }

}
