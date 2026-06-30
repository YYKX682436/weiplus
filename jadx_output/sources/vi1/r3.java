package vi1;

/* loaded from: classes7.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f437441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f437442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437443f;

    public r3(r45.yz5 yz5Var, vi1.z3 z3Var, android.app.ProgressDialog progressDialog) {
        this.f437441d = yz5Var;
        this.f437442e = z3Var;
        this.f437443f = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.z3 z3Var = this.f437442e;
        r45.yz5 yz5Var = this.f437441d;
        if (yz5Var == null) {
            vi1.z3.c(z3Var, -1);
        } else {
            vi1.z3.c(z3Var, yz5Var.f391538d);
        }
        z3Var.f437528r.b();
        this.f437443f.dismiss();
    }
}
