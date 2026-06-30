package rs2;

/* loaded from: classes2.dex */
public final class c extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rs2.f f399325g;

    public c(rs2.f fVar) {
        this.f399325g = fVar;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        androidx.viewpager.widget.ViewPager viewPager;
        kotlin.jvm.internal.o.g(window, "window");
        this.f477056d = null;
        rs2.f fVar = this.f399325g;
        android.view.View rootView = fVar.getRootView();
        android.view.View findViewById = rootView != null ? rootView.findViewById(com.tencent.mm.R.id.nup) : null;
        if (findViewById == null) {
            findViewById = window.findViewById(com.tencent.mm.R.id.nup);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        }
        if (findViewById instanceof com.google.android.material.tabs.TabLayout) {
            this.f477053a = (com.google.android.material.tabs.TabLayout) findViewById;
        } else if (findViewById instanceof com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) {
            this.f477057e = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) findViewById;
        }
        android.view.View rootView2 = fVar.getRootView();
        if (rootView2 == null || (viewPager = (androidx.viewpager.widget.ViewPager) rootView2.findViewById(com.tencent.mm.R.id.f487570p16)) == null) {
            viewPager = (androidx.viewpager.widget.ViewPager) window.findViewById(com.tencent.mm.R.id.f487570p16);
        }
        this.f477055c = viewPager;
    }

    @Override // zx2.a0
    public int d() {
        return com.tencent.mm.R.id.f486482ld3;
    }

    @Override // zx2.l, zx2.a0
    public android.view.View f() {
        return null;
    }

    @Override // zx2.l, zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dse;
    }
}
