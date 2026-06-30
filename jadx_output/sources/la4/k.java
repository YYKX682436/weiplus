package la4;

/* loaded from: classes4.dex */
public class k extends la4.i {

    /* renamed from: l, reason: collision with root package name */
    public boolean f317594l;

    public k(la4.e eVar, la4.a aVar) {
        super(eVar, aVar);
        this.f317594l = false;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 10L, 1L, true);
    }

    @Override // la4.i, la4.f
    public java.lang.String h(java.lang.String str) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        java.lang.String h17 = super.h(str);
        r45.jj4 jj4Var = this.f317590g;
        if (jj4Var != null && ((i17 = jj4Var.f377856e) == 6 || i17 == 4)) {
            pc4.d dVar = pc4.d.f353410a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableDownloadThumbWxam", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            com.tencent.mm.plugin.sns.config.RCSnsDownloadVideoThumbWxam rCSnsDownloadVideoThumbWxam = new com.tencent.mm.plugin.sns.config.RCSnsDownloadVideoThumbWxam();
            int h18 = bm5.o1.f22719a.h(rCSnsDownloadVideoThumbWxam);
            int nj6 = h18 != 2 ? h18 != 3 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(rCSnsDownloadVideoThumbWxam) : 0 : 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDownloadThumbWxam", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            if (!android.text.TextUtils.isEmpty(h17) && nj6 > 0) {
                h17 = t(h17, "picformat=" + nj6);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "media id:%s download wxam thumb,picFormat:%d", jj4Var.f377855d, java.lang.Integer.valueOf(nj6));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return h17;
    }

    @Override // la4.f
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return 3;
    }

    @Override // la4.f
    public boolean q(dn.h hVar, int i17) {
        int queryQuality;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        la4.a aVar = this.f317589f;
        if (aVar.f317549h == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
            return true;
        }
        r45.jj4 jj4Var = this.f317590g;
        java.lang.String U = ca4.z0.U(jj4Var);
        this.f317594l = com.tencent.mm.plugin.sns.storage.m2.o2(aVar.d() + aVar.h());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "media id:%s processData isWebp:%b isWxam:%b", jj4Var.f377855d, java.lang.Boolean.valueOf(this.f317594l), java.lang.Boolean.valueOf(com.tencent.mm.plugin.sns.storage.m2.D2(aVar.d() + aVar.h())));
        if (this.f317594l) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 64L, 1L, true);
        }
        java.lang.String str = aVar.d() + aVar.h();
        aVar.f317555n = ca4.z0.C(str);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(str, options);
        java.lang.String str2 = options.outMimeType;
        java.lang.String lowerCase = str2 != null ? str2.toLowerCase() : "";
        java.lang.String str3 = options.outMimeType;
        if (str3 == null || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 35L, 1L, true);
        }
        int i18 = ((lowerCase.contains("jpg") || lowerCase.contains("jpeg")) && (queryQuality = com.tencent.mm.sdk.platformtools.MMNativeJpeg.queryQuality(str)) != 0) ? queryQuality : -1;
        long k17 = com.tencent.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsDownloadThumb", "processData!!! file err!!! [%s].", str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 23L, 1L, true);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String U2 = ca4.z0.U(jj4Var);
        com.tencent.mm.vfs.w6.P(aVar.d(), aVar.h(), U2);
        com.tencent.mm.vfs.w6.j(aVar.d() + U2);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (!com.tencent.mm.plugin.sns.storage.m2.W0(aVar.d(), U2, U, com.tencent.mm.plugin.sns.model.l4.tj())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 27L, 1L, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "processData execute step1.");
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        boolean j17 = com.tencent.mm.vfs.w6.j(aVar.d() + U2);
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (!com.tencent.mm.vfs.w6.j(aVar.d() + U)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(aVar.d() + U)));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(150L, 31L, 1L, true);
            if (j17) {
                if (!com.tencent.mm.vfs.w6.j(aVar.d() + U)) {
                    boolean Ga = fo3.s.INSTANCE.Ga();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", java.lang.Boolean.valueOf(Ga));
                    g0Var.idkeyStat(150L, 32L, 1L, true);
                    if (Ga) {
                        g0Var.idkeyStat(150L, 33L, 1L, true);
                    }
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime4);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f317592i);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        com.tencent.mm.plugin.sns.model.l4.fj();
        g0Var2.d(11696, 3, valueOf, valueOf2, name, "", lp0.b.e0());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "processData execute step2.");
        if (aVar.f317549h.a() == 0 || aVar.f317549h.a() == 5) {
            java.lang.String e07 = ca4.z0.e0(jj4Var);
            com.tencent.mm.plugin.sns.storage.m2.i1(aVar.d(), U, e07, com.tencent.mm.plugin.sns.model.l4.mj());
            U = e07;
        }
        com.tencent.mm.plugin.sns.statistics.r.c(aVar.d() + U, aVar.f317544c, 1, options.outMimeType, options.outWidth, options.outHeight, i18, k17, elapsedRealtime3, hVar.field_receiveCostTime, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "processData execute step3.");
        com.tencent.mm.memory.r n17 = ca4.z0.n(aVar.d() + U);
        this.f317587d = n17;
        boolean g17 = ca4.z0.g(n17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + g17 + " isWebp: " + this.f317594l + " srcImgFileSize: " + k17);
        if (!g17) {
            g0Var2.idkeyStat(150L, 65L, 1L, true);
            g0Var2.idkeyStat(150L, 51L, 1L, true);
        }
        if (this.f317594l && !g17) {
            g0Var2.idkeyStat(22L, 65L, 1L, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return g17;
    }

    @Override // la4.f
    public boolean r(dn.h hVar, int i17) {
        int queryQuality;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        int i18 = hVar.f241773h;
        la4.a aVar = this.f317589f;
        android.util.SparseArray sparseArray = aVar.f317558q;
        if (sparseArray == null || sparseArray.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
            return true;
        }
        ca4.s0 s0Var = (ca4.s0) aVar.f317558q.get(i18);
        r45.jj4 jj4Var = (r45.jj4) aVar.f317557p.get(i18);
        if (s0Var == null || jj4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsDownloadThumb", "decodeElement or media is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "In processGroupDownloadSuccessData ing, %d.", java.lang.Integer.valueOf(i18));
        java.lang.String str = aVar.b(jj4Var.f377855d) + aVar.c(jj4Var);
        java.lang.String U = ca4.z0.U(jj4Var);
        boolean o27 = com.tencent.mm.plugin.sns.storage.m2.o2(str);
        this.f317594l = o27;
        if (o27) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 64L, 1L, true);
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(str, options);
        java.lang.String str2 = options.outMimeType;
        java.lang.String lowerCase = str2 != null ? str2.toLowerCase() : "";
        java.lang.String str3 = options.outMimeType;
        if (str3 == null || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 35L, 1L, true);
        }
        int i19 = ((lowerCase.contains("jpg") || lowerCase.contains("jpeg")) && (queryQuality = com.tencent.mm.sdk.platformtools.MMNativeJpeg.queryQuality(str)) != 0) ? queryQuality : -1;
        aVar.f317555n = ca4.z0.C(str);
        long k17 = com.tencent.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsDownloadThumb", "processGroupDownloadSuccessData!!! file err!!! [%s].", str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 23L, 1L, true);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str4 = "snstblur_src_" + ca4.z0.s(jj4Var.f377855d);
        if (jj4Var.D == 1) {
            str4 = l21.c.a(str4 + ca4.z0.f0(jj4Var), jj4Var.E);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        com.tencent.mm.vfs.w6.c(str, aVar.b(jj4Var.f377855d) + str4);
        com.tencent.mm.vfs.w6.j(aVar.b(jj4Var.f377855d) + str4);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (!com.tencent.mm.plugin.sns.storage.m2.W0(aVar.b(jj4Var.f377855d), aVar.c(jj4Var), U, com.tencent.mm.plugin.sns.model.l4.tj())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 27L, 1L, true);
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        com.tencent.mm.vfs.w6.h(str);
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (!com.tencent.mm.vfs.w6.j(aVar.b(jj4Var.f377855d) + U)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s.", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(aVar.d() + U)));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(150L, 31L, 1L, true);
            if (j17) {
                if (!com.tencent.mm.vfs.w6.j(aVar.b(jj4Var.f377855d) + U)) {
                    boolean Ga = fo3.s.INSTANCE.Ga();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", java.lang.Boolean.valueOf(Ga));
                    g0Var.idkeyStat(150L, 32L, 1L, true);
                    if (Ga) {
                        g0Var.idkeyStat(150L, 33L, 1L, true);
                    }
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime4);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f317592i);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        com.tencent.mm.plugin.sns.model.l4.fj();
        g0Var2.d(11696, 3, valueOf, valueOf2, name, "", lp0.b.e0());
        if (s0Var.a() == 0 || aVar.f317549h.a() == 5) {
            java.lang.String e07 = ca4.z0.e0(jj4Var);
            com.tencent.mm.plugin.sns.storage.m2.i1(aVar.b(jj4Var.f377855d), U, e07, com.tencent.mm.plugin.sns.model.l4.mj());
            U = e07;
        }
        com.tencent.mm.plugin.sns.statistics.r.c(aVar.b(jj4Var.f377855d) + U, jj4Var.f377860i, 1, options.outMimeType, options.outWidth, options.outHeight, i19, k17, elapsedRealtime3, hVar.field_receiveCostTime, i17);
        com.tencent.mm.memory.r n17 = ca4.z0.n(aVar.b(jj4Var.f377855d) + U);
        this.f317587d = n17;
        this.f317588e.put(i18, n17);
        boolean g17 = ca4.z0.g(this.f317587d);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + g17 + " isWebp: " + this.f317594l + " srcImgFileSize: " + k17 + " index: " + i18);
        if (!g17) {
            g0Var2.idkeyStat(150L, 65L, 1L, true);
            g0Var2.idkeyStat(150L, 51L, 1L, true);
        }
        if (this.f317594l && !g17) {
            g0Var2.idkeyStat(22L, 65L, 1L, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return g17;
    }
}
