package f93;

/* loaded from: classes11.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.z1 f260517d;

    public y1(f93.z1 z1Var) {
        this.f260517d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        f93.z1 z1Var = this.f260517d;
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.X6(z1Var.f260527e);
        if (!z1Var.f260526d || (n3Var = z1Var.f260527e.Q) == null) {
            return;
        }
        n3Var.removeMessages(5002);
        z1Var.f260527e.Q.sendEmptyMessageDelayed(5003, 400L);
    }
}
