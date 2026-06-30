package w45;

/* loaded from: classes11.dex */
public final class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f442908d;

    public h(w45.p pVar) {
        this.f442908d = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f442908d;
        d17.q(281, pVar.f442921a);
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
