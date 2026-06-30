package em1;

/* loaded from: classes7.dex */
public class h implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f255044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f255046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.k3 f255047d;

    public h(em1.d dVar, java.util.ArrayList arrayList, cl.q0 q0Var, cl.k3 k3Var) {
        this.f255045b = arrayList;
        this.f255046c = q0Var;
        this.f255047d = k3Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f255044a = java.lang.System.currentTimeMillis();
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        cl.k3 k3Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.util.ArrayList arrayList = this.f255045b;
        if (!arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            arrayList.clear();
            this.f255046c.b(arrayList2, com.tencent.mm.plugin.appbrand.utils.e3.a(), new em1.g(this, bool));
            return null;
        }
        if (!bool.booleanValue() || (k3Var = this.f255047d) == null) {
            return null;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((com.tencent.mm.plugin.appbrand.y9) k3Var).a(java.lang.System.currentTimeMillis() - this.f255044a);
        return null;
    }
}
