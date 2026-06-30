package com.tencent.wevision2.modules.hash;

/* loaded from: classes5.dex */
public class PDQHash {
    public int quality;
    public java.lang.String value;

    static {
        int i17 = fx5.a.f267157a;
    }

    public PDQHash(java.lang.String str, int i17) {
        this.value = str;
        this.quality = i17;
    }

    public static native com.tencent.wevision2.modules.hash.PDQHash makeFromImage(com.tencent.wevision2.base.PixelBuffer pixelBuffer, int i17);
}
