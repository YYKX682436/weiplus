package za4;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.k f471068a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(za4.k kVar, android.os.Looper looper) {
        super(looper);
        this.f471068a = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$2");
        if (message.what == 10008) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "unregister package receiver");
            try {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                za4.k kVar = this.f471068a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                za4.e eVar = kVar.f471134a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                context.unregisterReceiver(eVar);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "unregister package receiver, exp=" + e17.toString());
            }
            za4.k kVar2 = this.f471068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            kVar2.f471135b = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$2");
    }
}
