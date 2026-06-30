package uf;

/* loaded from: classes7.dex */
public final class z implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f427131b;

    public z(uf.o0 o0Var, int i17) {
        this.f427130a = o0Var;
        this.f427131b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set AVTransportURI fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", sb6.toString());
        uf.n nVar = uf.n.f427052m;
        uf.o0 o0Var = this.f427130a;
        uf.o0.a(o0Var, new uf.m(nVar, o0Var.f427068k));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "playNew: setAvTransUrl success");
        uf.o0 o0Var = this.f427130a;
        o0Var.f427062e.c().f452651e.f452663a = x91.j.Transitioning;
        o0Var.f427062e.c().c(new uf.y(o0Var, this.f427131b));
    }
}
