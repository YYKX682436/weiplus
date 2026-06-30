package w00;

/* loaded from: classes7.dex */
public final class a implements t00.s0 {
    @Override // t00.s0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.H;
    }

    @Override // t00.s0
    public java.lang.String b(int i17, android.content.Context context, org.json.JSONObject data, c00.p3 actionReturn) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(actionReturn, "actionReturn");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ActionHandlerCheckActionSync", "params not set");
            return ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).a(null);
        }
        org.json.JSONObject a17 = t00.d.f414272a.a(optJSONObject, i17);
        return a17 != null ? ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).b(a17) : ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).a(null);
    }
}
