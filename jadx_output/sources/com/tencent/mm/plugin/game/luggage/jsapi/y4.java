package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class y4 implements com.tencent.mm.ipcinvoker.j {
    private y4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.autogen.events.SetGameTabEvent setGameTabEvent = new com.tencent.mm.autogen.events.SetGameTabEvent();
        setGameTabEvent.f54765g.f8606a = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        setGameTabEvent.e();
    }
}
