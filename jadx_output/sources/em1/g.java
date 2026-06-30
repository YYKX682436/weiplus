package em1;

/* loaded from: classes7.dex */
public class g implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f255042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ em1.h f255043b;

    public g(em1.h hVar, java.lang.Boolean bool) {
        this.f255043b = hVar;
        this.f255042a = bool;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        em1.h hVar;
        cl.k3 k3Var;
        if (!this.f255042a.booleanValue() || (k3Var = (hVar = this.f255043b).f255047d) == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((com.tencent.mm.plugin.appbrand.y9) k3Var).a(java.lang.System.currentTimeMillis() - hVar.f255044a);
    }
}
