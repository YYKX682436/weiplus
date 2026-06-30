package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes2.dex */
public final class l0 extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f156287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.fragment.app.FragmentManager fm6, java.util.List fragments) {
        super(fm6, 1);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f156287d = fragments;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f156287d.size();
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) this.f156287d.get(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPickerPagerAdapter", "getItem position:" + i17);
        return fragment;
    }

    @Override // androidx.fragment.app.e2, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        java.lang.Object instantiateItem = super.instantiateItem(container, i17);
        kotlin.jvm.internal.o.f(instantiateItem, "instantiateItem(...)");
        container.toString();
        instantiateItem.toString();
        return instantiateItem;
    }
}
