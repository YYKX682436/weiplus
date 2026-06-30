package cr3;

/* loaded from: classes11.dex */
public class d implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f221927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f221928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f221929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221930d;

    public d(j41.e0 e0Var, com.tencent.mm.storage.z3 z3Var, j41.d0 d0Var, android.content.Context context) {
        this.f221927a = e0Var;
        this.f221928b = z3Var;
        this.f221929c = d0Var;
        this.f221930d = context;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        j41.e0 e0Var = this.f221927a;
        java.lang.String str = e0Var.f297623e;
        try {
            str = new org.json.JSONObject(e0Var.f297623e).optString("tel");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e17, "OpenIMCustomDetail.OPENIM_ACTION_DIAL_PHONE click parse error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15319, this.f221928b.Q0(), java.lang.Integer.valueOf(e0Var.f297622d), this.f221929c.f297617a);
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + str));
        intent.setFlags(268435456);
        android.content.Context context = this.f221930d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$2", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$2", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
