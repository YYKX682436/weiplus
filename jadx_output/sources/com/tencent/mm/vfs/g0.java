package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class g0 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f212944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.DBFileMultiplexFileSystem f212945f;

    public g0(com.tencent.mm.vfs.DBFileMultiplexFileSystem dBFileMultiplexFileSystem, com.tencent.mm.vfs.q2 dbFs, com.tencent.mm.vfs.q2 fbFs) {
        kotlin.jvm.internal.o.g(dbFs, "dbFs");
        kotlin.jvm.internal.o.g(fbFs, "fbFs");
        this.f212945f = dBFileMultiplexFileSystem;
        this.f212944e = kz5.c0.i(fbFs, dbFs);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f212944e;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        java.util.List list = this.f212944e;
        if (i17 != 0 && kz5.v.g(com.tencent.mm.vfs.j0.f213008a, path, 0, 0, 6, null) >= 0) {
            return (com.tencent.mm.vfs.q2) list.get(1);
        }
        return (com.tencent.mm.vfs.q2) list.get(0);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.lang.Iterable M(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        int g17 = kz5.v.g(com.tencent.mm.vfs.j0.f213008a, path, 0, 0, 6, null);
        java.util.List list = this.f212944e;
        if (g17 >= 0) {
            java.util.Set singleton = java.util.Collections.singleton(list.get(1));
            kotlin.jvm.internal.o.f(singleton, "singleton(...)");
            return singleton;
        }
        java.util.Set singleton2 = java.util.Collections.singleton(list.get(0));
        kotlin.jvm.internal.o.f(singleton2, "singleton(...)");
        return singleton2;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212945f;
    }
}
