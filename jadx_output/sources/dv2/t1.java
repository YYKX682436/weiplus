package dv2;

/* loaded from: classes2.dex */
public final class t1 extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.w1 f243948b;

    public t1(dv2.w1 w1Var) {
        this.f243948b = w1Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        return kz5.c0.d(new com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment(1), new com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment(0), new com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment(2));
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new dv2.v1(this.f243948b);
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        dv2.w1 w1Var = this.f243948b;
        return kz5.c0.d(new dv2.u1(w1Var, w1Var.getString(com.tencent.mm.R.string.f491930lw0)), new dv2.u1(w1Var, w1Var.getString(com.tencent.mm.R.string.nxh)), new dv2.u1(w1Var, w1Var.getString(com.tencent.mm.R.string.nxg)));
    }
}
