package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes8.dex */
public final class rj0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f127495e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.storage.qj0.E, "FinderVideoState")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f127496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.storage.qj0.E, "FinderVideoState", dm.e5.f236619s);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.qj0.E;
        this.f127496d = db6;
    }

    public final void y0(long j17) {
        if (j17 == 0) {
            return;
        }
        p75.n0 n0Var = dm.e5.f236615o;
        p75.m0 i17 = dm.e5.f236618r.i(java.lang.Long.valueOf(j17));
        p75.n0 n0Var2 = dm.e5.f236615o;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        java.lang.String b17 = i17.b();
        java.lang.String[] e17 = i17.e();
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 k0Var = this.f127496d;
        if (k0Var != null) {
            k0Var.delete(table, b17, e17);
        }
    }
}
