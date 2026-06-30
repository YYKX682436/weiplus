package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes4.dex */
public class g0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f139127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView f139128b;

    public g0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f139128b = chatRoomListView;
        this.f139127a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f139127a.B();
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139128b;
        fVar.k(1004L, 1L, 2L, 0L, chatRoomListView.f138906k2, chatRoomListView.f138905j2, "", "", "");
    }
}
