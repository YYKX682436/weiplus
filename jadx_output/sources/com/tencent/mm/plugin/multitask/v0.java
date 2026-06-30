package com.tencent.mm.plugin.multitask;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f150612a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f150613b;

    static {
        com.tencent.mm.plugin.multitask.v0 v0Var = new com.tencent.mm.plugin.multitask.v0();
        java.lang.String str = v0Var.a() + "coverimg/";
        f150612a = str;
        java.lang.String str2 = com.tencent.mm.vfs.q7.c("multitask") + "/coverimg/";
        f150613b = str2;
        if (!com.tencent.mm.vfs.w6.j(v0Var.a())) {
            com.tencent.mm.vfs.w6.u(v0Var.a());
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        if (com.tencent.mm.vfs.w6.j(str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.u(str2);
    }

    public final java.lang.String a() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            str = gm0.j1.u().d();
            kotlin.jvm.internal.o.d(str);
        } else {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.multitask.d0.class);
            str = iPCString != null ? iPCString.f68406d : null;
            if (str == null) {
                str = "";
            }
        }
        sb6.append(str);
        sb6.append("multitask/");
        return sb6.toString();
    }
}
