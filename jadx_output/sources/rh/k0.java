package rh;

/* loaded from: classes12.dex */
public class k0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.l0 f395434a;

    public k0(rh.l0 l0Var) {
        this.f395434a = l0Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.l0 l0Var = this.f395434a;
        rh.o0 o0Var = l0Var.f395442b;
        java.util.Map map = o0Var.f395481c.f427681f;
        rh.j0 j0Var = new rh.j0(this, (rh.o2) obj);
        wh.n1 n1Var = l0Var.f395441a;
        rh.c1 c1Var = o0Var.f395482d;
        rh.b1 b1Var = o0Var.f395480b;
        b1Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        c1Var.u(rh.j1.class, new rh.z0(b1Var, c1Var, j0Var, n1Var, linkedHashMap));
        map.put("JiffyUid", linkedHashMap);
    }
}
