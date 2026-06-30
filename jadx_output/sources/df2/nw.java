package df2;

/* loaded from: classes3.dex */
public final class nw {
    public nw(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("LiveShopMsgDataController", "[report] json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327237i2, t17, 0L, null, null, null, null, null, 252, null);
    }
}
