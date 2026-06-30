package hy4;

/* loaded from: classes7.dex */
public final class i0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.k0 f286116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f286118f;

    public i0(hy4.k0 k0Var, java.lang.String str, yz5.a aVar) {
        this.f286116d = k0Var;
        this.f286117e = str;
        this.f286118f = aVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        java.util.Iterator<java.lang.String> keys;
        this.f286116d.f286143y = null;
        java.lang.System.currentTimeMillis();
        try {
            java.lang.String s17 = this.f286117e;
            kotlin.jvm.internal.o.f(s17, "$s");
            java.lang.String substring = s17.substring(1, this.f286117e.length() - 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(u46.k.e(substring));
            yz5.a aVar = this.f286118f;
            hy4.k0 k0Var = this.f286116d;
            java.util.Iterator<java.lang.String> keys2 = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys2, "keys(...)");
            while (keys2.hasNext()) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(keys2.next());
                if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        optJSONObject.optLong(next);
                        k0Var.a(next, optJSONObject.optLong(next));
                    }
                }
            }
            aVar.invoke();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewPerformanceHelper", e17, "fetchDocumentTime exception", new java.lang.Object[0]);
        }
        hy4.k0 k0Var2 = this.f286116d;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = k0Var2.f342551b;
        if (concurrentLinkedDeque != null && !concurrentLinkedDeque.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                o25.j2 j2Var = (o25.j2) it.next();
                sb6.append("[");
                sb6.append(j2Var.f342545a);
                sb6.append(": ");
                sb6.append(j2Var.f342546b);
                if (j2Var.f342546b > k0Var2.f286140v) {
                    sb6.append(", ");
                    sb6.append(j2Var.f342546b - k0Var2.f286140v);
                }
                java.lang.String str = j2Var.f342547c;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    sb6.append(", ");
                    sb6.append(str);
                }
                sb6.append("] ");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPerformanceHelper", "WebView-Trace#" + k0Var2.f286139u + ", webViewPerformance: %s", sb6.toString());
            concurrentLinkedDeque.clear();
        }
        java.lang.System.currentTimeMillis();
        return false;
    }
}
