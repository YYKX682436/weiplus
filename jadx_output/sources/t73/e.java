package t73;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent receiveHoneyPayAppMsgEvent = (com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent) iEvent;
        am.up upVar = receiveHoneyPayAppMsgEvent.f54653g;
        com.tencent.mars.xlog.Log.i("ReceiveHoneyPayAppMsgEventIListener", "receive honey pay msg: %s, %s", upVar.f8122b, java.lang.Long.valueOf(upVar.f8121a));
        am.up upVar2 = receiveHoneyPayAppMsgEvent.f54653g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(upVar2.f8122b) || upVar2.f8121a <= -1) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(upVar2.f8124d)) {
            java.lang.String j17 = u73.h.j(upVar2.f8123c, upVar2.f8124d, 6);
            if (j17.equals(upVar2.f8123c)) {
                upVar2.f8123c = null;
            } else {
                upVar2.f8123c = j17;
            }
        }
        u73.b bVar = new u73.b();
        bVar.field_msgId = upVar2.f8121a;
        bVar.field_payMsgId = upVar2.f8122b;
        ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f360381d.a()).insert(bVar);
        return false;
    }
}
