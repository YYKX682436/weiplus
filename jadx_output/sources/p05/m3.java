package p05;

/* loaded from: classes5.dex */
public final class m3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.m3 f350621a = new p05.m3();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.v87 v87Var = (r45.v87) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "CgiWeVisGetModel: " + i17 + ", " + i18);
        if (i17 == 0 && i18 == 0) {
            p05.p3 p3Var = p05.p3.f350639a;
            kotlin.jvm.internal.o.d(v87Var);
            p05.p3.f350642d = v87Var;
            p05.p3.f350639a.b().H("target_info", pm0.v.D(p05.p3.f350642d));
            java.util.LinkedList<r45.w87> NewConfigList = v87Var.f387993d;
            kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
            for (r45.w87 w87Var : NewConfigList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "resp: " + w87Var.f388971d + '.' + w87Var.f388972e + ", " + w87Var.f388973f + ", " + ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(w87Var.f388971d, w87Var.f388972e) + ", " + w87Var.f388974g);
            }
            java.util.LinkedList<r45.w87> NewConfigList2 = p05.p3.f350642d.f387993d;
            kotlin.jvm.internal.o.f(NewConfigList2, "NewConfigList");
            for (r45.w87 w87Var2 : NewConfigList2) {
                if (!com.tencent.mm.vfs.w6.j(p05.a3.f350443e + '/' + w87Var2.f388971d + '.' + w87Var2.f388972e + '/' + w87Var2.f388974g)) {
                    java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(w87Var2.f388971d, w87Var2.f388972e);
                    if (Bi != null) {
                        java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(w87Var2.f388971d, w87Var2.f388972e);
                        if (kotlin.jvm.internal.o.b(w87Var2.f388973f, Ni)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "checkCopyResFile: get cached " + w87Var2.f388971d + '.' + w87Var2.f388972e + ", " + Bi);
                            p05.p3.f350639a.a(w87Var2.f388971d, w87Var2.f388972e, Bi);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WeVisModelMgr", "checkCopyResFile: cached md5 mismatch res:" + Ni + ", config:" + w87Var2.f388973f);
                        }
                    }
                }
            }
            p05.p3 p3Var2 = p05.p3.f350639a;
            p3Var2.e();
            p3Var2.f();
            p3Var2.b().putLong("cgi_time", java.lang.System.currentTimeMillis());
            p05.m4.f350622a.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRes: [");
            java.util.LinkedList linkedList = p05.p3.f350643e;
            sb6.append(kz5.n0.g0(linkedList, null, null, null, 0, null, null, 63, null));
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", sb6.toString());
            if (!linkedList.isEmpty()) {
                ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
                gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k0(linkedList));
            }
            p3Var2.d(86400000L);
            p05.a3 a3Var = p05.a3.f350439a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_wevision_model_delete_unused_enable_android, true)) {
                pm0.v.L("WeVisFileUtil_checkDeleteFile", true, p05.y2.f350737d);
            }
        } else if (i17 == 4) {
            p05.p3 p3Var3 = p05.p3.f350639a;
            p3Var3.b().putLong("cgi_time", java.lang.System.currentTimeMillis());
            com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct weVisionModelResStruct = new com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct();
            if (tq5.i.f421269a == 0) {
                tq5.i.f421269a = 2014500;
            }
            weVisionModelResStruct.f62926d = tq5.i.f421269a;
            weVisionModelResStruct.f62931i = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Bi();
            weVisionModelResStruct.f62929g = 10;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisionModelReporter", "reportCgiFailed: " + weVisionModelResStruct.n());
            weVisionModelResStruct.k();
            p3Var3.d(86400000L);
        } else {
            pm0.v.V(1800000L, p05.l3.f350586d);
        }
        return jz5.f0.f302826a;
    }
}
