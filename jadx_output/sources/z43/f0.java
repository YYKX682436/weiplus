package z43;

/* loaded from: classes.dex */
public class f0 extends com.tencent.mm.plugin.lite.api.p {
    public static void A(z43.f0 f0Var, com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo) {
        java.lang.String str;
        f0Var.getClass();
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
                jSONObject.put("progress_float", (((float) r3) * 100.0f) / ((float) j17));
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(fileDownloadTaskInfo.f96966i, jSONObject);
            f0Var.f143443f.c(jSONObject2, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiQueryDownloadTask", e17.getMessage());
        }
    }

    public final void B(org.json.JSONObject jSONObject, java.util.LinkedList linkedList) {
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
                com.tencent.mars.xlog.Log.e("LiteAppJsApiQueryDownloadTask", e17.getMessage());
            }
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        p95.a.a(new z43.e0(this, jSONObject));
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
