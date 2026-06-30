package com.tencent.xweb.util;

/* loaded from: classes13.dex */
public class HPatch extends by5.e0 {
    static {
        if (com.tencent.xweb.b0.f220211a != null) {
            fp.d0.n("xweb_hpatchz");
            by5.c4.f("LibraryLoader", "loadLibrary, use custom library loader, lib:xweb_hpatchz");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("xweb_hpatchz");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/xweb/LibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        by5.c4.f("LibraryLoader", "loadLibrary, use system library loader, lib:xweb_hpatchz");
    }

    @Override // by5.e0
    public int a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean z17;
        by5.c4.f("HPatch", "doHPatch oldFile:" + str + ",patchFile:" + str2 + ",newFile:" + str3);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 14L, 1L);
        }
        if (str.equals(str3)) {
            str3 = str.concat(".temp");
            z17 = true;
        } else {
            z17 = false;
        }
        int patch = new com.tencent.xweb.util.HPatch().patch(str, str2, str3, 262144L);
        if (patch != 0) {
            by5.c4.f("HPatch", "doHPatch failed");
            com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
            if (n1Var2 != null) {
                n1Var2.b(577L, 15L, 1L);
            }
        } else {
            by5.c4.f("HPatch", "doHPatch successful");
            if (z17) {
                if (!by5.u.d(str3, str)) {
                    by5.c4.c("HPatch", "doHPatch same path, copy failed");
                    return -1;
                }
                by5.u.i(str3);
            }
            by5.s0.f(java.lang.System.currentTimeMillis() - currentTimeMillis);
        }
        return patch;
    }

    public native int patch(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17);
}
