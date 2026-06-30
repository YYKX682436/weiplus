package l85;

/* loaded from: classes12.dex */
public class a1 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.b1 f317131d;

    public a1(l85.b1 b1Var) {
        this.f317131d = b1Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.b1 b1Var = this.f317131d;
        b1Var.f317133d.f317140m.onServiceDisconnected(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var.f317133d.f317137g));
        java.lang.String className = b1Var.f317133d.f317136f.getComponent().getClassName();
        l85.c1 c1Var = b1Var.f317133d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, c1Var.f317137g, c1Var.f317138h);
    }
}
