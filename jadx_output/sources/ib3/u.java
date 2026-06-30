package ib3;

/* loaded from: classes5.dex */
public final class u implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (kotlin.jvm.internal.o.b("f2fhbdistribute", str)) {
            r45.j4 j4Var = p0Var != null ? p0Var.f70726a : null;
            java.lang.String g17 = x51.j1.g(j4Var != null ? j4Var.f377561h : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceToFaceNewXmlMsgListener", "Full XML content: " + g17);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("sysmsg", g17);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.k("wxalite041d1599beb6eb0d45167bc1e9ec7ebe@pay", "pay.facetoface.sysmsg", jSONObject);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceToFaceNewXmlMsgListener", e17.toString());
            }
        }
    }
}
