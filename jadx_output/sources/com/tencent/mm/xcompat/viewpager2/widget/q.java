package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class q implements o3.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.s f214778a;

    public q(com.tencent.mm.xcompat.viewpager2.widget.s sVar) {
        this.f214778a = sVar;
    }

    @Override // o3.a0
    public boolean a(android.view.View view, o3.s sVar) {
        int currentItem = ((com.tencent.mm.xcompat.viewpager2.widget.ViewPager2) view).getCurrentItem() - 1;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f214778a.f214783d;
        if (viewPager2.f214749x) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }
}
