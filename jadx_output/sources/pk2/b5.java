package pk2;

/* loaded from: classes3.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f355578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f355580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(boolean z17, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f355578d = z17;
        this.f355579e = o9Var;
        this.f355580f = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            boolean z17 = this.f355578d;
            if (!z17) {
                com.tencent.mm.ui.MMActivity mMActivity = this.f355579e.f356078d;
                db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.dwt));
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.B : ml2.t1.C, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            if (z17) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.rj((ml2.r0) c18, 4, null, 2, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.rj((ml2.r0) c19, 3, null, 2, null);
            }
        }
        this.f355580f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
