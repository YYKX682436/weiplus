package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public final class g implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f200930a;

    /* renamed from: b, reason: collision with root package name */
    public final t21.v2 f200931b;

    /* renamed from: c, reason: collision with root package name */
    public final ok4.c f200932c;

    /* renamed from: d, reason: collision with root package name */
    public final t21.j3 f200933d;

    /* renamed from: e, reason: collision with root package name */
    public dn.o f200934e;

    /* renamed from: f, reason: collision with root package name */
    public t21.v2 f200935f;

    /* renamed from: g, reason: collision with root package name */
    public final int f200936g;

    /* renamed from: h, reason: collision with root package name */
    public final int f200937h;

    /* renamed from: i, reason: collision with root package name */
    public final int f200938i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f200939j;

    /* renamed from: k, reason: collision with root package name */
    public int f200940k;

    public g(com.tencent.mm.storage.f9 msg, t21.v2 videoInfo, ok4.c reporter, t21.j3 parseInfo) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        kotlin.jvm.internal.o.g(parseInfo, "parseInfo");
        this.f200930a = msg;
        this.f200931b = videoInfo;
        this.f200932c = reporter;
        this.f200933d = parseInfo;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOnlineVideoArgs");
        boolean z17 = false;
        if (!(d17 == null || d17.length() == 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2COriginVideoDownloadTask", "online video config : " + d17);
            kotlin.jvm.internal.o.d(d17);
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(";").g(d17, 0).toArray(new java.lang.String[0]);
            if (strArr.length >= 4) {
                this.f200936g = com.tencent.mm.sdk.platformtools.t8.P(strArr[0], 5);
                this.f200937h = com.tencent.mm.sdk.platformtools.t8.P(strArr[1], 1);
                this.f200940k = com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 75);
                this.f200938i = com.tencent.mm.sdk.platformtools.t8.P(strArr[3], 1) * 1048576;
                z17 = true;
            }
        }
        if (!z17) {
            this.f200936g = 5;
            this.f200937h = 1;
            this.f200940k = 75;
            this.f200938i = 1048576;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.C2COriginVideoDownloadTask", "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]", java.lang.Integer.valueOf(this.f200936g), java.lang.Integer.valueOf(this.f200937h), java.lang.Integer.valueOf(this.f200940k), java.lang.Integer.valueOf(this.f200938i));
    }

    @Override // fk4.p
    public void a() {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String e17 = e();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(e17);
        if (h17 != null) {
            this.f200935f = h17;
        }
    }

    @Override // fk4.p
    public java.lang.Long c() {
        return java.lang.Long.valueOf(this.f200930a.getMsgId());
    }

    @Override // fk4.p
    public int d() {
        return this.f200940k;
    }

    @Override // fk4.p
    public java.lang.String e() {
        dn.o oVar = this.f200934e;
        if (oVar != null) {
            return oVar.E1;
        }
        return null;
    }

    @Override // fk4.p
    public void f(int i17) {
        dn.o oVar = this.f200934e;
        if (oVar == null) {
            return;
        }
        oVar.H1 = i17;
    }

    @Override // fk4.p
    public boolean g() {
        return true;
    }

    @Override // fk4.p
    public long getLength() {
        return this.f200934e != null ? r0.G1 : this.f200931b.f415015m;
    }

    @Override // fk4.p
    public boolean h() {
        return this.f200939j;
    }

    @Override // fk4.p
    public java.lang.String i() {
        dn.o oVar = this.f200934e;
        if (oVar != null) {
            return oVar.field_mediaId;
        }
        return null;
    }

    @Override // fk4.p
    public boolean isFinished() {
        t21.v2 v2Var = this.f200935f;
        if (v2Var != null) {
            return v2Var.i() || v2Var.f415011i == 123;
        }
        return false;
    }

    @Override // fk4.p
    public java.lang.String j() {
        java.lang.String str;
        r45.vh4 vh4Var;
        t21.v2 v2Var = this.f200931b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(v2Var.S)) {
            return null;
        }
        int i17 = v2Var.f415026x;
        com.tencent.mm.storage.f9 f9Var = this.f200930a;
        if (i17 == -1) {
            str = !com.tencent.mm.vfs.w6.j(v2Var.f()) ? ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, true) : v2Var.f();
        } else {
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, true);
            if (f9Var.A0() == 1 && (vh4Var = v2Var.H) != null && vh4Var.f388235e) {
                try {
                    java.lang.String r17 = com.tencent.mm.vfs.w6.r(Ai);
                    if (r17 == null) {
                        r17 = "";
                    }
                    if (!r26.i0.n(r17, "/", false)) {
                        r17 = r17.concat("/");
                    }
                    java.lang.String str2 = r17 + com.tencent.mm.vfs.w6.q(Ai) + "_hd.mp4";
                    boolean j17 = com.tencent.mm.vfs.w6.j(str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.C2COriginVideoDownloadTask", "local capture video, hdFilePath: " + str2 + ", exist: " + j17);
                    if (j17) {
                        str = str2;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.C2COriginVideoDownloadTask", "try to get hd filePath error: " + e17.getMessage());
                }
            }
            str = Ai;
        }
        if (str == null || com.tencent.mm.vfs.w6.j(str)) {
            return str;
        }
        java.lang.String Ni = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ni(f9Var, true);
        return com.tencent.mm.vfs.w6.j(Ni) ? Ni : str;
    }

    @Override // fk4.p
    public java.lang.String k() {
        return null;
    }

    @Override // fk4.p
    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2COriginVideoDownloadTask", "finishRemaining()");
        dn.o oVar = this.f200934e;
        t21.d3.J(oVar != null ? oVar.E1 : null, 2);
    }

    public final t21.v2 m(java.lang.String str) {
        if (str == null) {
            return null;
        }
        t21.v2 v2Var = this.f200931b;
        v2Var.o(str);
        t21.v2 v2Var2 = new t21.v2();
        v2Var2.f415019q = v2Var.h();
        v2Var2.f415021s = v2Var.e();
        v2Var2.f415012j = this.f200930a.getCreateTime();
        v2Var2.f415004c = v2Var.f415004c;
        v2Var2.f415016n = v2Var.f415016n;
        v2Var2.n(v2Var.f415020r);
        v2Var2.f415008f = this.f200933d.f414809g;
        v2Var2.f415015m = v2Var.f415015m;
        v2Var2.f415022t = 0;
        v2Var2.f415000a = str;
        v2Var2.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var2.f415017o = 0;
        v2Var2.f415026x = 1;
        v2Var2.f415011i = 111;
        return v2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        if (t21.o2.Ui().C(r4) == false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d1  */
    @Override // fk4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean start() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.g.start():boolean");
    }

    @Override // fk4.p
    public void stop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2COriginVideoDownloadTask", "stop()");
        this.f200939j = false;
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        java.lang.String i17 = i();
        ok4.b v17 = this.f200932c.v();
        Di.g(i17, new java.lang.Integer[]{java.lang.Integer.valueOf(v17.f345966a), java.lang.Integer.valueOf(v17.f345967b), java.lang.Integer.valueOf(v17.f345968c), java.lang.Integer.valueOf(v17.f345969d), java.lang.Integer.valueOf(v17.f345970e), java.lang.Integer.valueOf(v17.f345971f), java.lang.Integer.valueOf(v17.f345972g)});
    }
}
