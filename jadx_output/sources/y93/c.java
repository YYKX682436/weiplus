package y93;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        try {
            java.lang.String string = jSONObject.has("openId") ? jSONObject.getString("openId") : null;
            java.lang.String string2 = jSONObject.has("userName") ? jSONObject.getString("userName") : null;
            if (string2 != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", string2);
                intent.putExtra("Contact_Scene", 3);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                this.f143443f.d(false);
                return;
            }
            if (string == null) {
                this.f143443f.a("openId or userName is required");
                return;
            }
            ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).getClass();
            sm4.d dVar = new sm4.d(string);
            gm0.j1.d().a(2830, new y93.b(this, dVar));
            gm0.j1.d().g(dVar);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenProfileWithOpenId", e17, "get openId", new java.lang.Object[0]);
            this.f143443f.a("get openId exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
