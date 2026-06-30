package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class k0 extends u25.a {
    public k0(com.tencent.mm.plugin.game.n0 n0Var) {
    }

    @Override // u25.a
    public com.tencent.mm.sdk.event.IEvent a(java.lang.String str) {
        com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent gameLifeStorageNotifyEvent = new com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent();
        gameLifeStorageNotifyEvent.f54364g.getClass();
        return gameLifeStorageNotifyEvent;
    }

    @Override // u25.a
    public l75.s0 b() {
        return ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di();
    }
}
