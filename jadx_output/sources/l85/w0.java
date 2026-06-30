package l85;

/* loaded from: classes12.dex */
public class w0 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.x0 f317227d;

    public w0(l85.x0 x0Var) {
        this.f317227d = x0Var;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        l85.h1.f317183g = false;
        l85.x0 x0Var = this.f317227d;
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected() service == null", x0Var.f317229d.getComponent().getClassName(), x0Var.f317230e, x0Var.f317231f);
            return;
        }
        x0Var.f317233h.onServiceConnected(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, x0Var.f317230e), iBinder);
        l85.h1.f317181e.put(java.lang.Integer.valueOf(x0Var.f317233h.hashCode()), iBinder);
        l85.v0 v0Var = new l85.v0(this);
        l85.h1.f317182f.put(java.lang.Integer.valueOf(x0Var.f317233h.hashCode()), v0Var);
        iBinder.linkToDeath(v0Var, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", x0Var.f317229d.getComponent().getClassName(), x0Var.f317230e, x0Var.f317231f);
    }
}
