package z93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz93/c;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class c extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenW1wPersonalMsgChatListPage", "openW1wPersonalMsgChatListPage called");
        if (!((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).hj(jSONObject)) {
            this.f143443f.a("json data invalid!");
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("commonReport") : null;
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "null") : null;
        java.lang.String optString2 = optJSONObject != null ? optJSONObject.optString("sceneNote", "null") : null;
        java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "null") : null;
        java.lang.String optString4 = optJSONObject != null ? optJSONObject.optString("extInfo") : null;
        ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f265826m = (jSONObject != null ? jSONObject.optInt("msgSettingsFlag", 0) : 0) == 1;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_w1w_refer_scene", optString);
        intent.putExtra("key_w1w_refer_scene_note", optString2);
        intent.putExtra("key_w1w_refer_session_id", optString3);
        intent.putExtra("key_w1w_refer_ext_info", optString4);
        if (jSONObject == null || (str2 = jSONObject.toString()) == null) {
            str2 = "";
        }
        intent.putExtra("key_w1w_self_contact_data", str2);
        java.lang.String Di = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di();
        if (com.tencent.mm.storage.z3.K4(Di)) {
            intent.putExtra("KEY_CONV_TYPE", 1);
            j45.l.j(c(), "w1wpersonalmsg", ".ui.W1wPersonalMsgConvListUI", intent, null);
            com.tencent.mm.plugin.lite.api.o oVar = this.f143443f;
            if (oVar != null) {
                oVar.d(true);
                return;
            }
            return;
        }
        if (!(Di.endsWith("@zhugeprivate"))) {
            com.tencent.mm.plugin.lite.api.o oVar2 = this.f143443f;
            if (oVar2 != null) {
                oVar2.a("username is invalid!");
                return;
            }
            return;
        }
        intent.putExtra("KEY_CONV_TYPE", 3);
        j45.l.j(c(), "w1wpersonalmsg", ".ui.W1wPersonalMsgPrivateConvListUI", intent, null);
        com.tencent.mm.plugin.lite.api.o oVar3 = this.f143443f;
        if (oVar3 != null) {
            oVar3.d(true);
        }
    }
}
