package lj2;

/* loaded from: classes10.dex */
public final class g implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj2.j f318858a;

    public g(lj2.j jVar) {
        this.f318858a = jVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        java.lang.String tag = this.f318858a.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish url: ");
        sb6.append(aVar);
        sb6.append(" from ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f282909a) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        com.tencent.mars.xlog.Log.i(this.f318858a.getTAG(), "onImageLoadStart url: " + aVar);
    }
}
