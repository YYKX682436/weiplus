package le;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pd.d f318113d;

    public c(le.d dVar, pd.d dVar2) {
        this.f318113d = dVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.customize.impl.g gVar = new com.tencent.luggage.sdk.customize.impl.g();
        pd.d dVar = this.f318113d;
        dVar.b(com.tencent.mm.plugin.appbrand.jsapi.r1.class, gVar);
        dVar.b(ik1.k0.class, new me.a());
    }
}
