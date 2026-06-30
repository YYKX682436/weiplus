package org.libpag;

/* loaded from: classes13.dex */
public class PAGSolidLayer extends org.libpag.PAGLayer {
    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGSolidLayer(long j17) {
        super(j17);
    }

    private static native void nativeInit();

    public native void setSolidColor(int i17);

    public native int solidColor();
}
