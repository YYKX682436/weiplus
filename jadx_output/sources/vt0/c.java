package vt0;

/* loaded from: classes8.dex */
public abstract class c extends vt0.b {
    public static java.lang.String a(android.app.Activity activity, java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.lang.String str2, boolean z29) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("pkgName", context.getPackageName());
            if (z28) {
                jSONObject.put("className", "com.tencent.mm.ui.tools.MiniQbCallBackMMUI");
            } else {
                jSONObject.put("className", "com.tencent.mm.ui.tools.MiniQbCallBackUI");
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", "miniqb");
            jSONObject2.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            jSONObject2.put("processName", bm5.f1.a());
            jSONObject2.put("appid", str2);
            jSONObject.put("thirdCtx", jSONObject2);
            jSONObject.put("darkMode", com.tencent.mm.ui.bk.C() ? 1 : 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str3 = "1";
            if (z27) {
                org.json.JSONObject c17 = c(8, com.tencent.mm.R.drawable.c5y, context.getString(com.tencent.mm.R.string.cfd), true, 1);
                if (z18) {
                    c17.put("from", "multitask");
                } else {
                    c17.put("from", "");
                }
                if (!z17) {
                    str3 = "0";
                }
                c17.put("hasCurrentMultiTask", str3);
                c17.put("multiTaskId", com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("%s", str)));
                org.json.JSONObject c18 = c(4, com.tencent.mm.R.drawable.c1q, context.getString(com.tencent.mm.R.string.f491158c60), true, 2);
                org.json.JSONObject c19 = c(5, com.tencent.mm.R.drawable.icon_file_handoff, context.getString(com.tencent.mm.R.string.cff), z19, 3);
                arrayList.add(c18);
                arrayList.add(c19);
                if (z29) {
                    arrayList.add(c(7, com.tencent.mm.R.drawable.bvj, context.getString(com.tencent.mm.R.string.f490210o1), true, 4));
                }
                if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(activity.getTaskId())) {
                    arrayList.add(c(11, com.tencent.mm.R.drawable.f481897c74, context.getString(com.tencent.mm.R.string.jjg), !com.tencent.mm.ui.bk.z(activity.getTaskId()), 5));
                    arrayList.add(c(12, com.tencent.mm.R.drawable.f481896c73, context.getString(com.tencent.mm.R.string.b9c), com.tencent.mm.ui.bk.z(activity.getTaskId()), 5));
                }
            } else {
                org.json.JSONObject b17 = b(8, com.tencent.mm.R.drawable.c5y, context.getString(com.tencent.mm.R.string.cfd));
                if (z18) {
                    b17.put("from", "multitask");
                } else {
                    b17.put("from", "");
                }
                if (!z17) {
                    str3 = "0";
                }
                b17.put("hasCurrentMultiTask", str3);
                b17.put("multiTaskId", com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("%s", str)));
                arrayList.add(b(4, com.tencent.mm.R.drawable.c1q, context.getString(com.tencent.mm.R.string.f491158c60)));
                if (z29) {
                    arrayList.add(b(7, com.tencent.mm.R.drawable.bvj, context.getString(com.tencent.mm.R.string.f490210o1)));
                }
                if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(activity.getTaskId())) {
                    if (com.tencent.mm.ui.bk.z(activity.getTaskId())) {
                        arrayList.add(b(12, com.tencent.mm.R.drawable.f481896c73, context.getString(com.tencent.mm.R.string.b9c)));
                    } else {
                        arrayList.add(b(11, com.tencent.mm.R.drawable.f481897c74, context.getString(com.tencent.mm.R.string.jjg)));
                    }
                }
            }
            jSONObject.put("menuItems", new org.json.JSONArray((java.util.Collection) arrayList));
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.MiniReaderLogic", "getMenuInfo() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return "";
        }
    }

    public static org.json.JSONObject b(int i17, int i18, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(dm.i4.COL_ID, i17);
            jSONObject.put("iconResId", i18);
            jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.MiniReaderLogic", "getMenuInfo() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        return jSONObject;
    }

    public static org.json.JSONObject c(int i17, int i18, java.lang.String str, boolean z17, int i19) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(dm.i4.COL_ID, i17);
            jSONObject.put("iconResId", i18);
            jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
            jSONObject.put("isShow", z17);
            jSONObject.put("idx", i19);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.MiniReaderLogic", "getMenuInfo() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        return jSONObject;
    }

    public static void d(boolean z17, boolean z18, boolean z19, boolean z27, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2, int i18, boolean z28) {
        e(z17, z18, z19, z27, activity, str, str2, str3, str4, i17, valueCallback, valueCallback2, false, "", i18, true, z28);
    }

    public static void e(boolean z17, boolean z18, boolean z19, boolean z27, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2, boolean z28, java.lang.String str5, int i18, boolean z29, boolean z37) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("menuData", a(activity, str, z17, z18, z27, z19, z28, str5, z37));
        if (z27) {
            byte b17 = (byte) 1;
            boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (i18 == 9) {
                b17 = (byte) (b17 | 2);
            }
            hashMap.put("param_flag", ((int) b17) + "");
        }
        hashMap.put("extra_param_open_file_scene", java.lang.String.valueOf(i17));
        com.tencent.mm.xwebutil.i.d(activity, str, str2, str3, str4, true, hashMap, valueCallback, valueCallback2, z29);
    }

    public static void f(boolean z17, boolean z18, boolean z19, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2, boolean z27, java.lang.String str6, boolean z28, boolean z29) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("menuData", a(activity, str, z17, z18, z19, false, z27, str6, z29));
        hashMap.put("query_param", "feature_wx_float_window");
        hashMap.put("extra_param_open_file_scene", java.lang.String.valueOf(i17));
        hashMap.put("extra_param_file_md5", str4);
        com.tencent.mm.xwebutil.i.d(activity, str, str2, str3, str5, false, hashMap, valueCallback, valueCallback2, z28);
    }

    public static void g(boolean z17, boolean z18, boolean z19, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2, boolean z27, java.lang.String str5, boolean z28) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("menuData", a(activity, str, z17, z18, z19, true, z27, str5, z28));
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z29 = true;
            jSONObject.put(dm.i4.COL_ID, 1);
            if (z17) {
                z29 = false;
            }
            jSONObject.put("isShow", z29);
            jSONArray.put(jSONObject);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.COL_ID, 2);
            jSONObject2.put("isShow", z17);
            jSONArray.put(jSONObject2);
            hashMap.put("update_menu_param", jSONArray.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.MiniReaderLogic", "updateMenu() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        hashMap.put("extra_param_open_file_scene", java.lang.String.valueOf(i17));
        com.tencent.mm.xwebutil.i.d(activity, str, str2, str3, str4, true, hashMap, valueCallback, valueCallback2, true);
    }
}
