package com.tencent.mm.plugin.wepkg.model;

@mk0.a
/* loaded from: classes8.dex */
class g implements com.tencent.mm.ipcinvoker.k0 {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = null;
        if (iPCString == null) {
            return null;
        }
        java.lang.String str2 = iPCString.f68406d;
        java.util.Map map = vz4.s.f441744a;
        java.lang.String str3 = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String c17 = vz4.b.c();
            if (c17 == null) {
                c17 = "";
            }
            if (str2.equals(c17)) {
                str3 = vz4.b.a();
            } else if (str2.equals("jscore_lib")) {
                vz4.x xVar = vz4.h.f441735b;
                if (xVar != null) {
                    com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion2 = xVar.f441758f;
                    str = wepkgVersion2 != null ? wepkgVersion2.f188376f : "";
                }
                str3 = str;
            } else {
                com.tencent.mm.plugin.wepkg.model.s sVar = (com.tencent.mm.plugin.wepkg.model.s) ((java.util.HashMap) vz4.s.f441744a).get(str2);
                if (sVar != null && (wepkgVersion = sVar.f188462d) != null) {
                    str3 = wepkgVersion.f188376f;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "pkgid:%s used_version:%s", str2, str3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("used_wepkg_version", str3);
        return bundle;
    }
}
