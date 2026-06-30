package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class u7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.u7 f213211d = new com.tencent.mm.vfs.u7();

    public u7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.FileSystem it = (com.tencent.mm.vfs.FileSystem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.AccessLogFileSystem accessLogFileSystem = new com.tencent.mm.vfs.AccessLogFileSystem(it, 0, "${logFlags}");
        accessLogFileSystem.f212679d = new com.tencent.mm.vfs.m3("${name}");
        return accessLogFileSystem;
    }
}
