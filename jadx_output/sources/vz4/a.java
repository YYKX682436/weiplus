package vz4;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.plugin.wepkg.model.a {
    @Override // com.tencent.mm.plugin.wepkg.model.a
    public void a(com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask baseWepkgProcessTask) {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = ((com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask) baseWepkgProcessTask).f188344i;
        if (wepkgVersion == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommJsLoader", "wepkgVersion is null");
            vz4.b.f441718a = null;
            return;
        }
        java.lang.String str = wepkgVersion.f188376f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommJsLoader", "version is null");
            vz4.b.f441718a = null;
            return;
        }
        com.tencent.mm.plugin.wepkg.model.s sVar = vz4.b.f441718a;
        if (sVar == null || !str.equals(sVar.f188462d.f188376f)) {
            if (!wepkgVersion.f188390w) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CommJsLoader", "bigPackage is not ready");
                vz4.b.f441718a = null;
                return;
            }
            com.tencent.mm.plugin.wepkg.model.o c17 = com.tencent.mm.plugin.wepkg.model.z.c(vz4.b.c(), wepkgVersion.f188376f, wepkgVersion.f188377g, wepkgVersion.f188383p, wepkgVersion.f188385r);
            if (c17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(wepkgVersion.f188377g) && com.tencent.mm.vfs.w6.j(wepkgVersion.f188377g)) {
                vz4.b.f441718a = new com.tencent.mm.plugin.wepkg.model.s(wepkgVersion, c17, (java.util.Map) null);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.CommJsLoader", "path not exist");
                vz4.b.f441718a = null;
            }
        }
    }
}
