package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class t0 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.z0 f202472a;

    public t0(com.tencent.mm.ui.chatting.presenter.z0 z0Var) {
        this.f202472a = z0Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mm.storage.f9 f27;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileHistoryListPresenter", "[onItemClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.chatting.presenter.z0 z0Var = this.f202472a;
        z0Var.getClass();
        de5.a.f229396a.k(5, 1, 2);
        view.getContext();
        z0Var.getClass();
        sc5.g gVar = sc5.g.f406572a;
        boolean z17 = sc5.g.f406573b;
        android.content.Context context = z0Var.f202541d;
        if (z17 && (f27 = pt0.f0.f2(z0Var.f202542e, f0Var.f198411d)) != null) {
            gVar.f(context, f27, new sc5.h(java.util.UUID.randomUUID().toString()));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", f0Var.f198411d);
        intent.putExtra("msg_talker", z0Var.f202542e);
        if (z0Var.f202574u == 3) {
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
            intent.putExtra("app_show_share", false);
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI) context).startActivityForResult(intent, 4);
            return;
        }
        android.content.Context context2 = z0Var.f202541d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/chatting/presenter/FileHistoryListPresenter", "enterFileProfile", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseMediaHistoryListItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/chatting/presenter/FileHistoryListPresenter", "enterFileProfile", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseMediaHistoryListItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        this.f202472a.getClass();
        de5.a.f229396a.k(14, 1, 2);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, new com.tencent.mm.ui.chatting.presenter.r0(this, f0Var), new com.tencent.mm.ui.chatting.presenter.s0(this, f0Var), null);
    }
}
