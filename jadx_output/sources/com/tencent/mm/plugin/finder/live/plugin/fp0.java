package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fp0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f112586d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f112587e;

    public fp0(android.content.Context context, java.util.List views, java.util.List titles) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(views, "views");
        kotlin.jvm.internal.o.g(titles, "titles");
        this.f112586d = views;
        this.f112587e = titles;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f112586d.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return (java.lang.CharSequence) this.f112587e.get(i17);
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        android.view.View view = (android.view.View) this.f112586d.get(i17);
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(object, "object");
        return kotlin.jvm.internal.o.b(view, object);
    }
}
