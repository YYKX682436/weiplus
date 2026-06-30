package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagTextLayer extends com.tencent.mm.rfx.RfxPagLayer {
    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    public RfxPagTextLayer(long j17) {
        super(j17);
    }

    private static native void nativeInit();

    private native void setFont(java.lang.String str, java.lang.String str2);

    public native int fillColor();

    public native com.tencent.mm.rfx.RfxPagFont font();

    public native float fontSize();

    public native void reset();

    public native void setFillColor(int i17);

    public void setFont(com.tencent.mm.rfx.RfxPagFont rfxPagFont) {
        setFont(rfxPagFont.fontFamily, rfxPagFont.fontStyle);
    }

    public native void setFontSize(float f17);

    public native void setStrokeColor(int i17);

    public native void setText(java.lang.String str);

    public native int strokeColor();

    public native java.lang.String text();
}
