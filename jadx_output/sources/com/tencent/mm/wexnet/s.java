package com.tencent.mm.wexnet;

/* loaded from: classes7.dex */
public final class s extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_xnet_npu_udr_switch, 0) != 1;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, z17 ? 8L : 7L, 1L, true);
        if (!z17) {
            return com.tencent.mm.wexnet.v.f214379a.a();
        }
        com.tencent.mars.xlog.Log.i("UDRXNetNPULibsFeatureService", " [addToPeriod]: clicfg_android_xnet_npu_udr_switch=false");
        return false;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.lang.Object obj;
        java.util.ArrayList d17 = com.tencent.mm.wexnet.v.f214379a.d();
        java.util.Iterator it = d17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.wechat.aff.udr.v vVar = (com.tencent.wechat.aff.udr.v) obj;
            if (kotlin.jvm.internal.o.b(vVar.f217584m[1] ? vVar.f217578d : "", "ro_soc_model")) {
                break;
            }
        }
        com.tencent.wechat.aff.udr.v vVar2 = (com.tencent.wechat.aff.udr.v) obj;
        java.lang.String str = vVar2 != null ? vVar2.f217584m[6] ? vVar2.f217583i : "" : null;
        java.lang.String str2 = str != null ? str : "";
        com.tencent.mars.xlog.Log.i("UDRXNetNPULibsFeatureService", " getParameter: ro_soc_model=".concat(str2));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, str2.length() > 0 ? 11L : 12L, 1L, true);
        return d17;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_57353131";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, 9L, 1L, true);
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(resource.getPath());
        java.lang.String o17 = new com.tencent.mm.vfs.r6(resource.c(), "unpack").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (!y8Var.a()) {
            return;
        }
        com.tencent.mm.vfs.w6.u(o17);
        java.util.Iterator it = new java.util.LinkedList(y8Var.f76072h.keySet()).iterator();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = null;
        while (true) {
            if (!it.hasNext()) {
                if (atomicBoolean != null && atomicBoolean.get()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, 10L, 1L, true);
                    return;
                }
                return;
            }
            java.lang.String str = (java.lang.String) it.next();
            kotlin.jvm.internal.o.d(str);
            if (r26.i0.n(str, ".so", false)) {
                java.io.InputStream c17 = y8Var.c(str);
                try {
                    java.lang.String o18 = new com.tencent.mm.vfs.r6(o17, str).o();
                    kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                    try {
                        com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(o18);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = c17.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    y6Var.write(bArr, 0, read);
                                }
                            }
                            vz5.b.a(y6Var, null);
                            vz5.b.a(c17, null);
                            com.tencent.mars.xlog.Log.i("UDRXNetNPULibsFeatureService", " postProcess unpack wxapkg " + str + " to " + o18 + " md5=[" + com.tencent.mm.vfs.w6.p(o18) + ']');
                            if (atomicBoolean == null) {
                                atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
                            }
                        } finally {
                            try {
                                break;
                            } catch (java.lang.Throwable th6) {
                            }
                        }
                    } finally {
                        try {
                            break;
                        } catch (java.lang.Throwable th7) {
                        }
                    }
                } catch (java.io.IOException e17) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
                    com.tencent.mars.xlog.Log.e("UDRXNetNPULibsFeatureService", " postProcess unpack wxapkg to dir fail: " + e17.getMessage());
                    atomicBoolean = atomicBoolean2;
                }
            }
        }
    }
}
