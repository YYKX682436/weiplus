package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class o7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.o7 f213117d = new com.tencent.mm.vfs.o7();

    public o7() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.vfs.r ctx = (com.tencent.mm.vfs.r) obj;
        com.tencent.mm.vfs.q2 fs6 = (com.tencent.mm.vfs.q2) obj2;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(fs6, "fs");
        java.util.Set X0 = kz5.n0.X0(ctx.f213149b.values());
        for (com.tencent.mm.vfs.q2 q2Var : com.tencent.mm.vfs.e8.c(fs6, null)) {
            if (q2Var instanceof com.tencent.mm.vfs.h4) {
                com.tencent.mm.vfs.h4 h4Var = (com.tencent.mm.vfs.h4) q2Var;
                if (X0.contains(h4Var.f212975e)) {
                    java.lang.String str = "Delete all main path found: " + h4Var.f212975e;
                    r26.t tVar = com.tencent.mm.vfs.p7.f213127a;
                    if (z65.c.a()) {
                        z17 = true;
                    } else {
                        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        z17 = false;
                    }
                    if (z17) {
                        throw new java.lang.AssertionError(str);
                    }
                    com.tencent.mars.xlog.Log.e("VFS.VFSRuleChecker", str);
                    return java.lang.Boolean.FALSE;
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
