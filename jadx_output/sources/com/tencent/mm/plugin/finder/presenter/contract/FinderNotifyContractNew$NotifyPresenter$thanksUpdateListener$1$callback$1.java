package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f123186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter f123188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f123189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderThanksUpdateEvent f123190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1$callback$1(java.lang.Long l17, java.lang.String str, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter, java.lang.Integer num, com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
        super(0);
        this.f123186d = l17;
        this.f123187e = str;
        this.f123188f = notifyPresenter;
        this.f123189g = num;
        this.f123190h = finderThanksUpdateEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.String str = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thanksUpdateListener event objectID:");
        java.lang.Long l17 = this.f123186d;
        sb6.append(l17);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f123187e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f123188f;
        ir2.a1 a1Var = notifyPresenter.f123164t;
        if (a1Var == null) {
            kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
            throw null;
        }
        int i17 = 0;
        for (java.lang.Object obj : a1Var.f294091d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.i iVar = (so2.i) obj;
            int i19 = iVar.f410411d.field_type;
            java.lang.Integer num = this.f123189g;
            boolean z17 = i19 == 2 && num != null && num.intValue() == 2;
            dm.pd pdVar = iVar.f410411d;
            boolean z18 = pdVar.field_type == 15 && num != null && num.intValue() == 3;
            boolean z19 = pdVar.field_type == 33 && num != null && num.intValue() == 5;
            if (z17 || z18 || z19) {
                long j17 = pdVar.field_objectId;
                if (l17 != null && j17 == l17.longValue() && kotlin.jvm.internal.o.b(pdVar.field_contact.getUsername(), str2)) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B, "thanksUpdateListener event index " + i17);
                    am.md mdVar = this.f123190h.f54333g;
                    pdVar.w0(mdVar != null && mdVar.f7338b);
                    ir2.a1 a1Var2 = notifyPresenter.f123164t;
                    if (a1Var2 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                        throw null;
                    }
                    a1Var2.f294091d.set(i17, iVar);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = notifyPresenter.f123166v;
                    if (notifyViewCallback == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = notifyViewCallback.f123196g;
                    if (refreshLoadMoreLayout != null && (recyclerView = refreshLoadMoreLayout.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                        adapter.notifyItemChanged(i17, 1);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
