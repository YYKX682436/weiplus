package dv2;

/* loaded from: classes2.dex */
public final class j extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.v f243872b;

    public j(dv2.v vVar) {
        this.f243872b = vVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        return kz5.c0.i(new com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationFragment(dv2.i.f243865e), new com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationFragment(dv2.i.f243866f));
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new dv2.m(this.f243872b);
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        dv2.v vVar = this.f243872b;
        return kz5.c0.i(new dv2.l(vVar, vVar.getString(com.tencent.mm.R.string.f493806p53)), new dv2.l(vVar, vVar.getString(com.tencent.mm.R.string.p57)));
    }
}
