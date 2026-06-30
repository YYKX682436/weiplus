package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class qe implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174230d;

    public qe(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        this.f174230d = textStatusOtherTopicFriendsActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        qj4.s.n(qj4.s.f363958a, 41L, null, 0, null, null, null, 0, 0L, 0L, null, null, null, null, null, 16382, null);
        com.tencent.mm.plugin.textstatus.ui.ce ceVar = com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.f173656z;
        com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity context = this.f174230d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "showMoreOptionBottomSheet");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.textstatus.ui.zd(context);
        k0Var.f211881s = new com.tencent.mm.plugin.textstatus.ui.ae(context);
        k0Var.C = com.tencent.mm.plugin.textstatus.ui.be.f173754a;
        k0Var.v();
        return true;
    }
}
