package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController f139238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController chatRoomPanelController) {
        super(0);
        this.f139238d = chatRoomPanelController;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f139238d.f138920f;
        if (z2Var != null) {
            z2Var.B();
        }
        return jz5.f0.f302826a;
    }
}
