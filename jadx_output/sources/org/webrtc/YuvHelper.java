package org.webrtc;

/* loaded from: classes16.dex */
public class YuvHelper {
    public static void ABGRToI420(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28, int i29) {
        nativeABGRToI420(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, i28, i29);
    }

    public static void I420Copy(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28) {
        int i29 = (i27 + 1) / 2;
        int i37 = i27 * i28;
        int i38 = ((i28 + 1) / 2) * i29;
        int i39 = (i38 * 2) + i37;
        if (byteBuffer4.capacity() >= i39) {
            byteBuffer4.position(0);
            java.nio.ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i37);
            java.nio.ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i38 + i37);
            nativeI420Copy(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, slice, i27, slice2, i29, byteBuffer4.slice(), i29, i27, i28);
            return;
        }
        throw new java.lang.IllegalArgumentException("Expected destination buffer capacity to be at least " + i39 + " was " + byteBuffer4.capacity());
    }

    public static void I420Rotate(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28, int i29) {
        int i37 = i29 % 180;
        int i38 = i37 == 0 ? i27 : i28;
        int i39 = i37 == 0 ? i28 : i27;
        int i47 = (i39 + 1) / 2;
        int i48 = (i38 + 1) / 2;
        int i49 = i39 * i38;
        int i57 = i47 * i48;
        int i58 = (i57 * 2) + i49;
        if (byteBuffer4.capacity() >= i58) {
            byteBuffer4.position(0);
            java.nio.ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i49);
            java.nio.ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i57 + i49);
            nativeI420Rotate(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, slice, i38, slice2, i48, byteBuffer4.slice(), i48, i27, i28, i29);
            return;
        }
        throw new java.lang.IllegalArgumentException("Expected destination buffer capacity to be at least " + i58 + " was " + byteBuffer4.capacity());
    }

    public static void I420ToNV12(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28) {
        int i29 = (i27 + 1) / 2;
        int i37 = i27 * i28;
        int i38 = (((i28 + 1) / 2) * i29 * 2) + i37;
        if (byteBuffer4.capacity() >= i38) {
            byteBuffer4.position(0);
            java.nio.ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i37);
            nativeI420ToNV12(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, slice, i27, byteBuffer4.slice(), i29 * 2, i27, i28);
            return;
        }
        throw new java.lang.IllegalArgumentException("Expected destination buffer capacity to be at least " + i38 + " was " + byteBuffer4.capacity());
    }

    public static void copyPlane(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27) {
        nativeCopyPlane(byteBuffer, i17, byteBuffer2, i18, i19, i27);
    }

    private static native void nativeABGRToI420(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28, int i29);

    private static native void nativeCopyPlane(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27);

    private static native void nativeI420Copy(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38);

    private static native void nativeI420Rotate(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38, int i39);

    private static native void nativeI420ToNV12(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, int i29, int i37);

    public static void I420ToNV12(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, int i29, int i37) {
        nativeI420ToNV12(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, byteBuffer5, i28, i29, i37);
    }

    public static void I420Copy(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38) {
        nativeI420Copy(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, byteBuffer5, i28, byteBuffer6, i29, i37, i38);
    }

    public static void I420Rotate(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38, int i39) {
        nativeI420Rotate(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, byteBuffer5, i28, byteBuffer6, i29, i37, i38, i39);
    }
}
