package zd;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1207;
    public static final java.lang.String NAME = "getWxCommFont";

    public static boolean C(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath input: [%s]", absolutePath);
        java.lang.String j17 = j62.e.g().j("clicfg_android_wxcommfont_paths", "[\"/system/fonts\", \"/system/etc/fonts\"]", true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath whiteList: [%s]", j17);
        org.json.JSONArray jSONArray = new org.json.JSONArray(j17);
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.String string = jSONArray.getString(i17);
            if (absolutePath.startsWith(string)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath isWhite?yes[%s]", string);
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath isWhite?skip[%s]", string);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath no white accept");
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        final java.lang.String optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        if (!android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont start [%s] ", optString);
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: zd.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String[] strArr;
                    com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                    int i18 = i17;
                    zd.a aVar = zd.a.this;
                    aVar.getClass();
                    java.lang.String str = optString;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont start, in iothread [%s]", str);
                    try {
                        java.io.File file = new java.io.File(str);
                        if (!zd.a.C(file)) {
                            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:Path permission denied" : null;
                            java.lang.String str3 = str2 == null ? "" : str2;
                            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put("errno", 1300014);
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                            }
                            e9Var2.a(i18, aVar.u(str3, jSONObject2));
                            return;
                        }
                        if (file.isDirectory()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isDirectory [%s]", str);
                            java.io.File[] listFiles = file.listFiles();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            if (listFiles == null) {
                                strArr = new java.lang.String[0];
                            } else {
                                strArr = new java.lang.String[listFiles.length];
                                for (int i19 = 0; i19 < listFiles.length; i19++) {
                                    strArr[i19] = listFiles[i19].toString();
                                }
                            }
                            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, strArr);
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = str;
                            objArr[1] = java.lang.Integer.valueOf(listFiles == null ? -1 : listFiles.length);
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isDirectory [%s] [%d]", objArr);
                            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            hashMap.put("errno", 0);
                            e9Var2.a(i18, aVar.t("ok", hashMap));
                            return;
                        }
                        try {
                            if (!file.isFile()) {
                                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:load resource file fail" : null;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                try {
                                    jSONObject3.put("errno", 1107012);
                                } catch (java.lang.Exception e18) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                                }
                                e9Var2.a(i18, aVar.u(str6, jSONObject3));
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isFile [%s]", str);
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            try {
                                byte[] b17 = ik1.f.b(new java.io.FileInputStream(file));
                                java.nio.ByteBuffer wrap = b17 != null ? java.nio.ByteBuffer.wrap(b17) : null;
                                hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, wrap);
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[0] = str;
                                objArr2[1] = java.lang.Integer.valueOf(wrap == null ? -1 : wrap.limit());
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isFile [%s] length = [%d]", objArr2);
                                e9Var2.a(i18, aVar.x(e9Var2, jc1.f.f298912a, hashMap2));
                                return;
                            } catch (java.io.FileNotFoundException e19) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetWxCommFont", e19, "file not found %s", str);
                                java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:target file not exists" : null;
                                java.lang.String str9 = str8 == null ? "" : str8;
                                java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                try {
                                    jSONObject4.put("errno", 1103002);
                                } catch (java.lang.Exception e27) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                                }
                                e9Var2.a(i18, aVar.u(str9, jSONObject4));
                                return;
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    } catch (java.lang.Exception unused2) {
                        str = null;
                    }
                    str = null;
                    java.lang.String str11 = android.text.TextUtils.isEmpty(str) ? "fail:internal error" : str;
                    java.lang.String str12 = str11 != null ? str11 : "";
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    try {
                        jSONObject5.put("errno", 4);
                    } catch (java.lang.Exception e28) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                    }
                    e9Var2.a(i18, aVar.u(str12, jSONObject5));
                }
            });
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:invalid request parameter" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 1001);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject2));
    }
}
