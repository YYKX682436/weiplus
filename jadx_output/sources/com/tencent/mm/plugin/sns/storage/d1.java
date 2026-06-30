package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class d1 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.d1 f165964d = new com.tencent.mm.plugin.sns.storage.d1();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2$handler$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj = it.obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = obj instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? (com.tencent.mm.plugin.sns.storage.SnsInfo) obj : null;
        if (snsInfo != null) {
            snsInfo.field_content = snsInfo.getTimeLine().toByteArray();
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String snsId = snsInfo.getSnsId();
            Fj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (com.tencent.mm.plugin.sns.storage.w2.g(snsId)) {
                Fj.v3(com.tencent.mm.plugin.sns.storage.w2.n(snsId), snsInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            } else {
                com.tencent.mm.plugin.sns.model.l4.Vi().b1(com.tencent.mm.plugin.sns.storage.w2.n(snsId), snsInfo.getAdSnsInfo());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2$handler$1");
        return true;
    }
}
