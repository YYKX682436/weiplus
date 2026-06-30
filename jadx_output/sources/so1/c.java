package so1;

/* loaded from: classes15.dex */
public final class c implements ro1.g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f410230a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f410231b;

    @Override // ro1.g
    public boolean a(java.lang.String remotePath) {
        kotlin.jvm.internal.o.g(remotePath, "remotePath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, remotePath).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return com.tencent.mm.vfs.w6.g(o17, true) || !com.tencent.mm.vfs.w6.j(o17);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x010c  */
    @Override // ro1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(po1.d r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so1.c.b(po1.d):boolean");
    }

    @Override // ro1.g
    public ro1.f c(java.lang.String remotePath, java.lang.String localPath, ro1.d dVar) {
        kotlin.jvm.internal.o.g(remotePath, "remotePath");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        com.tencent.mars.xlog.Log.i("DirectDiskChannel", "copyUDisk2Local remotePath = " + remotePath + ", localPath = " + localPath);
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, remotePath);
        if (!r6Var2.m()) {
            com.tencent.mars.xlog.Log.e("DirectDiskChannel", "Failed to get remotePath(" + remotePath + ')');
            return ro1.f.f397981g;
        }
        if (r6Var2.y()) {
            com.tencent.mars.xlog.Log.e("DirectDiskChannel", "remotePath=" + remotePath + " is a directory");
            return ro1.f.f397982h;
        }
        com.tencent.mars.xlog.Log.i("DirectDiskChannel", "copyUDisk2Local remoteUri = %s, localPath = %s", r6Var2, localPath);
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(localPath));
        com.tencent.mm.vfs.r6 s17 = r6Var3.s();
        if ((s17 != null && (s17.m() || s17.J())) || (s17 != null && s17.m())) {
            return so1.h.f410239a.a(r6Var2, r6Var3, dVar);
        }
        com.tencent.mars.xlog.Log.e("DirectDiskChannel", "[copyUDisk2Local] Parent=" + s17 + " is not exist and can't create");
        return ro1.f.f397984m;
    }

    @Override // ro1.g
    public com.tencent.wechat.aff.affroam.a0 d(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, filePath);
        if (!r6Var2.m()) {
            return null;
        }
        com.tencent.wechat.aff.affroam.a0 a0Var = new com.tencent.wechat.aff.affroam.a0();
        a0Var.f215776e = r6Var2.o();
        a0Var.f215777f = r6Var2.y();
        a0Var.f215778g = r6Var2.C();
        a0Var.f215779h = r6Var2.B();
        a0Var.f215780i = r6Var2.B();
        a0Var.f215775d = r6Var2.getName();
        return a0Var;
    }

    @Override // ro1.g
    public com.tencent.wechat.aff.affroam.b0 e(java.lang.String parentPath) {
        kotlin.jvm.internal.o.g(parentPath, "parentPath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, parentPath);
        if (!r6Var2.m()) {
            com.tencent.mars.xlog.Log.e("DirectDiskChannel", "dirDoc is not exist, parentPath = %s", parentPath);
            return null;
        }
        if (!r6Var2.y()) {
            com.tencent.mars.xlog.Log.e("DirectDiskChannel", "dirDoc is not directory");
            return null;
        }
        com.tencent.wechat.aff.affroam.b0 b0Var = new com.tencent.wechat.aff.affroam.b0();
        com.tencent.wechat.aff.affroam.a0 a0Var = new com.tencent.wechat.aff.affroam.a0();
        a0Var.f215776e = parentPath;
        a0Var.f215777f = r6Var2.y();
        a0Var.f215778g = r6Var2.C();
        a0Var.f215779h = r6Var2.B();
        a0Var.f215780i = r6Var2.B();
        a0Var.f215775d = r6Var2.getName();
        java.util.LinkedList linkedList = b0Var.f215798d;
        linkedList.add(a0Var);
        com.tencent.mm.vfs.r6[] G = r6Var2.G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var3 : G) {
                com.tencent.wechat.aff.affroam.a0 a0Var2 = new com.tencent.wechat.aff.affroam.a0();
                a0Var2.f215776e = parentPath + '/' + r6Var3.getName();
                a0Var2.f215777f = r6Var3.y();
                a0Var2.f215778g = r6Var3.C();
                a0Var2.f215779h = r6Var3.B();
                a0Var2.f215780i = r6Var3.B();
                a0Var2.f215775d = r6Var3.getName();
                linkedList.add(a0Var2);
            }
        }
        return b0Var;
    }

    @Override // ro1.g
    public boolean f() {
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var != null) {
            return r6Var.m();
        }
        kotlin.jvm.internal.o.o("rootPath");
        throw null;
    }

    @Override // ro1.g
    public java.io.InputStream g(java.lang.String remotePath) {
        kotlin.jvm.internal.o.g(remotePath, "remotePath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, remotePath);
        if (!r6Var2.m()) {
            com.tencent.mars.xlog.Log.e("DirectDiskChannel", "path(" + r6Var2 + ") not exists.");
            return null;
        }
        java.lang.Exception e17 = null;
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                try {
                    java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var2);
                    kotlin.jvm.internal.o.f(C, "openRead(...)");
                    return C;
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.tencent.mars.xlog.Log.e("DirectUtils", "openRead(" + r6Var2 + ") failed, tryCount=" + i17 + '.');
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("DirectDiskChannel", th6, "openRead(" + r6Var2 + ") failed.", new java.lang.Object[0]);
                return null;
            }
        }
        kotlin.jvm.internal.o.d(e17);
        throw e17;
    }

    @Override // ro1.g
    public java.io.OutputStream h(java.lang.String remotePath) {
        kotlin.jvm.internal.o.g(remotePath, "remotePath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, remotePath);
        com.tencent.mm.vfs.r6 s17 = r6Var2.s();
        if ((s17 == null || !(s17.m() || s17.J())) && (s17 == null || !s17.m())) {
            com.tencent.mars.xlog.Log.e("DirectDiskChannel", "[openDocumentAsOutputStream] Parent=" + s17 + " is not exist and can't create");
            return null;
        }
        java.lang.Exception e17 = null;
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                try {
                    java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var2);
                    kotlin.jvm.internal.o.f(H, "openWrite(...)");
                    return H;
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.tencent.mars.xlog.Log.e("DirectUtils", "openWrite(" + r6Var2 + ") failed, tryCount=" + i17 + '.');
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("DirectDiskChannel", th6, "openWrite(" + r6Var2 + ") failed.", new java.lang.Object[0]);
                return null;
            }
        }
        kotlin.jvm.internal.o.d(e17);
        throw e17;
    }

    @Override // ro1.g
    public boolean i(java.lang.String remotePath) {
        kotlin.jvm.internal.o.g(remotePath, "remotePath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, remotePath).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return com.tencent.mm.vfs.w6.h(o17) || !com.tencent.mm.vfs.w6.j(o17);
    }

    @Override // ro1.g
    public com.tencent.wechat.aff.affroam.x j() {
        com.tencent.mm.vfs.o2 g17;
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        long w17 = r6Var.w();
        com.tencent.mm.vfs.r6 r6Var2 = this.f410231b;
        if (r6Var2 == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.z2 M = r6Var2.M();
        long j17 = 0;
        if (M.a() && (g17 = M.f213266a.g(M.f213267b)) != null) {
            j17 = g17.f213105d;
        }
        com.tencent.wechat.aff.affroam.x xVar = new com.tencent.wechat.aff.affroam.x();
        xVar.f216007d = com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypePortableDisk;
        xVar.f216010g = j17;
        xVar.f216009f = w17;
        xVar.f216008e = j17 - w17;
        xVar.f216011h = false;
        return xVar;
    }

    @Override // ro1.g
    public ro1.f k(java.lang.String localPath, java.lang.String remotePath, ro1.d dVar) {
        kotlin.jvm.internal.o.g(localPath, "localPath");
        kotlin.jvm.internal.o.g(remotePath, "remotePath");
        com.tencent.mm.vfs.r6 r6Var = this.f410231b;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, remotePath);
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(localPath));
        com.tencent.mars.xlog.Log.i("DirectDiskChannel", "copyLocal2UDisk, localPath=" + localPath + ", localLength=" + r6Var3.C() + ", remotePath=" + remotePath);
        com.tencent.mm.vfs.r6 s17 = r6Var2.s();
        if ((s17 != null && (s17.m() || s17.J())) || (s17 != null && s17.m())) {
            return so1.h.f410239a.a(r6Var3, r6Var2, dVar);
        }
        com.tencent.mars.xlog.Log.e("DirectDiskChannel", "[copyLocal2UDisk] Parent=" + s17 + " is not exist and can't create");
        return ro1.f.f397984m;
    }

    @Override // ro1.g
    public java.util.ArrayList l(java.util.ArrayList dirPaths) {
        kotlin.jvm.internal.o.g(dirPaths, "dirPaths");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dirPaths.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.vfs.r6 r6Var = this.f410231b;
            if (r6Var == null) {
                kotlin.jvm.internal.o.o("rootPath");
                throw null;
            }
            long m17 = m(new com.tencent.mm.vfs.r6(r6Var, str));
            com.tencent.mars.xlog.Log.i("DirectDiskChannel", "getDirSize, path = " + str + ", size=" + m17 + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            arrayList.add(java.lang.Long.valueOf(m17));
        }
        return arrayList;
    }

    public final long m(com.tencent.mm.vfs.r6 r6Var) {
        if (!r6Var.y()) {
            return r6Var.C();
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                kotlin.jvm.internal.o.d(r6Var2);
                j17 += m(r6Var2);
            }
        }
        return j17;
    }

    @Override // ro1.g
    public boolean uninit() {
        return true;
    }
}
