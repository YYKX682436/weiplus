package fe1;

/* loaded from: classes15.dex */
public final class i extends fe1.a {
    public static final int CTRL_INDEX = 1577;
    public static final java.lang.String NAME = "getTransitCardCPLC";

    @Override // fe1.a
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(manager, "manager");
        fe1.h hVar = new fe1.h(java.lang.System.currentTimeMillis(), env, this, i17);
        com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCPLCTask getCPLCTask = new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCPLCTask(manager.f261502a);
        getCPLCTask.F(hVar);
        getCPLCTask.d();
    }
}
