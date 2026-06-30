package jn2;

/* loaded from: classes5.dex */
public final class k extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f300635d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f300636e;

    public k(java.util.List tabs) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        this.f300635d = tabs;
        this.f300636e = new android.util.SparseArray();
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        container.removeView((android.view.View) any);
        this.f300636e.remove(i17);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f300635d.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        r45.in inVar = (r45.in) kz5.n0.a0(this.f300635d, i17);
        java.lang.String str = inVar != null ? inVar.f377157e : null;
        return str == null ? "" : str;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        r45.in inVar = (r45.in) this.f300635d.get(i17);
        android.content.Context context = container.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        jn2.f0 f0Var = new jn2.f0(context, null, 0, inVar, 6, null);
        container.addView(f0Var);
        this.f300636e.put(i17, f0Var);
        return f0Var;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object any) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(any, "any");
        return kotlin.jvm.internal.o.b(view, any);
    }
}
