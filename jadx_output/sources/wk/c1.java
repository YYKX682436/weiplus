package wk;

/* loaded from: classes6.dex */
public class c1 extends com.tencent.mm.sdk.event.n {
    public c1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RequestAccountSyncEventListener", "requestAccountSync()");
        if (com.tencent.mm.sdk.platformtools.x2.f193071a != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RequestAccountSyncEventListener", "MMApplicationContext.getContext() == null");
        return false;
    }
}
