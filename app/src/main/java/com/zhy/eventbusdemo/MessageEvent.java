package com.zhy.eventbusdemo;

import java.util.ArrayList;
import java.util.List;

public class MessageEvent {

    private List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public MessageEvent(List<Item> itemList) {
        this.itemList = itemList;
    }
}
