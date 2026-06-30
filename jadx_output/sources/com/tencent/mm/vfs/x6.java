package com.tencent.mm.vfs;

/* loaded from: classes8.dex */
public abstract class x6 {
    public static long a(java.lang.String str, java.lang.String str2, boolean z17) {
        boolean z18;
        boolean z19 = false;
        if (z65.c.a()) {
            z18 = true;
        } else {
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z18 = !"0".equals(j62.e.g().a("clicfg_enable_refcount_linking", "1", false, true));
        }
        if (z17 && z18) {
            z19 = true;
        }
        return com.tencent.mm.vfs.w6.d(str, str2, z19);
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        try {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, z17);
            if (i17 == null) {
                return str;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VFSFileOpEx", "exportExternalPath:%s to realPath:%s", str, i17);
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VFSFileOpEx", th6, "exportExternalPath failed", new java.lang.Object[0]);
            return str;
        }
    }
}
