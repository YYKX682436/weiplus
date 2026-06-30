package d35;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mars.cdn.CdnManager.DownloadCallback {
    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CDownloadCompleted: ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (c2CDownloadResult != null) {
            if (c2CDownloadResult.errorCode == 0) {
                jz5.l lVar = (jz5.l) d35.h.f226345b.get(str);
                if (lVar != null) {
                    java.lang.Object obj = lVar.f302833d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(((com.tencent.mm.storage.f9) obj).getMsgId()), java.lang.Long.valueOf(((com.tencent.mm.storage.f9) obj).I0()));
                    if (((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(((com.tencent.mm.storage.f9) obj).getMsgId(), ((com.tencent.mm.storage.f9) obj).Q0()) == null) {
                        android.util.Pair n17 = com.tencent.mm.pluginsdk.model.app.a0.n((com.tencent.mm.storage.f9) obj, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted info is null, initPair:" + ((java.lang.Boolean) n17.first) + ", " + ((java.lang.String) n17.second));
                    }
                    bt3.l0.J((com.tencent.mm.storage.f9) obj, (java.lang.String) lVar.f302834e);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted pair is null");
                }
                jx3.f.INSTANCE.idkeyStat(1680L, 14L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(1680L, 15L, 1L, false);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "cdnCallback downloadTaskMap:" + d35.h.f226345b.size() + ", internal:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "onDownloadProgressChanged: " + str + ", " + j17 + ", " + j18 + ", " + z17);
    }
}
