package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class k3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    public static void f(com.tencent.mm.plugin.webview.luggage.jsapi.k3 k3Var, com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        java.lang.String str;
        k3Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = fileDownloadTaskInfo.f96963f;
        if (i17 == -1) {
            str = "api_not_support";
        } else if (i17 == 1) {
            str = "downloading";
        } else if (i17 == 2) {
            str = "download_pause";
        } else if (i17 != 3) {
            if (i17 == 4) {
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
            jSONObject.put("download_id", fileDownloadTaskInfo.f96961d);
            jSONObject.put("state", str);
            if (fileDownloadTaskInfo.f96972r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j17 = fileDownloadTaskInfo.f96968n;
            if (j17 != 0) {
                jSONObject.put("progress", (100 * fileDownloadTaskInfo.f96967m) / j17);
                jSONObject.put("progress_float", (((float) r2) * 100.0f) / ((float) j17));
            }
            q5Var.a(null, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
        }
    }

    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTask", "invokeInMM");
        try {
            p95.a.a(new com.tencent.mm.plugin.webview.luggage.jsapi.j3(this, new org.json.JSONObject(str), q5Var));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void g(org.json.JSONObject jSONObject, java.util.LinkedList linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("download_id", -1);
                jSONObject2.put("state", "default");
                jSONObject.put(str, jSONObject2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
            }
        }
    }
}
