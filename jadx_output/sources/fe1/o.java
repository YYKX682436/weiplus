package fe1;

/* loaded from: classes15.dex */
public final class o extends fe1.a {
    public static final int CTRL_INDEX = 1580;
    public static final java.lang.String NAME = "getTransitCardList";

    @Override // fe1.a
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(manager, "manager");
        fe1.n nVar = new fe1.n(java.lang.System.currentTimeMillis(), data.optString("issuerID", ""), env, this, i17);
        com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardListTask getCardListTask = new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardListTask(manager.f261502a);
        getCardListTask.F(nVar);
        getCardListTask.d();
    }
}
