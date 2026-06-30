package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.checkresupdate.z f189578e;

    public g(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar, java.lang.String str, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.z zVar) {
        this.f189577d = str;
        this.f189578e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(this.f189577d);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.z zVar = this.f189578e;
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record is null, urlKey = %s", zVar.f189654b);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record: urlKey = %s, url = %s, contentLength = %d, deleted = %b, eccSignature = %s, expireTime = %d, fileCompress = %b, fileEncrypt = %b, filePath = %s, fileUpdated = %b, fileVersion = %s, from = %s, keyVersion = %s, (encryptKey == null) = %b, maxRetryTimes = %d, retriedTimes = %d, sampleId = %s, dlStatus = %d", e17.field_urlKey, e17.field_url, java.lang.Long.valueOf(e17.field_contentLength), java.lang.Boolean.valueOf(e17.field_deleted), e17.field_eccSignature, java.lang.Long.valueOf(e17.field_expireTime), java.lang.Boolean.valueOf(e17.field_fileCompress), java.lang.Boolean.valueOf(e17.field_fileEncrypt), e17.field_filePath, java.lang.Boolean.valueOf(e17.field_fileUpdated), e17.field_fileVersion, e17.field_groupId2, java.lang.Integer.valueOf(e17.field_keyVersion), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(e17.field_encryptKey)), java.lang.Integer.valueOf(e17.field_maxRetryTimes), java.lang.Integer.valueOf(e17.field_retryTimes), e17.field_sampleId, java.lang.Integer.valueOf(e17.field_status));
        }
        if (e17 != null && e17.field_deleted) {
            if (com.tencent.mm.sdk.platformtools.t8.P(zVar.f189655c, 0) - com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0) <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "deletedFile.version = %s, cacheReq.version = %s, this file should have been deleted, skip this cache-op", e17.field_fileVersion, zVar.f189655c);
                return;
            }
        }
        if (e17 == null) {
            com.tencent.mm.pluginsdk.res.downloader.model.n0 a17 = zVar.a();
            a17.field_fileUpdated = true;
            a17.field_needRetry = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17.field_encryptKey)) {
                a17.field_keyVersion = -1;
            }
            a17.toString();
            l0Var.g(a17, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().i(zVar.f189640n, zVar.f189641o, 0, zVar.A);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.w.a(true, true, a17, zVar);
            return;
        }
        e17.field_networkType = zVar.f189656d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17.field_originalMd5)) {
            e17.field_originalMd5 = zVar.f189645s;
        }
        java.lang.String str = e17.field_fileVersion;
        java.lang.String str2 = zVar.f189655c;
        int P = com.tencent.mm.sdk.platformtools.t8.P(str2, 0) - com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        java.lang.String str3 = zVar.f189654b;
        boolean z17 = zVar.A;
        int i17 = zVar.f189641o;
        int i18 = zVar.f189640n;
        if (P > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "new version of file, re-download");
            com.tencent.mm.pluginsdk.res.downloader.model.n0 a18 = zVar.a();
            int i19 = e17.field_keyVersion;
            if (i19 >= zVar.f189649w) {
                a18.field_keyVersion = i19;
                a18.field_encryptKey = e17.field_encryptKey;
            }
            a18.field_fileUpdated = true;
            a18.field_needRetry = true;
            a18.field_deleted = false;
            l0Var.g(a18, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().i(i18, i17, 0, z17);
            if (l0Var.f189686e) {
                l0Var.f189683b.a(str3);
            }
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.w.a(false, true, a18, zVar);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.P(str2, 0) - com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0) == 0 && !e17.field_needRetry) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "no need retry, resType %d, subType %d, version %s", java.lang.Integer.valueOf(e17.field_resType), java.lang.Integer.valueOf(e17.field_subType), e17.field_fileVersion);
            return;
        }
        if (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0.b(e17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "no need retry, resType %d, subType %d, version %s checksum valid", java.lang.Integer.valueOf(e17.field_resType), java.lang.Integer.valueOf(e17.field_subType), e17.field_fileVersion);
            return;
        }
        int i27 = e17.field_status;
        if (i27 != 2 && i27 != 1 && i27 != 0) {
            if (i27 == 4 || i27 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download %s", e17.field_urlKey);
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.w.a(false, true, e17, zVar);
                return;
            }
            return;
        }
        long g17 = o35.a.g(e17.field_filePath);
        long j17 = e17.field_contentLength;
        if (j17 > g17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "content-length(%d) > fileSize(%d), resume download", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(g17));
            if (0 != g17) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.w.a(true, false, e17, zVar);
                return;
            } else {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().i(i18, i17, 0, z17);
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.w.a(false, true, e17, zVar);
                return;
            }
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.b(str3));
        if (p17 == null) {
            p17 = "";
        }
        if (!p17.equals(e17.field_md5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.w.a(false, true, e17, zVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "md5 check ok, file download complete, throw event to do decrypt %s", e17.field_urlKey);
        e17.field_status = 2;
        e17.field_contentLength = o35.a.g(e17.field_filePath);
        e17.field_fileUpdated = false;
        e17.field_reportId = zVar.f189642p;
        l0Var.g(e17, true);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(e17.field_reportId, 13L);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(e17.field_reportId, 44L);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.c(e17.field_resType, e17.field_subType, e17.field_url, com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0), com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.FILE_LATEST, true, "NewXml".equalsIgnoreCase(e17.field_groupId2), true, e17.field_sampleId);
        if (!zVar.f189646t && !zVar.f189647u) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().h(zVar.f189640n, zVar.f189641o, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.b(str3), com.tencent.mm.sdk.platformtools.t8.P(str2, 0), zVar.f189645s);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "send query and decrypt request %s", str3);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.x.a(e17, false, false);
        }
    }
}
