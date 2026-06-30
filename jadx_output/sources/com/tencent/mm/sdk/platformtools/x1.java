package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class x1 {
    public static boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            return false;
        }
        return com.tencent.mm.sdk.platformtools.MMJpegOptim.checkIntegrity(kk.w.a(str, false));
    }

    public static boolean b(java.lang.String str, java.lang.String str2, int i17) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.vfs.w6.j(str) && com.tencent.mm.sdk.platformtools.MMJpegOptim.convertToProgressive(kk.w.a(str, false), kk.w.a(str2, false), i17) == 0;
    }
}
