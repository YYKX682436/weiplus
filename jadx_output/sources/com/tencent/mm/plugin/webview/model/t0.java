package com.tencent.mm.plugin.webview.model;

/* loaded from: classes12.dex */
public class t0 implements com.tencent.mm.sdk.platformtools.o6 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f183110g = {l75.n0.getCreateSQLs(dm.t6.initAutoDBInfo(dm.t6.class), "JsLogBlockList")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f183111d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.p6 f183112e = new com.tencent.mm.sdk.platformtools.p6(this, gm0.j1.e().a(), 100, 20, 300000, 1000);

    /* renamed from: f, reason: collision with root package name */
    public long f183113f;

    public t0(l75.k0 k0Var) {
        this.f183111d = k0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.o6
    public boolean B() {
        l75.k0 k0Var = this.f183111d;
        if (k0Var.G()) {
            return false;
        }
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f183113f = F;
        return F > 0;
    }

    @Override // com.tencent.mm.sdk.platformtools.o6
    public void d0(com.tencent.mm.sdk.platformtools.p6 p6Var, com.tencent.mm.sdk.platformtools.n6 n6Var) {
        int i17 = n6Var.f192872a;
        l75.k0 k0Var = this.f183111d;
        if (i17 == 1) {
            android.content.ContentValues contentValues = new android.content.ContentValues(2);
            contentValues.put("logId", (java.lang.Integer) n6Var.f192873b);
            contentValues.put("liftTime", (java.lang.Long) n6Var.f192874c);
            k0Var.m("JsLogBlockList", "logId", contentValues);
            return;
        }
        if (i17 != 2) {
            return;
        }
        k0Var.delete("JsLogBlockList", "logId=" + n6Var.f192873b, null);
    }

    @Override // com.tencent.mm.sdk.platformtools.o6
    public void u() {
        long j17 = this.f183113f;
        if (j17 > 0) {
            this.f183111d.w(java.lang.Long.valueOf(j17));
        }
    }
}
