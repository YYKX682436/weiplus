package sd1;

/* loaded from: classes7.dex */
public abstract class d {
    public static final java.lang.String a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, sd1.b referrerPolicyContainer, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(referrerPolicyContainer, "referrerPolicyContainer");
        kotlin.jvm.internal.o.g(data, "data");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Referrers", "updateReferrers, component is null");
            return null;
        }
        sd1.a aVar = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Referrers", "updateReferrers, referrerHelper is null");
            return null;
        }
        if (referrerPolicyContainer.getReferrerPolicy() == null) {
            referrerPolicyContainer.setReferrerPolicy(com.tencent.mm.plugin.appbrand.utils.p5.f90530e);
        }
        com.tencent.mm.plugin.appbrand.utils.p5 p5Var = (com.tencent.mm.plugin.appbrand.utils.p5) aVar;
        sd1.c c17 = p5Var.c(data, lVar);
        if (c17 != null) {
            referrerPolicyContainer.setReferrerPolicy(c17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Referrers", "updateReferrers, referrerPolicy: " + referrerPolicyContainer.getReferrerPolicy());
        if (sd1.c.f406677e == referrerPolicyContainer.getReferrerPolicy()) {
            return null;
        }
        java.lang.String e17 = p5Var.e(lVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Referrers", "updateReferrers, mReferrer: " + e17);
        return e17;
    }
}
