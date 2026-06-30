package xd4;

/* loaded from: classes4.dex */
public final class f0 implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jj4 f453636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f453637b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453638c;

    /* renamed from: d, reason: collision with root package name */
    public final int f453639d;

    public f0(r45.jj4 media, int i17, java.lang.String localId) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(localId, "localId");
        this.f453636a = media;
        this.f453637b = i17;
        this.f453638c = localId;
        this.f453639d = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoFullDownloadPercent", 101);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoCommonDownloadTask", "createTime=" + i17 + ", localId=" + localId + ", createTime=" + i17 + ", needFinish=" + d());
    }

    @Override // fk4.p
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    @Override // fk4.p
    public java.lang.Long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return null;
    }

    @Override // fk4.p
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return this.f453639d;
    }

    @Override // fk4.p
    public java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String str = this.f453636a.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return str;
    }

    @Override // fk4.p
    public void f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    @Override // fk4.p
    public boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return false;
    }

    @Override // fk4.p
    public long getLength() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        r45.jj4 jj4Var = this.f453636a;
        java.lang.String str = jj4Var.f377855d;
        java.lang.String str2 = jj4Var.U;
        java.lang.String str3 = this.f453638c;
        t21.v2 i17 = t21.d3.i(str3, str, str2);
        if (i17 != null) {
            long j17 = i17.f415015m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
            return j17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoCommonDownloadTask", "Couldn't find video info for " + str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return 0L;
    }

    @Override // fk4.p
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        boolean s17 = com.tencent.mm.plugin.sns.model.l4.Pj().s(this.f453636a, this.f453637b, this.f453638c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return s17;
    }

    @Override // fk4.p
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String c17 = com.tencent.mm.plugin.sns.model.y6.c(this.f453637b, this.f453636a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return c17;
    }

    @Override // fk4.p
    public boolean isFinished() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(this.f453638c, this.f453636a);
        boolean z17 = !(i17 == null || i17.length() == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return z17;
    }

    @Override // fk4.p
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String p17 = com.tencent.mm.plugin.sns.model.y6.p(this.f453636a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return p17;
    }

    @Override // fk4.p
    public java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return null;
    }

    @Override // fk4.p
    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoCommonDownloadTask", "finishRemaining: savedPath=" + j() + ", mediaId=" + i());
        com.tencent.mm.plugin.sns.model.l4.Pj().m(this.f453636a, this.f453637b, this.f453638c, false, true, 36, i());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    @Override // fk4.p
    public boolean start() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoCommonDownloadTask", "start: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String j17 = j();
        if (!(j17 == null || j17.length() == 0)) {
            java.lang.String i17 = i();
            if (!(i17 == null || i17.length() == 0)) {
                com.tencent.mm.plugin.sns.model.i7 Pj = com.tencent.mm.plugin.sns.model.l4.Pj();
                r45.jj4 jj4Var = this.f453636a;
                int i18 = this.f453637b;
                java.lang.String str = this.f453638c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                Pj.m(jj4Var, i18, str, false, true, 40, i());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return false;
    }

    @Override // fk4.p
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoCommonDownloadTask", "stop: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String i17 = i();
        if (!(i17 == null || i17.length() == 0)) {
            com.tencent.mm.plugin.sns.model.l4.Pj().u(i(), null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }
}
