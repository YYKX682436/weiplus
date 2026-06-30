package pd3;

/* loaded from: classes7.dex */
public final class f extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f353559f = "MBJsApiOperateDownloadTask";

    @Override // lc3.c0
    public java.lang.String f() {
        return zc1.f.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("downloadTaskId");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(optString);
        java.lang.String str = this.f353559f;
        if (K0) {
            com.tencent.mars.xlog.Log.i(str, "downloadTaskId is null or nil");
            s().invoke(h(300005, "downloadTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = data.optString("operationType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.i(str, "operationType is null");
            s().invoke(h(300005, "operationType is null"));
            return;
        }
        java.lang.String instanceName = e().f344331a;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (!kotlin.jvm.internal.o.b(optString2, "abort")) {
            com.tencent.mars.xlog.Log.i(str, "unknown operationType");
            s().invoke(h(300005, "unknown operationType"));
            return;
        }
        jc3.v wi6 = ((com.tencent.mm.plugin.magicbrush.l6) ((com.tencent.mm.plugin.magicbrush.h4) i95.n0.c(com.tencent.mm.plugin.magicbrush.h4.class))).wi(s07, com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key.Download);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i(str, "get download task error");
            s().invoke(h(300004, "get download task error"));
            return;
        }
        jc3.w a17 = wi6.a(optString);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i(str, "downloadWorker is null %s", optString);
            s().invoke(h(300004, "get download worker error"));
            return;
        }
        wi6.b(a17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", optString);
        s().invoke(l(hashMap));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("downloadTaskId", optString);
        jSONObject.put("state", "fail");
        jSONObject.put("errno", 303305);
        jSONObject.put("errMsg", "fail:abort download");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new com.tencent.mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange();
        mBJsEventOnDownloadTaskStateChange.f147882e = jSONObject2;
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var != null) {
            h0Var.C0(mBJsEventOnDownloadTaskStateChange);
        }
    }
}
