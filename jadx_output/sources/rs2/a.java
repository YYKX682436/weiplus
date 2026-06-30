package rs2;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public a(rs2.f fVar) {
        setTabContainer(new rs2.c(fVar));
        setTabViewAction(new rs2.d());
        setTabs(new java.util.LinkedList());
        setFragments(new java.util.LinkedList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
