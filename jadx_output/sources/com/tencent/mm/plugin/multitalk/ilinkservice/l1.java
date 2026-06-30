package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s70 f149686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.m1 f149687e;

    public l1(com.tencent.mm.plugin.multitalk.ilinkservice.m1 m1Var, r45.s70 s70Var) {
        this.f149687e = m1Var;
        this.f149686d = s70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.m1 m1Var = this.f149687e;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = m1Var.f149719a;
        i4Var.f149640o2 = true;
        com.tencent.mm.plugin.multitalk.ilinkservice.s sVar = i4Var.f149625g;
        r45.s70 s70Var = this.f149686d;
        sVar.d(s70Var);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = m1Var.f149719a;
        i4Var2.f149625g.b();
        if (s70Var != null) {
            zj3.g gVar = zj3.g.f473302a;
            long j17 = s70Var.f385534d;
            zj3.g.f473303b = j17;
            rq4.u.f399110b = j17;
            rq4.u.f399111c = 0L;
        }
        i4Var2.V(new com.tencent.mm.plugin.multitalk.ilinkservice.k1(this));
    }
}
