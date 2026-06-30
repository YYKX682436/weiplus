package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class wl extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f120205d;

    public wl(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        this.f120205d = finderLiveInfiniteLoopView;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(android.view.ViewGroup container) {
        kotlin.jvm.internal.o.g(container, "container");
        finishUpdate((android.view.View) container);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f120205d.f117649o.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object object) {
        kotlin.jvm.internal.o.g(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        java.lang.Object obj = this.f120205d.f117649o.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        android.view.View view = (android.view.View) obj;
        container.addView(view, new androidx.viewpager.widget.ViewPager.LayoutParams());
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View p07, java.lang.Object p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        return kotlin.jvm.internal.o.b(p07, p17);
    }
}
