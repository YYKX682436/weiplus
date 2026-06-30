package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class f3 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f193914e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.e3.f193855z, "CleanDeleteItem")};

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.storage.f3 f193915f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193916d;

    public f3(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.e3.f193855z, "CleanDeleteItem", null);
        this.f193916d = k0Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList("CREATE INDEX IF NOT EXISTS ID ON CleanDeleteItem ( id )"));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            k0Var.A("CleanDeleteItem", (java.lang.String) arrayList.get(i17));
        }
        java.lang.System.currentTimeMillis();
        k0Var.w(java.lang.Long.valueOf(F));
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanDeleteItemStorage", "executeInitSQL last time[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static com.tencent.mm.storage.f3 y0() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (f193915f == null) {
            f193915f = new com.tencent.mm.storage.f3(gm0.j1.u().f273153f);
        }
        return f193915f;
    }

    @Override // l75.n0
    public boolean update(long j17, l75.f0 f0Var) {
        return super.update(j17, (dm.c2) f0Var);
    }
}
