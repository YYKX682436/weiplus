package mt2;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public a(mt2.h hVar) {
        setTabContainer(new mt2.c(hVar));
        setTabViewAction(new mt2.d());
        setTabs(new java.util.LinkedList());
        setFragments(new java.util.LinkedList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
