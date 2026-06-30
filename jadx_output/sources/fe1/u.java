package fe1;

/* loaded from: classes15.dex */
public final class u extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe1.v f261500d;

    public u(fe1.v vVar) {
        this.f261500d = vVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy, appId=");
        fe1.v vVar = this.f261500d;
        sb6.append(vVar.f261502a);
        sb6.append(", removing manager");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.Manager", sb6.toString());
        ((java.util.concurrent.ConcurrentHashMap) fe1.v.f261501b).remove(vVar.f261502a);
    }
}
