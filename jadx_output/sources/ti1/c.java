package ti1;

/* loaded from: classes7.dex */
public abstract class c {
    public static final boolean a(ze.n nVar) {
        byte[] bArr = null;
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPermission.AppidABTestConfig", "fail:runtime is nil");
        } else {
            si1.g gVar = nVar.X1;
            if (gVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPermission.AppidABTestConfig", "NULL permissionController with appId:%s", nVar.f74803n);
            } else {
                com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle f17 = gVar.f(nVar.f74803n, 1, nVar.f74805p.f77281g);
                if (f17 != null) {
                    bArr = f17.f87396d;
                }
            }
        }
        return bArr != null && bArr.length > 2 && bArr[2] == 1;
    }

    public static byte[] b(ze.n nVar) {
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPermission.AppidABTestConfig", "fail:runtime is nil");
            return null;
        }
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPermission.AppidABTestConfig", "NULL permissionController with appId:%s", nVar.f74803n);
            return null;
        }
        com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle f17 = gVar.f(nVar.f74803n, 1, nVar.f74805p.f77281g);
        if (f17 != null) {
            return f17.f87397e;
        }
        return null;
    }
}
