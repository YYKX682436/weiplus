package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagSolidLayer extends com.tencent.mm.rfx.RfxPagLayer {
    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    public RfxPagSolidLayer(long j17) {
        super(j17);
    }

    private static native void nativeInit();

    public native void setSolidColor(int i17);

    public native int solidColor();
}
