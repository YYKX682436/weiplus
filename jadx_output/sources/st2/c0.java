package st2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f412241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f412242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(st2.h1 h1Var, cm2.k0 k0Var, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        super(2);
        this.f412240d = h1Var;
        this.f412241e = k0Var;
        this.f412242f = finderLiveShoppingCouponView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q62 q62Var = (r45.q62) obj2;
        zl2.r4 r4Var = zl2.r4.f473950a;
        st2.h1 h1Var = this.f412240d;
        android.content.Context context = h1Var.f412333d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.h3(context, false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.D, this.f412241e, booleanValue ? "0" : "1", null, 8, null);
        java.lang.String string = q62Var != null ? q62Var.getString(2) : null;
        int integer = q62Var != null ? q62Var.getInteger(3) : 0;
        java.lang.Integer valueOf = q62Var != null ? java.lang.Integer.valueOf(q62Var.getInteger(4)) : null;
        int integer2 = q62Var != null ? q62Var.getInteger(5) : 0;
        cm2.k0 k0Var = this.f412241e;
        k0Var.j(string, integer, valueOf, integer2);
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "receive coupon success: " + k0Var);
        this.f412242f.c(k0Var, false, false);
        h1Var.S();
        if (booleanValue) {
            java.lang.String string2 = q62Var != null ? q62Var.getString(6) : null;
            boolean z17 = string2 == null || string2.length() == 0;
            android.view.ViewGroup viewGroup = h1Var.f412333d;
            if (z17) {
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                k0Var.i(context2);
            } else {
                db5.t7.h(viewGroup.getContext(), string2);
            }
            h1Var.G();
            h1Var.P.c0(((mm2.f6) h1Var.f412335f.a(mm2.f6.class)).f329039o);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "receive coupon failed");
        }
        return jz5.f0.f302826a;
    }
}
