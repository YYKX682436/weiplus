package dt;

/* loaded from: classes11.dex */
public class c6 extends com.tencent.mm.sdk.event.n {
    public c6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
        com.tencent.mm.ui.vb.i();
        by5.g0.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return true;
    }
}
