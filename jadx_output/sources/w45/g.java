package w45;

/* loaded from: classes11.dex */
public final class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f442907d;

    public g(w45.p pVar) {
        this.f442907d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f442907d;
        d17.q(281, pVar.f442921a);
        gm0.j1.d().q(282, pVar.f442922b);
        pVar.f442921a = null;
        pVar.f442922b = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = pVar.f442925e;
        if (b4Var != null) {
            b4Var.d();
        }
        android.app.ProgressDialog progressDialog = pVar.f442926f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        pVar.c();
        return false;
    }
}
