package st2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f412209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f412211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f412212g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(az2.f fVar, st2.h1 h1Var, boolean z17, cm2.k0 k0Var) {
        super(5);
        this.f412209d = fVar;
        this.f412210e = h1Var;
        this.f412211f = z17;
        this.f412212g = k0Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        mm2.h5 h5Var;
        mm2.i7 i7Var;
        r45.nt2 nt2Var;
        r45.nt2 nt2Var2;
        r45.ie ieVar;
        r45.du5 du5Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        int intValue = ((java.lang.Number) obj3).intValue();
        r45.sw1 sw1Var = (r45.sw1) obj5;
        this.f412209d.b();
        java.lang.String str = null;
        if (booleanValue || intValue == -200187) {
            if (this.f412211f) {
                gk2.e eVar = gk2.e.f272471n;
                if ((eVar == null || (nt2Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).E) == null || nt2Var2.getInteger(0) != 1) ? false : true) {
                    dk2.ef efVar = dk2.ef.f233372a;
                    mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
                    if (((f6Var == null || (nt2Var = f6Var.E) == null || nt2Var.getInteger(1) != 0) ? false : true) && (h5Var = (mm2.h5) efVar.i(mm2.h5.class)) != null && (i7Var = h5Var.f329112g) != null) {
                        st2.h1 h1Var = this.f412210e;
                        mm2.h5 h5Var2 = (mm2.h5) efVar.i(mm2.h5.class);
                        if (h5Var2 != null) {
                            h5Var2.N6(null);
                        }
                        r45.hd5 hd5Var = i7Var.f329148e;
                        if (hd5Var != null) {
                            hd5Var.set(5, 0);
                        }
                        h1Var.P.notifyDataSetChanged();
                    }
                }
            }
            this.f412212g.G = this.f412211f;
            this.f412210e.G();
            qm0.a aVar = ((mm2.f6) this.f412210e.f412335f.a(mm2.f6.class)).f329039o;
            boolean z17 = this.f412211f;
            st2.h1 h1Var2 = this.f412210e;
            if (z17) {
                aVar.getClass();
                java.util.List<so2.j5> list = aVar.f364680a;
                kotlin.jvm.internal.o.f(list, "list");
                synchronized (list) {
                    for (so2.j5 it : list) {
                        kotlin.jvm.internal.o.g(it, "it");
                        if (it instanceof cm2.m0) {
                            ((cm2.m0) it).G = 0;
                        }
                    }
                }
            }
            h1Var2.P.c0(aVar);
            if (this.f412211f) {
                this.f412210e.A();
            }
            this.f412210e.getClass();
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "issue coupon failed");
            android.content.Context context = this.f412210e.f412333d.getContext();
            if (sw1Var != null && (ieVar = (r45.ie) sw1Var.getCustom(0)) != null && (du5Var = ieVar.f376960e) != null) {
                str = du5Var.f372756d;
            }
            if (str == null) {
                str = this.f412210e.f412333d.getContext().getResources().getString(com.tencent.mm.R.string.edx, java.lang.Integer.valueOf(intValue));
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.g(context, str);
        }
        return jz5.f0.f302826a;
    }
}
