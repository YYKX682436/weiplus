package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class x7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.x7 f213243d = new com.tencent.mm.vfs.x7();

    public x7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.AbstractFileSystem[] abstractFileSystemArr = com.tencent.mm.vfs.y7.f213257a;
        return new com.tencent.mm.vfs.QuotaFileSystem(it, 256 * 1048576, 1048576 * 512, 90 * 86400000, true, "${target},${threshold},${expire}");
    }
}
