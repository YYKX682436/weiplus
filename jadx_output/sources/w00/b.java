package w00;

/* loaded from: classes8.dex */
public final class b implements t00.s0 {
    @Override // t00.s0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.I;
    }

    @Override // t00.s0
    public java.lang.String b(int i17, android.content.Context context, org.json.JSONObject data, c00.p3 actionReturn) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(actionReturn, "actionReturn");
        boolean Vi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Vi();
        com.tencent.mars.xlog.Log.i("MicroMsg.GetEcsSectionActionSync", "handleAction: " + data + ",switchOn:" + Vi);
        if (!Vi) {
            return ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).a(null);
        }
        x02.h Bi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Bi();
        if (Bi == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionActionSync", "orderAndCardCgiMgr is null");
            return ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).a(null);
        }
        t00.y yVar = t00.a0.f414262a;
        bw5.z7 a17 = yVar.a(data);
        if (a17 == null || a17.f35846f.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqScene:");
            sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f35845e) : null);
            sb6.append(" section list isEmpty");
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionActionSync", sb6.toString());
            return ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).a(null);
        }
        long c17 = c01.id.c();
        byte[] byteArray = a17.toByteArray();
        long cppPointer = ((x02.i) Bi).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        byte[] UR_F5EF = urgen.ur_7522.UR_3A2B.UR_F5EF(cppPointer, byteArray);
        bw5.i9 i9Var = UR_F5EF != null ? (bw5.i9) x02.a.a(UR_F5EF, new bw5.i9()) : null;
        if (i9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionActionSync", "resp is null");
            return ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).a(null);
        }
        org.json.JSONObject b17 = yVar.b(i9Var, c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetEcsSectionActionSync", "reqScene:" + a17.f35845e + " onSuccess, result count: " + i9Var.f28501d.size() + ',' + i9Var.f28502e);
        return ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i) actionReturn).b(b17);
    }
}
