package pd3;

/* loaded from: classes7.dex */
public final class b extends od3.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f353550f = "MBJsApiCreateCDNDownloadTask";

    public static final boolean v(pd3.b bVar, java.lang.String str, java.lang.String str2) {
        bVar.getClass();
        jc3.v Ai = ((com.tencent.mm.plugin.magicbrush.l6) ((com.tencent.mm.plugin.magicbrush.h4) i95.n0.c(com.tencent.mm.plugin.magicbrush.h4.class))).Ai(str, com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key.CDNDownload);
        if (Ai == null || !Ai.c(str2)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(bVar.f353550f, "download abort %s", str2);
        return true;
    }

    @Override // od3.a
    public java.lang.String a() {
        return "downloadTaskId";
    }

    @Override // od3.a
    public void d(lc3.a0 data, java.lang.String taskId, java.lang.String url, java.lang.String bizName) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String optString = data.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        int optInt = data.optInt("timeout", ((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).wi(bizName).f298968d);
        com.tencent.mars.xlog.Log.i(this.f353550f, "bizName:" + bizName + ",configTimeout:" + optInt + ",url:" + url + ",dstPath:" + optString);
        jc3.v Ai = ((com.tencent.mm.plugin.magicbrush.l6) ((com.tencent.mm.plugin.magicbrush.h4) i95.n0.c(com.tencent.mm.plugin.magicbrush.h4.class))).Ai(bizName, com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key.CDNDownload);
        if (Ai != null) {
            Ai.d((lc3.h0) this.f317890a, bizName, data, optInt, taskId, "createCDNDownloadTask", new pd3.a(this, bizName, taskId, optString));
        }
    }

    @Override // lc3.c0
    public java.lang.String f() {
        return "createCDNDownloadTask";
    }

    @Override // od3.a
    public java.lang.String getTaskId() {
        return ((com.tencent.mm.plugin.magicbrush.l6) ((com.tencent.mm.plugin.magicbrush.h4) i95.n0.c(com.tencent.mm.plugin.magicbrush.h4.class))).Bi(com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key.CDNDownload);
    }

    public final void w(java.lang.String bizName, java.lang.String str, int i17, java.lang.String str2) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        com.tencent.mars.xlog.Log.w(this.f353550f, "sendFailMsg, bizName = %s, downloadTaskId = %s, errno = %d, errMsg = %s", bizName, str, java.lang.Integer.valueOf(i17), str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("downloadTaskId", str);
        jSONObject.put("state", "fail");
        jSONObject.put("errno", i17);
        jSONObject.put("errMsg", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange();
        mBJsEventOnCDNDownloadTaskStateChange.f147882e = jSONObject2;
        u(mBJsEventOnCDNDownloadTaskStateChange);
    }
}
