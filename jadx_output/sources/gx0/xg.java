package gx0;

/* loaded from: classes5.dex */
public final class xg implements jx0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f277186a;

    public xg(gx0.bh bhVar) {
        this.f277186a = bhVar;
    }

    @Override // jx0.g0
    public void a(float f17) {
        gx0.bh bhVar = this.f277186a;
        yy0.m7 m7Var = (yy0.m7) bhVar.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.z2(m7Var, null), 3, null);
        com.tencent.maas.model.time.MJTime Y6 = gx0.bh.Y6(bhVar, f17);
        jx0.h0 h0Var = (jx0.h0) bhVar.L.j();
        if (h0Var != null) {
            h0Var.a(Y6);
        }
    }

    @Override // jx0.g0
    public int b() {
        return this.f277186a.B.f348914a;
    }

    @Override // jx0.g0
    public void c(float f17) {
        gx0.bh bhVar = this.f277186a;
        com.tencent.maas.model.time.MJTime Y6 = gx0.bh.Y6(bhVar, f17);
        if (!Y6.isNumeric() || !bhVar.V6().m7()) {
            bhVar.H = Y6;
            return;
        }
        com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        bhVar.H = InvalidTime;
        bhVar.V6().p7(Y6, true, 4L);
    }

    @Override // jx0.g0
    public void d() {
        this.f277186a.M = false;
    }

    @Override // jx0.g0
    public void e(float f17) {
        gx0.bh bhVar = this.f277186a;
        pf5.e.launchUI$default(bhVar, null, null, new gx0.wg(bhVar, null), 3, null);
    }
}
