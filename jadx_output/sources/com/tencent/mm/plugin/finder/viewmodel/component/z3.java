package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z3 extends l93.k0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.a4 f136635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f136636h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMediaLayout f136637i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f136638m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f136639n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f136640o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f136641p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f136642q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f136643r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f136644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f136645t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var, yz5.l lVar, com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout, float f17, float f18, float f19, float f27, int i17, float f28, float f29, float f37, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity, baseFinderFeed);
        this.f136635g = a4Var;
        this.f136636h = lVar;
        this.f136637i = finderMediaLayout;
        this.f136638m = f17;
        this.f136639n = f18;
        this.f136640o = f19;
        this.f136641p = f27;
        this.f136642q = i17;
        this.f136643r = f28;
        this.f136644s = f29;
        this.f136645t = f37;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        float f18 = f17;
        if (java.lang.Float.isNaN(f17)) {
            com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation isNaN percent:" + f18);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation percent:" + f18);
        if (java.lang.Float.isNaN(f17) || f18 > 1.0f) {
            f18 = 1.0f;
        } else if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout mediaLayout = this.f136637i;
        kotlin.jvm.internal.o.f(mediaLayout, "$mediaLayout");
        float f19 = 1;
        float f27 = f19 - f18;
        float f28 = this.f136642q;
        float f29 = this.f136640o;
        float f37 = f29 > 1.0f ? ((f29 - 1.0f) * f27) + 1.0f : f29 < 1.0f ? 1.0f - ((1.0f - f29) * f27) : 1.0f;
        float f38 = this.f136641p;
        float f39 = f38 > 1.0f ? ((f38 - 1.0f) * f27) + 1.0f : f38 < 1.0f ? 1.0f - ((1.0f - f38) * f27) : 1.0f;
        float f47 = this.f136644s + (f28 * f27);
        float f48 = this.f136645t + (this.f136643r * f27);
        com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = this.f136635g;
        a4Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTargetViewProperty setPivot:");
        float f49 = this.f136638m;
        sb6.append(f49);
        sb6.append(' ');
        float f57 = this.f136639n;
        sb6.append(f57);
        sb6.append(" viewPivot: ");
        sb6.append(mediaLayout.getPivotX());
        sb6.append(' ');
        sb6.append(mediaLayout.getPivotY());
        sb6.append("scaleX:");
        sb6.append(f37);
        sb6.append(" scaleY:");
        sb6.append(f39);
        sb6.append(" translationX:");
        sb6.append(f47);
        sb6.append(" translationY:");
        sb6.append(f48);
        com.tencent.mars.xlog.Log.i("FinderAnimateVideoviewUIC", sb6.toString());
        if (!((java.lang.Boolean) ((jz5.n) a4Var.f133711d).getValue()).booleanValue()) {
            mediaLayout.setPivotX(f49);
            mediaLayout.setPivotY(f57);
        }
        mediaLayout.setScaleX(f37);
        mediaLayout.setScaleY(f39);
        mediaLayout.setTranslationX(f47);
        mediaLayout.setTranslationY(f48);
        com.tencent.mm.plugin.finder.viewmodel.component.oc0 oc0Var = a4Var.f133717m;
        if (oc0Var != null) {
            oc0Var.f135465f = f27;
            oc0Var.invalidate();
        }
        float f58 = f19 - f27;
        android.view.View view = a4Var.f133716i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = a4Var.f133720p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view3 = a4Var.f133721q;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = a4Var.f133722r;
        if (view4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view5 = a4Var.f133723s;
        if (view5 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view6 = a4Var.f133724t;
        if (view6 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view7 = a4Var.f133725u;
        if (view7 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view8 = a4Var.f133726v;
        if (view8 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view9 = a4Var.f133727w;
        if (view9 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList9.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view9.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        androidx.appcompat.app.AppCompatActivity activity = a4Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class)).h7(f58);
        if (f18 == 0.0f) {
            com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation end");
            return;
        }
        if (f18 == 1.0f) {
            com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation start");
        }
    }

    @Override // l93.k0, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerDetach");
        this.f136636h.invoke(this);
        this.f136635g.f133729y = false;
        super.b();
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        boolean z19;
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerOpen isOpen:" + z17 + " isBegin:" + z18);
        if (z17 || z18) {
            z19 = true;
        } else {
            this.f136636h.invoke(this);
            z19 = false;
        }
        this.f136635g.f133729y = z19;
    }
}
