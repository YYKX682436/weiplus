package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class w0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x0 f120115d;

    public w0(com.tencent.mm.plugin.finder.live.widget.x0 x0Var) {
        this.f120115d = x0Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [fn2.m0] */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        fn2.b0 b0Var;
        com.tencent.mm.plugin.finder.live.widget.x0 x0Var = this.f120115d;
        x0Var.getClass();
        fn2.s1 s1Var = (fn2.s1) x0Var;
        s1Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongPanel", "Tab selected: " + i17);
        fn2.x1 x1Var = (fn2.x1) ((java.util.LinkedHashMap) s1Var.I).get(java.lang.Integer.valueOf(i17));
        if (x1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Tab selected: ");
            fn2.v1 tabType = x1Var.f264442g;
            sb6.append(tabType);
            com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongTabView", sb6.toString());
            if (x1Var.f264445m) {
                return;
            }
            x1Var.f264445m = true;
            com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongTabView", "Initializing tab content for tabType: " + tabType);
            android.content.Context context = x1Var.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i18 = x1Var.f264440e;
            kotlinx.coroutines.y0 y0Var = x1Var.f264443h;
            java.lang.String str = x1Var.f264444i;
            sf2.d3 controller = x1Var.f264439d;
            kotlin.jvm.internal.o.g(controller, "controller");
            kotlin.jvm.internal.o.g(tabType, "tabType");
            fn2.u1 sourceScene = x1Var.f264441f;
            kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
            int ordinal = tabType.ordinal();
            if (ordinal == 0) {
                b0Var = new fn2.b0(context, controller, i18, sourceScene, y0Var);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                b0Var = new fn2.m0(context, controller, y0Var, str, sourceScene);
            }
            x1Var.removeAllViews();
            x1Var.addView(b0Var);
            com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongTabView", "Tab view added for tabType: " + tabType);
            kotlinx.coroutines.y0 y0Var2 = x1Var.f264443h;
            if (y0Var2 != null) {
                kotlinx.coroutines.l.d(y0Var2, null, null, new fn2.w1(b0Var, null), 3, null);
            }
        }
    }
}
