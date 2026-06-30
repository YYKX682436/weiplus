package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ke extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public ke(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        setTabContainer(new com.tencent.mm.plugin.finder.profile.uic.se());
        setTabViewAction(new com.tencent.mm.plugin.finder.profile.uic.te(finderProfileTabUIC));
        setTabs(new java.util.LinkedList());
        setFragments(new java.util.LinkedList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}
