package zt1;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCard.ResetCardRetryCounter", "deal with reset card retry counter event");
        xt1.t0.hj().f456567d.A("PendingCardId", "update PendingCardId set retryCount = 0 where retryCount >= 10");
        return false;
    }
}
