package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.v7 f213218d = new com.tencent.mm.vfs.v7();

    public v7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.AbstractFileSystem[] abstractFileSystemArr = com.tencent.mm.vfs.y7.f213257a;
        long j17 = 7 * 86400000;
        com.tencent.mm.vfs.ExpireFileSystem expireFileSystem = new com.tencent.mm.vfs.ExpireFileSystem(new com.tencent.mm.vfs.QuotaFileSystem(it, 256 * 1048576, 1048576 * 512, j17, true, "${target},${threshold},${expire}"), j17, "${expire}");
        expireFileSystem.a("${name}", com.tencent.mm.vfs.q1.f213134a);
        return expireFileSystem;
    }
}
