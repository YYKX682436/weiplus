package o25;

/* loaded from: classes9.dex */
public class j0 implements o25.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f342541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f342542b;

    public j0(android.app.ProgressDialog progressDialog, android.content.Context context) {
        this.f342541a = progressDialog;
        this.f342542b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o25.k0
    public void b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        r45.zp6 I;
        android.content.Context context;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(z17));
        android.app.ProgressDialog progressDialog = this.f342541a;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if (m1Var == 0 || i17 == 0 || i18 == 0 || !(m1Var instanceof de0.h) || (I = ((com.tencent.mm.modelsimple.h1) ((de0.h) m1Var)).I()) == null || (context = this.f342542b) == null || com.tencent.mm.sdk.platformtools.t8.K0(I.f392285g)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getString(com.tencent.mm.R.string.f490573yv));
        sb6.append(" : ");
        java.lang.String str2 = I.f392285g;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        db5.t7.makeText(context, sb6.toString(), 0).show();
    }
}
