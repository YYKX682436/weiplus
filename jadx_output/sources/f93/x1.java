package f93;

/* loaded from: classes11.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.z1 f260502d;

    public x1(f93.z1 z1Var) {
        this.f260502d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        f93.z1 z1Var = this.f260502d;
        if (z1Var.f260527e.B.size() > 0) {
            com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.X6(z1Var.f260527e);
        } else {
            z1Var.f260527e.A.E();
            z1Var.f260527e.h7(f93.m2.Empty);
            z1Var.f260527e.f143251r.setEnabled(false);
            com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = z1Var.f260527e;
            contactLabelManagerUI.f143251r.setTextColor(contactLabelManagerUI.getResources().getColor(com.tencent.mm.R.color.f478720fb));
        }
        if (z1Var.f260526d && (n3Var = z1Var.f260527e.Q) != null) {
            n3Var.removeMessages(5002);
            z1Var.f260527e.Q.sendEmptyMessageDelayed(5003, 0L);
        }
        z1Var.f260527e.e7();
    }
}
