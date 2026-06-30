package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.k3 f182359f;

    public j3(com.tencent.mm.plugin.webview.luggage.jsapi.k3 k3Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182359f = k3Var;
        this.f182357d = jSONObject;
        this.f182358e = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.webview.luggage.jsapi.k3 k3Var;
        org.json.JSONObject jSONObject = this.f182357d;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("appIdArray");
        java.lang.String str3 = "download_id";
        com.tencent.mm.plugin.webview.luggage.jsapi.k3 k3Var2 = this.f182359f;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182358e;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            long optLong = jSONObject.optLong("download_id", -1L);
            java.lang.String optString = jSONObject.optString("appid");
            if (optLong > 0) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(optLong);
                if (p17 == null) {
                    p17 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
                }
                com.tencent.mm.plugin.webview.luggage.jsapi.k3.f(k3Var2, p17, q5Var);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                q5Var.a("fail", null);
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(optString);
            if (q17 == null) {
                q17 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
            }
            com.tencent.mm.plugin.webview.luggage.jsapi.k3.f(k3Var2, q17, q5Var);
            return;
        }
        k3Var2.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            linkedList.add(optJSONArray.optString(i17));
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        java.util.LinkedList e17 = com.tencent.mm.plugin.downloader.model.r0.i().e(linkedList);
        if (e17.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", "taskInfos is null");
            k3Var2.g(jSONObject2, linkedList);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("result", jSONObject2.toString());
            } catch (org.json.JSONException unused) {
            }
            q5Var.a(null, jSONObject3);
            return;
        }
        java.util.Iterator it = e17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = (com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo) it.next();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            int i18 = fileDownloadTaskInfo.f96963f;
            if (i18 == -1) {
                str = "api_not_support";
            } else if (i18 == 1) {
                str = "downloading";
            } else if (i18 == 2) {
                str = "download_pause";
            } else if (i18 != 3) {
                if (i18 == 4) {
                    str = "download_fail";
                }
                str = "default";
            } else {
                if (com.tencent.mm.vfs.w6.j(fileDownloadTaskInfo.f96964g)) {
                    str = "download_succ";
                }
                str = "default";
            }
            try {
                jSONObject4.put(str3, fileDownloadTaskInfo.f96961d);
                jSONObject4.put("state", str);
                if (fileDownloadTaskInfo.f96972r) {
                    jSONObject4.put("reserve_for_wifi", 1);
                }
                long j17 = fileDownloadTaskInfo.f96968n;
                if (j17 != 0) {
                    str2 = str3;
                    k3Var = k3Var2;
                    try {
                        jSONObject4.put("progress", (100 * fileDownloadTaskInfo.f96967m) / j17);
                        jSONObject4.put("progress_float", (((float) r13) * 100.0f) / ((float) j17));
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
                        str3 = str2;
                        k3Var2 = k3Var;
                    }
                } else {
                    str2 = str3;
                    k3Var = k3Var2;
                }
                jSONObject2.put(fileDownloadTaskInfo.f96966i, jSONObject4);
                linkedList.remove(fileDownloadTaskInfo.f96966i);
            } catch (java.lang.Exception e19) {
                e = e19;
                str2 = str3;
                k3Var = k3Var2;
            }
            str3 = str2;
            k3Var2 = k3Var;
        }
        k3Var2.g(jSONObject2, linkedList);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("result", jSONObject2.toString());
        } catch (org.json.JSONException unused2) {
        }
        q5Var.a("", jSONObject5);
    }
}
