package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.y f195101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f195103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f195104g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f195105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f195106i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f195107m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f195108n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f195109o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f195110p;

    public m0(com.tencent.mm.storage.y yVar, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        this.f195101d = yVar;
        this.f195102e = i17;
        this.f195103f = i18;
        this.f195104g = i19;
        this.f195105h = i27;
        this.f195106i = i28;
        this.f195107m = i29;
        this.f195108n = i37;
        this.f195109o = i38;
        this.f195110p = i39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        dw5.h m17 = a1Var.m();
        long j17 = m17 != null ? m17.f244361d : 0L;
        long i17 = a1Var.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report36986. boxActType:");
        com.tencent.mm.storage.y yVar = this.f195101d;
        sb6.append(yVar);
        sb6.append(", reddotActType:");
        com.tencent.mm.storage.d0.f193826e.getClass();
        java.util.Map map = com.tencent.mm.storage.d0.f193827f;
        int i18 = this.f195102e;
        com.tencent.mm.storage.d0 d0Var = (com.tencent.mm.storage.d0) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i18));
        if (d0Var == null) {
            d0Var = com.tencent.mm.storage.d0.f193828g;
        }
        sb6.append(d0Var);
        sb6.append(", prePos:");
        int i19 = this.f195103f;
        sb6.append(i19);
        sb6.append(", newPos:");
        int i27 = this.f195104g;
        sb6.append(i27);
        sb6.append(", reddotReason:");
        com.tencent.mm.storage.f0.f193896e.getClass();
        java.util.Map map2 = com.tencent.mm.storage.f0.f193897f;
        int i28 = this.f195105h;
        com.tencent.mm.storage.f0 f0Var = (com.tencent.mm.storage.f0) ((java.util.LinkedHashMap) map2).get(java.lang.Integer.valueOf(i28));
        if (f0Var == null) {
            f0Var = com.tencent.mm.storage.f0.f193904p;
        }
        sb6.append(f0Var);
        sb6.append(", boxPositionChangeReason:");
        com.tencent.mm.storage.a0.f193706e.getClass();
        java.util.Map map3 = com.tencent.mm.storage.a0.f193707f;
        int i29 = this.f195106i;
        com.tencent.mm.storage.a0 a0Var = (com.tencent.mm.storage.a0) ((java.util.LinkedHashMap) map3).get(java.lang.Integer.valueOf(i29));
        if (a0Var == null) {
            a0Var = com.tencent.mm.storage.a0.f193713o;
        }
        sb6.append(a0Var);
        sb6.append(", appStatus:");
        int i37 = this.f195107m;
        sb6.append(i37);
        sb6.append(", isBoxInScreen:");
        int i38 = this.f195108n;
        sb6.append(i38);
        sb6.append(", isInChat:");
        int i39 = this.f195109o;
        sb6.append(i39);
        sb6.append(", boxCntInScreen:");
        int i47 = this.f195110p;
        sb6.append(i47);
        sb6.append(", activeId:");
        sb6.append(j17);
        sb6.append(", msgRecordID:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36986, java.lang.Integer.valueOf(yVar.f196345d), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(i17));
    }
}
