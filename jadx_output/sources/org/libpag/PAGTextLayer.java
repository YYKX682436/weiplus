package org.libpag;

/* loaded from: classes13.dex */
public class PAGTextLayer extends org.libpag.PAGLayer {
    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGTextLayer(long j17) {
        super(j17);
    }

    private static native void nativeInit();

    private native void setFont(java.lang.String str, java.lang.String str2);

    public native int fillColor();

    public native org.libpag.PAGFont font();

    public native float fontSize();

    public native void reset();

    public native void setFillColor(int i17);

    public void setFont(org.libpag.PAGFont pAGFont) {
        setFont(pAGFont.fontFamily, pAGFont.fontStyle);
    }

    public native void setFontSize(float f17);

    public native void setStrokeColor(int i17);

    public native void setText(java.lang.String str);

    public native int strokeColor();

    public native java.lang.String text();
}
