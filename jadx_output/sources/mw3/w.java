package mw3;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        com.tencent.mars.xlog.Log.i("RevokeMsgListener", "receive revoke msg");
        kw3.p.Ai().Vi(revokeMsgEvent.f54713g.f6396c.Q0(), revokeMsgEvent.f54713g.f6396c, null);
        return false;
    }
}
