package zc1;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 270;
    public static final java.lang.String NAME = "operateDownloadTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateDownloadTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("downloadTaskId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
            lVar.a(i17, o("fail:downloadTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        if (!optString2.equals("abort")) {
            lVar.a(i17, o("fail:unknown operationType"));
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f427798b;
        uh1.f a17 = uh1.h.f427795a.a(lVar.getAppId());
        if (a17 == null) {
            lVar.a(i17, o("fail:no task"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateDownloadTask", "download is null");
            return;
        }
        vh1.f fVar = null;
        if (optString != null) {
            synchronized (a17.f427793j) {
                java.util.Iterator it = a17.f427793j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    vh1.f fVar2 = (vh1.f) it.next();
                    if (optString.equals(fVar2.f437033v)) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
        }
        if (fVar == null) {
            lVar.a(i17, o("fail:no task"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", optString);
            return;
        }
        a17.f427790g.add(fVar.f437033v);
        a17.a(fVar.f437033v);
        fVar.a();
        lVar.a(i17, o("ok"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", optString + "");
        hashMap.put("state", "fail");
        hashMap.put("errMsg", "abort");
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(c0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }
}
