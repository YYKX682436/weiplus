package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/y5;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/r5", "com/tencent/mm/plugin/lite/jsapi/comms/t5", "com/tencent/mm/plugin/lite/jsapi/comms/u5", "com/tencent/mm/plugin/lite/jsapi/comms/v5", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class y5 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f143835g;

    static {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        f143835g = lp0.b.h0("liteappjsapi_savefile");
    }

    public final void A(java.util.List list) {
        e40.c0 c0Var = (e40.c0) i95.n0.c(e40.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.jsapi.comms.v5 v5Var = (com.tencent.mm.plugin.lite.jsapi.comms.v5) it.next();
            arrayList.add(new e40.y(v5Var.f143808a, v5Var.f143809b, v5Var.f143813f, v5Var.f143810c, v5Var.f143811d, 0L, 32, null));
        }
        ((d40.t) c0Var).Zi(arrayList, new com.tencent.mm.plugin.lite.jsapi.comms.w5(this, list));
    }

    public final void B(java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.t5 t5Var, java.lang.String str2) {
        int ordinal = t5Var.ordinal();
        if (ordinal == 0) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context c17 = c();
            ((yb0.g) b0Var).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.b(c17, str, null);
            return;
        }
        if (ordinal == 1) {
            zb0.b0 b0Var2 = (zb0.b0) i95.n0.c(zb0.b0.class);
            c();
            ((yb0.g) b0Var2).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.g(com.tencent.mm.sdk.platformtools.x2.f193071a, str, null, null);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (str2 == null) {
            zb0.b0 b0Var3 = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context c18 = c();
            ((yb0.g) b0Var3).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.d(c18, str, null);
            return;
        }
        zb0.b0 b0Var4 = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context c19 = c();
        com.tencent.mm.plugin.lite.jsapi.comms.x5 x5Var = new com.tencent.mm.plugin.lite.jsapi.comms.x5(str2);
        ((yb0.g) b0Var4).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.e(c19, str, str2, x5Var);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        java.lang.String str5 = "fileId";
        java.lang.String str6 = "MicroMsg.LiteAppJsApiSaveFile";
        java.lang.String str7 = "fileList";
        kotlin.jvm.internal.o.g(data, "data");
        try {
            org.json.JSONArray jSONArray = data.getJSONArray("fileList");
            if (jSONArray.length() < 1) {
                return;
            }
            if (jSONArray.getJSONObject(0).has("fileId")) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    int i18 = 0;
                    while (i18 < length) {
                        java.lang.Object obj = jSONArray.get(i18);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                        java.lang.String string = jSONObject.getString(str5);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        java.lang.String str8 = str5;
                        java.lang.String string2 = jSONObject.getString("aesKey");
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        int i19 = length;
                        java.lang.String string3 = jSONObject.getString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        str3 = str6;
                        try {
                            java.lang.String string4 = jSONObject.getString("md5");
                            kotlin.jvm.internal.o.f(string4, "getString(...)");
                            java.lang.String str9 = str7;
                            com.tencent.mm.plugin.lite.jsapi.comms.s5 s5Var = com.tencent.mm.plugin.lite.jsapi.comms.t5.f143781d;
                            java.lang.String string5 = jSONObject.getString("fileType");
                            kotlin.jvm.internal.o.f(string5, "getString(...)");
                            arrayList.add(new com.tencent.mm.plugin.lite.jsapi.comms.v5(string, string2, string3, string4, s5Var.a(string5)));
                            i18++;
                            str5 = str8;
                            length = i19;
                            str6 = str3;
                            str7 = str9;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            str2 = str3;
                            com.tencent.mars.xlog.Log.e(str2, e.getMessage() + ": " + jz5.a.b(e));
                            this.f143442e.a();
                        }
                    }
                    str3 = str6;
                    str4 = str7;
                    A(arrayList);
                    i17 = 0;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str3 = str6;
                    str2 = str3;
                    com.tencent.mars.xlog.Log.e(str2, e.getMessage() + ": " + jz5.a.b(e));
                    this.f143442e.a();
                }
            } else {
                str3 = "MicroMsg.LiteAppJsApiSaveFile";
                str4 = "fileList";
                i17 = 0;
            }
            if (jSONArray.getJSONObject(i17).has(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
                java.util.ArrayList<com.tencent.mm.plugin.lite.jsapi.comms.u5> arrayList2 = new java.util.ArrayList(jSONArray.length());
                int length2 = jSONArray.length();
                for (int i27 = 0; i27 < length2; i27++) {
                    java.lang.Object obj2 = jSONArray.get(i27);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
                    java.lang.String string6 = jSONObject2.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    kotlin.jvm.internal.o.f(string6, "getString(...)");
                    java.lang.String string7 = jSONObject2.getString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
                    kotlin.jvm.internal.o.f(string7, "getString(...)");
                    com.tencent.mm.plugin.lite.jsapi.comms.s5 s5Var2 = com.tencent.mm.plugin.lite.jsapi.comms.t5.f143781d;
                    java.lang.String string8 = jSONObject2.getString("fileType");
                    kotlin.jvm.internal.o.f(string8, "getString(...)");
                    com.tencent.mm.plugin.lite.jsapi.comms.u5 u5Var = new com.tencent.mm.plugin.lite.jsapi.comms.u5(string6, string7, s5Var2.a(string8));
                    if (r26.i0.A(u5Var.f143799a, "liteappLocalId://", false, 2, null)) {
                        java.lang.String pathByLiteAppLocalId = com.tencent.mm.plugin.lite.LiteAppCenter.getPathByLiteAppLocalId(this.f143442e.f299024a, str, u5Var.f143799a);
                        kotlin.jvm.internal.o.f(pathByLiteAppLocalId, "getPathByLiteAppLocalId(...)");
                        u5Var.f143799a = pathByLiteAppLocalId;
                    }
                    arrayList2.add(u5Var);
                }
                for (com.tencent.mm.plugin.lite.jsapi.comms.u5 u5Var2 : arrayList2) {
                    B(u5Var2.f143799a, u5Var2.f143801c, u5Var2.f143800b);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(jSONArray.length());
                int length3 = jSONArray.length();
                for (int i28 = 0; i28 < length3; i28++) {
                    kotlin.jvm.internal.o.f(jSONArray.get(i28), "get(...)");
                    arrayList3.add(new com.tencent.mm.plugin.lite.jsapi.comms.r5(e40.a0.f247608n, null, null, null, 14, null));
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((com.tencent.mm.plugin.lite.jsapi.comms.r5) it.next()).a());
                }
                jSONObject3.put(str4, jSONArray2);
                jSONObject3.put("complete", true);
                str2 = str3;
                try {
                    com.tencent.mars.xlog.Log.i(str2, "callbackResponse = " + jSONObject3);
                    this.f143442e.f(jSONObject3, false);
                } catch (java.lang.Exception e19) {
                    e = e19;
                    com.tencent.mars.xlog.Log.e(str2, e.getMessage() + ": " + jz5.a.b(e));
                    this.f143442e.a();
                }
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            str2 = "MicroMsg.LiteAppJsApiSaveFile";
        }
    }
}
