package xt2;

/* loaded from: classes3.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f456901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f456902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f456903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.ui.MMActivity mMActivity, cm2.k0 k0Var, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView, xt2.e3 e3Var) {
        super(2);
        this.f456901d = mMActivity;
        this.f456902e = k0Var;
        this.f456903f = finderLiveShoppingCouponView;
        this.f456904g = e3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q62 q62Var = (r45.q62) obj2;
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f456901d;
        r4Var.h3(mMActivity, false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.f327445s, this.f456902e, booleanValue ? "0" : "1", null, 8, null);
        java.lang.String string = q62Var != null ? q62Var.getString(2) : null;
        int integer = q62Var != null ? q62Var.getInteger(3) : 0;
        java.lang.Integer valueOf = q62Var != null ? java.lang.Integer.valueOf(q62Var.getInteger(4)) : null;
        cm2.k0 k0Var = this.f456902e;
        k0Var.j(string, integer, valueOf, 0);
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f456903f;
        if (finderLiveShoppingCouponView != null) {
            finderLiveShoppingCouponView.c(k0Var, this.f456904g.e(), false);
        }
        if (booleanValue) {
            k0Var.i(mMActivity);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "receive coupon failed");
        }
        return jz5.f0.f302826a;
    }
}
