package mw3;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        return kw3.p.Ai().wi((com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent) iEvent, true);
    }
}
