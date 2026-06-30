package vo3;

/* loaded from: classes9.dex */
public class a0 extends com.tencent.mm.sdk.event.n {
    public a0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("OfflineDisasterInfoEventListener", "receive disaster update token");
        to3.c0.Ai().Ui().a(0, 0);
        return false;
    }
}
