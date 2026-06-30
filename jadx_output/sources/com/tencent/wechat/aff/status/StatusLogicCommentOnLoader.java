package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class StatusLogicCommentOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.status.StatusLogicCommentOnLoader instance = new com.tencent.wechat.aff.status.StatusLogicCommentOnLoader();

    public static com.tencent.wechat.aff.status.StatusLogicCommentOnLoader getInstance() {
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

    public <T> void registerStatusLogicCommentManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("status.StatusLogicCommentManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusLogicCommentManagerInvoker"), cls);
    }
}
