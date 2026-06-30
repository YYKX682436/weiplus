package ma1;

/* loaded from: classes7.dex */
public final class m extends ma1.f {
    public static final int CTRL_INDEX = 1169;
    public static final java.lang.String NAME = "shareGameRecorderVideo";

    @Override // ma1.f
    public void G(com.tencent.mm.plugin.appbrand.service.c0 env, int i17, ma1.c editSrc, java.lang.String title, org.json.JSONArray shareOptions, ta1.n0 data, org.json.JSONObject jsonObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i18;
        jz5.f0 f0Var;
        int i19;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08;
        xi1.g windowAndroid;
        xi1.p orientationHandler;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(editSrc, "editSrc");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(shareOptions, "shareOptions");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderShare", "startEdit");
        int a17 = cf.b.a(this);
        android.app.Activity Z0 = env.Z0();
        if (Z0 == null) {
            env.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        nf.g.a(Z0).f(new ma1.k(a17, env, i17, this));
        com.tencent.mm.plugin.appbrand.page.n7 V0 = env.V0();
        xi1.o a18 = (V0 == null || (windowAndroid = V0.getWindowAndroid()) == null || (orientationHandler = windowAndroid.getOrientationHandler()) == null) ? null : orientationHandler.a();
        int i27 = a18 == null ? -1 : ma1.j.f325197a[a18.ordinal()];
        java.lang.Class cls = i27 != -1 ? (i27 == 1 || i27 == 2) ? com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.class : com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareLandscapeUI.class : null;
        if (cls != null) {
            android.content.Intent intent = new android.content.Intent(Z0, (java.lang.Class<?>) cls);
            intent.putExtra("k_ext_absFilePath", editSrc.f325152a);
            intent.putExtra("k_ext_appid", env.getAppId());
            intent.putExtra("k_ext_configJson", jsonObject.optString("configJson"));
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            try {
                cf.f.b(shareOptions, new ma1.l(arrayList));
                i19 = 4;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderShare", e17, "", new java.lang.Object[0]);
                java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                java.lang.String str6 = str5 == null ? "" : str5;
                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                i19 = 4;
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                env.a(i17, u(str6, jSONObject));
            }
            intent.putIntegerArrayListExtra("k_ext_share_options", arrayList);
            intent.putExtra("k_ext_appName", (env.t3() == null || env.t3().E0() == null) ? "" : env.t3().E0().f305841d);
            intent.putExtra("k_ext_share_title", jsonObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            intent.putExtra("k_ext_share_desc", jsonObject.optString("desc"));
            com.tencent.mm.plugin.appbrand.o6 t37 = env.t3();
            intent.putExtra("k_ext_app_version", (t37 == null || (u08 = t37.u0()) == null) ? 0 : u08.L);
            com.tencent.mm.plugin.appbrand.o6 t38 = env.t3();
            intent.putExtra("k_ext_app_version_type", (t38 == null || (u07 = t38.u0()) == null) ? 0 : u07.f77281g);
            intent.putExtra("k_ext_is_dev_edited", jsonObject.optInt("isDevRequestEdit", 0));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(a17));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            i18 = i19;
            str = "";
            str2 = "errno";
            str3 = "makeReturnJson with JSONObject, put errno, e=%s";
            str4 = "MicroMsg.AppBrandJsApi";
            yj0.a.k(Z0, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/game/jsapi/screenrecorder/WAGameJsApiScreenRecorderShare", "startEdit", "(Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;ILcom/tencent/mm/plugin/appbrand/game/jsapi/screenrecorder/WAGameJsApiScreenRecorderBase$WxaFile;Ljava/lang/String;Lorg/json/JSONArray;Lcom/tencent/mm/plugin/appbrand/game/screenrecorder/GameRecorderMgr$RemuxResult;Lorg/json/JSONObject;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            f0Var = jz5.f0.f302826a;
        } else {
            str = "";
            str2 = "errno";
            str3 = "makeReturnJson with JSONObject, put errno, e=%s";
            str4 = "MicroMsg.AppBrandJsApi";
            i18 = 4;
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            java.lang.String str9 = str8 == null ? str : str8;
            java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(str2, i18);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e(str4, str3, e19);
            }
            env.a(i17, u(str9, jSONObject2));
        }
    }
}
