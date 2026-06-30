package qo3;

/* loaded from: classes15.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        po3.p.wi().Bi().f152444b.a();
        po3.p.wi().Di().f152444b.a();
        com.tencent.mars.xlog.Log.i("DismissAllNotificationListener", "dismiss all fail msg notification");
        return false;
    }
}
