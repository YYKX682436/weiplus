package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class i extends com.tencent.mm.xcompat.viewpager2.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f214775a;

    public i(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2) {
        this.f214775a = viewPager2;
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void a(int i17) {
        if (i17 == 0) {
            this.f214775a.e();
        }
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void c(int i17) {
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f214775a;
        if (viewPager2.f214735g != i17) {
            viewPager2.f214735g = i17;
            viewPager2.f214751z.b();
        }
    }
}
