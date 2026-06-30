package com.tencent.mm.sdk.platformtools;

/* loaded from: classes3.dex */
public abstract class l {
    public static int a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
            return com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
        }
        return 0;
    }
}
