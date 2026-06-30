package w92;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public c(int i17) {
        setTabContainer(new w92.b(i17));
        setTabViewAction(new zx2.y());
        setTabs(new java.util.LinkedList());
        setFragments(new java.util.LinkedList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
