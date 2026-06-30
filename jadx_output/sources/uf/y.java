package uf;

/* loaded from: classes7.dex */
public final class y implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f427127b;

    public y(uf.o0 o0Var, int i17) {
        this.f427126a = o0Var;
        this.f427127b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", sb6.toString());
        uf.n nVar = uf.n.f427052m;
        uf.o0 o0Var = this.f427126a;
        uf.o0.a(o0Var, new uf.m(nVar, o0Var.f427068k));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "play new success");
        uf.o0 o0Var = this.f427126a;
        o0Var.f427062e.c().f452654h = o0Var.f427067j;
        uf.c1 c1Var = o0Var.f427062e;
        c1Var.c().f452651e.f452663a = x91.j.Playing;
        c1Var.c().f();
        c1Var.c().g();
        int i17 = this.f427127b;
        if (i17 <= 0) {
            return;
        }
        o0Var.f427069l = new uf.b0(o0Var, i17);
    }
}
