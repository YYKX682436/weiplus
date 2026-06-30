package t00;

/* loaded from: classes.dex */
public final class i2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414336q;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (optJSONObject == null) {
            callback.a();
            return;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("mediaInfoList");
        org.json.JSONObject optJSONObject2 = jSONObject != null ? jSONObject.optJSONObject("imgLocalPathInfoMap") : null;
        java.lang.String optString = optJSONObject.optString("entranceGMsgID");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (optJSONObject2 != null && optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                java.lang.String optString2 = optJSONObject2.optString(jSONObject2.optString("imgPath"));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                    arrayList.add(optString2);
                }
                jSONObject2.put("localPath", optString2);
                jSONArray.put(jSONObject2);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_kemdia_path_list", arrayList);
        intent.putExtra("need_result", true);
        intent.putExtra("sns_ecs_share_media_info_json_array", jSONArray.toString());
        intent.putExtra("sns_ecs_entrance_gmsg_id", optString);
        intent.putExtra("sns_upload_is_show_dialog", true);
        if (context instanceof android.app.Activity) {
            nf.g.a(context).f(new b30.q(8230, callback));
            j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 8230);
        } else {
            j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent, null);
            callback.b(null);
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (optJSONObject == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("mediaInfoList");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString = optJSONArray.getJSONObject(i18).optString("imgPath");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    kotlin.jvm.internal.o.d(optString);
                    jSONObject2.put(optString, envHandler.getAbsoluteFilePath(optString));
                }
            }
            jSONObject.put("imgLocalPathInfoMap", jSONObject2);
        }
        return jSONObject;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
