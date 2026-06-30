package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.v4 f202499e;

    public u4(com.tencent.mm.ui.chatting.presenter.v4 v4Var, com.tencent.mm.ui.chatting.presenter.y4 y4Var, android.view.View view) {
        this.f202499e = v4Var;
        this.f202498d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/presenter/PayHistoryListPresenter$HeaderViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.PayHistoryListPresenter", "click detailLayout");
        com.tencent.mm.autogen.events.EntryWalletLedgerEvent entryWalletLedgerEvent = new com.tencent.mm.autogen.events.EntryWalletLedgerEvent();
        java.lang.String str = this.f202499e.f202509f.f202542e;
        am.x4 x4Var = entryWalletLedgerEvent.f54111g;
        x4Var.f8344a = str;
        x4Var.f8345b = new java.lang.ref.WeakReference(this.f202498d.getContext());
        entryWalletLedgerEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 0, 1, 0, 0);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/presenter/PayHistoryListPresenter$HeaderViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
