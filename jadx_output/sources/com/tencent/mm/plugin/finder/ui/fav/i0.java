package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class i0 extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.m0 f129176a;

    public i0(com.tencent.mm.plugin.finder.ui.fav.m0 m0Var) {
        this.f129176a = m0Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        return new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new com.tencent.mm.plugin.finder.ui.fav.l0();
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.z tabViewAction() {
        return new com.tencent.mm.plugin.finder.ui.fav.j0(new java.lang.ref.WeakReference(this.f129176a));
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        return new java.util.ArrayList();
    }
}
