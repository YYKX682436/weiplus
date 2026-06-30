package vi1;

/* loaded from: classes7.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.x20 f437472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f437473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437474f;

    public v3(r45.x20 x20Var, vi1.z3 z3Var, android.app.ProgressDialog progressDialog) {
        this.f437472d = x20Var;
        this.f437473e = z3Var;
        this.f437474f = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.x20 x20Var = this.f437472d;
        if (x20Var == null) {
            vi1.z3.e(this.f437473e, -1, "", "", "", "");
        } else {
            vi1.z3.e(this.f437473e, x20Var.f389690d, x20Var.f389691e, x20Var.f389692f, x20Var.f389694h, x20Var.f389695i);
        }
        this.f437474f.dismiss();
    }
}
