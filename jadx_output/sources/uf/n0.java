package uf;

/* loaded from: classes7.dex */
public final class n0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f427055b;

    public n0(uf.o0 o0Var, yz5.l lVar) {
        this.f427054a = o0Var;
        this.f427055b = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", sb6.toString());
        this.f427055b.invoke(new uf.h2(false));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "stop success");
        uf.o0 o0Var = this.f427054a;
        o0Var.f427062e.c().f452651e.f452663a = x91.j.Stopped;
        o0Var.f();
        o0Var.f427066i.d();
        this.f427055b.invoke(new uf.h2(true));
    }
}
