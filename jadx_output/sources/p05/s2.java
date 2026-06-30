package p05;

/* loaded from: classes5.dex */
public final class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.s2 f350687a = new p05.s2();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.q87 q87Var = (r45.q87) fVar.f70618d;
        java.lang.String str = p05.v2.f350705e;
        com.tencent.mars.xlog.Log.i(str, "CgiWeVisGetDeviceScore: " + i17 + ", " + i18);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadDeviceScore resp: runScore: ");
            sb6.append(q87Var.f383765e);
            sb6.append(", size:");
            java.util.LinkedList<r45.o87> linkedList = q87Var.f383764d;
            sb6.append(linkedList.size());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            for (r45.o87 o87Var : linkedList) {
                com.tencent.mars.xlog.Log.i(p05.v2.f350705e, "resp: cpu:" + o87Var.f382039d + ", gpu:" + o87Var.f382040e);
            }
            p05.v2 v2Var = p05.v2.f350704d;
            com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
            p05.p3 p3Var = p05.p3.f350639a;
            Bi.G("need_run_score", java.lang.Boolean.parseBoolean(q87Var.f383765e));
            v2Var.Bi().B("score_cgi_time", java.lang.System.currentTimeMillis());
            r45.o87 o87Var2 = (r45.o87) kz5.n0.Z(linkedList);
            if (o87Var2 != null) {
                v2Var.Bi().z("cpu_score", o87Var2.f382039d);
                v2Var.Bi().z("gpu_score", o87Var2.f382040e);
            }
        }
        return jz5.f0.f302826a;
    }
}
