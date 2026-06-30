package xf1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final xf1.h f454236a = new xf1.h();

    public final boolean a(com.tencent.mm.vfs.r6 cacheFile) {
        kotlin.jvm.internal.o.g(cacheFile, "cacheFile");
        if (cacheFile.y()) {
            java.util.Objects.toString(cacheFile);
            xf1.o oVar = null;
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("AppBrandResCacheMeta").getString("metaData_dir_" + cacheFile.o(), null);
            if (string == null || string.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, metaDataStr is empty");
            } else {
                try {
                    oVar = xf1.o.f454246c.a(new org.json.JSONObject(string));
                } catch (java.lang.Exception e17) {
                    e17.toString();
                }
                if (oVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, metaData is null");
                } else {
                    com.tencent.mm.vfs.r6 s17 = cacheFile.s();
                    kotlin.jvm.internal.o.d(s17);
                    if (c(oVar, s17)) {
                        return true;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, validateMeta fail");
                }
            }
        } else {
            long j17 = com.tencent.mm.sdk.platformtools.o4.M("AppBrandResCacheMeta").getLong("metaData_file_" + cacheFile.o(), -1L);
            long B = cacheFile.B();
            cacheFile.toString();
            if (j17 == B) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(com.tencent.mm.vfs.r6 cacheFile) {
        kotlin.jvm.internal.o.g(cacheFile, "cacheFile");
        if (!cacheFile.y()) {
            com.tencent.mm.sdk.platformtools.o4.M("AppBrandResCacheMeta").putLong("metaData_file_" + cacheFile.o(), cacheFile.B());
            return true;
        }
        java.util.Objects.toString(cacheFile);
        xf1.m mVar = cacheFile.y() ? new xf1.m(cacheFile) : null;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, metaData is null");
        } else {
            org.json.JSONObject a17 = mVar.a();
            java.lang.String jSONObject = a17 != null ? a17.toString() : null;
            if (!(jSONObject == null || jSONObject.length() == 0)) {
                com.tencent.mm.sdk.platformtools.o4.M("AppBrandResCacheMeta").putString("metaData_dir_" + cacheFile.o(), jSONObject);
                return true;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, metaDataStr is empty");
        }
        return false;
    }

    public final boolean c(xf1.o oVar, com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, oVar.f454247a);
        r6Var2.toString();
        if (!(oVar instanceof xf1.m)) {
            if (r6Var2.m() && r6Var2.A()) {
                return oVar.f454248b == r6Var2.B();
            }
            return false;
        }
        java.util.List list = ((xf1.m) oVar).f454245d;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!f454236a.c((xf1.o) it.next(), r6Var2)) {
                return false;
            }
        }
        return true;
    }
}
