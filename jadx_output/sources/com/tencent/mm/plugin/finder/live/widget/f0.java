package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class f0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f118297d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x0 f118298e;

    public f0(com.tencent.mm.plugin.finder.live.widget.x0 x0Var) {
        this.f118298e = x0Var;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(obj, "obj");
        container.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return ((fn2.s1) this.f118298e).H.length;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return (java.lang.CharSequence) kz5.z.U(((fn2.s1) this.f118298e).H, i17);
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        java.util.Map map = this.f118297d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            fn2.s1 s1Var = (fn2.s1) this.f118298e;
            s1Var.getClass();
            fn2.v1 v1Var = i17 != 0 ? i17 != 1 ? fn2.v1.f264423f : fn2.v1.f264423f : fn2.v1.f264422e;
            fn2.v1 v1Var2 = fn2.v1.f264423f;
            fn2.t1 t1Var = s1Var.G;
            fn2.x1 x1Var = new fn2.x1(s1Var.f120254e, s1Var.F, t1Var.f264403a, t1Var.f264404b, v1Var, s1Var.C, v1Var == v1Var2 ? t1Var.f264406d : null);
            s1Var.I.put(java.lang.Integer.valueOf(i17), x1Var);
            com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongPanel", "Created tab content view for index: " + i17 + ", type: " + v1Var);
            linkedHashMap.put(valueOf, x1Var);
            obj = x1Var;
        }
        android.view.View view = (android.view.View) obj;
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        return kotlin.jvm.internal.o.b(view, obj);
    }
}
