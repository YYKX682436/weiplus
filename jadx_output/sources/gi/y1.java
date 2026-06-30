package gi;

/* loaded from: classes12.dex */
public final class y1 extends kh.d {

    /* renamed from: l, reason: collision with root package name */
    public ri.k f272227l;

    /* renamed from: m, reason: collision with root package name */
    public gi.v1 f272228m;

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // kh.d, rh.g, rh.a, rh.e3
    public void c() {
        super.c();
        gi.v1 v1Var = this.f272228m;
        v1Var.getClass();
        pu5.g.f358471a = new gi.u1(v1Var);
    }

    @Override // rh.g, rh.a, rh.e3
    public void e() {
        super.e();
        pu5.g.f358471a = this.f272228m.f272200a;
    }

    @Override // rh.g, rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        java.lang.Math.max(gi.d.f272003k, 5);
        this.f272228m = new gi.v1(this, pu5.g.f358471a, null);
        qh.w wVar = f0Var.f363335d.f363283b;
        if (wVar instanceof ri.k) {
            this.f272227l = (ri.k) wVar;
        }
        cr0.z6 z6Var = (cr0.z6) ((ob0.p3) i95.n0.c(ob0.p3.class));
        z6Var.getClass();
        android.os.Handler battHandler = f0Var.f363337f;
        kotlin.jvm.internal.o.g(battHandler, "battHandler");
        battHandler.post(new cr0.r6(z6Var, battHandler));
    }

    @Override // rh.g
    public wh.i2 o(int i17, long j17, long j18) {
        return super.o(i17, j17, j18);
    }

    @Override // rh.g
    public void q(java.lang.String str, int i17, int i18) {
    }

    @Override // rh.g
    public void s(java.util.List list) {
        rh.o2 o2Var;
        ri.k kVar = this.f272227l;
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "#onTraceOverHeat, size = " + list.size());
            if (list.isEmpty() || (o2Var = (rh.o2) list.get(0)) == null || ((java.lang.Long) ((rh.f) o2Var.f395486c).f395377g.f395552a).longValue() <= 0) {
                return;
            }
            qh.u uVar = new qh.u();
            uVar.i();
            uVar.f363387a.append((java.lang.Object) "| ThreadPool Task Jiffies Tracing OverHeat");
            uVar.a("\n");
            gi.w0 w0Var = new gi.w0(kVar.f363388d, "overheat");
            ((java.util.HashMap) w0Var.f395325g).put(gi.y1.class, list);
            new ri.m().a(w0Var, uVar);
            uVar.f();
            uVar.d();
            new ri.n("overheat").a(w0Var);
        }
    }

    @Override // kh.d, rh.g
    public boolean t(rh.o2 o2Var) {
        return super.t(o2Var);
    }

    @Override // rh.g
    public void v(rh.o2 o2Var) {
        super.v(o2Var);
    }

    @Override // kh.d
    public void w(java.lang.String str, int i17) {
        super.w(str, i17);
    }

    @Override // kh.d
    public void x(java.lang.String str, int i17) {
        super.x(str, i17);
    }
}
