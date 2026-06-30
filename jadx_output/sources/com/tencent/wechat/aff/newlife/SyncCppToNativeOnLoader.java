package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class SyncCppToNativeOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.newlife.SyncCppToNativeOnLoader instance = new com.tencent.wechat.aff.newlife.SyncCppToNativeOnLoader();

    public static com.tencent.wechat.aff.newlife.SyncCppToNativeOnLoader getInstance() {
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

    public <T> void registerAffFinderCppToNativeManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffFinderCppToNativeManager@Get", com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.class, cls);
    }

    public <T> void registerAffSyncCppToNativeManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffSyncCppToNativeManager@Get", com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.class, cls);
    }
}
