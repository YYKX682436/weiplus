package tv1;

/* loaded from: classes6.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreAccountInitializationNotifiedListener", "All account post reset");
        c01.v1.b(false);
        return false;
    }
}
