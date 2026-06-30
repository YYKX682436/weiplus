package k85;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305420g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar) {
        super(0);
        this.f305417d = activity;
        this.f305418e = g0Var;
        this.f305419f = f0Var;
        this.f305420g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k85.t tVar = k85.t.f305439a;
        android.app.Activity activity = this.f305417d;
        d85.g0 g0Var = this.f305418e;
        d85.f0 f0Var = this.f305419f;
        yz5.l lVar = this.f305420g;
        jz5.l h17 = tVar.h(activity, g0Var, f0Var, new k85.k(g0Var, f0Var, lVar, activity), null, null);
        if (((java.lang.Boolean) h17.f302833d).booleanValue() || ((java.lang.Boolean) h17.f302834e).booleanValue()) {
            j85.h.b(j85.h.f298258a, 201L, java.lang.Long.valueOf(this.f305418e.f227193e), java.lang.Long.valueOf(this.f305419f.f227177e), null, 8, null);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
