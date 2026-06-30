package xd4;

/* loaded from: classes4.dex */
public final class i0 implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jj4 f453647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f453648b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453649c;

    /* renamed from: d, reason: collision with root package name */
    public final ok4.c f453650d;

    /* renamed from: e, reason: collision with root package name */
    public final xd4.g0 f453651e;

    /* renamed from: f, reason: collision with root package name */
    public int f453652f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f453653g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f453654h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f453655i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f453656j;

    /* renamed from: k, reason: collision with root package name */
    public final int f453657k;

    public i0(r45.jj4 media, int i17, java.lang.String localId, ok4.c reporter, xd4.g0 provider) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(localId, "localId");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f453647a = media;
        this.f453648b = i17;
        this.f453649c = localId;
        this.f453650d = reporter;
        this.f453651e = provider;
        this.f453654h = media.F;
        this.f453655i = com.tencent.mm.plugin.sns.model.y6.c(i17, media);
        this.f453656j = media.U;
        this.f453657k = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoFullDownloadPercent", 101);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadTask", "createTime=" + i17 + ", localId=" + localId + ", createTime=" + i17 + ", preloadSec=" + ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoPreloadSec", 5) + " downloadSec=" + ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoDownloadSec", 1) + "], needFinish=" + d() + ',');
    }

    @Override // fk4.p
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    @Override // fk4.p
    public fk4.o b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.model.i7 Pj = com.tencent.mm.plugin.sns.model.l4.Pj();
        java.lang.String str = this.f453649c;
        java.lang.String i17 = i();
        Pj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.plugin.sns.model.z7 z7Var = Pj.f164308a;
        if (z7Var == null || android.text.TextUtils.isEmpty(z7Var.f164813b) || android.text.TextUtils.isEmpty(z7Var.f164817f) || !z7Var.f164813b.equals(i17) || !z7Var.f164817f.equals(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            z7Var = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        if (z7Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            return null;
        }
        fk4.o oVar = new fk4.o(z7Var.f164819h, z7Var.f164820i, z7Var.f164821j, z7Var.f164822k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return oVar;
    }

    @Override // fk4.p
    public java.lang.Long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return null;
    }

    @Override // fk4.p
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f453657k;
    }

    @Override // fk4.p
    public java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f453654h;
    }

    @Override // fk4.p
    public void f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    @Override // fk4.p
    public boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return false;
    }

    @Override // fk4.p
    public long getLength() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        r45.jj4 jj4Var = this.f453647a;
        java.lang.String str = jj4Var.f377855d;
        java.lang.String str2 = jj4Var.U;
        java.lang.String str3 = this.f453649c;
        t21.v2 i17 = t21.d3.i(str3, str, str2);
        if (i17 != null) {
            long j17 = i17.f415015m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            return j17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoDownloadTask", "Couldn't find video info for " + str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return 0L;
    }

    @Override // fk4.p
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        boolean s17 = com.tencent.mm.plugin.sns.model.l4.Pj().s(this.f453647a, this.f453648b, this.f453649c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return s17;
    }

    @Override // fk4.p
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f453655i;
    }

    @Override // fk4.p
    public boolean isFinished() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(this.f453649c, this.f453647a);
        boolean z17 = !(i17 == null || i17.length() == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return z17;
    }

    @Override // fk4.p
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        java.lang.String p17 = com.tencent.mm.plugin.sns.model.y6.p(this.f453647a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return p17;
    }

    @Override // fk4.p
    public java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f453656j;
    }

    @Override // fk4.p
    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoDownloadTask", "finishRemaining: savedPath=" + j() + ", mediaId=" + i());
        com.tencent.mm.plugin.sns.model.l4.Pj().m(this.f453647a, this.f453648b, this.f453649c, false, false, 36, i());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        ((ku5.t0) ku5.t0.f312615d).h(new xd4.h0(this), "rptVideoPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public final void n(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        this.f453652f = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public final void o(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        this.f453653g = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    @Override // fk4.p
    public boolean start() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadTask", "start: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String j17 = j();
        if (!(j17 == null || j17.length() == 0)) {
            java.lang.String i17 = i();
            if (!(i17 == null || i17.length() == 0)) {
                com.tencent.mm.plugin.sns.model.l4.Pj().m(this.f453647a, this.f453648b, this.f453649c, this.f453653g, true, this.f453652f, i());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return false;
    }

    @Override // fk4.p
    public void stop() {
        java.lang.String str;
        com.tencent.mm.plugin.sight.base.b bVar;
        long j17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoDownloadTask", "stop: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String i18 = i();
        if (i18 == null || i18.length() == 0) {
            str = "stop";
            m();
        } else {
            com.tencent.mm.plugin.sns.model.i7 Pj = com.tencent.mm.plugin.sns.model.l4.Pj();
            java.lang.String i19 = i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildReportData", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            ok4.b v17 = this.f453650d.v();
            xd4.g0 g0Var = this.f453651e;
            com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct b17 = g0Var.b();
            try {
                bVar = com.tencent.mm.plugin.sight.base.e.d(j(), true);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoDownloadTask", "Failed to getMediaInfo");
                bVar = null;
            }
            int i27 = v17.f345974i;
            boolean z17 = (i27 & 1) != 0;
            boolean z18 = (i27 & 2) != 0;
            if (bVar == null || (i17 = bVar.f162382a) == 0) {
                str = "stop";
                j17 = 0;
            } else if (v17.f345976k) {
                str = "stop";
                j17 = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
            } else {
                str = "stop";
                j17 = java.lang.Math.min(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, (v17.f345975j * 10000) / i17);
            }
            java.lang.Object[] objArr = new java.lang.Object[22];
            objArr[0] = java.lang.Integer.valueOf(v17.f345966a);
            objArr[1] = java.lang.Integer.valueOf(v17.f345967b);
            int i28 = 2;
            objArr[2] = java.lang.Integer.valueOf(v17.f345968c);
            objArr[3] = java.lang.Integer.valueOf(v17.f345969d);
            objArr[4] = java.lang.Integer.valueOf(v17.f345970e);
            objArr[5] = java.lang.Integer.valueOf(v17.f345971f);
            objArr[6] = java.lang.Integer.valueOf(v17.f345972g);
            objArr[7] = java.lang.Integer.valueOf(b17.f166556c);
            java.lang.String sessionId = b17.f166555b;
            kotlin.jvm.internal.o.f(sessionId, "sessionId");
            objArr[8] = sessionId;
            objArr[9] = java.lang.Long.valueOf(b17.f166554a);
            java.lang.String snsId = b17.f166557d;
            kotlin.jvm.internal.o.f(snsId, "snsId");
            objArr[10] = snsId;
            java.lang.String snsUrl = b17.f166558e;
            kotlin.jvm.internal.o.f(snsUrl, "snsUrl");
            objArr[11] = snsUrl;
            java.lang.String filePath = b17.f166559f;
            kotlin.jvm.internal.o.f(filePath, "filePath");
            objArr[12] = filePath;
            objArr[13] = java.lang.Long.valueOf(g0Var.c());
            objArr[14] = java.lang.Integer.valueOf(bVar != null ? bVar.f162384c : 0);
            objArr[15] = java.lang.Integer.valueOf(bVar != null ? bVar.f162385d : 0);
            objArr[16] = java.lang.Integer.valueOf(bVar != null ? bVar.f162386e : 0);
            objArr[17] = java.lang.Long.valueOf(v17.f345973h);
            if (z17 && z18) {
                i28 = 3;
            } else if (z17) {
                i28 = 1;
            } else if (!z18) {
                i28 = 0;
            }
            objArr[18] = java.lang.Integer.valueOf(i28);
            objArr[19] = java.lang.Long.valueOf(j17);
            objArr[20] = java.lang.Integer.valueOf(b17.f166564k);
            java.lang.String sns_video_multi_spec = b17.f166565l;
            kotlin.jvm.internal.o.f(sns_video_multi_spec, "sns_video_multi_spec");
            objArr[21] = sns_video_multi_spec;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildReportData", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            Pj.u(i19, objArr);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptStopDownload", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 203L, 1L, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptStopDownload", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }
}
