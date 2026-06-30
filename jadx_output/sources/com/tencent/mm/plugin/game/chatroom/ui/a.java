package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes15.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.c f138829d;

    public a(com.tencent.mm.plugin.game.chatroom.ui.c cVar) {
        this.f138829d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.chatroom.ui.c cVar = this.f138829d;
        if (cVar.f138833c || cVar.f138832b || java.lang.System.currentTimeMillis() - cVar.f138834d < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            return;
        }
        cVar.f138832b = true;
        java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) cVar.f138835e;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo) arrayDeque.poll();
        if (arrayDeque.isEmpty()) {
            wu5.c cVar2 = cVar.f138836f;
            if (cVar2 != null) {
                cVar2.cancel(false);
            }
            cVar.f138836f = null;
        }
        cVar.f138834d = java.lang.System.currentTimeMillis();
        s33.y.i(cVar.f138831a, jumpInfo, 15, null);
    }
}
