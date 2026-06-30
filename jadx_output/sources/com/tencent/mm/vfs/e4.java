package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class e4 implements java.lang.Iterable, pm5.j, pm5.k {

    /* renamed from: d, reason: collision with root package name */
    public java.nio.file.DirectoryStream f212906d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.file.Path f212907e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.h4 f212908f;

    public e4(java.nio.file.Path path, com.tencent.mm.vfs.h4 h4Var) {
        this.f212907e = path;
        this.f212908f = h4Var;
    }

    @Override // pm5.k
    public void e() {
        com.tencent.mm.vfs.e8.d(this.f212906d);
        this.f212906d = null;
    }

    public void finalize() {
        e();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.nio.file.Path path = this.f212907e;
        com.tencent.mm.vfs.e8.d(this.f212906d);
        try {
            this.f212906d = java.nio.file.Files.newDirectoryStream(path);
            return new com.tencent.mm.vfs.d4(this);
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.w("VFS.NativeFileSystem", e17, "Cannot list directory '" + path + "'");
            this.f212906d = null;
            return java.util.Collections.emptyIterator();
        }
    }
}
