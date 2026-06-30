package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class r3 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView f139278a;

    public r3(com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView) {
        this.f139278a = joinRoomExternalConfirmView;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView = this.f139278a;
        joinRoomExternalConfirmView.f138998f.f451643b.post(new com.tencent.mm.plugin.game.chatroom.view.q3(joinRoomExternalConfirmView, bitmap));
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
