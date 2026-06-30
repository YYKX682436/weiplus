package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class c0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getAppDownloadStatus";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (Ai != null) {
            java.util.ArrayList<com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : Ai) {
                java.lang.String str2 = ((com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo) obj).f97227d;
                if (!(str2 == null || str2.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            for (com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo downloadWidgetTaskInfo : arrayList) {
                kotlin.jvm.internal.o.d(downloadWidgetTaskInfo);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("appId", downloadWidgetTaskInfo.f97227d);
                java.lang.String str3 = downloadWidgetTaskInfo.f97229f;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1211129254:
                            if (str3.equals("downloading")) {
                                jSONArray4.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                        case 31448181:
                            if (str3.equals("download_fail")) {
                                jSONArray3.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                        case 31854489:
                            if (str3.equals("download_succ")) {
                                jSONArray2.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                        case 984140671:
                            if (str3.equals("download_pause")) {
                                jSONArray.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        jSONObject.put("DownloadedTaskList", jSONArray2);
        jSONObject.put("PausedTaskList", jSONArray);
        jSONObject.put("RunningTaskList", jSONArray4);
        jSONObject.put("FailedTaskList", jSONArray3);
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
