package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewlifeOnLoader {
    private static java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.tencent.wechat.aff.newlife.NewlifeOnLoader instance = new com.tencent.wechat.aff.newlife.NewlifeOnLoader();

    public static com.tencent.wechat.aff.newlife.NewlifeOnLoader getInstance() {
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

    public <T> void registerAffNewLifeExtraInfoManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeExtraInfoManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManagerInvoker"), cls);
    }

    public <T> void registerAffNewLifeFeedJumpInfoSummaryManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeFeedJumpInfoSummaryManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeFeedJumpInfoSummaryManagerInvoker"), cls);
    }

    public <T> void registerAffNewLifeJumpInfoManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeJumpInfoManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeJumpInfoManagerInvoker"), cls);
    }

    public <T> void registerAffNewLifeMentionManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeMentionManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeMentionManagerInvoker"), cls);
    }

    public <T> void registerAffNewLifeMmkvManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeMmkvManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeMmkvManagerInvoker"), cls);
    }

    public <T> void registerAffNewLifeSyncManager(java.lang.Class<T> cls) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.getInstance().registerInvokerV2("newlife.AffNewLifeSyncManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeSyncManagerInvoker"), cls);
    }
}
