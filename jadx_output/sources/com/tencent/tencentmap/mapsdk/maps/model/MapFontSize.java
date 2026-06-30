package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public enum MapFontSize {
    tiny(0, 4),
    small(1, 3),
    normal(2, 0),
    large(3, 1),
    huge(4, 2);

    private int engineCode;
    private int fontSize;

    MapFontSize(int i17, int i18) {
        this.fontSize = i17;
        this.engineCode = i18;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getValue() {
        return this.engineCode;
    }
}
