package z43;

/* loaded from: classes.dex */
public class h extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return;
        }
        z43.g gVar = new z43.g(this);
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.fax);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(context, string, gVar, true, a17);
    }
}
