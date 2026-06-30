package w45;

/* loaded from: classes.dex */
public final class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f442917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w45.p f442918e;

    public n(com.tencent.mm.modelsimple.w0 w0Var, w45.p pVar) {
        this.f442917d = w0Var;
        this.f442918e = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        gm0.j1.d().d(this.f442917d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f442918e;
        d17.q(255, pVar.f442923c);
        pVar.f442923c = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = pVar.f442924d;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            pVar.f442924d = null;
        }
        android.app.ProgressDialog progressDialog = pVar.f442926f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        w45.p.a(pVar);
        return false;
    }
}
