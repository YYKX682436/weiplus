package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes.dex */
public interface BubbleGroup {
    public static final int INVALID_BUBBLE_ID = -1;

    int addBubble(com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions bubbleOptions);

    void clearBubbleGroup();

    boolean containsBubble(int i17);

    java.util.List<java.lang.Integer> getBubbleIds();

    boolean remove(int i17);

    boolean updateBubble(int i17, com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions bubbleOptions);
}
