package qe5;

/* loaded from: classes8.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z1 f362218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(qe5.z1 z1Var) {
        super(1);
        this.f362218d = z1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zh1.v0 v0Var;
        java.lang.String e17;
        oi3.g gVar;
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.q qVar = (kd5.q) state.a(kd5.q.class);
        qe5.z1 z1Var = this.f362218d;
        if (qVar != null) {
            kd5.e T6 = z1Var.T6();
            java.lang.String str = T6 != null ? T6.f306893x : null;
            kd5.e T62 = z1Var.T6();
            java.lang.String string = (T62 == null || (gVar = T62.f306881i) == null) ? null : gVar.getString(gVar.f345617d + 13);
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            ot0.q v17 = ot0.q.v(string);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachDownLoadUtil", "parse content error?? content:%s", string);
                e17 = "";
            } else {
                jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
                java.lang.String str2 = v17.f348690o;
                ((ht.a) vVar).getClass();
                e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(str2);
                kotlin.jvm.internal.o.f(e17, "getMimeTypeByExt(...)");
            }
            ((ht.s) a0Var).getClass();
            if (!com.tencent.mm.pluginsdk.model.t3.k(str, e17)) {
                kd5.e T63 = z1Var.T6();
                java.lang.String str3 = T63 != null ? T63.F : null;
                kd5.e T64 = z1Var.T6();
                java.lang.String str4 = T64 != null ? T64.f306893x : null;
                if (x51.t1.b(str3)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, filePath is empty");
                } else if (!kotlin.jvm.internal.o.b(str3, z1Var.f362228d) || z1Var.f362229e == null) {
                    kotlin.jvm.internal.o.d(str3);
                    com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.b(str3, str4);
                    com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
                    if (k5Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, openMaterialService is null");
                    } else {
                        zh1.p pVar = (zh1.p) k5Var;
                        if (pVar.Vi(bi1.g.ATTACH)) {
                            pVar.Ni(b17, new qe5.w1(z1Var, b17, k5Var));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, openMaterialService is not enabled");
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, already load");
                }
            }
        }
        if (((kd5.s) state.a(kd5.s.class)) != null && (v0Var = z1Var.f362230f) != null) {
            v0Var.r();
        }
        return jz5.f0.f302826a;
    }
}
