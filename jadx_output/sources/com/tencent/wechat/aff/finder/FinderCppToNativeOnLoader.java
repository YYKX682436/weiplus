package com.tencent.wechat.aff.finder;

/* loaded from: classes8.dex */
public class FinderCppToNativeOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.finder.FinderCppToNativeOnLoader instance = new com.tencent.wechat.aff.finder.FinderCppToNativeOnLoader();

    public static com.tencent.wechat.aff.finder.FinderCppToNativeOnLoader getInstance() {
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

    public <T> void registerAffFinderProvider(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("finder.AffFinderProvider@Get", com.tencent.wechat.aff.finder.AffFinderProviderInvoker.class, cls);
    }
}
