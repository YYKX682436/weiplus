package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pm implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f135561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderVideoBanner f135562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f135563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f135564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f135565i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f135566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f135567n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f135568o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f135569p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f135570q;

    public pm(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, com.tencent.mm.plugin.finder.view.FinderVideoBanner finderVideoBanner, float f17, float f18, float f19, float f27, int i17, float f28, float f29, float f37) {
        this.f135560d = s0Var;
        this.f135561e = finderHorizontalVideoDrawerUIC;
        this.f135562f = finderVideoBanner;
        this.f135563g = f17;
        this.f135564h = f18;
        this.f135565i = f19;
        this.f135566m = f27;
        this.f135567n = i17;
        this.f135568o = f28;
        this.f135569p = f29;
        this.f135570q = f37;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerTranslation isNaN percent:" + f17);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerTranslation percent:" + f17);
        com.tencent.mm.plugin.finder.view.FinderVideoBanner banner = this.f135562f;
        kotlin.jvm.internal.o.f(banner, "$banner");
        float f18 = 1 - f17;
        float f19 = this.f135567n;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f135561e;
        finderHorizontalVideoDrawerUIC.getClass();
        float f27 = this.f135565i;
        float f28 = f27 > 1.0f ? ((f27 - 1.0f) * f18) + 1.0f : f27 < 1.0f ? 1.0f - ((1.0f - f27) * f18) : 1.0f;
        float f29 = this.f135566m;
        float f37 = f29 > 1.0f ? ((f29 - 1.0f) * f18) + 1.0f : f29 < 1.0f ? 1.0f - ((1.0f - f29) * f18) : 1.0f;
        float f38 = this.f135569p + (f19 * f18);
        float f39 = this.f135570q + (this.f135568o * f18);
        banner.setPivotX(this.f135563g);
        banner.setPivotY(this.f135564h);
        banner.setScaleX(f28);
        banner.setScaleY(f37);
        banner.setTranslationX(f38);
        banner.setTranslationY(f39);
        if (0.0f <= f18 && f18 <= 0.6f) {
            androidx.appcompat.app.AppCompatActivity activity = finderHorizontalVideoDrawerUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            float f47 = 1.0f - (f18 / 0.6f);
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class)).h7(f47);
            in5.s0 s0Var = finderHorizontalVideoDrawerUIC.f133592i;
            if (s0Var != null) {
                float borderClose = (finderHorizontalVideoDrawerUIC.Q6().getBorderClose() - finderHorizontalVideoDrawerUIC.Q6().getF131934f()) - finderHorizontalVideoDrawerUIC.Q6().getTranslation();
                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.kp7);
                if (p17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(f47));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setTranslationY(-borderClose);
                }
                android.view.View p18 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
                if (p18 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(f47));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p18.setTranslationY(-borderClose);
                }
            }
        }
        if (0.6f <= f18 && f18 <= 1.0f) {
            float f48 = (f18 - 0.6f) / 0.4f;
            android.view.View R6 = finderHorizontalVideoDrawerUIC.R6();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(f48));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            R6.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            finderHorizontalVideoDrawerUIC.S6().setAlpha(f48);
            android.view.View view = (android.view.View) ((jz5.n) finderHorizontalVideoDrawerUIC.f133596p).getValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(f48));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) this.f135560d.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.t("horizontalVideoAnimClose");
        }
        this.f135561e.W6();
    }
}
