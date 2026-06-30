package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContract$NotifyPresenter$msgUpdateListener$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderMentionUpdateEvent f123058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f123059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f123060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$msgUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent, long j17, long j18) {
        super(0);
        this.f123057d = notifyPresenter;
        this.f123058e = finderMentionUpdateEvent;
        this.f123059f = j17;
        this.f123060g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123057d;
        java.util.Iterator it6 = notifyPresenter.f123014q.iterator();
        int i17 = 0;
        loop0: while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) next;
            int i19 = 0;
            for (java.lang.Object obj : arrayList) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.i iVar = (so2.i) obj;
                com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent = this.f123058e;
                am.lc lcVar = finderMentionUpdateEvent.f54306g;
                int i28 = lcVar.f7239d;
                java.util.ArrayList arrayList2 = notifyPresenter.f123012o;
                java.lang.String str = notifyPresenter.f123007g;
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter2 = notifyPresenter;
                if (i28 == 2) {
                    java.lang.String str2 = lcVar.f7240e;
                    com.tencent.mars.xlog.Log.i(str, "msgUpdateListener: FollowEvent index " + i19 + " tabIndex" + i17 + ", finderUsername=" + str2);
                    if (str2 == null || str2.length() == 0) {
                        break loop0;
                    }
                    if (kotlin.jvm.internal.o.b(str2, iVar.f410411d.field_username) && (wxRecyclerAdapter = ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) arrayList2.get(i17)).f123085m) != null) {
                        wxRecyclerAdapter.notifyItemChanged(i19, 2);
                    }
                    it = it6;
                } else {
                    dm.pd pdVar = iVar.f410411d;
                    it = it6;
                    if (pdVar.field_id == this.f123059f || pdVar.field_svrMentionId == this.f123060g) {
                        com.tencent.mars.xlog.Log.i(str, "msgUpdateListener event index " + i19 + " tabIndex" + i17);
                        am.lc lcVar2 = finderMentionUpdateEvent.f54306g;
                        int i29 = lcVar2.f7239d;
                        if (i29 == 0) {
                            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) arrayList2.get(i17)).f123085m;
                            if (wxRecyclerAdapter2 != null) {
                                wxRecyclerAdapter2.notifyItemChanged(i19);
                            }
                        } else if (i29 == 1) {
                            iVar.f410411d.w0(lcVar2.f7238c);
                            arrayList.set(i19, iVar);
                            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) arrayList2.get(i17)).f123085m;
                            if (wxRecyclerAdapter3 != null) {
                                wxRecyclerAdapter3.notifyItemChanged(i19, 1);
                            }
                        }
                    }
                }
                i19 = i27;
                notifyPresenter = notifyPresenter2;
                it6 = it;
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
