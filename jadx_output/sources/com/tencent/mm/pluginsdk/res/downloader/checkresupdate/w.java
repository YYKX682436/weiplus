package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public abstract class w {
    public static void a(boolean z17, boolean z18, com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "sendIORequest, fileAppend = %b, fileUpdate = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        int i17 = n0Var.field_maxRetryTimes;
        if (i17 > 0 && n0Var.field_retryTimes <= 0 && !z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(n0Var.field_retryTimes));
            return;
        }
        n0Var.field_reportId = zVar.f189642p;
        n0Var.field_status = 0;
        if (z18) {
            int i18 = zVar.f189657e;
            n0Var.field_maxRetryTimes = i18;
            n0Var.field_retryTimes = i18;
            n0Var.field_fileUpdated = true;
            n0Var.field_priority = zVar.f189663k;
            long j17 = zVar.f189652z;
            if (j17 > 0) {
                n0Var.field_fileSize = j17;
            }
            n0Var.field_filePath = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.b(zVar.f189654b);
            com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.g(n0Var, true);
        } else {
            n0Var.field_retryTimes--;
            n0Var.field_priority = zVar.f189663k;
            com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.g(n0Var, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 12L);
        }
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        if (l0Var.c(zVar.f189654b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s is already downloading", zVar.f189654b);
            if (zVar.A) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(zVar.f189642p, 9L);
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(zVar.f189642p, 44L);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s, post network task", zVar.f189654b);
        if (z18 && !z17) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c();
            int i19 = n0Var.field_resType;
            int i27 = n0Var.field_subType;
            java.lang.String str = n0Var.field_groupId2;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            c17.i(i19, i27, 0, str.equals("NewXml"));
        }
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t d17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t.d(n0Var);
        d17.f189638o = z17;
        d17.f189637n = zVar.f189651y;
        if (!z17) {
            o35.a.a(d17.b());
            o35.a.a(d17.b() + ".decompressed");
            o35.a.a(d17.b() + ".decrypted");
        }
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.e(n0Var.field_resType, n0Var.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, 0), (int) n0Var.field_reportId, 76);
        l0Var.a(d17);
    }
}
