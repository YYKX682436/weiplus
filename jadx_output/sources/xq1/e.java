package xq1;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f456026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq1.f f456027e;

    public e(xq1.f fVar, org.json.JSONObject jSONObject) {
        this.f456027e = fVar;
        this.f456026d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String jSONObject = this.f456026d.toString();
        wq1.d dVar = this.f456027e.f456028a;
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0("requestCompleted")) {
                return;
            }
            if (jSONObject == null) {
                jSONObject = "";
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = "requestCompleted";
            objArr[1] = (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject) || jSONObject.length() <= 50) ? jSONObject : jSONObject.substring(0, 50);
            com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxJsEventNotifier", "notifyJsEvent %s %s", objArr);
            dVar.c().evaluateJavascript(java.lang.String.format("javascript:boxJSApi['%s'] && boxJSApi.%s(%s)", "requestCompleted", "requestCompleted", jSONObject), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Box.BoxJsEventNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
