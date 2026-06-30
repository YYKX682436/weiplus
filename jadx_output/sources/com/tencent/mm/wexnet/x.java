package com.tencent.mm.wexnet;

/* loaded from: classes7.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.e0());
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append("Xnet");
        sb6.append(str);
        sb6.append(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH);
        sb6.append(str);
        sb6.append("debug");
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String b() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + java.io.File.separator + "XNetLibDebug";
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append("XNetLib");
        sb6.append(str);
        sb6.append(com.tencent.mm.sdk.platformtools.z.f193115k ? "64" : "32");
        return sb6.toString();
    }
}
