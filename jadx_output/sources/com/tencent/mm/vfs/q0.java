package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class q0 extends com.tencent.mm.vfs.o8 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.DeleteBlockingFileSystem f213133g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.vfs.DeleteBlockingFileSystem deleteBlockingFileSystem, com.tencent.mm.vfs.q2 fs6) {
        super(fs6);
        kotlin.jvm.internal.o.g(fs6, "fs");
        this.f213133g = deleteBlockingFileSystem;
        this.f213132f = fs6;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public boolean I(java.lang.String fromPath, com.tencent.mm.vfs.q2 toFS, java.lang.String toPath) {
        kotlin.jvm.internal.o.g(fromPath, "fromPath");
        kotlin.jvm.internal.o.g(toFS, "toFS");
        kotlin.jvm.internal.o.g(toPath, "toPath");
        java.lang.String lowerCase = fromPath.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (r26.i0.y(lowerCase, "android/data/com.tencent.mm/", false)) {
            return super.I(fromPath, toFS, toPath);
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError("File move rejected: " + fromPath + " [" + this.f213132f + "] -> " + toPath + " [" + toFS + ']');
        if (z65.c.a()) {
            throw assertionError;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.printErrStackTrace("VFS.SystemDirectoryBlocker", assertionError, "File move rejected", new java.lang.Object[0]);
        return false;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean d(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String lowerCase = path.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (r26.i0.y(lowerCase, "android/data/com.tencent.mm/", false)) {
            return super.d(path);
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError("File delete rejected: " + path + " [" + this.f213132f + ']');
        if (z65.c.a()) {
            throw assertionError;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.printErrStackTrace("VFS.SystemDirectoryBlocker", assertionError, "File delete rejected", new java.lang.Object[0]);
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213133g;
    }
}
