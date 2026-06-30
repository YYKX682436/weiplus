package ta1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f416691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416692e;

    public w(ta1.q0 q0Var, android.content.Context context) {
        this.f416692e = q0Var;
        this.f416691d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.app.w7.a();
        ta1.q0 q0Var = this.f416692e;
        q0Var.getClass();
        com.hilive.mediasdk.LoadDelegate.setInstance(new ta1.b0(q0Var));
        com.hilive.mediasdk.LogDelegate.setImp(new ta1.c0(q0Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "init mediasdk");
        q0Var.f416667c.init(this.f416691d);
    }
}
