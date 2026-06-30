package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1(boolean z17, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f123209d = z17;
        this.f123210e = notifyViewCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f123209d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123210e;
        if (z17) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.epa);
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3);
            java.lang.String str = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
            notifyViewCallback.s(string, color, false);
        } else {
            java.lang.String str2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
            notifyViewCallback.s(null, 0, false);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = notifyViewCallback.f123196g;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.P(0);
        }
        java.lang.String str3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishRefresh: onFinishRefresh notifyDataSetChanged:");
        sb6.append(notifyViewCallback.f123195f);
        sb6.append(" size:");
        androidx.recyclerview.widget.RecyclerView recyclerView = notifyViewCallback.f123203q;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        sb6.append(adapter != null ? java.lang.Integer.valueOf(adapter.getItemCount()) : null);
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
        return jz5.f0.f302826a;
    }
}
