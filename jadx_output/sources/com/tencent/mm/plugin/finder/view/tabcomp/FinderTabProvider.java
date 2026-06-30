package com.tencent.mm.plugin.finder.view.tabcomp;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/tabcomp/FinderTabProvider;", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "fragments", "Lzx2/a0;", "tabContainer", "Lzx2/i;", "tabs", "Lzx2/z;", "tabViewAction", "Ljava/util/List;", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "Lzx2/a0;", "getTabContainer", "()Lzx2/a0;", "setTabContainer", "(Lzx2/a0;)V", "getTabs", "setTabs", "Lzx2/z;", "getTabViewAction", "()Lzx2/z;", "setTabViewAction", "(Lzx2/z;)V", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderTabProvider implements com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider {
    private java.util.List<? extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> fragments;
    private zx2.a0 tabContainer;
    private zx2.z tabViewAction;
    private java.util.List<? extends zx2.i> tabs;

    public FinderTabProvider() {
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment.f129263n = 101;
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment2 = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment2.f129263n = 102;
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment3 = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment3.f129263n = 103;
        this.fragments = kz5.c0.d(finderSampleTabFragment, finderSampleTabFragment2, finderSampleTabFragment3);
        this.tabContainer = new zx2.l();
        this.tabs = kz5.c0.d(new zx2.k("喜欢"), new zx2.k("点赞"), new zx2.k("提到"));
        this.tabViewAction = new zx2.y();
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> fragments() {
        return this.fragments;
    }

    public final java.util.List<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> getFragments() {
        return this.fragments;
    }

    public final zx2.a0 getTabContainer() {
        return this.tabContainer;
    }

    public final zx2.z getTabViewAction() {
        return this.tabViewAction;
    }

    public final java.util.List<zx2.i> getTabs() {
        return this.tabs;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public /* bridge */ /* synthetic */ boolean isDynamic() {
        return false;
    }

    public final void setFragments(java.util.List<? extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.fragments = list;
    }

    public final void setTabContainer(zx2.a0 a0Var) {
        kotlin.jvm.internal.o.g(a0Var, "<set-?>");
        this.tabContainer = a0Var;
    }

    public final void setTabViewAction(zx2.z zVar) {
        kotlin.jvm.internal.o.g(zVar, "<set-?>");
        this.tabViewAction = zVar;
    }

    public final void setTabs(java.util.List<? extends zx2.i> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.tabs = list;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return this.tabContainer;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.z tabViewAction() {
        return this.tabViewAction;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List<zx2.i> tabs() {
        return this.tabs;
    }
}
