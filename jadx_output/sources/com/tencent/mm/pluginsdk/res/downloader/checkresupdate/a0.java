package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class a0 {
    public static boolean b(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var) {
        if (n0Var.field_fileCompress) {
            if (java.util.Objects.equals(com.tencent.mm.vfs.w6.p(n0Var.field_filePath + ".decompressed"), n0Var.field_originalMd5)) {
                return true;
            }
        } else if (n0Var.field_fileEncrypt) {
            if (java.util.Objects.equals(com.tencent.mm.vfs.w6.p(n0Var.field_filePath + ".decrypted"), n0Var.field_originalMd5)) {
                return true;
            }
        }
        return java.util.Objects.equals(com.tencent.mm.vfs.w6.p(n0Var.field_filePath), n0Var.field_md5);
    }

    public final void a(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var, boolean z17) {
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        java.lang.String str = n0Var.field_urlKey;
        if (l0Var.f189686e) {
            l0Var.f189683b.a(str);
        }
        o35.a.a(n0Var.field_filePath);
        o35.a.a(n0Var.field_filePath + ".decompressed");
        o35.a.a(n0Var.field_filePath + ".decrypted");
        if (2 == n0Var.field_status && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "delete completed but invalid file, but forceDL = false, skip this downloading");
            return;
        }
        int i17 = n0Var.field_maxRetryTimes;
        if (i17 > 0 && n0Var.field_retryTimes <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(n0Var.field_retryTimes));
            return;
        }
        n0Var.field_retryTimes--;
        n0Var.field_fileUpdated = true;
        l0Var.g(n0Var, true);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 12L);
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "post network task");
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t d17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t.d(n0Var);
        d17.f189638o = false;
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.e(n0Var.field_resType, n0Var.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, 0), (int) n0Var.field_reportId, 76);
        l0Var.a(d17);
    }

    public final void c(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var) {
        if (!n0Var.field_fileCompress && !n0Var.field_fileEncrypt) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().h(n0Var.field_resType, n0Var.field_subType, n0Var.field_filePath, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, 0), n0Var.field_originalMd5);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "send query and decrypt request");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().a(n0Var);
        }
    }
}
