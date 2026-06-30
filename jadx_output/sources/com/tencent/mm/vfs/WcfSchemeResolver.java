package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class WcfSchemeResolver extends com.tencent.mm.vfs.SingletonSchemeResolver {
    public static final com.tencent.mm.vfs.m8 CREATOR = new com.tencent.mm.vfs.m8(null);

    public WcfSchemeResolver(com.tencent.mm.vfs.l8 l8Var) {
    }

    @Override // com.tencent.mm.vfs.s5
    public android.util.Pair a(com.tencent.mm.vfs.m5 m5Var, com.tencent.mm.vfs.z7 z7Var) {
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) m5Var).b(z7Var.f213278e);
        java.lang.String str = z7Var.f213279f;
        return new android.util.Pair(b17, str == null ? "" : com.tencent.mm.vfs.e8.l(str, true, true));
    }
}
