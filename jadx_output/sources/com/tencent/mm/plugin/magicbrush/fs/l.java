package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public abstract class l implements com.tencent.mm.plugin.appbrand.appstorage.u1 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.u1 f147984f = new com.tencent.mm.plugin.appbrand.appstorage.y0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f147982d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f147983e = new java.util.concurrent.ConcurrentHashMap();

    public com.tencent.mm.plugin.appbrand.appstorage.u1 a(java.lang.String str) {
        java.lang.String d17 = d(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return this.f147984f;
        }
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var.accept(d17)) {
                return u1Var;
            }
        }
        synchronized (this.f147983e) {
            for (com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var2 : c().values()) {
                if (u1Var2.accept(d17)) {
                    return u1Var2;
                }
            }
            return this.f147984f;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        java.lang.String[] strArr = {"file://", "http://", "https://"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (nf.z.d(f(str), strArr[i17])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        return a(str).access(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).allocTempFile(str);
    }

    public com.tencent.mm.plugin.appbrand.appstorage.u1 b(java.lang.Class cls) {
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (cls.isInstance(u1Var)) {
                return u1Var;
            }
        }
        return null;
    }

    public synchronized java.util.concurrent.ConcurrentHashMap c() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        synchronized (this.f147983e) {
            concurrentHashMap = this.f147983e;
        }
        return concurrentHashMap;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canRenameFile(java.lang.String str) {
        java.lang.String f17 = f(str);
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var.accept(f17) && u1Var.canRenameFile(f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canSaveToLocal(java.lang.String str) {
        java.lang.String f17 = f(str);
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var.accept(f17) && !u1Var.canSaveToLocal(f17)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 copyTo(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, boolean z17) {
        return a(str).copyTo(f(str), r6Var, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom;
        java.util.Iterator it = e().iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            createTempFileFrom = ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).createTempFileFrom(r6Var, str, z17, b0Var);
        } while (createTempFileFrom == j1Var);
        return createTempFileFrom;
    }

    public java.lang.String d(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return java.net.URLDecoder.decode(str, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicBrushFileSystemRegistry", e17, "getDecodePath exception", new java.lang.Object[0]);
            }
        }
        return str;
    }

    public synchronized java.util.concurrent.CopyOnWriteArrayList e() {
        return this.f147982d;
    }

    public java.lang.String f(java.lang.String str) {
        return d(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str) {
        return getAbsoluteFile(f(str), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getPrivateAbsoluteFile(java.lang.String str) {
        return a(str).getPrivateAbsoluteFile(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.util.List getSavedFileList() {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).getSavedFileList();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        com.tencent.mm.plugin.appbrand.appstorage.j1 tempDirectory;
        java.util.Iterator it = e().iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            tempDirectory = ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).getTempDirectory(b0Var);
        } while (tempDirectory == j1Var);
        return tempDirectory;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).initialize();
        }
        this.f147984f.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean isSavedFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).isSavedFile(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return a(str).isdir(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir(java.lang.String str, boolean z17) {
        return a(str).mkdir(f(str), z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        return a(str).readDir(f(str), b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        return a(str).readFile(f(str), b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public final java.io.InputStream readStream(java.lang.String str) {
        return a(str).readStream(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return a(str).readZipEntry(f(str), b0Var, str2, j17, j18);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).release();
        }
        this.f147984f.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean removeSavedFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).removeSavedFile(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 resolvePath(java.lang.String str) {
        return a(str).resolvePath(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 rmdir(java.lang.String str, boolean z17) {
        return a(str).rmdir(f(str), z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile;
        java.lang.String f17 = f(str);
        java.util.Iterator it = e().iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            saveFile = ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).saveFile(r6Var, f17, b0Var);
        } while (saveFile == j1Var);
        return saveFile;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        return a(str).stat(f(str), fileStructStat);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        return a(str).statDir(f(str), list);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unlink(java.lang.String str) {
        return a(str).unlink(f(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unzip(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        return a(str).unzip(f(str), r6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile(java.lang.String str, java.io.InputStream inputStream, boolean z17) {
        return a(str).writeFile(f(str), inputStream, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        return a(str).getAbsoluteFile(f(str), z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        return a(str).readFile(f(str), j17, j18, b0Var);
    }
}
