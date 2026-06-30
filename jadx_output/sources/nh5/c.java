package nh5;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f337128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.ManualDumpActivity f337129e;

    public c(com.tencent.mm.ui.matrix.ManualDumpActivity manualDumpActivity, android.app.ProgressDialog progressDialog) {
        this.f337129e = manualDumpActivity;
        this.f337128d = progressDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f337129e.f209108o.getText().toString());
        java.lang.String str = this.f337129e.getExternalCacheDir() + "/" + r6Var.getName() + ".zip";
        kk.x.a(r6Var, false, str);
        ((ku5.t0) ku5.t0.f312615d).B(new nh5.b(this, str));
    }
}
