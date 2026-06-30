package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class h3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, p94.d0 {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.Vector f164219x = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164220d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f164221e;

    /* renamed from: f, reason: collision with root package name */
    public final long f164222f;

    /* renamed from: g, reason: collision with root package name */
    public long f164223g;

    /* renamed from: h, reason: collision with root package name */
    public long f164224h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f164225i;

    /* renamed from: m, reason: collision with root package name */
    public final int f164226m;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164231r;

    /* renamed from: t, reason: collision with root package name */
    public final int f164233t;

    /* renamed from: u, reason: collision with root package name */
    public final long f164234u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f164235v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f164236w;

    /* renamed from: n, reason: collision with root package name */
    public boolean f164227n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f164228o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f164229p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f164230q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f164232s = 0;

    /* JADX WARN: Can't wrap try/catch for region: R(35:1|(1:114)(1:5)|6|(1:8)(1:113)|9|(2:11|(2:(3:14|(1:16)(1:88)|17)(1:89)|18)(29:90|(1:21)(1:87)|22|(3:24|(1:26)|27)|28|(1:30)(1:86)|31|(3:33|(1:35)|36)|37|(2:39|(19:41|42|43|44|45|46|(1:48)(1:77)|49|(1:51)|52|(2:55|53)|56|57|(2:60|58)|61|62|(1:64)(2:71|(1:73)(1:(1:75)(1:76)))|65|(2:67|68)(1:70)))(1:85)|84|42|43|44|45|46|(0)(0)|49|(0)|52|(1:53)|56|57|(1:58)|61|62|(0)(0)|65|(0)(0)))(2:(3:92|(2:94|(2:96|(2:97|(2:99|(1:107)(2:104|105))(1:109)))(0))(0)|110)(1:112)|111)|19|(0)(0)|22|(0)|28|(0)(0)|31|(0)|37|(0)(0)|84|42|43|44|45|46|(0)(0)|49|(0)|52|(1:53)|56|57|(1:58)|61|62|(0)(0)|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x029c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a0, code lost:
    
        com.tencent.mars.xlog.Log.e("AdPullRequestHelper", "getAdPullEnable, exp=" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x029e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x029f, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x032e A[LOOP:0: B:53:0x0328->B:55:0x032e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0389 A[LOOP:1: B:58:0x0383->B:60:0x0389, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h3(long r21, long r23, int r25) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.h3.<init>(long, long, int):void");
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.h3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            java.util.Vector vector = f164219x;
            if (vector.contains(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
                return false;
            }
            vector.add(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            return true;
        }
    }

    public static synchronized boolean L(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.h3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            f164219x.remove(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        }
        return true;
    }

    @Override // p94.d0
    public int A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return this.f164233t;
    }

    @Override // p94.d0
    public boolean C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return this.f164221e;
    }

    @Override // p94.d0
    public long D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        long j17 = this.f164224h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return j17;
    }

    @Override // p94.d0
    public boolean E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return false;
    }

    public r45.ua6 I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        r45.ua6 ua6Var = (r45.ua6) this.f164220d.f70711b.f70700a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return ua6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0386 A[Catch: all -> 0x0464, TryCatch #0 {all -> 0x0464, blocks: (B:55:0x0294, B:58:0x029d, B:60:0x02b0, B:63:0x02b5, B:65:0x02bd, B:67:0x02e3, B:69:0x02ee, B:70:0x02e9, B:73:0x02f1, B:75:0x02f5, B:77:0x02fb, B:78:0x0304, B:80:0x030c, B:108:0x035b, B:92:0x037a, B:94:0x0386, B:97:0x03c4, B:100:0x03dc, B:103:0x03e6, B:115:0x03f5, B:116:0x0424), top: B:54:0x0294 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r20, int r21, java.lang.String r22, r45.ua6 r23) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.h3.J(int, int, java.lang.String, r45.ua6):void");
    }

    public final void K(r45.ua6 ua6Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.storage.SnsInfo W0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.model.s5.h("@__weixintimtline", this.f164226m, ua6Var.f387170f, str);
        java.util.LinkedList linkedList = ua6Var.f387170f;
        this.f164224h = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getLast()).Id;
        long j17 = this.f164223g;
        if (j17 == 0) {
            this.f164223g = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getFirst()).Id;
        } else {
            this.f164223g = com.tencent.mm.plugin.sns.model.f1.a(j17);
        }
        com.tencent.mm.plugin.sns.model.f1.d("@__weixintimtline", this.f164223g, this.f164224h, ua6Var.f387171g);
        try {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) it.next();
                if (snsObject.NoChange == 0 && (W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(snsObject.Id)) != null && W0.getTimeLine() != null) {
                    ka4.m.f306136a.f(W0);
                    if (W0.getTypeFlag() == 15) {
                        try {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14388, java.lang.Long.valueOf(snsObject.Id), 4, ((r45.jj4) W0.getTimeLine().ContentObj.f369840h.get(0)).f377858g, 0);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
    }

    @Override // p94.d0
    public boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z17 = this.f164233t == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        this.f164231r = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f164220d;
        r45.ta6 ta6Var = (r45.ta6) oVar.f70710a.f70684a;
        java.util.LinkedList v17 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0.v();
        if (v17 == null || v17.isEmpty()) {
            ta6Var.f386246n = 0;
        } else {
            ta6Var.f386247o = v17;
            ta6Var.f386246n = v17.size();
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_UPDATE_SNS_TIMELINE_SCENE_INT;
        ta6Var.f386248p = c17.r(u3Var, 0);
        gm0.j1.u().c().x(u3Var, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsTimeLine", "req sns timeline read exposure size[%d] update scene[%d]", java.lang.Integer.valueOf(ta6Var.f386246n), java.lang.Integer.valueOf(ta6Var.f386248p));
        if (this.f164221e && this.f164236w) {
            java.lang.String str = this.f164235v;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                u64.p pVar = u64.p.f425023a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestPullAd", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "requestPullAd() called with: uuid = " + str);
                if (str == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPullAd", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                } else {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    u64.p.d(str, new jz5.l(bool, null));
                    u64.p.c(str, new jz5.l(bool, null));
                    ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(u64.p.f425029g)), null, null, new u64.l(str, ta6Var, null), 3, null)).p(new u64.m(str));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPullAd", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                }
            }
        }
        int dispatch = dispatch(sVar, oVar, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return dispatch;
    }

    @Override // p94.d0
    public long f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return 0L;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return 211;
    }

    @Override // p94.d0
    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return "@__weixintimtline";
    }

    @Override // p94.d0
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z17 = this.f164227n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z17;
    }

    @Override // p94.d0
    public boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z17 = this.f164228o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z17;
    }

    @Override // p94.d0
    public int k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        int i17 = this.f164232s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return i17;
    }

    @Override // p94.d0
    public java.lang.String m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return "";
    }

    @Override // p94.d0
    public boolean o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0272  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.mm.network.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 1669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.h3.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // p94.d0
    public boolean q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return false;
    }

    @Override // p94.d0
    public long r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        long j17 = this.f164223g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return j17;
    }

    @Override // p94.d0
    public int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return -1;
    }
}
