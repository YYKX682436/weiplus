package iw0;

/* loaded from: classes5.dex */
public final class a extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f295180d;

    public a(java.util.List tabs) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        this.f295180d = tabs;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        container.removeView((android.view.View) any);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f295180d.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return ((kw0.d) this.f295180d.get(i17)).f312798a;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        android.view.View view = ((kw0.d) this.f295180d.get(i17)).f312800c;
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object any) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(any, "any");
        return kotlin.jvm.internal.o.b(view, any);
    }
}
