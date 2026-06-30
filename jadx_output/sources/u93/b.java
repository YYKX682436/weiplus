package u93;

/* loaded from: classes.dex */
public class b extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("videoUrl", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("videoUrl is null");
            return;
        }
        java.lang.String optString2 = jSONObject.optString("thumbUrl", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            this.f143443f.a("thumbUrl is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("videoUrl", optString);
        hashMap.put("thumbUrl", optString2);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 7);
        intent.putExtra("download_game_video_params", hashMap);
        int i17 = m93.j.f325055o + 1;
        m93.j.f325055o = i17;
        m93.j.f325056p.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325055o);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiDownloadGameVideo", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiDownloadGameVideo", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void j(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1137) {
            if (i18 != -1) {
                this.f143443f.a("cancel");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("ret_info");
            if ("0".equals(stringExtra)) {
                this.f143443f.d(false);
            } else {
                this.f143443f.a(stringExtra);
            }
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
