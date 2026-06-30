package km4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f309293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309295f;

    public k(kotlin.jvm.internal.h0 h0Var, yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        this.f309293d = h0Var;
        this.f309294e = lVar;
        this.f309295f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f309293d;
        android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) h0Var.f310123d;
        boolean z17 = false;
        if (progressDialog != null && progressDialog.isShowing()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingAdHelper", "openAD time expire cancel");
            km4.l.d(h0Var);
            km4.l.c(this.f309294e, this.f309295f, h0Var, com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL);
            km4.l.f309296a.a(13, null);
        }
    }
}
