package xt2;

/* loaded from: classes3.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f456944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk2.e f456946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f456947h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.content.Context context, boolean z17, xt2.e3 e3Var, gk2.e eVar, cm2.k0 k0Var) {
        super(0);
        this.f456943d = context;
        this.f456944e = z17;
        this.f456945f = e3Var;
        this.f456946g = eVar;
        this.f456947h = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f456943d;
        r4Var.h3(context, false);
        boolean z17 = this.f456944e;
        xt2.e3 e3Var = this.f456945f;
        if (z17) {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView couponView = e3Var.getCouponView();
            cm2.k0 k0Var = this.f456947h;
            int integer = k0Var.f43360v.getInteger(21);
            qo0.c cVar = e3Var.f456703e;
            if (integer == 1) {
                gk2.e eVar = e3Var.R;
                mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
                if (f6Var != null) {
                    java.lang.String string = k0Var.f43360v.getString(20);
                    f6Var.U = string != null ? string : "";
                }
                qo0.c.a(cVar, qo0.b.f365368j2, null, 2, null);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Fj((ml2.r0) c17, ml2.f4.f327445s, k0Var, "0", null, 8, null);
            } else if (integer == 2) {
                r4Var.h3(mMActivity, true);
                dk2.xf W0 = e3Var.f456705g.W0();
                if (W0 != null) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.lang.String str = k0Var.f43362x;
                    linkedList.add(str != null ? str : "");
                    ((dk2.r4) W0).m0(mMActivity, linkedList, true, new xt2.n2(mMActivity, k0Var, couponView, e3Var));
                }
            } else if (integer == 3) {
                qo0.c.a(cVar, qo0.b.f365349f2, null, 2, null);
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.Fj((ml2.r0) c18, ml2.f4.f327445s, k0Var, "0", null, 8, null);
            }
        } else {
            com.tencent.mars.xlog.Log.w(e3Var.f456706h, "get shop shelf failed");
        }
        return jz5.f0.f302826a;
    }
}
