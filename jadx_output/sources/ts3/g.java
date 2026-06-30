package ts3;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f421667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f421668e;

    public g(ts3.h hVar, android.app.ProgressDialog progressDialog, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f421667d = progressDialog;
        this.f421668e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f421667d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f421668e.sendEmptyMessage(0);
        }
    }
}
