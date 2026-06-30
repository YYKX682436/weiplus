package go2;

/* loaded from: classes2.dex */
public final class c1 extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public c1(go2.d1 d1Var) {
        setTabContainer(new go2.b1(d1Var));
        setTabViewAction(new zx2.y());
        setTabs(new java.util.ArrayList());
        setFragments(new java.util.ArrayList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
