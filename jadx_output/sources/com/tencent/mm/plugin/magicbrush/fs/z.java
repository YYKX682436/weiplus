package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class z implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.fs.z f148003a = new com.tencent.mm.plugin.magicbrush.fs.z();

    @Override // com.tencent.mm.vfs.t6
    public final boolean accept(com.tencent.mm.vfs.r6 pathname) {
        kotlin.jvm.internal.o.g(pathname, "pathname");
        java.lang.String name = pathname.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        if (r26.i0.n(name, ".data", false)) {
            return false;
        }
        java.lang.String name2 = pathname.getName();
        kotlin.jvm.internal.o.f(name2, "getName(...)");
        if (r26.i0.y(name2, "store_", false)) {
            return false;
        }
        java.lang.String name3 = pathname.getName();
        kotlin.jvm.internal.o.f(name3, "getName(...)");
        return !r26.i0.n(name3, ".nomedia", false);
    }
}
