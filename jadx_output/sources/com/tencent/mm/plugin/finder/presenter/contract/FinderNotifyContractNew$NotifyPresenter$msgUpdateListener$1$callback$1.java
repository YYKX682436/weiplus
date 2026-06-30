package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter f123178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderMentionUpdateEvent f123179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f123180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f123181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter, com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent, long j17, long j18) {
        super(0);
        this.f123178d = notifyPresenter;
        this.f123179e = finderMentionUpdateEvent;
        this.f123180f = j17;
        this.f123181g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f123178d;
        ir2.a1 a1Var = notifyPresenter.f123164t;
        java.lang.Throwable th6 = null;
        java.lang.String str2 = com.tencent.shadow.core.common.HostConstants.LOADER_APPID;
        if (a1Var == null) {
            kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
            throw null;
        }
        java.util.Iterator it = ((java.util.ArrayList) a1Var.f294091d).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                java.lang.Throwable th7 = th6;
                kz5.c0.p();
                throw th7;
            }
            so2.i iVar = (so2.i) next;
            com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent = this.f123179e;
            am.lc lcVar = finderMentionUpdateEvent.f54306g;
            int i19 = lcVar.f7239d;
            int i27 = notifyPresenter.f123155h;
            if (i19 == 2) {
                java.lang.String str3 = lcVar.f7240e;
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B, "msgUpdateListener: FollowEvent index " + i17 + " tabIndex" + i27 + ", finderUsername=" + str3);
                if (str3 == null || str3.length() == 0) {
                    break;
                }
                if (kotlin.jvm.internal.o.b(str3, iVar.f410411d.field_username)) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = notifyPresenter.f123166v;
                    if (notifyViewCallback == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw th6;
                    }
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = notifyViewCallback.f123196g;
                    if (refreshLoadMoreLayout != null && (recyclerView2 = refreshLoadMoreLayout.getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                        adapter2.notifyItemChanged(i17, 2);
                    }
                }
                str = str2;
            } else {
                dm.pd pdVar = iVar.f410411d;
                str = str2;
                if (pdVar.field_id == this.f123180f || pdVar.field_svrMentionId == this.f123181g) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B, "msgUpdateListener event index " + i17 + " tabIndex" + i27);
                    am.lc lcVar2 = finderMentionUpdateEvent.f54306g;
                    int i28 = lcVar2.f7239d;
                    dm.pd pdVar2 = iVar.f410411d;
                    if (i28 == 0) {
                        ir2.a1 a1Var2 = notifyPresenter.f123164t;
                        if (a1Var2 == null) {
                            kotlin.jvm.internal.o.o(str);
                            throw null;
                        }
                        pf5.e.launch$default(a1Var2, null, null, new ir2.z0(pdVar2.field_id, null, null, false, a1Var2, null), 3, null);
                    } else if (i28 == 1) {
                        pdVar2.w0(lcVar2.f7238c);
                        ir2.a1 a1Var3 = notifyPresenter.f123164t;
                        if (a1Var3 == null) {
                            kotlin.jvm.internal.o.o(str);
                            throw null;
                        }
                        ((java.util.ArrayList) a1Var3.f294091d).set(i17, iVar);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = notifyPresenter.f123166v;
                        if (notifyViewCallback2 == null) {
                            kotlin.jvm.internal.o.o("viewCallback");
                            throw null;
                        }
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = notifyViewCallback2.f123196g;
                        if (refreshLoadMoreLayout2 != null && (recyclerView = refreshLoadMoreLayout2.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyItemChanged(i17, 1);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i17 = i18;
            str2 = str;
            th6 = null;
        }
        return jz5.f0.f302826a;
    }
}
