package t00;

/* loaded from: classes.dex */
public final class l2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414331l;
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
        int optInt = optJSONObject.optInt("type", 1);
        if (optInt == 3) {
            java.lang.String optString = optJSONObject.optString("url");
            java.lang.String optString2 = optJSONObject.optString("thumbUrl");
            java.lang.String optString3 = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Ksnsupload_link", optString);
            intent.putExtra("Ksnsupload_type", 1);
            intent.putExtra("Ksnsupload_title", optString3);
            kotlin.jvm.internal.o.d(optString2);
            if (r26.i0.y(optString2, "http://", false) || r26.i0.y(optString2, "https://", false)) {
                intent.putExtra("Ksnsupload_imgurl", optString2);
            }
            intent.putExtra("KSnsUploadDisableLinkClick", true);
            intent.putExtra("need_result", true);
            if (context instanceof android.app.Activity) {
                nf.g.a(context).f(new b30.q(8229, callback));
                j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 8229);
                return;
            } else {
                j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent, null);
                callback.b(null);
                return;
            }
        }
        if (optInt != 4) {
            android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
            kotlinx.coroutines.l.d(context2 instanceof androidx.lifecycle.y ? new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ShareTimelineEcsActionHandler", (androidx.lifecycle.y) context2, 0, 4, null) : kotlinx.coroutines.i2.f310477d, null, null, new t00.k2(optJSONObject, com.tencent.mm.ui.widget.dialog.u3.f(context2, context2.getString(com.tencent.mm.R.string.f490604zq), false, 0, null), this, context, callback, jSONObject, null), 3, null);
            return;
        }
        java.lang.String optString4 = optJSONObject.optString("url");
        java.lang.String optString5 = optJSONObject.optString("thumbUrl");
        java.lang.String optString6 = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString7 = optJSONObject.optString("ecsJumpInfoBase64");
        r45.k86 k86Var = new r45.k86();
        k86Var.f378494d = optString7;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("sns_ecs_info", k86Var.toByteArray());
        intent2.putExtra("Ksnsupload_link", optString4);
        intent2.putExtra("Ksnsupload_type", 46);
        intent2.putExtra("Ksnsupload_title", optString6);
        kotlin.jvm.internal.o.d(optString5);
        if (r26.i0.y(optString5, "http://", false) || r26.i0.y(optString5, "https://", false)) {
            intent2.putExtra("Ksnsupload_imgurl", optString5);
        }
        intent2.putExtra("KSnsUploadDisableLinkClick", true);
        intent2.putExtra("need_result", true);
        if (context instanceof android.app.Activity) {
            nf.g.a(context).f(new b30.q(8229, callback));
            j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent2, 8229);
        } else {
            j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent2, null);
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
        java.lang.String optString = optJSONObject.optString("imgPath");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            kotlin.jvm.internal.o.d(optString);
            java.lang.String absoluteFilePath = envHandler.getAbsoluteFilePath(optString);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline imgPath:" + optString + ", imgLocalPath:" + absoluteFilePath);
            jSONObject.put("imgLocalPath", absoluteFilePath);
        }
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("imgPathList");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString2 = optJSONArray.optString(i18);
                kotlin.jvm.internal.o.d(optString2);
                jSONArray.put(envHandler.getAbsoluteFilePath(optString2));
            }
            jSONObject.put("imgLocalPathList", jSONArray);
        }
        java.lang.String optString3 = optJSONObject.optString("videoPath");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            kotlin.jvm.internal.o.d(optString3);
            java.lang.String absoluteFilePath2 = envHandler.getAbsoluteFilePath(optString3);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline videoPath:" + optString3 + ", videoLocalPath:" + absoluteFilePath2);
            jSONObject.put("videoLocalPath", absoluteFilePath2);
        }
        java.lang.String optString4 = optJSONObject.optString("videoThumbPath");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            kotlin.jvm.internal.o.d(optString4);
            java.lang.String absoluteFilePath3 = envHandler.getAbsoluteFilePath(optString4);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline videoThumbPath:" + optString4 + ", imgLocalPath:" + absoluteFilePath3);
            jSONObject.put("videoThumbLocalPath", absoluteFilePath3);
        }
        return jSONObject;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
