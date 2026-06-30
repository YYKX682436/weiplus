package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class StatusOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.status.StatusOnLoader instance = new com.tencent.wechat.aff.status.StatusOnLoader();

    public static com.tencent.wechat.aff.status.StatusOnLoader getInstance() {
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

    public <T> void registerStatusCgiManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("status.StatusCgiManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusCgiManagerInvoker"), cls);
    }

    public <T> void registerStatusLogicManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("status.StatusLogicManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusLogicManagerInvoker"), cls);
    }

    public <T> void registerStatusStorageManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("status.StatusStorageManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusStorageManagerInvoker"), cls);
    }

    public <T> void registerStatusXmlParseManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("status.StatusXmlParseManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusXmlParseManagerInvoker"), cls);
    }
}
