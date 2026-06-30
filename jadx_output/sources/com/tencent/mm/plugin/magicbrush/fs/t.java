package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.magicbrush.fs.j implements jc3.k0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f147999s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String instanceName, java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List bizNameList) {
        super(instanceName);
        com.tencent.mm.plugin.appbrand.appstorage.n3 n3Var;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(bizNameList, "bizNameList");
        this.f147999s = new java.util.concurrent.CopyOnWriteArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f147970g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushPublicServiceFileSystem", "file system invalid instanceName:" + instanceName + ",not register");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList e17 = e();
        com.tencent.mm.vfs.r6 r6Var = this.f147971h;
        kotlin.jvm.internal.o.d(r6Var);
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String str2 = this.f147970g;
        kotlin.jvm.internal.o.d(str2);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(o17, "/".concat(str2));
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        java.lang.String o18 = r6Var2.o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(o18, "files/");
        if (!r6Var3.m()) {
            r6Var3.J();
        }
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = new com.tencent.mm.plugin.appbrand.appstorage.j3(r6Var3.o(), "wxfile://usr");
        j3Var.f76227f = ((java.lang.Number) ((jz5.n) this.f147972i).getValue()).longValue();
        java.lang.String o19 = r6Var2.o();
        kotlin.jvm.internal.o.f(o19, "getAbsolutePath(...)");
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(o19, "objects/");
        if (!r6Var4.m()) {
            r6Var4.J();
        }
        com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = new com.tencent.mm.plugin.appbrand.appstorage.n1(r6Var4.o(), "default_obfuscation_key", "wxfile://");
        n1Var.f76280i = g();
        linkedList.add(j3Var);
        linkedList.add(n1Var);
        e17.addAll(linkedList);
        if (str != null && b(com.tencent.mm.plugin.appbrand.appstorage.n3.class) == null) {
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
            if (y8Var.a()) {
                n3Var = new com.tencent.mm.plugin.appbrand.appstorage.n3(y8Var);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushPublicServiceFileSystem", "getPkgFileSystem readInfo error calculateMD5:" + com.tencent.mm.vfs.w6.p(str));
                n3Var = null;
            }
            if (n3Var != null) {
                e().add(n3Var);
            }
        } else if (u1Var != null && b(u1Var.getClass()) == null) {
            e().add(u1Var);
        }
        com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class);
        if (n1Var2 != null) {
            n1Var2.c();
        }
        super.initialize();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushPublicServiceFileSystem", "file system established instanceName:" + instanceName + ",pkgPath:" + str + ",assetsFS:" + u1Var);
        java.util.Iterator it = bizNameList.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushPublicServiceFileSystem", "PS fs need biz:" + str3 + " fs");
            if (jc3.u0.f298998c.contains(str3)) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f147999s;
                java.lang.String lowerCase = str3.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                copyOnWriteArrayList.add(lowerCase);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushPublicServiceFileSystem", "PS fs need biz:" + str3 + " not exist");
            }
        }
    }

    @Override // jc3.k0
    public void J(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
    }

    @Override // jc3.k0
    public void Vf(java.lang.String pkgPath, java.lang.String customName, java.lang.String str) {
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        kotlin.jvm.internal.o.g(customName, "customName");
    }

    @Override // jc3.k0
    public java.lang.String X3(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (com.tencent.mm.sdk.platformtools.t8.K0(path)) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 mDummyFS = this.f147984f;
            kotlin.jvm.internal.o.f(mDummyFS, "mDummyFS");
            return mDummyFS;
        }
        java.lang.String i17 = i(path);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            return com.tencent.mm.plugin.magicbrush.fs.k.b(com.tencent.mm.plugin.magicbrush.fs.k.f147979a, i17, null, null, null, null, 16, null);
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 a17 = super.a(path);
        kotlin.jvm.internal.o.f(a17, "findAppropriateFileSystem(...)");
        return a17;
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canRenameFile(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (com.tencent.mm.sdk.platformtools.t8.K0(path)) {
            return false;
        }
        java.lang.String i17 = i(path);
        return !com.tencent.mm.sdk.platformtools.t8.K0(i17) ? com.tencent.mm.plugin.magicbrush.fs.k.b(com.tencent.mm.plugin.magicbrush.fs.k.f147979a, i17, null, null, null, null, 16, null).canRenameFile(f(path)) : super.canRenameFile(path);
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canSaveToLocal(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (com.tencent.mm.sdk.platformtools.t8.K0(path)) {
            return false;
        }
        java.lang.String i17 = i(path);
        return !com.tencent.mm.sdk.platformtools.t8.K0(i17) ? com.tencent.mm.plugin.magicbrush.fs.k.b(com.tencent.mm.plugin.magicbrush.fs.k.f147979a, i17, null, null, null, null, 16, null).canSaveToLocal(f(path)) : super.canRenameFile(path);
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.l
    public java.lang.String f(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String d17 = d(path);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i(d17))) {
            return d17;
        }
        kotlin.jvm.internal.o.d(d17);
        int L = r26.n0.L(d17, "://", 0, false, 6, null);
        if (L == -1) {
            return null;
        }
        java.lang.String substring = d17.substring(L + 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return r26.i0.t(substring, "\u0000", "", false);
    }

    public final java.lang.String i(java.lang.String str) {
        java.net.URI uri;
        java.lang.String d17 = d(str);
        java.lang.String str2 = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            try {
                uri = new java.net.URI(d17);
            } catch (java.lang.Throwable th6) {
                if (d17.length() > 50) {
                    d17 = d17.substring(0, 50);
                    kotlin.jvm.internal.o.f(d17, "substring(...)");
                }
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicBrushPublicServiceFileSystem", th6, "Not supported uri format!!! ".concat(d17), new java.lang.Object[0]);
                uri = null;
            }
            java.lang.String scheme = uri != null ? uri.getScheme() : null;
            if (scheme == null) {
                scheme = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(scheme)) {
                java.lang.String s07 = r26.n0.s0(scheme, "-", scheme);
                java.util.Iterator it = this.f147999s.iterator();
                while (it.hasNext()) {
                    if (s07.equals((java.lang.String) it.next())) {
                        str2 = scheme;
                    }
                }
            }
        }
        return str2;
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.j, com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        java.util.Iterator it = this.f147999s.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.magicbrush.fs.k kVar = com.tencent.mm.plugin.magicbrush.fs.k.f147979a;
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.magicbrush.fs.k.b(kVar, str, null, null, null, null, 16, null).initialize();
        }
        super.initialize();
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.j, com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        java.util.Iterator it = this.f147999s.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.magicbrush.fs.k kVar = com.tencent.mm.plugin.magicbrush.fs.k.f147979a;
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.magicbrush.fs.k.b(kVar, str, null, null, null, null, 16, null).release();
        }
        super.release();
    }

    @Override // jc3.k0
    public void s7(java.lang.String instanceName) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        super.release();
        com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = (com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class);
        if (n1Var != null) {
            n1Var.b();
            e().remove(n1Var);
        }
    }

    @Override // com.tencent.mm.plugin.magicbrush.fs.j, com.tencent.mm.plugin.magicbrush.fs.l, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 srcFile, java.lang.String specifiedPath, ik1.b0 b0Var) {
        kotlin.jvm.internal.o.g(srcFile, "srcFile");
        kotlin.jvm.internal.o.g(specifiedPath, "specifiedPath");
        if (com.tencent.mm.sdk.platformtools.t8.K0(specifiedPath)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
        }
        java.lang.String i17 = i(specifiedPath);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            return super.saveFile(srcFile, specifiedPath, b0Var);
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile = com.tencent.mm.plugin.magicbrush.fs.k.b(com.tencent.mm.plugin.magicbrush.fs.k.f147979a, i17, null, null, null, null, 16, null).saveFile(srcFile, f(specifiedPath), b0Var);
        kotlin.jvm.internal.o.f(saveFile, "saveFile(...)");
        return saveFile;
    }
}
