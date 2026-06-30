package cr3;

/* loaded from: classes11.dex */
public class f implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f221943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f221944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f221945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221946d;

    public f(j41.e0 e0Var, com.tencent.mm.storage.z3 z3Var, j41.d0 d0Var, android.content.Context context) {
        this.f221943a = e0Var;
        this.f221944b = z3Var;
        this.f221945c = d0Var;
        this.f221946d = context;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        j41.e0 e0Var = this.f221943a;
        android.content.Intent intent = new android.content.Intent();
        try {
            str = new org.json.JSONObject(e0Var.f297623e).optString("url");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e17, "loadProfile", new java.lang.Object[0]);
            str = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.storage.z3 z3Var = this.f221944b;
        g0Var.d(15319, z3Var.Q0(), java.lang.Integer.valueOf(e0Var.f297622d), this.f221945c.f297617a);
        intent.putExtra("geta8key_scene", 58);
        intent.putExtra("geta8key_username", z3Var.d1());
        intent.putExtra("msgUsername", z3Var.d1());
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f221946d, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
