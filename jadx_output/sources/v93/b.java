package v93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv93/b;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class b extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiGetAdInfoWithPosId", "invoke appId：" + str + "、data：" + jSONObject);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiGetAdInfoWithPosId", "data == null");
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("posId", "");
        java.lang.String str2 = optString != null ? optString : "";
        boolean z18 = true;
        if (str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiGetAdInfoWithPosId", "posId is empty");
            this.f143443f.a("posId is empty");
            return;
        }
        java.util.Iterator<E> it = v93.a.f434160a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((wj.t0) obj).f446518d, str2)) {
                    break;
                }
            }
        }
        wj.t0 t0Var = (wj.t0) obj;
        if (t0Var == null) {
            t0Var = wj.t0.f446508q;
        }
        xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(t0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("posId：");
        sb6.append(str2);
        sb6.append("、magicPosId: ");
        sb6.append(t0Var.f446518d);
        sb6.append("、adInfo: ");
        sb6.append(Ui != null ? Ui.f454753a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiGetAdInfoWithPosId", sb6.toString());
        if (Ui != null) {
            java.lang.String str3 = Ui.f454753a;
            if (str3 != null && str3.length() != 0) {
                z18 = false;
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiGetAdInfoWithPosId", "callback success");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("result", java.lang.Boolean.TRUE);
                hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "ok");
                this.f143443f.b(hashMap);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiGetAdInfoWithPosId", "callback failed：ad info not found");
        this.f143443f.a("No Cache AdInfo, try get from svr.");
    }
}
