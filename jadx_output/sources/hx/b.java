package hx;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getAllDynamicCardInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String instanceName = e().f344331a;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        int i17 = kotlin.jvm.internal.o.b(s07, "MagicBrandService") ? 2 : kotlin.jvm.internal.o.b(s07, "MagicAdBrandService") ? 1 : 0;
        if (data.optBoolean("isRec")) {
            i17 = 3;
        }
        com.tencent.mars.xlog.Log.i("MBJsApiGetAllDynamicCardInfo", "bizName:".concat(s07));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (r01.l lVar : ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).wi(i17)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("msgId", lVar.f368135a);
            jSONObject.put("frameSetName", lVar.f368136b);
            jSONObject.put("frameSetData", lVar.f368137c);
            jSONObject.put("pos", lVar.f368138d);
            if (i17 == 3) {
                jSONObject.put("cardId", lVar.f368139e);
                jSONObject.put("subPos", lVar.f368140f);
            }
            jSONArray.put(jSONObject);
        }
        yz5.l s17 = s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("dynamicCardInfo", jSONArray);
        m(a0Var);
        s17.invoke(a0Var);
    }
}
