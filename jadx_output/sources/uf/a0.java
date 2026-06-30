package uf;

/* loaded from: classes7.dex */
public final class a0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f426967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f426968b;

    public a0(uf.o0 o0Var, int i17) {
        this.f426967a = o0Var;
        this.f426968b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", sb6.toString());
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "playNew: stop success");
        uf.o0 o0Var = this.f426967a;
        o0Var.f427062e.c().f452651e.f452663a = x91.j.Stopped;
        o0Var.f427062e.c().d(((uf.o1) o0Var.f427058a).f427076h, new uf.z(o0Var, this.f426968b));
    }
}
