package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pv f134993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar) {
        super(0);
        this.f134993d = pvVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) this.f134993d.getRootView().findViewById(com.tencent.mm.R.id.m6e);
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout.getRecyclerView();
        }
        return null;
    }
}
