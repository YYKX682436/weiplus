package ts3;

/* loaded from: classes9.dex */
public class e implements ss3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f421662a;

    public e(ts3.f fVar, android.app.ProgressDialog progressDialog) {
        this.f421662a = progressDialog;
    }

    @Override // ss3.c0
    public boolean a() {
        return false;
    }

    @Override // ss3.c0
    public void b() {
        android.app.ProgressDialog progressDialog = this.f421662a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
