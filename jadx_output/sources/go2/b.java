package go2;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public b(go2.c cVar) {
        setTabContainer(new go2.a(cVar));
        setTabViewAction(new zx2.y());
        setTabs(new java.util.ArrayList());
        setFragments(new java.util.ArrayList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
