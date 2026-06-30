package vo3;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.sdk.event.n {
    public x() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (((com.tencent.mm.autogen.events.BroadcastEvent) iEvent).f54012g.f6298a == 4) {
            com.tencent.mars.xlog.Log.i("OfflineBroadcastEventIListener", "receive old disaster event");
            to3.c0.Ai().Ui().a(0, 0);
        }
        return false;
    }
}
