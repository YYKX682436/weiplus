package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public class NativeHandler implements com.tencent.skyline.jni.INativeHandler {
    private static final java.lang.String TAG = "NativeHandler";
    private com.tencent.skyline.jni.INativeHandler nativeHandlerProxy;

    public void checkAndPost(long j17) {
        checkAndPost(com.tencent.skyline.jni.NativeRunnable.Create(j17));
    }

    public void init(com.tencent.skyline.jni.INativeHandler iNativeHandler) {
        this.nativeHandlerProxy = iNativeHandler;
    }

    @Override // com.tencent.skyline.jni.INativeHandler
    public void checkAndPost(java.lang.Runnable runnable) {
        com.tencent.skyline.jni.INativeHandler iNativeHandler = this.nativeHandlerProxy;
        if (iNativeHandler != null) {
            iNativeHandler.checkAndPost(runnable);
        }
    }
}
