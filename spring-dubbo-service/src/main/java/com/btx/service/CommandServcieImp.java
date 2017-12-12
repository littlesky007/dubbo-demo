package com.btx.service;

public class CommandServcieImp implements ICommandService{
    @Override
    public String doBusi(String name) {
        System.out.println("生产者接受到了："+name);
        return "生产者处理完成了。。。。。。";
    }
}
