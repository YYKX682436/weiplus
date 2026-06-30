package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vc implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.xc f136239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f136241f;

    public vc(com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.a aVar) {
        this.f136239d = xcVar;
        this.f136240e = baseFinderFeed;
        this.f136241f = aVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        long itemId = this.f136240e.getItemId();
        com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar = this.f136239d;
        xcVar.f7(itemId).removeObservers(xcVar.getActivity());
        this.f136241f.invoke();
    }
}
