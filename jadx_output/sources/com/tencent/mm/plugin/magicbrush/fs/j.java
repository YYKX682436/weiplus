package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public abstract class j extends com.tencent.mm.plugin.magicbrush.fs.l {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f147970g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f147971h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f147972i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f147973m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f147974n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f147975o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f147976p;

    /* renamed from: q, reason: collision with root package name */
    public long f147977q;

    /* renamed from: r, reason: collision with root package name */
    public long f147978r;

    public j(java.lang.String instanceName) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f147972i = jz5.h.b(new com.tencent.mm.plugin.magicbrush.fs.h(instanceName));
        this.f147973m = jz5.h.b(new com.tencent.mm.plugin.magicbrush.fs.f(instanceName));
        this.f147974n = jz5.h.b(new com.tencent.mm.plugin.magicbrush.fs.i(instanceName));
        this.f147975o = jz5.h.b(new com.tencent.mm.plugin.magicbrush.fs.g(instanceName));
        this.f147976p = new java.util.HashMap();
        java.lang.String a17 = fe3.l.a();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17) && com.tencent.mm.vfs.w6.u(a17)) {
            com.tencent.mm.vfs.w6.t(a17);
        }
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        java.util.Iterator it = ((java.util.ArrayList) jc3.u0.f299000e).iterator();
        while (true) {
            if (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (s07.equalsIgnoreCase(str2.toLowerCase())) {
                    str = str2.toLowerCase();
                    break;
                }
            } else if (jc3.u0.f298996a.a(s07)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystemRegistry", "findBizName: dynamic biz found: ".concat(s07));
                str = s07.toLowerCase();
            } else {
                str = null;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushFileSystemBizRegistry", "file system invalid instanceName:" + instanceName + ",not register");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushFileSystemBizRegistry", "file system vfs init failed instanceName:".concat(instanceName));
            return;
        }
        this.f147970g = str;
        this.f147971h = new com.tencent.mm.vfs.r6(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystemBizRegistry", "file system established instanceName:".concat(instanceName));
    }

    private final boolean h(long j17) {
        boolean z17 = this.f147977q + j17 > g();
        if (z17) {
            i95.m c17 = i95.n0.c(je3.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            je3.i.x2((je3.i) c17, "MagicTempFileSizeExceedLimit", 1, null, 1.0f, 4, null);
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushFileSystemBizRegistry", "temp file size exceed limit! %d limit:%d", java.lang.Long.valueOf(this.f147977q + j17), java.lang.Long.valueOf(g()));
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        if (h(0L)) {
            return null;
        }
        return super.allocTempFile(str);
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        if (h(r6Var != null ? r6Var.C() : 0L)) {
            if (b0Var != null) {
                b0Var.f291824a = null;
            }
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        this.f147977q += r6Var != null ? r6Var.C() : 0L;
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = super.createTempFileFrom(r6Var, str, z17, b0Var);
        kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
        return createTempFileFrom;
    }

    public final long g() {
        return ((java.lang.Number) ((jz5.n) this.f147973m).getValue()).longValue();
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        if (h(0L)) {
            if (b0Var != null) {
                b0Var.f291824a = null;
            }
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 tempDirectory = super.getTempDirectory(b0Var);
        kotlin.jvm.internal.o.f(tempDirectory, "getTempDirectory(...)");
        return tempDirectory;
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        java.lang.String str;
        super.initialize();
        java.util.HashMap hashMap = this.f147976p;
        hashMap.clear();
        java.util.concurrent.CopyOnWriteArrayList e17 = e();
        kotlin.jvm.internal.o.f(e17, "getOrderedFileSystemList(...)");
        java.util.Iterator it = e17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z17 = true;
            str = this.f147970g;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.n1) {
                com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = (com.tencent.mm.plugin.appbrand.appstorage.n1) u1Var;
                java.lang.String str2 = n1Var.f76276e;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushFileSystemBizRegistry", "fs root path is null, skip");
                } else if (kotlin.jvm.internal.o.b(n1Var.f76277f, "wxfile://")) {
                    java.lang.String str3 = n1Var.f76276e;
                    kotlin.jvm.internal.o.f(str3, "getRootPath(...)");
                    hashMap.put(str + "-temp", str3);
                    kotlin.jvm.internal.o.f(str3, "getRootPath(...)");
                    hashMap.put(str + "-saved_temp", str3);
                }
            } else if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.j3) {
                com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = (com.tencent.mm.plugin.appbrand.appstorage.j3) u1Var;
                java.lang.String str4 = j3Var.f76225d;
                if (str4 != null && str4.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushFileSystemBizRegistry", "fs root path is null, skip");
                } else if (kotlin.jvm.internal.o.b(j3Var.f76226e, "wxfile://usr")) {
                    java.lang.String str5 = j3Var.f76225d;
                    kotlin.jvm.internal.o.f(str5, "getRootPath(...)");
                    hashMap.put(str + "-normal_none_flatten", str5);
                }
            }
        }
        if (str != null) {
            com.tencent.mm.plugin.magicbrush.fs.x xVar = com.tencent.mm.plugin.magicbrush.fs.x.f148001a;
            this.f147977q = xVar.c(str, "temp");
            this.f147978r = xVar.c(str, "normal_none_flatten");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystemBizRegistry", str + " currentTempSize " + this.f147977q + " currentUsrSize " + this.f147978r);
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicStorageFsInitialize", 1, "{\"bizName\":\"" + r26.n0.s0(str, "-", str) + "\",\"currentTempSize\":" + this.f147977q + ",\"currentUsrSize\":" + this.f147978r + '}', com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneTenThousandth.getValue());
        }
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        java.lang.String str = this.f147970g;
        if (str != null) {
            long longValue = ((java.lang.Number) ((jz5.n) this.f147974n).getValue()).longValue();
            long g17 = g();
            long longValue2 = ((java.lang.Number) ((jz5.n) this.f147975o).getValue()).longValue();
            java.util.HashMap storageKey2Path = this.f147976p;
            kotlin.jvm.internal.o.g(storageKey2Path, "storageKey2Path");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "start check: bizName[" + str + "] minTemp[" + longValue + "] maxTemp[" + g17 + "] maxTotal[" + longValue2 + ']');
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams(str, longValue, g17, longValue2, storageKey2Path), com.tencent.mm.plugin.magicbrush.fs.w.class, null);
        }
        super.release();
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 srcFile, java.lang.String specifiedPath, ik1.b0 b0Var) {
        kotlin.jvm.internal.o.g(srcFile, "srcFile");
        kotlin.jvm.internal.o.g(specifiedPath, "specifiedPath");
        this.f147977q -= srcFile.C();
        com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile = super.saveFile(srcFile, specifiedPath, b0Var);
        kotlin.jvm.internal.o.f(saveFile, "saveFile(...)");
        return saveFile;
    }
}
