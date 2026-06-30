package wc1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 1184;
    public static final java.lang.String NAME = "awaitLoadSubPackageTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.utils.b5 b5Var;
        java.lang.String optString = jSONObject.optString("loadTaskId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAwaitLoadSubPackageTask", "null or nil loadTaskId");
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str, jSONObject2);
        }
        int optInt = jSONObject.optInt("timeout", 10000);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAwaitLoadSubPackageTask", "await taskId: %s, timeout: %d", optString, java.lang.Integer.valueOf(optInt));
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String tag = "AwaitTagLoadSubPackage_" + optString;
        long j17 = optInt;
        com.tencent.mm.plugin.appbrand.utils.c5 c5Var = (com.tencent.mm.plugin.appbrand.utils.c5) com.tencent.mm.plugin.appbrand.utils.p0.a(lVar);
        kotlin.jvm.internal.o.g(tag, "tag");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = c5Var.f90398d;
        if ((concurrentHashMap.get(tag) != null) && (b5Var = (com.tencent.mm.plugin.appbrand.utils.b5) concurrentHashMap.get(tag)) != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = b5Var.f90391a;
            reentrantLock.lock();
            try {
                try {
                    b5Var.f90392b.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.InterruptedException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SyncWaiter", "hy: wait from async fail due to timeout!");
                    reentrantLock.unlock();
                    z17 = false;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        z17 = true;
        ph1.g gVar = (ph1.g) c5Var.f90399e.get(tag);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = optString;
        objArr[1] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = gVar != null ? gVar.toString() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAwaitLoadSubPackageTask", "await taskId: %s done, using %d ms and is success %b and load result is %s", objArr);
        return r(null, z17 ? gVar == ph1.g.OK ? jc1.f.f298912a : gVar == ph1.g.CANCEL ? jc1.f.f298913b : jc1.f.f298915d : jc1.f.f298916e, null);
    }
}
