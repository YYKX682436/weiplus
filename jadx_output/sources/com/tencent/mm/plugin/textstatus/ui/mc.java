package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI f174103d;

    public mc(com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI) {
        this.f174103d = textStatusHistoryUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI = this.f174103d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusHistoryUI.f173633e;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        int computeVerticalScrollRange = wxRecyclerView.computeVerticalScrollRange();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = textStatusHistoryUI.f173633e;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        int computeVerticalScrollExtent = wxRecyclerView2.computeVerticalScrollExtent();
        if (computeVerticalScrollRange <= computeVerticalScrollExtent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "[checkFeedsTail]contentHeight:" + computeVerticalScrollRange + " visibleHeight:" + computeVerticalScrollExtent);
            bk4.d dVar = textStatusHistoryUI.f173635g;
            if (dVar != null) {
                dVar.b();
            } else {
                kotlin.jvm.internal.o.o("dataLoader");
                throw null;
            }
        }
    }
}
