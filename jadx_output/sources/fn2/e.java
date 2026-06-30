package fn2;

/* loaded from: classes5.dex */
public final class e extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f264246d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264247e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f264248f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f264249g;

    public e(java.util.List tabs, int i17, fn2.u1 sourceScene) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f264246d = tabs;
        this.f264247e = i17;
        this.f264248f = sourceScene;
        this.f264249g = new android.util.SparseArray();
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        container.removeView((android.view.View) any);
        this.f264249g.remove(i17);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f264246d.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        r45.in inVar = (r45.in) kz5.n0.a0(this.f264246d, i17);
        java.lang.String str = inVar != null ? inVar.f377157e : null;
        return str == null ? "" : str;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        r45.in inVar = (r45.in) this.f264246d.get(i17);
        android.content.Context context = container.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fn2.s0 s0Var = new fn2.s0(context, null, 0, inVar, this.f264247e, this.f264248f, 6, null);
        container.addView(s0Var);
        this.f264249g.put(i17, s0Var);
        return s0Var;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object any) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(any, "any");
        return kotlin.jvm.internal.o.b(view, any);
    }
}
