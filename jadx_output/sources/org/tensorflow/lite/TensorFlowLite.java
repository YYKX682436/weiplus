package org.tensorflow.lite;

/* loaded from: classes13.dex */
public final class TensorFlowLite {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f347867a;

    public static void a() {
        if (f347867a) {
            return;
        }
        try {
            nativeRuntimeVersion();
            f347867a = true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            throw new java.lang.UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():");
        }
    }

    public static native java.lang.String nativeRuntimeVersion();

    public static native java.lang.String nativeSchemaVersion();
}
