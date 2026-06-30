package wk;

/* loaded from: classes12.dex */
public class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent extVoiceMsgIdToFileNameEvent = (com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent) iEvent;
        if (w21.p0.Di() == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SubCoreVoice.getVoiceStg()");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtVoiceMsgIdToFileName", sb6.toString());
            extVoiceMsgIdToFileNameEvent.f54218h.f6133a = "";
        }
        w21.w0 J0 = w21.p0.Di().J0(extVoiceMsgIdToFileNameEvent.f54217g.f8527b, (int) r2.f8526a);
        am.a9 a9Var = extVoiceMsgIdToFileNameEvent.f54218h;
        if (J0 == null) {
            a9Var.f6133a = "";
            return true;
        }
        a9Var.f6133a = J0.f442485b;
        return true;
    }
}
