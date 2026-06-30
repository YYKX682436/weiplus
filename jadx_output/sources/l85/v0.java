package l85;

/* loaded from: classes12.dex */
public class v0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.w0 f317225d;

    public v0(l85.w0 w0Var) {
        this.f317225d = w0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.w0 w0Var = this.f317225d;
        w0Var.f317227d.f317233h.onServiceDisconnected(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, w0Var.f317227d.f317230e));
        java.lang.String className = w0Var.f317227d.f317229d.getComponent().getClassName();
        l85.x0 x0Var = w0Var.f317227d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, x0Var.f317230e, x0Var.f317231f);
    }
}
