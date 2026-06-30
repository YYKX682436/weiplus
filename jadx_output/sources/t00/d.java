package t00;

/* loaded from: classes.dex */
public final class d implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t00.c f414272a = new t00.c(null);

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414323d;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CheckActionEcsActionHandler", "params not set");
            callback.a();
            return;
        }
        org.json.JSONObject a17 = f414272a.a(optJSONObject, i17);
        if (a17 != null) {
            callback.b(a17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            callback.a();
        }
    }
}
