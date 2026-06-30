package sf4;

/* loaded from: classes4.dex */
public final class d2 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f407448d;

    /* renamed from: e, reason: collision with root package name */
    public t21.h0 f407449e;

    /* renamed from: f, reason: collision with root package name */
    public nf4.o f407450f;

    /* renamed from: g, reason: collision with root package name */
    public if4.h f407451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407452h;

    public d2(sf4.j2 j2Var) {
        this.f407452h = j2Var;
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress, mediaId:");
        sb6.append(mediaId);
        sb6.append(", offset:");
        sb6.append(j17);
        sb6.append(", total:");
        sb6.append(j18);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar = this.f407452h.f407504f;
        sb6.append(hVar != null ? hVar.f291256d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        pm0.v.X(new sf4.c2(this.f407452h, mediaId, j17, j18, this));
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h hVar) {
        long j17;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish, mediaId:");
        sb6.append(mediaId);
        sb6.append(", ret:");
        sb6.append(i17);
        sb6.append(", sceneResult:");
        sb6.append(hVar != null ? hVar.field_retCode : 0);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar2 = this.f407452h.f407504f;
        sb6.append(hVar2 != null ? hVar2.f291256d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        if4.h hVar3 = this.f407451g;
        if (hVar3 != null) {
            mf4.b bVar = mf4.b.f326142a;
            long j18 = hVar3.f291254b;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            java.util.Map map = mf4.b.f326144c;
            if (map.containsKey(valueOf)) {
                android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j18)));
                if (j18 != 0) {
                    android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j18)));
                }
            }
            sf4.u1 u1Var = sf4.u1.f407583a;
            long j19 = hVar3.f291254b;
            java.lang.Long l17 = sf4.u1.f407595m;
            if (l17 != null && l17.longValue() == j19) {
                sf4.u1.f407595m = 0L;
            }
            if (sf4.u1.f407598p != j19) {
                sf4.u1.f407598p = j19;
                if (sf4.u1.f407585c != 0 && sf4.u1.f407587e != 0 && sf4.u1.f407591i.size() <= 0) {
                    sf4.o1 o1Var = sf4.u1.f407593k;
                    if (o1Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "resetWalk");
                        o1Var.f407542e = o1Var.f407538a;
                        o1Var.f407543f = o1Var.f407539b;
                        o1Var.f407544g = 0;
                    }
                    u1Var.m(false);
                }
            }
        }
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        nf4.o oVar2 = this.f407450f;
        java.lang.String str = oVar2 != null ? oVar2.field_filePath : null;
        ((be0.e) oVar).getClass();
        if (com.tencent.mm.plugin.sight.base.e.d(str, true) != null) {
            com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct storyDownloadReportStruct = mf4.d.f326171l;
            storyDownloadReportStruct.f60900j = r2.f162382a;
            storyDownloadReportStruct.f60901k = r2.f162383b;
            storyDownloadReportStruct.f60902l = r2.f162388g;
            storyDownloadReportStruct.f60903m = r2.f162386e;
            storyDownloadReportStruct.f60904n = r2.f162384c;
            storyDownloadReportStruct.f60905o = r2.f162385d;
            storyDownloadReportStruct.f60907q = r2.f162387f;
        }
        com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct storyDownloadReportStruct2 = mf4.d.f326171l;
        nf4.o oVar3 = this.f407450f;
        storyDownloadReportStruct2.f60899i = oVar3 != null ? oVar3.field_totalSize : 0L;
        storyDownloadReportStruct2.f60895e = storyDownloadReportStruct2.b("VideoUrl", oVar3 != null ? oVar3.field_url : null, true);
        com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct storyDownloadReportStruct3 = mf4.d.f326171l;
        sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
        nf4.o oVar4 = this.f407450f;
        storyDownloadReportStruct3.f60896f = storyDownloadReportStruct3.b("NewMd5", ((rx.a) a0Var).Di(oVar4 != null ? oVar4.field_filePath : null), true);
        if (hVar != null) {
            com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct storyDownloadReportStruct4 = mf4.d.f326171l;
            storyDownloadReportStruct4.f60897g = hVar.field_startTime;
            storyDownloadReportStruct4.f60898h = hVar.field_endTime;
        }
        if ((hVar != null ? hVar.field_usedSvrIps : null) != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.lang.String[] field_usedSvrIps = hVar.field_usedSvrIps;
            kotlin.jvm.internal.o.f(field_usedSvrIps, "field_usedSvrIps");
            for (java.lang.String str2 : field_usedSvrIps) {
                stringBuffer.append(str2);
                stringBuffer.append("|");
            }
            com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct storyDownloadReportStruct5 = mf4.d.f326171l;
            storyDownloadReportStruct5.f60906p = storyDownloadReportStruct5.b("CDNIp", stringBuffer.toString(), true);
        }
        sf4.f2 f2Var = this.f407452h.f407500b;
        if (f2Var != null) {
            com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct storyDownloadReportStruct6 = mf4.d.f326171l;
            storyDownloadReportStruct6.f60908r = f2Var.f407476g;
            kotlin.jvm.internal.o.d(f2Var);
            if (f2Var.f407477h) {
                j17 = 3;
            } else {
                sf4.f2 f2Var2 = this.f407452h.f407500b;
                kotlin.jvm.internal.o.d(f2Var2);
                j17 = f2Var2.f407476g > 0 ? 2L : 1L;
            }
            storyDownloadReportStruct6.f60909s = j17;
        }
        mf4.d.f326171l.k();
        mf4.d.f326171l = new com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct();
        pm0.v.X(new sf4.a2(this, mediaId, i17));
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDataAvailable, mediaId:");
        sb6.append(mediaId);
        sb6.append(", offset:");
        sb6.append(j17);
        sb6.append(", length:");
        sb6.append(j18);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar = this.f407452h.f407504f;
        sb6.append(hVar != null ? hVar.f291256d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        pm0.v.X(new sf4.z1(this.f407452h, mediaId, j17, j18));
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String mediaId, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoovReady, mediaId:");
        sb6.append(str);
        sb6.append(", offset:");
        sb6.append(j17);
        sb6.append(", length:");
        sb6.append(j18);
        sb6.append(", isMoovReady:");
        sb6.append(this.f407448d);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar = this.f407452h.f407504f;
        sb6.append(hVar != null ? hVar.f291256d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        if (this.f407448d) {
            return;
        }
        this.f407448d = true;
        pm0.v.X(new sf4.b2(this.f407452h, str, j17, j18, videoInfo));
    }
}
