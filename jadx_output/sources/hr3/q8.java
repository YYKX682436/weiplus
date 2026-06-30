package hr3;

/* loaded from: classes5.dex */
public class q8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f283917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f283918e;

    public q8(android.app.ProgressDialog progressDialog, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f283917d = progressDialog;
        this.f283918e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f283917d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f283918e.sendEmptyMessage(0);
        }
    }
}
