package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f122847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f122848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderMentionUpdateEvent f122849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter, long j17, long j18, com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent) {
        super(0);
        this.f122846d = msgPresenter;
        this.f122847e = j17;
        this.f122848f = j18;
        this.f122849g = finderMentionUpdateEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122846d;
        java.lang.String str = msgPresenter.f122826g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msgUpdateListener event id ");
        long j17 = this.f122847e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.ArrayList arrayList = msgPresenter.f122828i;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.i iVar = (so2.i) next;
            dm.pd pdVar = iVar.f410411d;
            if (pdVar.field_id == j17 || pdVar.field_svrMentionId == this.f122848f) {
                com.tencent.mars.xlog.Log.i(msgPresenter.f122826g, "msgUpdateListener event index " + i17);
                am.lc lcVar = this.f122849g.f54306g;
                int i19 = lcVar.f7239d;
                if (i19 == 0) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f122827h;
                    if (msgViewCallback != null && (wxRecyclerAdapter = msgViewCallback.f122867q) != null) {
                        wxRecyclerAdapter.notifyItemChanged(i17);
                    }
                } else if (i19 == 1) {
                    iVar.f410411d.w0(lcVar.f7238c);
                    arrayList.set(i17, iVar);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback2 = msgPresenter.f122827h;
                    if (msgViewCallback2 != null && (wxRecyclerAdapter2 = msgViewCallback2.f122867q) != null) {
                        wxRecyclerAdapter2.notifyItemChanged(i17, 1);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
