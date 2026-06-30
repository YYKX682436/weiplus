package l85;

/* loaded from: classes12.dex */
public class y0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.z0 f317238d;

    public y0(l85.z0 z0Var) {
        this.f317238d = z0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.z0 z0Var = this.f317238d;
        z0Var.f317243g.onServiceDisconnected(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, z0Var.f317241e));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", z0Var.f317240d.getComponent().getClassName(), z0Var.f317241e, z0Var.f317242f);
    }
}
