package uf;

/* loaded from: classes7.dex */
public final class s implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f427098a;

    public s(yz5.l lVar) {
        this.f427098a = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        if (eVar != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", "get volume  fail" + eVar.f2487c);
        }
    }

    @Override // z91.a
    public void b(aa1.e response) {
        aa1.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        java.util.Map map = response.f2489b;
        java.lang.String str = (map == null || (aVar = (aa1.a) map.get("CurrentVolume")) == null) ? null : aVar.f2481a;
        if (!(str == null || str.length() == 0)) {
            uf.h2 h2Var = new uf.h2(true);
            h2Var.f427031b = java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
            this.f427098a.invoke(h2Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "get volume success : " + str);
    }
}
