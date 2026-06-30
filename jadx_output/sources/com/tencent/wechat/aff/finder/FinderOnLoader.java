package com.tencent.wechat.aff.finder;

/* loaded from: classes8.dex */
public class FinderOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.finder.FinderOnLoader instance = new com.tencent.wechat.aff.finder.FinderOnLoader();

    public static com.tencent.wechat.aff.finder.FinderOnLoader getInstance() {
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

    public <T> void registerFinderDataService(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("finder.FinderDataService@Get", java.lang.Class.forName("com.tencent.wechat.aff.finder.FinderDataServiceInvoker"), cls);
    }

    public <T> void registerFinderPrefetchManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("finder.FinderPrefetchManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.finder.FinderPrefetchManagerInvoker"), cls);
    }

    public <T> void registerRedDotManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("finder.RedDotManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.finder.RedDotManagerInvoker"), cls);
    }
}
