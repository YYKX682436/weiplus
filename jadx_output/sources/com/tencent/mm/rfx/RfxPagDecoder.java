package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagDecoder {
    private long nativeDecoder;

    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    private RfxPagDecoder(long j17) {
        this.nativeDecoder = j17;
    }

    public static com.tencent.mm.rfx.RfxPagDecoder Make(com.tencent.mm.rfx.RfxPagFile rfxPagFile) {
        return Make(rfxPagFile, rfxPagFile.frameRate(), 1.0f);
    }

    private static native long MakeFromScale(com.tencent.mm.rfx.RfxPagFile rfxPagFile, float f17, float f18);

    private static native long MakeFromWH(com.tencent.mm.rfx.RfxPagFile rfxPagFile, float f17, int i17, int i18);

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    public native boolean checkFrameChanged(int i17);

    public native boolean copyFrameTo(android.graphics.Bitmap bitmap, int i17);

    public void finalize() {
        nativeFinalize();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap frameAtIndex(int r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.rfx.RfxPagDecoder.frameAtIndex(int):android.graphics.Bitmap");
    }

    public native float frameRate();

    public native int height();

    public native int numFrames();

    public native boolean readFrame(int i17, android.hardware.HardwareBuffer hardwareBuffer);

    public void release() {
        nativeRelease();
    }

    public native int width();

    public static com.tencent.mm.rfx.RfxPagDecoder Make(com.tencent.mm.rfx.RfxPagFile rfxPagFile, int i17, int i18) {
        long MakeFromWH = MakeFromWH(rfxPagFile, rfxPagFile.frameRate(), i17, i18);
        if (MakeFromWH == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagDecoder(MakeFromWH);
    }

    public static com.tencent.mm.rfx.RfxPagDecoder Make(com.tencent.mm.rfx.RfxPagFile rfxPagFile, float f17, float f18) {
        long MakeFromScale = MakeFromScale(rfxPagFile, f17, f18);
        if (MakeFromScale == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagDecoder(MakeFromScale);
    }

    public static com.tencent.mm.rfx.RfxPagDecoder Make(com.tencent.mm.rfx.RfxPagFile rfxPagFile, float f17, int i17, int i18) {
        long MakeFromWH = MakeFromWH(rfxPagFile, f17, i17, i18);
        if (MakeFromWH == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagDecoder(MakeFromWH);
    }
}
