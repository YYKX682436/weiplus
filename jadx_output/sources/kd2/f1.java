package kd2;

/* loaded from: classes2.dex */
public final class f1 extends do2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306745d;

    public f1(kd2.p1 p1Var) {
        this.f306745d = p1Var;
    }

    @Override // do2.f, cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        this.f306745d.k0().getClass();
    }

    @Override // do2.f, cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        i95.m c17 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c17;
        kd2.p1 p1Var = this.f306745d;
        cw2.da daVar = p1Var.f306788y;
        cw2.wa f130607n = daVar != null ? daVar.getF130607n() : null;
        cw2.da daVar2 = p1Var.f306788y;
        b0Var.fj(f130607n, daVar2 != null ? java.lang.Long.valueOf(daVar2.getCurrentPlayMs()) : null, eu2.k.f256795e);
    }
}
