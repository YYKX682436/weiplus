package s61;

/* loaded from: classes8.dex */
public class f1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f403348d;

    /* renamed from: e, reason: collision with root package name */
    public final s61.e1 f403349e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f403350f;

    public f1(android.content.Context context, s61.e1 e1Var) {
        this.f403348d = context;
        this.f403349e = e1Var;
    }

    public final void a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        r61.n1 n1Var = new r61.n1(arrayList);
        gm0.j1.d().g(n1Var);
        android.content.Context context = this.f403348d;
        this.f403350f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.g2a), this.f403348d.getString(com.tencent.mm.R.string.g29), true, true, new s61.c1(this, n1Var));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendInviteGoogleContact", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        if (m1Var.getType() != 489) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f403350f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f403350f = null;
        }
        gm0.j1.d().q(489, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendInviteGoogleContact", "dealSendInviteFail");
            this.f403349e.getClass();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendInviteGoogleContact", "dealSendInviteSuccess");
            db5.e1.m(this.f403348d, com.tencent.mm.R.string.g28, com.tencent.mm.R.string.f490573yv, new s61.d1(this));
        }
    }
}
