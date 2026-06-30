package org.libpag;

/* loaded from: classes12.dex */
public abstract class VideoDecoder {
    static {
        b56.a.a("pag");
    }

    public static native void RegisterSoftwareDecoderFactory(long j17);

    public static native void SetMaxHardwareDecoderCount(int i17);
}
