package org.libpag;

/* loaded from: classes13.dex */
public class PAGImageLayer extends org.libpag.PAGLayer {
    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGImageLayer(long j17) {
        super(j17);
    }

    public static org.libpag.PAGImageLayer Make(int i17, int i18, long j17) {
        long nativeMake = nativeMake(i17, i18, j17);
        if (nativeMake == 0) {
            return null;
        }
        return new org.libpag.PAGImageLayer(nativeMake);
    }

    private static native void nativeInit();

    private static native long nativeMake(int i17, int i18, long j17);

    private native void replaceImage(long j17);

    private native void setImage(long j17);

    public native long contentDuration();

    public native org.libpag.PAGVideoRange[] getVideoRanges();

    public native java.nio.ByteBuffer imageBytes();

    public void replaceImage(org.libpag.PAGImage pAGImage) {
        replaceImage(pAGImage == null ? 0L : pAGImage.nativeContext);
    }

    public void setImage(org.libpag.PAGImage pAGImage) {
        setImage(pAGImage == null ? 0L : pAGImage.nativeContext);
    }
}
