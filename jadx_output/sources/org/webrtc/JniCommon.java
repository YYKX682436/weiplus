package org.webrtc;

/* loaded from: classes14.dex */
public class JniCommon {
    public static native void nativeAddRef(long j17);

    public static native java.nio.ByteBuffer nativeAllocateByteBuffer(int i17);

    public static native void nativeFreeByteBuffer(java.nio.ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j17);
}
