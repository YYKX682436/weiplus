package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class n3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, p94.d0 {
    public static final java.util.Vector E = new java.util.Vector();
    public final int A;
    public final int B;
    public int C;
    public final int D;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164492d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164493e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f164494f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f164495g;

    /* renamed from: h, reason: collision with root package name */
    public final long f164496h;

    /* renamed from: i, reason: collision with root package name */
    public long f164497i;

    /* renamed from: m, reason: collision with root package name */
    public long f164498m;

    /* renamed from: n, reason: collision with root package name */
    public int f164499n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f164500o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f164501p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f164502q;

    /* renamed from: r, reason: collision with root package name */
    public long f164503r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f164504s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f164505t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f164506u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f164507v;

    /* renamed from: w, reason: collision with root package name */
    public final int f164508w;

    /* renamed from: x, reason: collision with root package name */
    public int f164509x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164510y;

    /* renamed from: z, reason: collision with root package name */
    public long f164511z;

    public n3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28) {
        this(str, j17, z17, i17, i18, i19, i27, i28, 1);
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.n3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            java.util.Vector vector = E;
            if (vector.contains(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                return false;
            }
            vector.add(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            return true;
        }
    }

    public static synchronized boolean L(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.n3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            E.remove(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        }
        return true;
    }

    @Override // p94.d0
    public int A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return -1;
    }

    @Override // p94.d0
    public boolean C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return this.f164494f;
    }

    @Override // p94.d0
    public long D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j17 = this.f164498m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j17;
    }

    @Override // p94.d0
    public boolean E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f164505t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    public final void I(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int y27 = com.tencent.mm.plugin.sns.model.l4.Fj().y2(11, this.f164493e, this.f164495g);
        if (y27 <= 10 && y27 > 0 && i17 == 0 && i18 == 0) {
            this.f164506u = true;
        } else if (y27 == 0) {
            this.f164504s = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
    }

    public final void J(r45.eb6 eb6Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        java.util.LinkedList linkedList = eb6Var.f373241f;
        java.lang.String str2 = this.f164493e;
        com.tencent.mm.plugin.sns.model.s5.h(str2, this.f164508w, linkedList, str);
        long j17 = this.f164497i;
        java.util.LinkedList linkedList2 = eb6Var.f373241f;
        if (j17 == 0) {
            this.f164497i = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList2.getFirst()).Id;
        } else {
            this.f164497i = com.tencent.mm.plugin.sns.model.f1.a(j17);
        }
        this.f164498m = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList2.getLast()).Id;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", str2, ca4.z0.t0(this.f164497i), ca4.z0.t0(this.f164498m), java.lang.Integer.valueOf(eb6Var.f373244i));
        com.tencent.mm.plugin.sns.model.f1.d(this.f164493e, this.f164497i, this.f164498m, eb6Var.f373244i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
    }

    public final boolean K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f164508w == 64;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = true;
        int i17 = this.A;
        if (i17 != 0 && i17 != 2 && i17 != 1) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        this.f164510y = u0Var;
        int dispatch = dispatch(sVar, this.f164492d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return dispatch;
    }

    @Override // p94.d0
    public long f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j17 = this.f164511z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return 212;
    }

    @Override // p94.d0
    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return this.f164493e;
    }

    @Override // p94.d0
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f164504s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f164506u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public int k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i17 = this.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return i17;
    }

    @Override // p94.d0
    public java.lang.String m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        java.lang.String str = this.f164502q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return str;
    }

    @Override // p94.d0
    public boolean o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f164500o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0886  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r28, int r29, int r30, java.lang.String r31, com.tencent.mm.network.v0 r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.n3.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // p94.d0
    public boolean q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f164507v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public long r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j17 = this.f164497i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j17;
    }

    @Override // p94.d0
    public int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return this.A;
    }

    public n3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f164496h = 0L;
        this.f164498m = 0L;
        this.f164499n = 0;
        this.f164500o = false;
        this.f164501p = "";
        this.f164502q = "";
        this.f164503r = 0L;
        this.f164504s = false;
        this.f164505t = false;
        this.f164506u = false;
        this.f164507v = false;
        this.f164509x = 0;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.D = i29;
        this.f164493e = str;
        this.f164497i = j17;
        this.f164495g = z17;
        this.A = i18;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "fp userName " + str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "np userName " + str);
        }
        this.f164508w = i27;
        this.B = i28;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.db6();
        lVar.f70665b = new r45.eb6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsuserpage";
        lVar.f70667d = 212;
        lVar.f70668e = 99;
        lVar.f70669f = 1000000099;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "filterType:%d sourceType:%d serverType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164492d = a17;
        r45.db6 db6Var = (r45.db6) a17.f70710a.f70684a;
        db6Var.f372286e = str;
        db6Var.f372287f = j17;
        db6Var.f372291m = i19;
        if (!com.tencent.mm.sdk.platformtools.o4.L().getBoolean("ShowWithTaEntrance_" + str, false)) {
            db6Var.f372295q = 1;
        }
        boolean z18 = j17 == 0;
        this.f164494f = z18;
        if (i18 != 1 && i18 != 2 && i18 != 0) {
            int j18 = com.tencent.mm.plugin.sns.model.l4.Kj().j(str);
            long F2 = com.tencent.mm.plugin.sns.model.l4.Fj().F2(z18 ? 0L : j17, j18, str, z17);
            this.f164498m = F2;
            db6Var.f372289h = F2;
            int c17 = com.tencent.mm.plugin.sns.model.f1.c(F2, j17, str);
            db6Var.f372290i = c17;
            db6Var.f372288g = i17;
            if (z18) {
                if (K()) {
                    com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
                    Ej.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str2 = Ej.J0(str).field_albumMd5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f164501p = str2;
                } else {
                    com.tencent.mm.plugin.sns.storage.e2 Ej2 = com.tencent.mm.plugin.sns.model.l4.Ej();
                    Ej2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str3 = Ej2.J0(str).field_md5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f164501p = str3;
                }
                if (this.f164501p == null) {
                    this.f164501p = "";
                }
                db6Var.f372285d = this.f164501p;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + j18 + " maxId:" + ca4.z0.t0(j17) + " minId:" + ca4.z0.t0(this.f164498m) + " lastReqTime:" + c17 + " snsSource:" + i17 + " FirstPageMd5:" + this.f164501p);
        } else {
            db6Var.f372289h = 0L;
            db6Var.f372288g = i17;
            if (i18 == 1) {
                db6Var.f372292n = 1;
            }
            this.f164508w = 16;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "maxId:%s, minId:%s, snsSource:%s, pullType:%s", ca4.z0.t0(j17), ca4.z0.t0(this.f164498m), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(db6Var.f372292n));
        }
        this.f164496h = j17;
    }
}
