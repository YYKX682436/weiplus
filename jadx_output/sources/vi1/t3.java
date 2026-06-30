package vi1;

/* loaded from: classes7.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f437458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f437459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437460f;

    public t3(r45.yz5 yz5Var, vi1.z3 z3Var, android.app.ProgressDialog progressDialog) {
        this.f437458d = yz5Var;
        this.f437459e = z3Var;
        this.f437460f = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.z3 z3Var = this.f437459e;
        r45.yz5 yz5Var = this.f437458d;
        if (yz5Var == null) {
            vi1.z3.c(z3Var, -1);
        } else {
            vi1.z3.c(z3Var, yz5Var.f391538d);
        }
        z3Var.f437528r.b();
        this.f437460f.dismiss();
    }
}
