package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f189700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.model.v f189701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189702f;

    public q(com.tencent.mm.pluginsdk.res.downloader.model.s sVar, java.util.List list, com.tencent.mm.pluginsdk.res.downloader.model.v vVar, java.lang.String str) {
        this.f189700d = list;
        this.f189701e = vVar;
        this.f189702f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.pluginsdk.res.downloader.model.h hVar : this.f189700d) {
            hVar.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ("CheckResUpdate".equals(this.f189701e.f189728f)) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e eVar = (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e) hVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("networkEventListener.onComplete, urlkey = ");
                java.lang.String str = this.f189702f;
                sb6.append(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", sb6.toString());
                com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
                com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(str);
                if (e17 != null) {
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(e17.field_reportId, 10L);
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(e17.field_reportId, 15L);
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.e(e17.field_resType, e17.field_subType, com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0), (int) e17.field_reportId, 77);
                    if ((!e17.field_fileCompress || e17.field_fileEncrypt) && e17.field_fileUpdated) {
                        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0 d0Var = e17.field_maxRetryTimes > e17.field_retryTimes ? com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.RETRY_SUCC : com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.SUCC;
                        int i17 = e17.field_resType;
                        int i18 = e17.field_subType;
                        java.lang.String str2 = e17.field_url;
                        int P = com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0);
                        java.lang.String str3 = e17.field_groupId2;
                        if (str3 == null) {
                            str3 = "";
                        }
                        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.c(i17, i18, str2, P, d0Var, true, str3.equals("NewXml"), false, e17.field_sampleId);
                    }
                    if (e17.field_fileCompress || e17.field_fileEncrypt) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener, addDecryptRequest");
                        eVar.f189568a.a(e17);
                    } else {
                        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                        java.lang.String str4 = e17.field_filePath;
                        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
                        r2Var.f7761c = str4;
                        r2Var.f7764f = e17.field_originalMd5;
                        r2Var.f7763e = e17.field_fileUpdated;
                        r2Var.f7762d = com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0);
                        r2Var.f7759a = e17.field_resType;
                        r2Var.f7760b = e17.field_subType;
                        l0Var.f189685d.post(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d(eVar, checkResUpdateCacheFileEvent));
                        e17.field_fileUpdated = false;
                        l0Var.g(e17, true);
                    }
                }
            }
        }
    }
}
