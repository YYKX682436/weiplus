package dv2;

/* loaded from: classes2.dex */
public final class q0 extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.t0 f243931b;

    public q0(dv2.t0 t0Var) {
        this.f243931b = t0Var;
    }

    public final com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment a(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        android.content.Intent intent = this.f243931b.getActivity().getIntent();
        if (intent == null || (str2 = intent.getStringExtra("by_pass")) == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment = new com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("tabId", i17);
        bundle.putString("byPassInfo", str2);
        finderPostPlaySquareContainerFragment.setArguments(bundle);
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderPostPlaySquareContainerFragment.f129264o = str;
        finderPostPlaySquareContainerFragment.f129265p = i17;
        finderPostPlaySquareContainerFragment.f109494x = z17;
        return finderPostPlaySquareContainerFragment;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        dv2.t0 t0Var = this.f243931b;
        return kz5.c0.d(a(t0Var.getString(com.tencent.mm.R.string.p4b), 1, true), a(t0Var.getString(com.tencent.mm.R.string.p4g), 2, false));
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new dv2.s0(this.f243931b);
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.z tabViewAction() {
        return new dv2.p0(this.f243931b);
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        dv2.t0 t0Var = this.f243931b;
        return kz5.c0.d(new dv2.r0(t0Var, t0Var.getString(com.tencent.mm.R.string.p4b), 1), new dv2.r0(t0Var, t0Var.getString(com.tencent.mm.R.string.p4g), 2));
    }
}
