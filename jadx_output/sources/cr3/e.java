package cr3;

/* loaded from: classes11.dex */
public class e implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f221939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f221940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f221941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221942d;

    public e(j41.e0 e0Var, com.tencent.mm.storage.z3 z3Var, j41.d0 d0Var, android.content.Context context) {
        this.f221939a = e0Var;
        this.f221940b = z3Var;
        this.f221941c = d0Var;
        this.f221942d = context;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        j41.e0 e0Var = this.f221939a;
        try {
            str = new org.json.JSONObject(e0Var.f297623e).optString("mailto");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e17, "loadProfile", new java.lang.Object[0]);
            str = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15319, this.f221940b.Q0(), java.lang.Integer.valueOf(e0Var.f297622d), this.f221941c.f297617a);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
        intent.setData(android.net.Uri.parse("mailto:" + str));
        try {
            android.content.Context context = this.f221942d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$3", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$3", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Profile.OpenIMProfileLogic", "onPreferenceClick OPENIM_ACTION_OPEN_MAIL_BOX Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
            return true;
        }
    }
}
