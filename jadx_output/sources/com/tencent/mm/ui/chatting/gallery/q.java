package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public final class q implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f201278a;

    /* renamed from: b, reason: collision with root package name */
    public t21.v2 f201279b;

    /* renamed from: c, reason: collision with root package name */
    public final ok4.c f201280c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f201281d;

    /* renamed from: e, reason: collision with root package name */
    public final dn.o f201282e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f201283f;

    /* renamed from: g, reason: collision with root package name */
    public final int f201284g;

    /* renamed from: h, reason: collision with root package name */
    public final int f201285h;

    /* renamed from: i, reason: collision with root package name */
    public final int f201286i;

    /* renamed from: j, reason: collision with root package name */
    public int f201287j;

    public q(com.tencent.mm.storage.f9 msg, t21.v2 videoInfo, ok4.c reporter, yz5.l onGotTask) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        kotlin.jvm.internal.o.g(onGotTask, "onGotTask");
        this.f201278a = msg;
        this.f201279b = videoInfo;
        this.f201280c = reporter;
        this.f201281d = onGotTask;
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "create c2c online task: filename=" + msg.z0());
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        dn.o j17 = t21.o2.Di().j(msg.z0(), true);
        if (j17 == null && msg.M2()) {
            j17 = new dn.o();
            j17.f241785d = "task_OnlineVideoUIHelper";
            t21.v2 v2Var = this.f201279b;
            j17.field_mediaId = com.tencent.mm.modelcdntran.i2.b("downvideo", v2Var.f415012j, v2Var.h(), this.f201279b.d());
            t21.v2 v2Var2 = this.f201279b;
            j17.M1 = v2Var2.E.f387333d;
            j17.H1 = 1;
            j17.Z = 7;
            j17.f241809y0 = 4;
            j17.E1 = v2Var2.d();
            j17.field_fullpath = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(msg, bm5.f0.f22571s, this.f201279b.d(), true);
            j17.G1 = this.f201279b.f415008f;
        }
        this.f201282e = j17;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOnlineVideoArgs");
        boolean z17 = false;
        if (!(d17 == null || d17.length() == 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "online video config : " + d17);
            kotlin.jvm.internal.o.d(d17);
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(";").g(d17, 0).toArray(new java.lang.String[0]);
            if (strArr.length >= 4) {
                this.f201284g = com.tencent.mm.sdk.platformtools.t8.P(strArr[0], 5);
                this.f201285h = com.tencent.mm.sdk.platformtools.t8.P(strArr[1], 1);
                this.f201287j = com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 75);
                this.f201286i = com.tencent.mm.sdk.platformtools.t8.P(strArr[3], 1) * 1048576;
                z17 = true;
            }
        }
        if (!z17) {
            this.f201284g = 5;
            this.f201285h = 1;
            this.f201287j = 75;
            this.f201286i = 1048576;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]", java.lang.Integer.valueOf(this.f201284g), java.lang.Integer.valueOf(this.f201285h), java.lang.Integer.valueOf(this.f201287j), java.lang.Integer.valueOf(this.f201286i));
    }

    @Override // fk4.p
    public void a() {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String e17 = e();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(e17);
        if (h17 != null) {
            this.f201279b = h17;
        }
    }

    @Override // fk4.p
    public java.lang.Long c() {
        return java.lang.Long.valueOf(this.f201278a.getMsgId());
    }

    @Override // fk4.p
    public int d() {
        return this.f201287j;
    }

    @Override // fk4.p
    public java.lang.String e() {
        dn.o oVar = this.f201282e;
        if (oVar != null) {
            return oVar.E1;
        }
        return null;
    }

    @Override // fk4.p
    public void f(int i17) {
        dn.o oVar = this.f201282e;
        if (oVar == null) {
            return;
        }
        oVar.H1 = i17;
    }

    @Override // fk4.p
    public boolean g() {
        return false;
    }

    @Override // fk4.p
    public long getLength() {
        return this.f201282e != null ? r0.G1 : this.f201279b.f415015m;
    }

    @Override // fk4.p
    public boolean h() {
        return this.f201283f;
    }

    @Override // fk4.p
    public java.lang.String i() {
        dn.o oVar = this.f201282e;
        if (oVar != null) {
            return oVar.field_mediaId;
        }
        return null;
    }

    @Override // fk4.p
    public boolean isFinished() {
        return this.f201279b.i() || this.f201279b.f415011i == 123;
    }

    @Override // fk4.p
    public java.lang.String j() {
        return ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).Zi(this.f201278a);
    }

    @Override // fk4.p
    public java.lang.String k() {
        return null;
    }

    @Override // fk4.p
    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "finishRemaining()");
        dn.o oVar = this.f201282e;
        t21.d3.J(oVar != null ? oVar.E1 : null, 2);
    }

    @Override // fk4.p
    public boolean start() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "start task: path=" + j());
        boolean aj6 = ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj();
        com.tencent.mm.storage.f9 f9Var = this.f201278a;
        if (aj6) {
            if (f9Var.A0() == 1 && !f9Var.M2() && !f9Var.z2() && com.tencent.mm.sdk.platformtools.t8.K0(this.f201279b.L)) {
                return false;
            }
        } else if (f9Var.A0() == 1 && !f9Var.M2() && !f9Var.z2()) {
            return false;
        }
        dn.o oVar = this.f201282e;
        if (oVar == null) {
            return false;
        }
        if (oVar != null) {
            this.f201281d.invoke(oVar);
        }
        java.lang.String i17 = i();
        if (i17 == null || i17.length() == 0) {
            return false;
        }
        long j17 = this.f201279b.f415008f;
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "video size[" + j17 + "] less than config size[0], do not stream video");
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            t21.v2 v2Var = this.f201279b;
            ((vf0.y1) x1Var).getClass();
            t21.d3.F(v2Var, 9);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 17L, 1L, false);
            return false;
        }
        this.f201283f = true;
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.M(f9Var);
        boolean i18 = t21.o2.Zi().i();
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().e(oVar, i18);
        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
        t21.v2 v2Var2 = this.f201279b;
        ((vf0.y1) x1Var2).getClass();
        t21.d3.F(v2Var2, 1);
        return true;
    }

    @Override // fk4.p
    public void stop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoDownloadTask", "stop()");
        this.f201283f = false;
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        java.lang.String i17 = i();
        ok4.b v17 = this.f201280c.v();
        Di.g(i17, new java.lang.Integer[]{java.lang.Integer.valueOf(v17.f345966a), java.lang.Integer.valueOf(v17.f345967b), java.lang.Integer.valueOf(v17.f345968c), java.lang.Integer.valueOf(v17.f345969d), java.lang.Integer.valueOf(v17.f345970e), java.lang.Integer.valueOf(v17.f345971f), java.lang.Integer.valueOf(v17.f345972g)});
    }
}
