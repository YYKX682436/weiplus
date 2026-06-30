package od1;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "getGamePerformance";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17;
        yg.a aVar;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || (b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(e9Var.getAppId(), true)) == null) {
            return;
        }
        int i18 = yd.c0.INST.h().f460918a;
        int i19 = i18 - b17.f88152x;
        yg.h hVar = ((ae.a) ((ae.q) b17.f88144p.C0().z1(ae.q.class))).w().f48585i;
        synchronized (hVar.f462064a) {
            aVar = hVar.f462066c;
        }
        float f17 = aVar.f462018a;
        yg.f a17 = hVar.a();
        int i27 = a17.f462050c;
        int i28 = a17.f462051d;
        float f18 = a17.f462052e * 10000;
        int round = (int) java.lang.Math.round(com.tencent.mm.plugin.appbrand.report.quality.z.INST.f88391d.b());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cpu", java.lang.String.valueOf(round));
        hashMap.put("memory", java.lang.String.valueOf(i18));
        hashMap.put("memoryDiff", java.lang.String.valueOf(i19));
        hashMap.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.String.valueOf(f17));
        hashMap.put("jank", java.lang.String.valueOf(i27));
        hashMap.put("bigJank", java.lang.String.valueOf(i28));
        hashMap.put("stutter", java.lang.String.valueOf(f18));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGamePerformance", "jMap:" + hashMap);
        e9Var.a(i17, p("ok", hashMap));
    }
}
