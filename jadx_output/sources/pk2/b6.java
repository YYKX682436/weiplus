package pk2;

/* loaded from: classes3.dex */
public final class b6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f355581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f355583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(boolean z17, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f355581d = z17;
        this.f355582e = o9Var;
        this.f355583f = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.res.Resources resources;
        int i17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f355581d;
        pk2.o9 o9Var = this.f355582e;
        if (booleanValue) {
            java.lang.String string = z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwn) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dww);
            kotlin.jvm.internal.o.d(string);
            if (!z17) {
                db5.t7.h(o9Var.f356078d, string);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", z17);
            o9Var.j(qo0.b.f365435x4, bundle);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.f327933J : ml2.t1.K, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            if (z17) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.rj((ml2.r0) c18, 10, null, 2, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.rj((ml2.r0) c19, 9, null, 2, null);
            }
        } else {
            if (z17) {
                resources = o9Var.f356078d.getResources();
                i17 = com.tencent.mm.R.string.dwm;
            } else {
                resources = o9Var.f356078d.getResources();
                i17 = com.tencent.mm.R.string.dwv;
            }
            java.lang.String string2 = resources.getString(i17);
            kotlin.jvm.internal.o.d(string2);
            db5.t7.b(o9Var.f356078d, string2 + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cud));
        }
        this.f355583f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
