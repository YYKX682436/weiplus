package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class y implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.fs.y f148002a = new com.tencent.mm.plugin.magicbrush.fs.y();

    @Override // com.tencent.mm.vfs.t6
    public final boolean accept(com.tencent.mm.vfs.r6 pathname) {
        kotlin.jvm.internal.o.g(pathname, "pathname");
        com.tencent.mm.plugin.magicbrush.fs.d0 d0Var = com.tencent.mm.plugin.magicbrush.fs.e0.f147962a;
        if (!pathname.m() || pathname.y() || com.tencent.mm.sdk.platformtools.t8.K0(pathname.getName())) {
            return false;
        }
        java.lang.String name = pathname.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        return r26.i0.y(name, "store_", false);
    }
}
