package sx5;

/* loaded from: classes13.dex */
public class v extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413760d;

    public v(sx5.a1 a1Var) {
        this.f413760d = a1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f413760d;
        a1Var.getClass();
        a1Var.w(new sx5.x(a1Var));
    }
}
