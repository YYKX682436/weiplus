package uf;

/* loaded from: classes7.dex */
public final class r implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427092a;

    public r(uf.o0 o0Var) {
        this.f427092a = o0Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get position  fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", sb6.toString());
        uf.o0 o0Var = this.f427092a;
        o0Var.f427066i.d();
        uf.o0.a(o0Var, new uf.m(uf.n.f427052m));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        java.util.Map map = response.f2489b;
        if (map == null || map.isEmpty() || !map.containsKey("RelTime") || !map.containsKey("TrackDuration")) {
            return;
        }
        java.lang.String str = ((aa1.a) kz5.c1.h(map, "RelTime")).f2481a;
        java.lang.String str2 = ((aa1.a) kz5.c1.h(map, "TrackDuration")).f2481a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "getProgressTimeMs: relTime = " + str + ", duration =  " + str2);
        int b17 = (int) uf.c.b(str);
        int b18 = (int) uf.c.b(str2);
        uf.o0 o0Var = this.f427092a;
        o0Var.f427070m = b17;
        o0Var.f427059b.l(b17, b18);
        o0Var.f427059b.c((int) ((b17 / b18) * 100));
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "get position success, relTime: " + ((int) uf.c.b(str)) + " duration: " + ((int) uf.c.b(str2)));
    }
}
