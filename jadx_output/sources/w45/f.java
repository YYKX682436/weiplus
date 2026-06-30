package w45;

/* loaded from: classes11.dex */
public final class f implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f442905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w45.p f442906e;

    public f(de0.i iVar, w45.p pVar) {
        this.f442905d = iVar;
        this.f442906e = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        java.lang.Object obj = this.f442905d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d17.d((com.tencent.mm.modelbase.m1) obj);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        w45.p pVar = this.f442906e;
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
        if (progressDialog == null || progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }
}
