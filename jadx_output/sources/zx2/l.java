package zx2;

/* loaded from: classes2.dex */
public class l implements zx2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f477053a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.HardTouchableLayout f477054b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f477055c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f477056d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477057e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f477058f;

    @Override // zx2.a0
    public com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout a() {
        return this.f477057e;
    }

    @Override // zx2.a0
    public com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        return this.f477058f;
    }

    @Override // zx2.a0
    public void c(android.view.Window window) {
        android.view.View findViewById;
        androidx.viewpager.widget.ViewPager viewPager;
        com.tencent.mm.view.HardTouchableLayout hardTouchableLayout;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        kotlin.jvm.internal.o.g(window, "window");
        android.view.View findViewById2 = d() != -1 ? window.findViewById(d()) : null;
        if (findViewById2 == null || (findViewById = findViewById2.findViewById(com.tencent.mm.R.id.backBtn)) == null) {
            findViewById = window.findViewById(com.tencent.mm.R.id.backBtn);
        }
        this.f477056d = findViewById;
        android.view.View findViewById3 = findViewById2 != null ? findViewById2.findViewById(com.tencent.mm.R.id.nup) : null;
        if (findViewById3 == null) {
            findViewById3 = window.findViewById(com.tencent.mm.R.id.nup);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        }
        if (findViewById3 instanceof com.google.android.material.tabs.TabLayout) {
            this.f477053a = (com.google.android.material.tabs.TabLayout) findViewById3;
        } else if (findViewById3 instanceof com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) {
            this.f477057e = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) findViewById3;
        }
        if (findViewById2 == null || (viewPager = (androidx.viewpager.widget.ViewPager) findViewById2.findViewById(com.tencent.mm.R.id.f487570p16)) == null) {
            viewPager = (androidx.viewpager.widget.ViewPager) window.findViewById(com.tencent.mm.R.id.f487570p16);
        }
        this.f477055c = viewPager;
        if (findViewById2 == null || (hardTouchableLayout = (com.tencent.mm.view.HardTouchableLayout) findViewById2.findViewById(com.tencent.mm.R.id.nuq)) == null) {
            hardTouchableLayout = (com.tencent.mm.view.HardTouchableLayout) window.findViewById(com.tencent.mm.R.id.nuq);
        }
        this.f477054b = hardTouchableLayout;
        if (findViewById2 == null || (wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2.findViewById(com.tencent.mm.R.id.f485344hd3)) == null) {
            wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) window.findViewById(com.tencent.mm.R.id.f485344hd3);
        }
        this.f477058f = wxRecyclerView;
    }

    @Override // zx2.a0
    public androidx.viewpager.widget.ViewPager e() {
        return this.f477055c;
    }

    @Override // zx2.a0
    public android.view.View f() {
        return this.f477056d;
    }

    @Override // zx2.a0
    public com.google.android.material.tabs.TabLayout g() {
        return this.f477053a;
    }

    @Override // zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ba7;
    }

    @Override // zx2.a0
    public com.tencent.mm.view.HardTouchableLayout h() {
        return this.f477054b;
    }
}
