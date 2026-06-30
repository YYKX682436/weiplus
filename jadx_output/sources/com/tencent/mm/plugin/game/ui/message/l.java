package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI f141579d;

    public l(com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI gameMsgCenterUI) {
        this.f141579d = gameMsgCenterUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f141579d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.game.ui.message.e(this);
        k0Var.f211881s = new com.tencent.mm.plugin.game.ui.message.k(this);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
