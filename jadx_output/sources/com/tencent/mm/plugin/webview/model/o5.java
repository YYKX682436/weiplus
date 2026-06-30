package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public abstract class o5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f183050a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f183051b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f183050a = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f183051b = hashMap2;
        hashMap.put("image/jpeg", java.util.Arrays.asList(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, ".jpeg"));
        hashMap.put("image/jpg", java.util.Arrays.asList(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, ".jpeg"));
        hashMap.put("image/png", java.util.Collections.singletonList(".png"));
        hashMap.put("image/webp", java.util.Collections.singletonList(".webp"));
        hashMap.put("image/bmp", java.util.Collections.singletonList(".bmp"));
        hashMap.put("image/gif", java.util.Collections.singletonList(".gif"));
        hashMap.put("image/tiff", java.util.Arrays.asList(".tiff", ".tif"));
        hashMap.put("image/svg+xml", java.util.Arrays.asList(".svg", ".svgz"));
        hashMap2.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4, java.util.Collections.singletonList(".mp4"));
        hashMap2.put("video/x-m4v", java.util.Collections.singletonList(".m4v"));
        hashMap2.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MPEG, java.util.Arrays.asList(".mpg", ".mpeg", ".mpe"));
        hashMap2.put("video/quicktime", java.util.Arrays.asList(".qt", ".mov"));
        hashMap2.put("video/x-msvideo", java.util.Collections.singletonList(".avi"));
        hashMap2.put("video/x-ms-wmv", java.util.Collections.singletonList(".wmv"));
        hashMap2.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_WEBM, java.util.Collections.singletonList(".webm"));
        hashMap2.put("video/ogg", java.util.Collections.singletonList(".ogv"));
        hashMap2.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_H263, java.util.Collections.singletonList(".3gp"));
        hashMap2.put("video/3gpp2", java.util.Collections.singletonList(".3g2"));
    }

    public static java.lang.String a(java.util.ArrayList arrayList) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return "";
        }
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
                if (b17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) {
                    jSONStringer.object();
                    jSONStringer.key(dm.i4.COL_LOCALID);
                    jSONStringer.value(str);
                    jSONStringer.key("height");
                    jSONStringer.value(b17.f182745q + "");
                    jSONStringer.key("width");
                    jSONStringer.value(b17.f182744p + "");
                    jSONStringer.key("isGif");
                    jSONStringer.value(((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) b17).f182751w + "");
                    jSONStringer.endObject();
                }
            }
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public static android.content.Intent b(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.vfs.r6(c(str))));
        return intent;
    }

    public static java.lang.String c(java.lang.String str) {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_jsapi_choose_image_forbid_new_tmp_path, 0) == 1)) {
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            java.lang.String str2 = lp0.b.h0("WebViewImageCache").o() + "/" + str + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "getTmpFilePath: %s == %s", str, str2);
            return str2;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.K());
        if (!r6Var.J()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "mkdirs failed.File is exist = " + r6Var.m());
        }
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewJSSDKUtil", "camera storage path do not exist.(%s)", lp0.b.K());
        }
        java.lang.String str3 = r6Var.o() + "/" + str + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "get file path from capture file name : %s == %s", str, str3);
        return str3;
    }

    public static java.lang.String d(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "get orignal filepath from local id :%s", b17.f182738g);
            return b17.f182738g;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebviewJSSDKUtil", "getOrigFilePathByLocalId, local map not contains the local id : %s", str);
        return null;
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "get local thumb filepath from local id :%s", b17.f182737f);
            return b17.f182737f;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebviewJSSDKUtil", "fromLocalIdToFilePath, local map not contains the local id : %s", str);
        return null;
    }

    public static boolean f(java.lang.String[] strArr, java.util.HashMap hashMap, java.lang.String str) {
        if (strArr == null) {
            return false;
        }
        for (java.lang.String str2 : strArr) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                java.lang.String trim = str2.trim();
                if (trim.equalsIgnoreCase(str)) {
                    return true;
                }
                for (java.lang.String str3 : hashMap.keySet()) {
                    if (trim.equalsIgnoreCase(str3)) {
                        return true;
                    }
                    java.util.List list = (java.util.List) hashMap.get(str3);
                    if (list != null && list.contains(trim)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static java.lang.String g(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewJSSDKUtil", "data is null");
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            jSONArray.put((java.lang.String) arrayList.get(i17));
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(java.util.ArrayList r6) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.WebviewJSSDKUtil"
            if (r6 == 0) goto L5f
            int r2 = r6.size()
            if (r2 != 0) goto Ld
            goto L5f
        Ld:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L3d
            java.lang.String r4 = "{"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L3d
            java.lang.String r4 = "}"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L37
            goto L3d
        L37:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r4.<init>(r3)     // Catch: org.json.JSONException -> L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L44
            r2.put(r4)
            goto L16
        L44:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "localId"
            r4.put(r5, r3)     // Catch: org.json.JSONException -> L52
            r2.put(r4)     // Catch: org.json.JSONException -> L52
            goto L16
        L52:
            r3 = move-exception
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r0, r4)
            goto L16
        L5a:
            java.lang.String r6 = r2.toString()
            return r6
        L5f:
            java.lang.String r6 = "data is null"
            com.tencent.mars.xlog.Log.e(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.model.o5.h(java.util.ArrayList):java.lang.String");
    }

    public static java.lang.String i(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewJSSDKUtil", "parseVideoItemToJson localId is null");
            return "";
        }
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            jSONStringer.object();
            jSONStringer.key(dm.i4.COL_LOCALID);
            jSONStringer.value(str);
            jSONStringer.key("thumbLocalId");
            jSONStringer.value(str2);
            jSONStringer.key("duration");
            jSONStringer.value(i17 + "");
            jSONStringer.key("height");
            jSONStringer.value(i18 + "");
            jSONStringer.key("width");
            jSONStringer.value(i19 + "");
            jSONStringer.key("size");
            jSONStringer.value(i27 + "");
            jSONStringer.endObject();
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}
