package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class h4 extends com.tencent.mm.vfs.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f212975e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f212976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.NativeFileSystem f212977g;

    public h4(com.tencent.mm.vfs.NativeFileSystem nativeFileSystem, java.lang.String str) {
        this.f212977g = nativeFileSystem;
        java.lang.String a17 = str.isEmpty() ? "" : com.tencent.mm.vfs.e8.a(str);
        java.lang.String str2 = a17.equals("/") ? "" : a17;
        this.f212975e = str2;
        if (str2.isEmpty()) {
            this.f212976f = true;
            return;
        }
        java.io.File file = new java.io.File(str2);
        if (file.isDirectory()) {
            this.f212976f = true;
            return;
        }
        if (file.exists()) {
            com.tencent.stubs.logger.Log.e("VFS.NativeFileSystem", "Base directory exists but is not a directory, delete and proceed.Base path: " + file.getPath());
            file.delete();
        }
        this.f212976f = false;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        java.lang.String D = D(str, false);
        if (D == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.nio.file.Path a17 = com.tencent.mm.vfs.c4.a(D);
            if (a17 == null) {
                return null;
            }
            return new com.tencent.mm.vfs.b4(a17, this);
        }
        java.lang.String[] list = new java.io.File(D).list();
        if (list == null) {
            return null;
        }
        return java.util.Arrays.asList(list);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        java.lang.String str2 = this.f212975e;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("Base path cannot be resolved: " + this.f212977g.f212737e);
        }
        if (z17 && !this.f212976f) {
            new java.io.File(str2).mkdirs();
            this.f212976f = true;
        }
        if (str.isEmpty()) {
            return str2;
        }
        return str2 + '/' + str;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        java.lang.String D = D(str, false);
        return D != null && new java.io.File(D).exists();
    }

    @Override // com.tencent.mm.vfs.a
    public boolean H(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        if ((q2Var.o() & 2) != 0) {
            java.lang.String D = q2Var.D(str2, false);
            java.lang.String D2 = D(str, true);
            if (D != null && D2 != null) {
                return com.tencent.mm.vfs.z3.a(D, D2);
            }
        }
        return false;
    }

    public final com.tencent.mm.vfs.x1 K(java.io.File file) {
        long j17;
        java.lang.String path = file.getPath();
        java.lang.String str = this.f212975e;
        if (!path.startsWith(str)) {
            throw new java.lang.RuntimeException("Illegal file: " + file + " (base: " + str + ")");
        }
        java.lang.String substring = file.getPath().length() == str.length() ? "" : file.getPath().substring(str.length() + 1);
        java.lang.String name = file.getName();
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.lang.String path2 = file.getPath();
        try {
            android.system.StructStat lstat = android.system.Os.lstat(path2);
            if (lstat == null) {
                return null;
            }
            android.system.StructStat stat = android.system.OsConstants.S_ISLNK(lstat.st_mode) ? android.system.Os.stat(path2) : lstat;
            if (i17 >= 27) {
                android.system.StructTimespec structTimespec = lstat.st_mtim;
                j17 = (structTimespec.tv_sec * 1000) + (structTimespec.tv_nsec / 1000000);
            } else {
                j17 = lstat.st_mtime * 1000;
            }
            return new com.tencent.mm.vfs.x1(this, substring, name, stat.st_size, 512 * lstat.st_blocks, j17, android.system.OsConstants.S_ISDIR(stat.st_mode));
        } catch (android.system.ErrnoException unused) {
            return null;
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.lang.String D = D(str, false);
        if (D == null) {
            throw new java.io.FileNotFoundException("Invalid path: ".concat(str));
        }
        try {
            return new com.tencent.mm.vfs.f4(D);
        } catch (java.lang.Exception e17) {
            throw com.tencent.mm.vfs.NativeFileSystem.c(e17);
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.lang.String D = D(str, true);
        if (D == null) {
            throw new java.io.FileNotFoundException("Invalid path: ".concat(str));
        }
        try {
            return new java.io.FileOutputStream(D, z17);
        } catch (java.lang.Exception e17) {
            throw com.tencent.mm.vfs.NativeFileSystem.c(e17);
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        java.lang.String D = D(str, false);
        if (D == null) {
            return false;
        }
        return new java.io.File(D).delete();
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        java.lang.String D = D(str, false);
        if (D == null) {
            return false;
        }
        boolean z18 = str.isEmpty() || str.equals("/");
        java.io.File file = new java.io.File(D);
        if (!file.isDirectory()) {
            return false;
        }
        boolean f17 = z17 ? com.tencent.mm.vfs.NativeFileSystem.f(file) : file.delete();
        if (z18 && f17) {
            this.f212976f = false;
        }
        return f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.h4) {
            if (this.f212975e.equals(((com.tencent.mm.vfs.h4) obj).f212975e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.o2 g(java.lang.String str) {
        try {
            android.os.StatFs statFs = new android.os.StatFs(D(str, false));
            com.tencent.mm.vfs.o2 o2Var = new com.tencent.mm.vfs.o2();
            o2Var.f213102a = statFs.getBlockSizeLong();
            o2Var.f213103b = statFs.getAvailableBlocksLong();
            long blockCountLong = statFs.getBlockCountLong();
            long j17 = o2Var.f213103b;
            long j18 = o2Var.f213102a;
            o2Var.f213104c = j17 * j18;
            o2Var.f213105d = blockCountLong * j18;
            return o2Var;
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        java.lang.String D = D(str, true);
        if (D == null) {
            throw new java.io.FileNotFoundException("Invalid path: ".concat(str));
        }
        try {
            return new java.io.FileOutputStream(D, z17).getChannel();
        } catch (java.lang.Exception e17) {
            throw com.tencent.mm.vfs.NativeFileSystem.c(e17);
        }
    }

    public int hashCode() {
        return com.tencent.mm.vfs.h4.class.hashCode() ^ this.f212975e.hashCode();
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        java.lang.String D = D(str, false);
        if (D == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.nio.file.Path a17 = com.tencent.mm.vfs.c4.a(D);
            if (a17 == null) {
                return null;
            }
            return new com.tencent.mm.vfs.a4(a17, this);
        }
        java.io.File file = new java.io.File(D);
        java.lang.String[] list = file.list();
        if (list == null) {
            return null;
        }
        return new pm5.l(java.util.Arrays.asList(list), new com.tencent.mm.vfs.g4(this, file), null, false);
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        java.lang.String D = D(str, false);
        if (D == null) {
            return null;
        }
        return K(new java.io.File(D));
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        java.lang.String D = D(str, true);
        if (D == null) {
            return false;
        }
        return new java.io.File(D).setLastModified(j17);
    }

    @Override // com.tencent.mm.vfs.q2
    public int o() {
        return 31;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        java.nio.file.Path path;
        java.lang.String D = D(str, true);
        if (D == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return new java.io.File(D).mkdirs();
        }
        try {
            path = java.nio.file.Paths.get(D, new java.lang.String[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("VFS.NativeFileSystem", e17, "Cannot create directory.");
        }
        if (java.nio.file.Files.isDirectory(path, java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
            return false;
        }
        java.nio.file.Files.createDirectories(path, new java.nio.file.attribute.FileAttribute[0]);
        return true;
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.lang.String D = D(str, false);
        if (D == null) {
            throw new java.io.FileNotFoundException("Invalid path: ".concat(str));
        }
        try {
            return new java.io.FileInputStream(D).getChannel();
        } catch (java.lang.Exception e17) {
            throw com.tencent.mm.vfs.NativeFileSystem.c(e17);
        }
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return this.f212975e;
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        java.lang.String D = D(str, true);
        if (D == null) {
            throw new java.io.FileNotFoundException("Invalid path: ".concat(str));
        }
        try {
            return android.os.ParcelFileDescriptor.open(new java.io.File(D), com.tencent.mm.vfs.NativeFileSystem.d(str2));
        } catch (java.lang.Exception e17) {
            throw com.tencent.mm.vfs.NativeFileSystem.c(e17);
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212977g;
    }
}
