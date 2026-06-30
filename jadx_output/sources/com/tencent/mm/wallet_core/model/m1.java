package com.tencent.mm.wallet_core.model;

/* loaded from: classes11.dex */
public class m1 extends l75.a1 {

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String[] f213939k = {"CREATE TABLE IF NOT EXISTS walletcache ( sid TEXT PRIMARY KEY, type INT, value TEXT )"};

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.Object f213940l = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f213941d;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f213946i;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.model.k1 f213942e = new com.tencent.mm.wallet_core.model.k1(this, "walletcache", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, 64);

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f213943f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f213944g = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f213947j = new com.tencent.mm.wallet_core.model.j1(this);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f213945h = new com.tencent.mm.sdk.platformtools.n3("WalletCacheStorage");

    public m1(l75.k0 k0Var) {
        this.f213941d = k0Var;
    }

    @Override // l75.a1
    public boolean f() {
        l75.k0 k0Var = this.f213941d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = k0Var == null ? "null" : java.lang.Boolean.valueOf(k0Var.J());
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletCacheStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    public void g(boolean z17) {
        synchronized (this) {
            this.f213945h.removeCallbacks(this.f213947j);
            this.f213945h.post(this.f213947j);
            this.f213946i = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCacheStorage", "Posted appendAllToDisk");
    }

    public final boolean h(java.lang.String str, java.lang.Object obj, boolean z17) {
        if (obj == null && z17) {
            return true;
        }
        if (str.equals("INT") && (obj instanceof java.lang.Integer)) {
            return true;
        }
        if (str.equals("LONG") && (obj instanceof java.lang.Long)) {
            return true;
        }
        if (str.equals("STRING") && (obj instanceof java.lang.String)) {
            return true;
        }
        if (str.equals("BOOLEAN") && (obj instanceof java.lang.Boolean)) {
            return true;
        }
        if (str.equals("FLOAT") && (obj instanceof java.lang.Float)) {
            return true;
        }
        if (str.equals("DOUBLE") && (obj instanceof java.lang.Double)) {
            return true;
        }
        if (obj != null && z65.c.a()) {
            iz5.a.g("checkType failed, input type and value[" + str + ", " + obj + "] are not match", false);
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCacheStorage", "checkType failed, input type and value[%s, %s] are not match", str, obj);
        }
        return false;
    }

    public java.lang.Object i(com.tencent.mm.storage.u3 u3Var, java.lang.Object obj) {
        if (u3Var == null) {
            return obj;
        }
        java.lang.String name = u3Var.name();
        if (com.tencent.mm.sdk.platformtools.t8.K0(name)) {
            return obj;
        }
        java.lang.String[] split = name.split("_");
        java.lang.String str = split[split.length - 1];
        if (str.equals("SYNC")) {
            str = split[split.length - 2];
        }
        java.lang.String substring = name.substring(0, name.lastIndexOf(str) + str.length());
        iz5.a.d("db is null", this.f213941d);
        java.lang.Object obj2 = this.f213942e.get(substring);
        if (obj2 == null || obj2 == f213940l) {
            obj2 = obj;
        }
        return !h(str, obj2, false) ? obj : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.tencent.mm.storage.u3 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.model.m1.j(com.tencent.mm.storage.u3, java.lang.Object):void");
    }
}
