package s61;

/* loaded from: classes8.dex */
public class a1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f403318d;

    /* renamed from: e, reason: collision with root package name */
    public final s61.z0 f403319e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f403320f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f403321g;

    public a1(android.content.Context context, s61.z0 z0Var) {
        this.f403321g = true;
        this.f403318d = context;
        this.f403319e = z0Var;
        this.f403321g = true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 116) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f403320f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f403320f = null;
        }
        gm0.j1.d().q(116, this);
        s61.z0 z0Var = this.f403319e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailFail");
            z0Var.getClass();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailSuccess");
        if (!this.f403321g) {
            ((s61.g0) z0Var).f403352a.f403358d.finish();
        } else {
            db5.e1.m(this.f403318d, com.tencent.mm.R.string.g28, com.tencent.mm.R.string.f490573yv, new s61.y0(this));
        }
    }
}
