package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class AffBizGlobalOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.AffBizGlobalOnLoader instance = new com.tencent.wechat.aff.AffBizGlobalOnLoader();

    public static com.tencent.wechat.aff.AffBizGlobalOnLoader getInstance() {
        return instance;
    }

    private native void jniOnLoader();

    public void onLoader() {
        if (initialized.compareAndSet(false, true)) {
            try {
                jniOnLoader();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }
}
