package t00;

/* loaded from: classes.dex */
public final class g2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414330k;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendThanksActionHandler", "handleAction context null");
            callback.a();
            return;
        }
        java.lang.String optString = data.optString("orderId");
        if (optString == null || optString.length() == 0) {
            callback.a();
            return;
        }
        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
        kotlin.jvm.internal.o.d(optString);
        ((j00.d2) m3Var).Ui(context, optString, new t00.f2(callback));
    }
}
