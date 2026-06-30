package sz4;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.e0 f414189d;

    public d0(sz4.e0 e0Var) {
        this.f414189d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sz4.e0 e0Var = this.f414189d;
        if (e0Var.f414192d.f296113k != 0) {
            int i17 = e0Var.f414194f.f414195f.getSelection().f333350d;
            if (i17 == e0Var.f414192d.f296155t.length()) {
                e0Var.f414194f.f414195f.x();
                e0Var.f414194f.f414195f.getText().append((java.lang.CharSequence) "\n");
                e0Var.f414194f.f414195f.C();
                e0Var.f414194f.f414195f.setSelection(i17);
            }
            iz4.i iVar = e0Var.f414192d;
            iVar.f296113k = 0;
            int i18 = iVar.f296114l;
            if (i18 == 1) {
                e0Var.f414194f.f414195f.u(oz4.w.f350318d, java.lang.Boolean.TRUE);
            } else if (i18 == 3) {
                e0Var.f414194f.f414195f.u(oz4.w.f350317c, java.lang.Boolean.TRUE);
            } else if (i18 == 2) {
                e0Var.f414194f.f414195f.u(oz4.w.f350319e, java.lang.Boolean.TRUE);
            }
        }
    }
}
