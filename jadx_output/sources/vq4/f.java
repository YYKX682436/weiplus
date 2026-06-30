package vq4;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.i f439294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vq4.i iVar) {
        super(0);
        this.f439294d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ph.u uVar;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null) {
            return null;
        }
        gi.w0 w0Var = new gi.w0(uVar.f354296h, "voIpProf");
        w0Var.F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
        int i17 = s26.a.f402368f;
        s26.d dVar = s26.d.f402372g;
        w0Var.H(rh.w1.class, s26.a.e(s26.c.e(30, dVar)));
        w0Var.H(rh.r1.class, s26.a.e(s26.c.e(this.f439294d.f439309h, dVar)));
        return w0Var;
    }
}
