package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo f139282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView f139283e;

    public s3(com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo, com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView) {
        this.f139282d = backgroundInfo;
        this.f139283e = joinRoomExternalConfirmView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r53.y.a().e(null, this.f139282d.background_url, null, new com.tencent.mm.plugin.game.chatroom.view.r3(this.f139283e));
    }
}
