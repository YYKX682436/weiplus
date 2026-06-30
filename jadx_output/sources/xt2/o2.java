package xt2;

/* loaded from: classes3.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f456920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.content.Context context, xt2.e3 e3Var, cm2.k0 k0Var) {
        super(5);
        this.f456918d = context;
        this.f456919e = e3Var;
        this.f456920f = k0Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        int intValue = ((java.lang.Number) obj3).intValue();
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f456918d;
        r4Var.h3(context, false);
        xt2.e3 e3Var = this.f456919e;
        if (booleanValue || intValue == -200187) {
            this.f456920f.G = false;
            xt2.e3.b(e3Var);
        } else {
            com.tencent.mars.xlog.Log.w(e3Var.f456706h, "issue coupon failed");
            db5.t7.g(context, ((com.tencent.mm.ui.MMActivity) context).getResources().getString(com.tencent.mm.R.string.edx, java.lang.Integer.valueOf(intValue)));
        }
        return jz5.f0.f302826a;
    }
}
