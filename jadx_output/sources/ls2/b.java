package ls2;

/* loaded from: classes2.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final org.json.JSONObject a(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String path;
        java.lang.String url;
        java.lang.String str3;
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        int jumpinfo_type = jumpInfo.getJumpinfo_type();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("iconname", jumpInfo.getWording());
        jSONObject2.put("iconurl", b(context, jumpInfo));
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        boolean z17 = true;
        str = "";
        if (jumpinfo_type == 1) {
            jSONObject2.put("icontype", 1);
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = jumpInfo.getMini_app_info();
            if (mini_app_info == null || (str2 = mini_app_info.getApp_id()) == null) {
                str2 = "";
            }
            jSONObject3.put("appid", str2);
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info2 = jumpInfo.getMini_app_info();
            if (mini_app_info2 != null && (path = mini_app_info2.getPath()) != null) {
                str = path;
            }
            jSONObject3.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
        } else if (jumpinfo_type == 2) {
            jSONObject2.put("icontype", 3);
            com.tencent.mm.protocal.protobuf.Html5Info html5_info = jumpInfo.getHtml5_info();
            if (html5_info != null && (url = html5_info.getUrl()) != null) {
                str = url;
            }
            jSONObject3.put("url", str);
        } else if (jumpinfo_type == 3) {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = jumpInfo.getNative_info();
            java.lang.String str4 = null;
            java.lang.Integer valueOf = native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null;
            com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = jumpInfo.getNative_info();
            if (native_info2 == null || (str3 = native_info2.getNecessary_params()) == null) {
                str3 = "";
            }
            try {
                jSONObject = new org.json.JSONObject(str3);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("ProfileMenuConvert", e17.getMessage());
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            if (valueOf != null && valueOf.intValue() == 2) {
                jSONObject2.put("icontype", 2);
                try {
                    if (!jSONObject.has("cardId")) {
                        z17 = false;
                    }
                    if (z17) {
                        str4 = jSONObject.getString("cardId");
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e18);
                }
                jSONObject3.put("cardId", str4 != null ? str4 : "");
            } else if (valueOf != null && valueOf.intValue() == 7) {
                jSONObject2.put("icontype", 4);
                try {
                    if (!jSONObject.has("kf_url")) {
                        z17 = false;
                    }
                    if (z17) {
                        str4 = jSONObject.getString("kf_url");
                    }
                } catch (java.lang.Exception e19) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e19);
                }
                jSONObject3.put("kf_url", str4 != null ? str4 : "");
            }
        }
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        jSONObject2.put("utf_kv", r26.i0.t(jSONObject4, ",", ";", false));
        return jSONObject2;
    }

    public final java.lang.String b(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        java.lang.String icon_url;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((com.tencent.mm.plugin.finder.profile.uic.ie) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.ie.class)).f123811p;
        boolean C = com.tencent.mm.ui.bk.C();
        if (z17) {
            icon_url = finderJumpInfo.getIcon_url_bg();
            if (icon_url == null) {
                return "";
            }
        } else if (C) {
            icon_url = finderJumpInfo.getIcon_url_dark();
            if (icon_url == null) {
                return "";
            }
        } else {
            icon_url = finderJumpInfo.getIcon_url();
            if (icon_url == null) {
                return "";
            }
        }
        return icon_url;
    }
}
