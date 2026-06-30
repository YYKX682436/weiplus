package fa1;

/* loaded from: classes7.dex */
public final class e0 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public boolean f260682d;

    public static final void b() {
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_3985331c", "mis");
        if (Ui != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "checkMisResource: resource exists, version=" + Ui.f217590e);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "checkMisResource: trigger UDR check");
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_3985331c");
        java.util.LinkedList linkedList = qVar.f217548e;
        if (linkedList != null) {
            linkedList.add("mis");
        }
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
    }

    public static final java.lang.String c() {
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_3985331c", "mis");
        if (Ui != null) {
            java.lang.String c17 = Ui.c();
            if (!(c17 == null || c17.length() == 0)) {
                if (Ui.f217590e < 4) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: version mismatch, minVersion=4, actual=" + Ui.f217590e);
                    return "";
                }
                java.lang.String str = Ui.c() + "/unzip/libmis.so";
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
                if (r6Var.m() && r6Var.A()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: ".concat(str));
                    return str;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: so file not exist at ".concat(str));
                return "";
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: resource not ready");
        return "";
    }

    public final void f(com.tencent.wechat.aff.udr.x xVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "postProcess start. " + xVar.getPath());
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(xVar.getPath());
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGameMISUDRConfig", "postProcess: fromPath not exist: " + r6Var);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(xVar.c() + "/unziptmp");
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(xVar.c() + "/unzip");
        if (r6Var2.m()) {
            if (r6Var2.y()) {
                com.tencent.mm.vfs.w6.f(r6Var2.u());
            } else {
                r6Var2.l();
            }
        }
        r6Var2.J();
        try {
            com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(r6Var);
            try {
                java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(u6Var);
                try {
                    q26.h hVar = new q26.h((q26.i) q26.h0.j(q26.y.e(new fa1.c0(zipInputStream)), fa1.d0.f260681d));
                    while (hVar.hasNext()) {
                        java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry) hVar.next();
                        com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(new com.tencent.mm.vfs.r6(r6Var2, zipEntry.getName()));
                        try {
                            vz5.a.b(zipInputStream, y6Var, 0, 2, null);
                            vz5.b.a(y6Var, null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "postProcess: unzip " + zipEntry.getName());
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                vz5.b.a(y6Var, th6);
                                throw th7;
                            }
                        }
                    }
                    vz5.b.a(zipInputStream, null);
                    vz5.b.a(u6Var, null);
                    if (r6Var3.m() && r6Var3.y()) {
                        com.tencent.mm.vfs.w6.f(r6Var3.u());
                    }
                    r6Var2.L(r6Var3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "postProcess done: " + r6Var3);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameMISUDRConfig", e17, "postProcess unzip failed", new java.lang.Object[0]);
            if (r6Var2.m()) {
                if (r6Var2.y()) {
                    com.tencent.mm.vfs.w6.f(r6Var2.u());
                } else {
                    r6Var2.l();
                }
            }
        }
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_3985331c";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        super.haveSpecifiedResourceAsync(j17, projectId, name, i17, i18, i19);
        boolean z17 = i18 == 1002 || (i18 == 0 && i19 == 0 && this.f260682d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MIS resource prepare ");
        sb6.append(z17 ? ya.b.SUCCESS : "fail");
        sb6.append(": version=");
        sb6.append(i17);
        sb6.append(" (");
        sb6.append(i18);
        sb6.append(':');
        sb6.append(i19);
        sb6.append(':');
        sb6.append(this.f260682d);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", sb6.toString());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MIS resource ");
        sb6.append(i17 == 1002 ? ya.b.SUCCESS : "fail");
        sb6.append(": version=");
        sb6.append(i19);
        sb6.append(" type=");
        sb6.append(type.name());
        sb6.append(" (");
        sb6.append(i17);
        sb6.append(':');
        sb6.append(i18);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", sb6.toString());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameMISUDRConfig", "MIS resource ready: version=" + i17 + " type=" + type.name());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        try {
            this.f260682d = false;
            f(resource);
            this.f260682d = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameMISUDRConfig", th6, "MIS: postProcess failed", new java.lang.Object[0]);
            this.f260682d = false;
            throw th6;
        }
    }
}
