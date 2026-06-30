package com.tencent.wechat.aff.misc;

/* loaded from: classes8.dex */
public class MiscOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.misc.MiscOnLoader instance = new com.tencent.wechat.aff.misc.MiscOnLoader();

    public static com.tencent.wechat.aff.misc.MiscOnLoader getInstance() {
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

    public <T> void registerWebViewManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvoker("misc.WebViewManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.misc.WebViewManagerInvoker"), cls);
    }
}
