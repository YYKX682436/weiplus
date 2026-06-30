package l85;

/* loaded from: classes12.dex */
public class b1 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.c1 f317133d;

    public b1(l85.c1 c1Var) {
        this.f317133d = c1Var;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        l85.c1 c1Var = this.f317133d;
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected() service == null", c1Var.f317136f.getComponent().getClassName(), c1Var.f317137g, c1Var.f317138h);
            return;
        }
        c1Var.f317140m.onServiceConnected(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, c1Var.f317137g), iBinder);
        l85.h1.f317181e.put(java.lang.Integer.valueOf(c1Var.f317140m.hashCode()), iBinder);
        l85.a1 a1Var = new l85.a1(this);
        l85.h1.f317182f.put(java.lang.Integer.valueOf(c1Var.f317140m.hashCode()), a1Var);
        iBinder.linkToDeath(a1Var, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", c1Var.f317136f.getComponent().getClassName(), c1Var.f317137g, c1Var.f317138h);
    }
}
