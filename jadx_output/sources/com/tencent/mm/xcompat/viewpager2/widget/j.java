package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class j extends com.tencent.mm.xcompat.viewpager2.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f214776a;

    public j(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2) {
        this.f214776a = viewPager2;
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void c(int i17) {
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f214776a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f214741p.requestFocus(2);
        }
    }
}
