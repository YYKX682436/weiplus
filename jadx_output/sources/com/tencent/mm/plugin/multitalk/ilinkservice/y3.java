package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s70 f149863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.z3 f149864e;

    public y3(com.tencent.mm.plugin.multitalk.ilinkservice.z3 z3Var, r45.s70 s70Var) {
        this.f149864e = z3Var;
        this.f149863d = s70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.z3 z3Var = this.f149864e;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = z3Var.f149870a;
        i4Var.f149640o2 = true;
        com.tencent.mm.plugin.multitalk.ilinkservice.s sVar = i4Var.f149625g;
        r45.s70 s70Var = this.f149863d;
        sVar.d(s70Var);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = z3Var.f149870a;
        i4Var2.f149625g.b();
        if (s70Var != null) {
            zj3.g gVar = zj3.g.f473302a;
            long j17 = s70Var.f385534d;
            zj3.g.f473303b = j17;
            rq4.u.f399110b = j17;
            rq4.u.f399111c = 0L;
        }
        i4Var2.W(new com.tencent.mm.plugin.multitalk.ilinkservice.x3(this));
    }
}
