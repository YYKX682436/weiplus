package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class xk extends com.tencent.mm.sdk.event.n {
    public xk() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.chatting.RepairerConfigSetVoiceInputLongclickTime();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_SetVoiceInputLongclickTime")) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N(gm0.j1.b().j() + "MicroMsg.ChattingVoice2TxtComponent", 2, null);
        N.B("longclick_guide_interval_override", 3000L);
        N.G("show_longclick_guide", false);
        N.A("longclick_guide_count", 0);
        return true;
    }
}
