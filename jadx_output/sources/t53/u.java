package t53;

/* loaded from: classes8.dex */
public final class u implements u53.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f415825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f415826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f415827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f415828g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t53.j f415829h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f415830i;

    public u(ik1.b0 b0Var, ik1.b0 b0Var2, java.lang.String str, android.app.ProgressDialog progressDialog, t53.m0 m0Var, android.content.Context context, int i17, t53.j jVar, u53.c0 c0Var) {
        this.f415822a = b0Var;
        this.f415823b = b0Var2;
        this.f415824c = str;
        this.f415825d = progressDialog;
        this.f415826e = m0Var;
        this.f415827f = context;
        this.f415828g = i17;
        this.f415829h = jVar;
        this.f415830i = c0Var;
    }

    @Override // u53.v
    public void a(boolean z17, boolean z18) {
        this.f415822a.f291824a = java.lang.Boolean.valueOf(z18);
        this.f415823b.f291824a = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "isBlackListAssociateWithWAGame userName:%s,isAssociate:%b,isOwnBlack:%b", this.f415824c, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        android.app.ProgressDialog progressDialog = this.f415825d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f415825d.dismiss();
        t53.m0 m0Var = this.f415826e;
        android.content.Context context = this.f415827f;
        java.lang.String userName = this.f415824c;
        kotlin.jvm.internal.o.f(userName, "$userName");
        int i17 = this.f415828g;
        ik1.b0 b0Var = this.f415822a;
        ik1.b0 b0Var2 = this.f415823b;
        t53.j jVar = this.f415829h;
        u53.c0 sessionInfo = this.f415830i;
        kotlin.jvm.internal.o.f(sessionInfo, "$sessionInfo");
        m0Var.ij(context, userName, i17, b0Var, b0Var2, jVar, sessionInfo);
    }
}
