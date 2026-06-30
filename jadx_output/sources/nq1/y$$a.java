package nq1;

/* loaded from: classes13.dex */
public final /* synthetic */ class y$$a implements b83.h {
    @Override // b83.h
    public final void a() {
        ak0.a aVar = ak0.o.f5542a;
        boolean z17 = ak0.x.f5548k;
        uv5.c b17 = uv5.c.b(ak0.o.a());
        android.content.Context context = b17.f431475c;
        boolean z18 = false;
        if (!tv5.b.b(context).f422375h) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry is not main process, just return", new java.lang.Object[0]);
        } else if (b17.f431473a.exists()) {
            java.lang.String str = uv5.a.f431469a;
            if (com.tencent.tinker.lib.service.TinkerPatchService.a(context)) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad tinker service is running, just return", new java.lang.Object[0]);
            } else {
                java.lang.String absolutePath = b17.f431474b.getAbsolutePath();
                if (absolutePath == null || !new java.io.File(absolutePath).exists()) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is not exist, just return", absolutePath);
                } else {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is exist, retry to patch", absolutePath);
                    tv5.b.b(context).f422370c.a(absolutePath);
                    z18 = true;
                }
            }
        } else {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry info not exist, just return", new java.lang.Object[0]);
        }
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 9L, 1L, false);
        }
    }
}
