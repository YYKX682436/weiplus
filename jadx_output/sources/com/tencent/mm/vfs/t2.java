package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.vfs.o5 f213179a = new com.tencent.mm.vfs.o5();

    /* renamed from: b, reason: collision with root package name */
    public boolean f213180b = false;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f213181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.b3 f213182d;

    public t2(com.tencent.mm.vfs.b3 b3Var, boolean z17) {
        this.f213182d = b3Var;
        this.f213181c = z17;
    }

    public void a(boolean z17) {
        com.tencent.mm.vfs.o5 o5Var;
        com.tencent.mm.vfs.o5 o5Var2;
        android.os.Bundle bundle = null;
        if (this.f213181c) {
            o5Var2 = this.f213179a;
            o5Var = null;
        } else {
            o5Var = this.f213179a;
            o5Var2 = null;
        }
        com.tencent.mm.vfs.b3 b3Var = this.f213182d;
        boolean z18 = this.f213180b;
        synchronized (b3Var.f212819m) {
            if (o5Var != null) {
                try {
                    b3Var.f212821o.a(o5Var);
                    if (z17) {
                        bundle = b3Var.f212821o.h();
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            if (o5Var2 != null) {
                b3Var.f212820n.a(o5Var2);
            }
            b3Var.l(z18);
        }
        if (bundle != null) {
            b3Var.k(bundle);
        }
        com.tencent.stubs.logger.LogPrinter logPrinter = new com.tencent.stubs.logger.LogPrinter(4, "VFS.FileSystemManager");
        if (o5Var != null) {
            com.tencent.stubs.logger.Log.i("VFS.FileSystemManager", "Patched layer [PUBLIC]");
            o5Var.d(logPrinter);
        }
        if (o5Var2 != null) {
            com.tencent.stubs.logger.Log.i("VFS.FileSystemManager", "Patched layer [PRIVATE]");
            o5Var2.d(logPrinter);
        }
        this.f213179a = new com.tencent.mm.vfs.o5();
    }

    public com.tencent.mm.vfs.t2 b(java.lang.String str, com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f213179a.f213111b.put(str, fileSystem == null ? null : new com.tencent.mm.vfs.t5(fileSystem));
        return this;
    }

    public com.tencent.mm.vfs.t2 c(java.lang.String str, com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f213179a.f213112c.put(str, fileSystem == null ? null : new com.tencent.mm.vfs.t5(fileSystem));
        return this;
    }

    public com.tencent.mm.vfs.t2 d(java.lang.String str, java.lang.String str2) {
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, false);
        ((java.util.TreeMap) this.f213179a.f213113d).put(new com.tencent.mm.vfs.f1(l17), str2);
        return this;
    }

    public com.tencent.mm.vfs.t2 e(java.lang.String str, java.lang.String str2) {
        this.f213179a.f213114e.put(str, str2);
        this.f213180b = true;
        return this;
    }

    public com.tencent.mm.vfs.t2 f(java.lang.String str) {
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, false);
        ((java.util.TreeMap) this.f213179a.f213113d).put(new com.tencent.mm.vfs.f1(l17), null);
        return this;
    }
}
