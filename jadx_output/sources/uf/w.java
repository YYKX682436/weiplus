package uf;

/* loaded from: classes7.dex */
public final class w implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f427117b;

    public w(uf.o0 o0Var, yz5.l lVar) {
        this.f427116a = o0Var;
        this.f427117b = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", sb6.toString());
        this.f427117b.invoke(new uf.h2(false));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "pause success");
        this.f427116a.f427062e.c().f452651e.f452663a = x91.j.Paused;
        this.f427117b.invoke(new uf.h2(true));
    }
}
