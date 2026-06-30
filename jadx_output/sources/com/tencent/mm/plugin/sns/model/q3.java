package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class q3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, p94.d0 {
    public static final java.util.Vector D = new java.util.Vector();
    public final int A;
    public int B;
    public final int C;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164596d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164597e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f164598f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f164599g;

    /* renamed from: h, reason: collision with root package name */
    public final long f164600h;

    /* renamed from: i, reason: collision with root package name */
    public long f164601i;

    /* renamed from: m, reason: collision with root package name */
    public long f164602m;

    /* renamed from: n, reason: collision with root package name */
    public int f164603n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f164604o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f164605p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f164606q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f164607r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f164608s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f164609t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f164610u;

    /* renamed from: v, reason: collision with root package name */
    public final int f164611v;

    /* renamed from: w, reason: collision with root package name */
    public int f164612w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164613x;

    /* renamed from: y, reason: collision with root package name */
    public long f164614y;

    /* renamed from: z, reason: collision with root package name */
    public final int f164615z;

    public q3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28) {
        this(str, j17, z17, i17, i18, i19, i27, i28, 1);
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.q3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            java.util.Vector vector = D;
            if (vector.contains(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                return false;
            }
            vector.add(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            return true;
        }
    }

    public static synchronized boolean M(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.q3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            D.remove(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        }
        return true;
    }

    @Override // p94.d0
    public int A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return -1;
    }

    @Override // p94.d0
    public boolean C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return this.f164598f;
    }

    @Override // p94.d0
    public long D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j17 = this.f164602m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j17;
    }

    @Override // p94.d0
    public boolean E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f164608s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    public final void I(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int y27 = com.tencent.mm.plugin.sns.model.l4.Fj().y2(11, this.f164597e, this.f164599g);
        if (y27 <= 10 && y27 > 0 && i17 == 0 && i18 == 0) {
            this.f164609t = true;
        } else if (y27 == 0 || (y27 <= 10 && i18 == 207)) {
            this.f164607r = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    public final void J(r45.wb6 wb6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFetchByContinueID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.p3(this, wb6Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFetchByContinueID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    public final void K(r45.xb6 xb6Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        java.util.LinkedList linkedList = xb6Var.f389950f;
        java.lang.String str2 = this.f164597e;
        com.tencent.mm.plugin.sns.model.s5.h(str2, this.f164611v, linkedList, str);
        long j17 = this.f164601i;
        java.util.LinkedList linkedList2 = xb6Var.f389950f;
        if (j17 == 0) {
            this.f164601i = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList2.getFirst()).Id;
        } else {
            this.f164601i = com.tencent.mm.plugin.sns.model.f1.a(j17);
        }
        this.f164602m = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList2.getLast()).Id;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", str2, java.lang.Long.valueOf(this.f164601i), java.lang.Long.valueOf(this.f164602m), java.lang.Integer.valueOf(xb6Var.f389953i));
        com.tencent.mm.plugin.sns.model.f1.d(this.f164597e, this.f164601i, this.f164602m, xb6Var.f389953i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    public final boolean L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f164611v == 64;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = true;
        int i17 = this.f164615z;
        if (i17 != 0 && i17 != 2 && i17 != 1) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        this.f164613x = u0Var;
        int dispatch = dispatch(sVar, this.f164596d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return dispatch;
    }

    @Override // p94.d0
    public long f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j17 = this.f164614y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return 5203;
    }

    @Override // p94.d0
    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return this.f164597e;
    }

    @Override // p94.d0
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f164607r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f164609t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public int k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i17 = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return i17;
    }

    @Override // p94.d0
    public java.lang.String m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        java.lang.String str = this.f164606q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return str;
    }

    @Override // p94.d0
    public boolean o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f164604o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01aa, code lost:
    
        if (r14.V.equals(r6.f389962u.f388077d) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021d  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r30, int r31, int r32, java.lang.String r33, com.tencent.mm.network.v0 r34, byte[] r35) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.q3.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // p94.d0
    public boolean q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f164610u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public long r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j17 = this.f164601i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j17;
    }

    @Override // p94.d0
    public int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return this.f164615z;
    }

    public q3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f164600h = 0L;
        this.f164602m = 0L;
        this.f164603n = 0;
        this.f164604o = false;
        this.f164605p = "";
        this.f164606q = "";
        this.f164607r = false;
        this.f164608s = false;
        this.f164609t = false;
        this.f164610u = false;
        this.f164612w = 0;
        this.f164615z = -1;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.C = i29;
        this.f164597e = str;
        this.f164601i = j17;
        this.f164599g = z17;
        this.f164615z = i18;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwUserPage", "fp userName " + str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwUserPage", "np userName " + str);
        }
        this.f164611v = i27;
        this.A = i28;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wb6();
        lVar.f70665b = new r45.xb6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnswwuserpage";
        lVar.f70667d = 5203;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164596d = a17;
        r45.wb6 wb6Var = (r45.wb6) a17.f70710a.f70684a;
        wb6Var.f389039e = str;
        wb6Var.f389040f = j17;
        wb6Var.f389044m = i19;
        boolean z18 = j17 == 0;
        this.f164598f = z18;
        if (i18 != 1 && i18 != 2 && i18 != 0) {
            int j18 = com.tencent.mm.plugin.sns.model.l4.Kj().j(str);
            long F2 = com.tencent.mm.plugin.sns.model.l4.Fj().F2(z18 ? 0L : j17, j18, str, z17);
            this.f164602m = F2;
            wb6Var.f389042h = F2;
            int c17 = com.tencent.mm.plugin.sns.model.f1.c(F2, j17, str);
            wb6Var.f389043i = c17;
            wb6Var.f389041g = i17;
            if (z18) {
                if (L()) {
                    com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
                    Ej.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str2 = Ej.J0(str).field_albumMd5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f164605p = str2;
                } else {
                    com.tencent.mm.plugin.sns.storage.e2 Ej2 = com.tencent.mm.plugin.sns.model.l4.Ej();
                    Ej2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str3 = Ej2.J0(str).field_md5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f164605p = str3;
                }
                if (this.f164605p == null) {
                    this.f164605p = "";
                }
                wb6Var.f389038d = this.f164605p;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwUserPage", "nextCount: " + j18 + " maxId:" + ca4.z0.t0(j17) + " minId:" + ca4.z0.t0(this.f164602m) + " lastReqTime:" + c17 + " snsSource:" + i17 + " FirstPageMd5:" + this.f164605p);
        } else {
            wb6Var.f389042h = 0L;
            wb6Var.f389041g = i17;
            if (i18 == 1) {
                wb6Var.f389045n = 1;
            }
            this.f164611v = 16;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwUserPage", "maxId:%s, minId:%s, snsSource:%s, pullType:%s", ca4.z0.t0(j17), ca4.z0.t0(this.f164602m), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wb6Var.f389045n));
        }
        this.f164600h = j17;
    }
}
