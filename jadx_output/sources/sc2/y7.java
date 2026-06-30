package sc2;

/* loaded from: classes2.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f406396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f406395d = s0Var;
        this.f406396e = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.z2 z2Var = observer.f3151o;
        java.lang.String simpleName = z2Var == null ? "null" : z2Var.getClass().getSimpleName();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewEventHandler", simpleName);
        xc2.p0 p0Var = observer.f3147h;
        java.lang.Object obj2 = p0Var != null ? p0Var.f453246h : null;
        xc2.n0 n0Var = obj2 instanceof xc2.n0 ? (xc2.n0) obj2 : null;
        long j17 = n0Var != null ? n0Var.f453230i : 0L;
        android.content.Context context = this.f406395d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
        if (p1Var != null) {
            p1Var.O6(this.f406396e.getItemId(), "observer.onPause", jSONObject, j17);
        }
        return jz5.f0.f302826a;
    }
}
