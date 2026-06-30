package zx2;

/* loaded from: classes2.dex */
public final class j implements zx2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f477042a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.HardTouchableLayout f477043b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f477044c;

    @Override // zx2.a0
    public com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout a() {
        return null;
    }

    @Override // zx2.a0
    public com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        return null;
    }

    @Override // zx2.a0
    public void c(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        this.f477042a = (com.google.android.material.tabs.TabLayout) window.findViewById(com.tencent.mm.R.id.nup);
        this.f477044c = (androidx.viewpager.widget.ViewPager) window.findViewById(com.tencent.mm.R.id.f487570p16);
        this.f477043b = (com.tencent.mm.view.HardTouchableLayout) window.findViewById(com.tencent.mm.R.id.nuq);
    }

    @Override // zx2.a0
    public androidx.viewpager.widget.ViewPager e() {
        return this.f477044c;
    }

    @Override // zx2.a0
    public android.view.View f() {
        return null;
    }

    @Override // zx2.a0
    public com.google.android.material.tabs.TabLayout g() {
        return this.f477042a;
    }

    @Override // zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488828al2;
    }

    @Override // zx2.a0
    public com.tencent.mm.view.HardTouchableLayout h() {
        return this.f477043b;
    }
}
