package wk;

/* loaded from: classes12.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent extVoiceFileNameToMsgIdEvent = (com.tencent.mm.autogen.events.ExtVoiceFileNameToMsgIdEvent) iEvent;
        if (w21.p0.Di() == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SubCoreVoice.getVoiceStg() == null");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtVoiceFileNameToMsgId", sb6.toString());
        }
        w21.w0 z07 = w21.p0.Di().z0(extVoiceFileNameToMsgIdEvent.f54215g.f8367a);
        if (z07 == null) {
            return true;
        }
        extVoiceFileNameToMsgIdEvent.f54216h.f8443a = z07.f442496m;
        return true;
    }
}
