package za4;

/* loaded from: classes4.dex */
public class e extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.k f471076a;

    public e(za4.k kVar, za4.b bVar) {
        this.f471076a = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ApkInstallReceiver");
        if (intent != null) {
            java.lang.String action = intent.getAction();
            com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onReceive, action=" + action);
            boolean equals = "android.intent.action.PACKAGE_ADDED".equals(action);
            za4.k kVar = this.f471076a;
            if (equals) {
                java.lang.String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onReceive, pkg=" + schemeSpecificPart);
                if (com.tencent.mm.sdk.platformtools.t8.K0(schemeSpecificPart) || !za4.k.a(kVar).containsKey(schemeSpecificPart)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "onReceive, installCallback==null, pkg=" + schemeSpecificPart);
                } else {
                    ((za4.h) za4.k.a(kVar).remove(schemeSpecificPart)).b(schemeSpecificPart);
                }
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                java.lang.String schemeSpecificPart2 = intent.getData().getSchemeSpecificPart();
                com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onReceive, pkg=" + schemeSpecificPart2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(schemeSpecificPart2) || !za4.k.a(kVar).containsKey(schemeSpecificPart2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "onReceive, installCallback==null, pkg=" + schemeSpecificPart2);
                } else {
                    ((za4.h) za4.k.a(kVar).remove(schemeSpecificPart2)).a(schemeSpecificPart2);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ApkInstallReceiver");
    }
}
