package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s70 f149868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.a3 f149869e;

    public z2(com.tencent.mm.plugin.multitalk.ilinkservice.a3 a3Var, r45.s70 s70Var) {
        this.f149869e = a3Var;
        this.f149868d = s70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.a3 a3Var = this.f149869e;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = a3Var.f149508a;
        i4Var.f149640o2 = true;
        r45.s70 s70Var = this.f149868d;
        if (s70Var != null) {
            zj3.g gVar = zj3.g.f473302a;
            long j17 = s70Var.f385534d;
            zj3.g.f473303b = j17;
            rq4.u.f399110b = j17;
            rq4.u.f399111c = 0L;
        }
        i4Var.f149625g.d(s70Var);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = a3Var.f149508a;
        i4Var2.f149625g.b();
        i4Var2.U(new com.tencent.mm.plugin.multitalk.ilinkservice.y2(this));
    }
}
