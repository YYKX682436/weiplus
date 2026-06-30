package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class z0 extends com.tencent.mm.vfs.b1 {
    @Override // com.tencent.mm.vfs.b1
    public boolean a(com.tencent.mm.vfs.a1 a1Var) {
        if (a1Var.f212766b == 7) {
            java.lang.String str = a1Var.f212768d;
            if (str.startsWith("${data}/") && java.util.Arrays.binarySearch(com.tencent.mm.vfs.c1.f212861t, str.substring(8)) >= 0 && a1Var.f212765a.equals("@DiskSpace-NonAccountData-${data}")) {
                return true;
            }
        }
        return false;
    }
}
