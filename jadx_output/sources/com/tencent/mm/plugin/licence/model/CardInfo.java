package com.tencent.mm.plugin.licence.model;

/* loaded from: classes13.dex */
public class CardInfo {
    public byte[] bitmapData;
    public int width = 0;
    public int height = 0;
    public int bitmapLen = 0;

    public CardInfo(int i17, int i18) {
        double d17 = i17;
        this.bitmapData = new byte[(((int) (0.8d * d17)) * ((int) (d17 * 0.52d)) * 3) + 54];
    }

    public byte[] getData() {
        return this.bitmapData;
    }

    public int getHeight() {
        return this.height;
    }

    public int getSize() {
        return this.bitmapLen;
    }

    public int getWidth() {
        return this.width;
    }
}
