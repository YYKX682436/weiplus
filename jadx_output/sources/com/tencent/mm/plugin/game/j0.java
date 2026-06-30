package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class j0 extends u25.a {
    public j0(com.tencent.mm.plugin.game.n0 n0Var) {
    }

    @Override // u25.a
    public com.tencent.mm.sdk.event.IEvent a(java.lang.String str) {
        com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent gameMessageStorageNotifyEvent = new com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent();
        gameMessageStorageNotifyEvent.f54366g.getClass();
        return gameMessageStorageNotifyEvent;
    }

    @Override // u25.a
    public l75.s0 b() {
        return ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
    }
}
