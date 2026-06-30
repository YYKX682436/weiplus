package f93;

/* loaded from: classes11.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.j3 f260356d;

    public i3(f93.j3 j3Var) {
        this.f260356d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        f93.j3 j3Var = this.f260356d;
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.a(j3Var.f260365e);
        if (!j3Var.f260364d || (n3Var = j3Var.f260365e.Z) == null) {
            return;
        }
        n3Var.removeMessages(5002);
        j3Var.f260365e.Z.sendEmptyMessageDelayed(5003, 400L);
    }
}
