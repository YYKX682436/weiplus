package iv1;

/* loaded from: classes8.dex */
public class d extends fv1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f295106d;

    public d(iv1.f fVar) {
        this.f295106d = fVar;
    }

    @Override // fv1.f
    public void L2(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "onDownloadStateChange, mediaId = %s, state = %d, errCode = %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        iv1.f fVar = this.f295106d;
        if (i17 != 1) {
            fVar.i(new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str));
        }
        iv1.g gVar = fVar.f295114h;
        if (gVar != null) {
            ((com.tencent.mm.plugin.downloader.model.w) gVar).a(str, i17, i18, str2);
        }
    }

    @Override // fv1.f
    public void Ue(java.lang.String str, long j17, long j18) {
        iv1.g gVar = this.f295106d.f295114h;
        if (gVar != null) {
            com.tencent.mm.plugin.downloader.model.w wVar = (com.tencent.mm.plugin.downloader.model.w) gVar;
            h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
            if (f17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, info is null");
                return;
            }
            boolean z17 = f17.field_downloadInWifi;
            com.tencent.mm.plugin.downloader.model.b0 b0Var = wVar.f97188a;
            if (z17 && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                long j19 = f17.field_downloadId;
                b0Var.getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j19);
                if (c17 != null) {
                    c17.field_downloadType = 2;
                    com.tencent.mm.plugin.downloader.model.m0.l(c17);
                }
                g02.b.e(j19, 13);
                b0Var.c(j19);
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) b0Var.f96986h.get(f17.field_downloadUrl)));
            long longValue = valueOf.longValue();
            java.util.HashMap hashMap = b0Var.f96986h;
            if (longValue == 0) {
                valueOf = java.lang.Long.valueOf(j17);
                hashMap.put(f17.field_downloadUrl, java.lang.Long.valueOf(j17));
            }
            long longValue2 = j17 - valueOf.longValue();
            if (j18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, totalDataLen = 0");
            } else {
                int i17 = (int) ((((float) j17) / ((float) j18)) * 100.0f);
                if ((100 * longValue2) / j18 >= 1) {
                    java.util.HashMap hashMap2 = b0Var.f96987i;
                    long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hashMap2.get(f17.field_downloadUrl), f17.field_startTime);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    k02.m.a(f17.field_downloadId, ((((float) longValue2) * 1000.0f) / ((float) (currentTimeMillis - k17))) / 1048576.0f, i17);
                    hashMap2.put(f17.field_downloadUrl, java.lang.Long.valueOf(currentTimeMillis));
                    hashMap.put(f17.field_downloadUrl, java.lang.Long.valueOf(j17));
                }
            }
            java.util.HashMap hashMap3 = b0Var.f96984f;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) hashMap3.get(f17.field_downloadUrl)));
            java.lang.Long valueOf3 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            long longValue3 = valueOf3.longValue() - valueOf2.longValue();
            if (longValue3 <= 0 || longValue3 >= 500) {
                hashMap3.put(f17.field_downloadUrl, valueOf3);
                f17.field_downloadedSize = j17;
                f17.field_totalSize = j18;
                com.tencent.mm.plugin.downloader.model.m0.l(f17);
                b0Var.f97212a.f(f17.field_downloadId, str, j17, j18);
                int i18 = j18 > 0 ? (int) ((((float) j17) / ((float) j18)) * 100.0f) : 0;
                b0Var.l(f17.field_downloadUrl, 1, i18 < 0 ? 0 : i18 > 100 ? 100 : i18, false, false, false);
            }
        }
    }
}
