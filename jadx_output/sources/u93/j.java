package u93;

/* loaded from: classes.dex */
public class j extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGamePluginSettingPage", "invoke openGamePluginSettingPage");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "gh_25d9ac85a4bc");
        intent.putExtra("key_wxgame_setting_from_scene", 3);
        j45.l.j(c(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        this.f143442e.d();
    }
}
