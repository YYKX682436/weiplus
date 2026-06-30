package xx0;

/* loaded from: classes5.dex */
public final class a implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.c f457850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.NoScrollViewPager f457851e;

    public a(xx0.c cVar, com.tencent.mm.mj_publisher.finder.widgets.NoScrollViewPager noScrollViewPager) {
        this.f457850d = cVar;
        this.f457851e = noScrollViewPager;
    }

    @Override // oa.c
    public void h0(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    @Override // oa.c
    public void l4(oa.i tab) {
        xx0.d0 d0Var;
        kotlin.jvm.internal.o.g(tab, "tab");
        xx0.f0 f0Var = this.f457850d.f457864g;
        if (f0Var != null) {
            int i17 = tab.f343782e;
            try {
                xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) f0Var.f457899h).get(java.lang.Long.valueOf(((vt3.r) f0Var.f457896e.get(i17)).f440039a));
                if (e0Var == null || (d0Var = e0Var.f457888a) == null) {
                    return;
                }
                d0Var.b();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TemplateTabPagerAdapter", "unselectTabAt: tab is invalid at: " + i17 + ", exception: " + e17);
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        xx0.d0 d0Var;
        kotlin.jvm.internal.o.g(tab, "tab");
        xx0.c cVar = this.f457850d;
        xx0.f0 f0Var = cVar.f457864g;
        if (f0Var != null) {
            int i17 = tab.f343782e;
            try {
                xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) f0Var.f457899h).get(java.lang.Long.valueOf(((vt3.r) f0Var.f457896e.get(i17)).f440039a));
                if (e0Var != null && (d0Var = e0Var.f457888a) != null) {
                    d0Var.a();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TemplateTabPagerAdapter", "selectTabAt: tab is invalid at: " + i17 + ", exception: " + e17);
            }
        }
        if (((vt3.r) kz5.n0.a0(cVar.f457866i, tab.f343782e)) != null) {
            this.f457851e.setCurrentItem(tab.f343782e, false);
        }
    }
}
