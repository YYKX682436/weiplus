package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.fs.x f148001a = new com.tencent.mm.plugin.magicbrush.fs.x();

    public final long a(java.lang.String bizName, java.lang.String key, com.tencent.mm.vfs.r6 dir) {
        long b17;
        com.tencent.mm.vfs.t6 t6Var;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(dir, "dir");
        if (!dir.m() || !dir.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "dir not exist[" + bizName + ',' + key + ',' + dir.u() + ']');
            d(bizName, key, 0L, true);
            return 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (kotlin.jvm.internal.o.b(key, "temp") ? true : kotlin.jvm.internal.o.b(key, "saved_temp")) {
            if (kotlin.jvm.internal.o.b(key, "temp")) {
                com.tencent.mm.plugin.magicbrush.fs.d0 d0Var = com.tencent.mm.plugin.magicbrush.fs.e0.f147962a;
                t6Var = com.tencent.mm.plugin.magicbrush.fs.e0.f147964c;
            } else {
                com.tencent.mm.plugin.magicbrush.fs.d0 d0Var2 = com.tencent.mm.plugin.magicbrush.fs.e0.f147962a;
                t6Var = com.tencent.mm.plugin.magicbrush.fs.e0.f147965d;
            }
            com.tencent.mm.vfs.r6[] H = dir.H(t6Var);
            if (H != null) {
                b17 = 0;
                for (com.tencent.mm.vfs.r6 r6Var : H) {
                    b17 += r6Var.C();
                }
            } else {
                b17 = 0;
            }
        } else {
            b17 = b(dir);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "calculateStorageSize [" + bizName + ',' + key + ',' + dir.u() + "]->" + b17 + " cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
        if (b17 >= 0) {
            d(bizName, key, b17, true);
        }
        if (b17 < 0) {
            return 0L;
        }
        return b17;
    }

    public final long b(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return -1L;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G == null) {
            return 0L;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            j17 += r6Var2.A() ? r6Var2.C() : b(r6Var2);
        }
        return j17;
    }

    public final long c(java.lang.String bizName, java.lang.String key) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String str = null;
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicStorageQuota", null);
        if (wi6 != null) {
            java.lang.Object[] b17 = ((ue3.f) wi6).b("storage_size_".concat(key));
            java.lang.Object obj = b17[0];
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
            lc3.z zVar = (lc3.z) obj;
            lc3.z zVar2 = lc3.x.f317934a;
            if (kotlin.jvm.internal.o.b(zVar, zVar2)) {
                java.lang.Object obj2 = b17[1];
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (java.lang.String) obj2;
            }
            if (kotlin.jvm.internal.o.b(zVar, zVar2) && str != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "get saved storage size:" + str + " for " + bizName + ',' + key);
                return java.lang.Long.parseLong(str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "get saved storage size errno:" + zVar.f317944a + ", errMsg " + zVar.f317945b);
        }
        return 0L;
    }

    public final void d(java.lang.String bizName, java.lang.String key, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(key, "key");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "save storage size:" + j17 + " for " + bizName + ',' + key);
        }
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicStorageQuota", null);
        if (wi6 != null) {
            if (kotlin.jvm.internal.o.b(((ue3.f) wi6).g("storage_size_".concat(key), java.lang.String.valueOf(j17), "String"), lc3.x.f317934a)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "save storage fail: " + bizName + ',' + key);
        }
    }
}
