package iq2;

/* loaded from: classes2.dex */
public final class b0 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293712a;

    public b0(iq2.d0 d0Var) {
        this.f293712a = d0Var;
    }

    @Override // sp2.a4, sp2.b4
    public void a(long j17) {
    }

    @Override // sp2.a4, sp2.b4
    public boolean b(int i17) {
        iq2.d0 d0Var = this.f293712a;
        gp2.l0 l0Var = d0Var.E;
        boolean z17 = false;
        if (l0Var != null && l0Var.K(i17, true)) {
            z17 = true;
        }
        gp2.l0 l0Var2 = d0Var.E;
        if (l0Var2 != null) {
            l0Var2.I(z17);
        }
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "startAutoPlay: playOrder=" + i17 + ", isEnableAutoPlay=" + z17);
        return z17;
    }

    @Override // sp2.a4, sp2.b4
    public boolean c(so2.j5 whichContainer) {
        kotlin.jvm.internal.o.g(whichContainer, "whichContainer");
        return kotlin.jvm.internal.o.b(whichContainer, this.f293712a.f293719c.f301103i);
    }

    @Override // sp2.a4, sp2.b4
    public void d(int i17, long j17) {
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        kotlin.jvm.internal.o.g(cards, "cards");
    }

    @Override // sp2.a4, sp2.b4
    public void f() {
        iq2.d0 d0Var = this.f293712a;
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "stopAutoPlay by caller.");
        gp2.l0 l0Var = d0Var.E;
        if (l0Var == null) {
            return;
        }
        l0Var.I(false);
    }

    @Override // sp2.b4
    public void g() {
        gp2.l0 l0Var = this.f293712a.E;
        if (l0Var != null) {
            l0Var.j();
        }
    }
}
