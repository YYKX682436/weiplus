package sx4;

/* loaded from: classes8.dex */
public class v {

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f413665e;

    /* renamed from: a, reason: collision with root package name */
    public long f413661a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f413662b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f413663c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f413664d = 0;

    /* renamed from: f, reason: collision with root package name */
    public final sx4.u f413666f = new sx4.u(this);

    public static void a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : keySet) {
                jSONObject.put(str, bundle.get(str));
            }
            com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent = new com.tencent.mm.autogen.events.GameCommOperationEvent();
            am.le leVar = gameCommOperationEvent.f54358g;
            leVar.f7243a = 4;
            leVar.f7244b = jSONObject.toString();
            gameCommOperationEvent.e();
        } catch (org.json.JSONException unused) {
        }
    }

    public void b(android.os.Bundle bundle) {
    }
}
