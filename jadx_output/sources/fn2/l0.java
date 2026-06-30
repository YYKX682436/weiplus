package fn2;

/* loaded from: classes10.dex */
public final class l0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f264305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f264306e;

    public l0(fn2.m0 m0Var, java.util.List list) {
        this.f264305d = m0Var;
        this.f264306e = list;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        fn2.m0 m0Var = this.f264305d;
        m0Var.f264321o = i17;
        fn2.t0 t0Var = m0Var.f264320n;
        fn2.h1 h1Var = t0Var != null ? (fn2.h1) t0Var.f264402g.get(i17) : null;
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(this.f264306e, i17);
        if (num != null) {
            int intValue = num.intValue();
            if (h1Var != null) {
                kotlinx.coroutines.y0 y0Var = m0Var.f264314e;
                sf2.d3 controller = m0Var.f264313d;
                kotlin.jvm.internal.o.g(controller, "controller");
                fn2.q1 dataSource = m0Var.f264325s;
                kotlin.jvm.internal.o.g(dataSource, "dataSource");
                if (!h1Var.f264273m) {
                    h1Var.f264273m = true;
                    h1Var.f264270g = controller;
                    h1Var.f264274n = java.lang.Integer.valueOf(intValue);
                    h1Var.f264271h = dataSource;
                    h1Var.f264269f = new com.tencent.mm.plugin.finder.live.widget.dv(h1Var, controller, y0Var, new fn2.u0(h1Var, intValue));
                    android.content.Context context = h1Var.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    bm2.k7 k7Var = new bm2.k7(context, controller, intValue, h1Var.f264268e, y0Var, h1Var.f264267d);
                    h1Var.f264272i = k7Var;
                    androidx.recyclerview.widget.RecyclerView recyclerView = h1Var.f264268e;
                    recyclerView.setAdapter(k7Var);
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
                    recyclerView.setOnTouchListener(new zl2.k5(recyclerView));
                    ym5.a1.g(recyclerView, new fn2.v0(h1Var, intValue));
                    if (intValue != 0) {
                        com.tencent.mm.plugin.finder.live.widget.dv dvVar = h1Var.f264269f;
                        if (dvVar != null) {
                            fn2.w0 w0Var = new fn2.w0(intValue, dataSource, h1Var, null);
                            fn2.x0 x0Var = new fn2.x0(h1Var);
                            dvVar.f118162o = w0Var;
                            dvVar.f118163p = x0Var;
                        }
                        com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = h1Var.f264269f;
                        if (dvVar2 != null) {
                            fn2.y0 y0Var2 = new fn2.y0(h1Var, intValue, dataSource, null);
                            fn2.z0 z0Var = new fn2.z0(h1Var);
                            dvVar2.f118164q = y0Var2;
                            dvVar2.f118165r = z0Var;
                        }
                    }
                    fn2.h1.c(h1Var, y0Var, true, false, 4, null);
                }
            }
            if (h1Var != null) {
                fn2.h1 h1Var2 = h1Var.getMarkNeedRefresh() ? h1Var : null;
                if (h1Var2 != null) {
                    h1Var2.setMarkNeedRefresh(false);
                    fn2.h1.c(h1Var2, m0Var.f264314e, false, false, 6, null);
                }
            }
        }
        m0Var.c();
    }
}
