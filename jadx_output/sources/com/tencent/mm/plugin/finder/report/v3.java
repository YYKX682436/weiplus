package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class v3 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.w3 f125402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f125403h;

    public v3(com.tencent.mm.plugin.finder.report.w3 w3Var, r45.qt2 qt2Var) {
        this.f125402g = w3Var;
        this.f125403h = qt2Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof fc2.t) && ((i17 = ((fc2.t) event).f260985d) == 0 || i17 == 5 || i17 == 4);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            com.tencent.mm.plugin.finder.report.w3 w3Var = this.f125402g;
            fc2.t tVar = (fc2.t) ev6;
            if (w3Var.f125420a != tVar.f260992k) {
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                cl0.g gVar = new cl0.g();
                r45.qt2 qt2Var = this.f125403h;
                b6Var.c(qt2Var, "forward", false, gVar);
                b6Var.c(qt2Var, "tridot", false, new cl0.g());
                w3Var.f125420a = tVar.f260992k;
            }
        }
    }
}
