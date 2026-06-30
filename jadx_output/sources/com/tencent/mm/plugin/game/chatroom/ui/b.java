package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes15.dex */
public final class b extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.c f138830d;

    public b(com.tencent.mm.plugin.game.chatroom.ui.c cVar) {
        this.f138830d = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        ik1.h0.b(new com.tencent.mm.plugin.game.chatroom.ui.a(this.f138830d));
    }
}
