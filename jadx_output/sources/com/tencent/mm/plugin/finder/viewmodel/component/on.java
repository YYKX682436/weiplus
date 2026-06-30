package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class on implements com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider {
    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment());
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new zx2.j();
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.z tabViewAction() {
        return new zx2.y();
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new zx2.k(com.tencent.mm.R.string.f6j));
        return arrayList;
    }
}
