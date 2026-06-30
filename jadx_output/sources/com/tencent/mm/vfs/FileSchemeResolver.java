package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class FileSchemeResolver extends com.tencent.mm.vfs.SingletonSchemeResolver {
    public static final com.tencent.mm.vfs.n2 CREATOR = new com.tencent.mm.vfs.n2(null);

    public FileSchemeResolver(com.tencent.mm.vfs.m2 m2Var) {
    }

    @Override // com.tencent.mm.vfs.s5
    public android.util.Pair a(com.tencent.mm.vfs.m5 m5Var, com.tencent.mm.vfs.z7 z7Var) {
        java.lang.String str = z7Var.f213279f;
        if (str == null) {
            str = "";
        }
        return ((com.tencent.mm.vfs.r5) m5Var).e(str, null);
    }

    @Override // com.tencent.mm.vfs.SingletonSchemeResolver, com.tencent.mm.vfs.s5
    public com.tencent.mm.vfs.z7 c(com.tencent.mm.vfs.m5 m5Var, com.tencent.mm.vfs.z7 z7Var) {
        java.lang.String[] strArr = new java.lang.String[1];
        android.util.Pair e17 = ((com.tencent.mm.vfs.r5) m5Var).e(z7Var.f213279f, strArr);
        if (e17 == null || strArr[0] == null) {
            return null;
        }
        return new com.tencent.mm.vfs.z7("wcf", strArr[0], (java.lang.String) e17.second, null, null);
    }
}
