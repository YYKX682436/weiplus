package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f153109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f153110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17, long j18) {
        super(1);
        this.f153109d = j17;
        this.f153110e = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        ri.i0 i0Var = ri.k0.f395920a;
        long j17 = this.f153109d;
        long j18 = this.f153110e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("hprof", (java.lang.String) it);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
        }
        i0Var.a(new ri.j0(200, null, 0, 0, j17, j18, 0L, 0, null, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 1, 0, 0, 0, 0L, null, null, ri.l0.b(jSONObject), 0, 0, null, null, 0, 0, -67633202, 1, null));
        return jz5.f0.f302826a;
    }
}
