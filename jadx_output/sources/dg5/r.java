package dg5;

/* loaded from: classes9.dex */
public class r implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f232394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg5.u f232395e;

    public r(dg5.u uVar, android.app.ProgressDialog progressDialog) {
        this.f232395e = uVar;
        this.f232394d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f232395e.f232404g;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f232394d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
