package dv2;

/* loaded from: classes2.dex */
public final class p1 extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f243928b = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, false);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dv2.s1 f243929c;

    public p1(dv2.s1 s1Var) {
        this.f243929c = s1Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        java.util.ArrayList d17 = kz5.c0.d(new com.tencent.mm.plugin.finder.feed.ui.FinderMixCellFragment());
        if (this.f243928b) {
            d17.add(new com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryFragment());
        }
        return d17;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new dv2.r1(this.f243929c);
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        dv2.s1 s1Var = this.f243929c;
        java.util.ArrayList d17 = kz5.c0.d(new dv2.q1(s1Var, s1Var.getString(com.tencent.mm.R.string.f491931lw1), 7));
        if (this.f243928b) {
            d17.add(new dv2.q1(s1Var, s1Var.getString(com.tencent.mm.R.string.m9a), 8));
        }
        return d17;
    }
}
