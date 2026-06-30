package com.tencent.mm.plugin.game.ui.chat_tab;

@mk0.a
/* loaded from: classes8.dex */
class q0 implements com.tencent.mm.ipcinvoker.j {
    private q0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        com.tencent.mm.autogen.events.GameLifecycleNotifyEvent gameLifecycleNotifyEvent = new com.tencent.mm.autogen.events.GameLifecycleNotifyEvent();
        am.se seVar = gameLifecycleNotifyEvent.f54365g;
        seVar.f7894a = "com.tencent.mm.game.ACTION_EXIT";
        seVar.f7895b = i17;
        gameLifecycleNotifyEvent.e();
    }
}
