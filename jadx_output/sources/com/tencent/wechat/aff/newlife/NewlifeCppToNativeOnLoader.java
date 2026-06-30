package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewlifeCppToNativeOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.newlife.NewlifeCppToNativeOnLoader instance = new com.tencent.wechat.aff.newlife.NewlifeCppToNativeOnLoader();

    public static com.tencent.wechat.aff.newlife.NewlifeCppToNativeOnLoader getInstance() {
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

    public <T> void registerAffNewLifeCppToNativeManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeCppToNativeManager@Get", com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerInvoker.class, cls);
    }
}
