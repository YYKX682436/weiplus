package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewlifeDartToNativeOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.newlife.NewlifeDartToNativeOnLoader instance = new com.tencent.wechat.aff.newlife.NewlifeDartToNativeOnLoader();

    public static com.tencent.wechat.aff.newlife.NewlifeDartToNativeOnLoader getInstance() {
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

    public <T> void registerAffNewLifeDartToNativeManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvoker("newlife.AffNewLifeDartToNativeManager@Get", com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerInvoker.class, cls);
    }
}
