package rs2;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public g() {
        setTabContainer(new rs2.i());
        setTabViewAction(new rs2.j());
        setTabs(new java.util.LinkedList());
        setFragments(new java.util.LinkedList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
