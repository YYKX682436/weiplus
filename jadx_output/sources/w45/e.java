package w45;

/* loaded from: classes11.dex */
public final class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f442903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w45.p f442904e;

    public e(de0.i iVar, w45.p pVar) {
        this.f442903d = iVar;
        this.f442904e = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        java.lang.Object obj = this.f442903d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d17.d((com.tencent.mm.modelbase.m1) obj);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        w45.p pVar = this.f442904e;
        d18.q(281, pVar.f442921a);
        gm0.j1.d().q(282, pVar.f442922b);
        pVar.f442921a = null;
        pVar.f442922b = null;
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
        pVar.c();
        return false;
    }
}
