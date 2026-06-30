package org.libpag;

/* loaded from: classes13.dex */
public class PAGDecoder {
    private long nativeContext;

    static {
        b56.a.a("pag");
        nativeInit();
    }

    private PAGDecoder(long j17) {
        this.nativeContext = j17;
    }

    public static org.libpag.PAGDecoder Make(org.libpag.PAGComposition pAGComposition) {
        return Make(pAGComposition, pAGComposition.frameRate(), 1.0f);
    }

    private static native long MakeFrom(org.libpag.PAGComposition pAGComposition, float f17, float f18);

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    public native boolean checkFrameChanged(int i17);

    public native boolean copyFrameTo(android.graphics.Bitmap bitmap, int i17);

    public void finalize() {
        nativeFinalize();
    }

    public android.graphics.Bitmap frameAtIndex(int i17) {
        boolean copyFrameTo;
        android.util.Pair a17 = org.libpag.a.a(width(), height(), false);
        java.lang.Object obj = a17.first;
        if (obj == null) {
            return null;
        }
        java.lang.Object obj2 = a17.second;
        if (obj2 == null || android.os.Build.VERSION.SDK_INT < 26) {
            copyFrameTo = copyFrameTo((android.graphics.Bitmap) obj, i17);
        } else {
            copyFrameTo = readFrame(i17, (android.hardware.HardwareBuffer) obj2);
            ((android.hardware.HardwareBuffer) a17.second).close();
        }
        if (copyFrameTo) {
            return (android.graphics.Bitmap) a17.first;
        }
        return null;
    }

    public native float frameRate();

    public native int height();

    public native int numFrames();

    public native boolean readFrame(int i17, android.hardware.HardwareBuffer hardwareBuffer);

    public void release() {
        nativeRelease();
    }

    public native int width();

    public static org.libpag.PAGDecoder Make(org.libpag.PAGComposition pAGComposition, float f17, float f18) {
        long MakeFrom = MakeFrom(pAGComposition, f17, f18);
        if (MakeFrom == 0) {
            return null;
        }
        return new org.libpag.PAGDecoder(MakeFrom);
    }
}
