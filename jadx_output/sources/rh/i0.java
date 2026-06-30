package rh;

/* loaded from: classes12.dex */
public class i0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.l0 f395421a;

    public i0(rh.l0 l0Var) {
        this.f395421a = l0Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        java.util.Map map = ((uh.g) o2Var.f395486c).f427681f;
        rh.l0 l0Var = this.f395421a;
        rh.o0 o0Var = l0Var.f395442b;
        rh.b1 b1Var = o0Var.f395480b;
        rh.h0 h0Var = new rh.h0(this, o2Var);
        wh.n1 n1Var = l0Var.f395441a;
        rh.c1 c1Var = o0Var.f395482d;
        b1Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        c1Var.u(rh.j1.class, new rh.z0(b1Var, c1Var, h0Var, n1Var, linkedHashMap));
        map.put("TimeUid", linkedHashMap);
    }
}
