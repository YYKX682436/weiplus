package w93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            return;
        }
        try {
            int optInt = jSONObject.optInt("businessId");
            boolean z18 = true;
            if (jSONObject.optInt("isBatchReport") != 1) {
                z18 = false;
            }
            java.lang.String optString = jSONObject.optString("infoList", "");
            kotlin.jvm.internal.o.d(optString);
            if (r26.n0.N(optString)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiSdkReporter", "empty infoList");
                return;
            }
            com.tencent.mm.autogen.events.JsSdkCgiReportEvent jsSdkCgiReportEvent = new com.tencent.mm.autogen.events.JsSdkCgiReportEvent();
            am.xh xhVar = jsSdkCgiReportEvent.f54448g;
            xhVar.f8378a = optInt;
            xhVar.f8379b = z18;
            xhVar.f8380c = optString;
            jsSdkCgiReportEvent.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiSdkReporter", "cur bizId = " + optInt + ", isBatchReport = " + z18 + ", info = " + jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiSdkReporter", "invoke error " + e17);
        }
    }
}
