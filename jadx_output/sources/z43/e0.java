package z43;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f470114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z43.f0 f470115e;

    public e0(z43.f0 f0Var, org.json.JSONObject jSONObject) {
        this.f470115e = f0Var;
        this.f470114d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        org.json.JSONObject jSONObject = this.f470114d;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("appIdArray");
        long j17 = 0;
        z43.f0 f0Var = this.f470115e;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            long optLong = jSONObject.optLong("download_id", -1L);
            java.lang.String optString = jSONObject.optString("appid");
            if (optLong > 0) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(optLong);
                if (p17 == null) {
                    p17 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
                }
                p17.f96966i = optString;
                z43.f0.A(f0Var, p17);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                f0Var.f143443f.a("fail");
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(optString);
            if (q17 == null) {
                q17 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
            }
            q17.f96966i = optString;
            z43.f0.A(f0Var, q17);
            return;
        }
        f0Var.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            linkedList.add(optJSONArray.optString(i17));
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        java.util.LinkedList e17 = com.tencent.mm.plugin.downloader.model.r0.i().e(linkedList);
        java.lang.String str2 = "LiteAppJsApiQueryDownloadTask";
        if (e17.size() <= 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiQueryDownloadTask", "taskInfos is null");
            f0Var.B(jSONObject2, linkedList);
            f0Var.f143443f.c(jSONObject2, false);
            return;
        }
        java.util.Iterator it = e17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = (com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo) it.next();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
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
            java.lang.String str3 = str2;
            try {
                jSONObject3.put("download_id", fileDownloadTaskInfo.f96961d);
                jSONObject3.put("state", str);
                if (fileDownloadTaskInfo.f96972r) {
                    jSONObject3.put("reserve_for_wifi", 1);
                }
                long j18 = fileDownloadTaskInfo.f96968n;
                if (j18 != j17) {
                    jSONObject3.put("progress", (100 * fileDownloadTaskInfo.f96967m) / j18);
                    jSONObject3.put("progress_float", (((float) r13) * 100.0f) / ((float) j18));
                }
                jSONObject2.put(fileDownloadTaskInfo.f96966i, jSONObject3);
                linkedList.remove(fileDownloadTaskInfo.f96966i);
                str2 = str3;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e(str3, e18.getMessage());
                str2 = str3;
            }
            j17 = 0;
        }
        f0Var.B(jSONObject2, linkedList);
        new org.json.JSONObject();
        f0Var.f143443f.c(jSONObject2, false);
    }
}
