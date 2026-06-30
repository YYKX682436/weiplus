package te2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f418026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.l f418027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.g f418028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.kv1 kv1Var, te2.l lVar, dk2.g gVar) {
        super(0);
        this.f418026d = kv1Var;
        this.f418027e = lVar;
        this.f418028f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.f2 f2Var = ml2.f2.f327425g;
        r45.kv1 kv1Var = this.f418026d;
        java.lang.String string = kv1Var.getString(0);
        if (string == null) {
            string = "";
        }
        r0Var.Yj(f2Var, string);
        te2.l lVar = this.f418027e;
        qo0.c cVar = lVar.f418182g;
        qo0.b bVar = qo0.b.T4;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!dk2.u7.f234181a.g(ce2.i.U1.b(kv1Var))) {
            bundle.putString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL", kv1Var.getString(2));
        }
        cVar.statusChange(bVar, bundle);
        return kotlinx.coroutines.l.d(lVar.f418187o, null, null, new te2.f(lVar, kv1Var, this.f418028f, null), 3, null);
    }
}
