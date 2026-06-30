package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class s extends com.tencent.mm.xcompat.viewpager2.widget.l {

    /* renamed from: a, reason: collision with root package name */
    public final o3.a0 f214780a;

    /* renamed from: b, reason: collision with root package name */
    public final o3.a0 f214781b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.w0 f214782c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f214783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2) {
        super(viewPager2, null);
        this.f214783d = viewPager2;
        this.f214780a = new com.tencent.mm.xcompat.viewpager2.widget.p(this);
        this.f214781b = new com.tencent.mm.xcompat.viewpager2.widget.q(this);
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.l
    public void a(com.tencent.mm.xcompat.viewpager2.widget.c cVar, com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.f214782c = new com.tencent.mm.xcompat.viewpager2.widget.r(this);
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f214783d;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.l
    public void b() {
        c();
    }

    public void c() {
        int a17;
        int i17 = android.R.id.accessibilityActionPageLeft;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f214783d;
        n3.l1.j(android.R.id.accessibilityActionPageLeft, viewPager2);
        n3.l1.h(viewPager2, 0);
        n3.l1.j(android.R.id.accessibilityActionPageRight, viewPager2);
        n3.l1.h(viewPager2, 0);
        n3.l1.j(android.R.id.accessibilityActionPageUp, viewPager2);
        n3.l1.h(viewPager2, 0);
        n3.l1.j(android.R.id.accessibilityActionPageDown, viewPager2);
        n3.l1.h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (a17 = viewPager2.getAdapter().a()) == 0 || !viewPager2.f214749x) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        o3.a0 a0Var = this.f214781b;
        o3.a0 a0Var2 = this.f214780a;
        if (orientation != 0) {
            if (viewPager2.f214735g < a17 - 1) {
                n3.l1.k(viewPager2, new o3.f(android.R.id.accessibilityActionPageDown, null), null, a0Var2);
            }
            if (viewPager2.f214735g > 0) {
                n3.l1.k(viewPager2, new o3.f(android.R.id.accessibilityActionPageUp, null), null, a0Var);
                return;
            }
            return;
        }
        boolean z17 = n3.v0.d(viewPager2.f214738m.f214522b) == 1;
        int i18 = z17 ? 16908360 : 16908361;
        if (z17) {
            i17 = 16908361;
        }
        if (viewPager2.f214735g < a17 - 1) {
            n3.l1.k(viewPager2, new o3.f(i18, null), null, a0Var2);
        }
        if (viewPager2.f214735g > 0) {
            n3.l1.k(viewPager2, new o3.f(i17, null), null, a0Var);
        }
    }
}
