package com.tencent.mm.plugin.voip.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/voip/model/VoipIncomingCallManager$renderListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/voip/video/render/VoIPRenderEvent;", "plugin-voip_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class VoipIncomingCallManager$renderListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent> {
    public VoipIncomingCallManager$renderListener$1(com.tencent.mm.plugin.voip.model.r1 r1Var, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.__eventId = -1223349174;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent voIPRenderEvent) {
        com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent event = voIPRenderEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f177087g != 2) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.p1(null));
        return false;
    }
}
