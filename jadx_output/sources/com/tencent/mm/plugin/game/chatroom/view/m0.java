package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController f139219d;

    public m0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController chatRoomPanelController) {
        this.f139219d = chatRoomPanelController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController chatRoomPanelController = this.f139219d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = chatRoomPanelController.f138920f;
        if (z2Var != null) {
            z2Var.B();
        }
        chatRoomPanelController.f138920f = null;
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
