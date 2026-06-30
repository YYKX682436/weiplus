package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139298d;

    public t2(com.tencent.mm.plugin.game.chatroom.view.u2 u2Var, java.lang.String str) {
        this.f139298d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent = new com.tencent.mm.autogen.events.NewUserNoticeEvent();
        am.gl glVar = newUserNoticeEvent.f54535g;
        glVar.f6778a = 3;
        glVar.f6780c = this.f139298d;
        newUserNoticeEvent.e();
    }
}
