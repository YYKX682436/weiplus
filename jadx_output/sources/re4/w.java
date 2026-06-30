package re4;

/* loaded from: classes6.dex */
public class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterDynamicConfigUpdatedEventListener", "dynamic config updated.");
        re4.g0.f();
        return true;
    }
}
