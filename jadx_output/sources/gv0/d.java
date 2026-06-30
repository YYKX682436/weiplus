package gv0;

/* loaded from: classes5.dex */
public final class d extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f275974d;

    public d(java.util.List tabs) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        this.f275974d = tabs;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object any) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(any, "any");
        container.removeView((android.view.View) any);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f275974d.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return ((mv0.e) this.f275974d.get(i17)).f331538a;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        android.view.View view = ((mv0.e) this.f275974d.get(i17)).f331540c;
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
