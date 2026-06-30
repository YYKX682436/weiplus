package l85;

/* loaded from: classes12.dex */
public class d1 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.e1 f317153d;

    public d1(l85.e1 e1Var) {
        this.f317153d = e1Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        l85.e1 e1Var = this.f317153d;
        e1Var.f317162g.onServiceDisconnected(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, e1Var.f317160e));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", e1Var.f317159d.getComponent().getClassName(), e1Var.f317160e, e1Var.f317161f);
    }
}
