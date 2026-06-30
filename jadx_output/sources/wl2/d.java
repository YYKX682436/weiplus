package wl2;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447052a = g();

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wl2.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int b(com.tencent.wechat.aff.udr.x xVar) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        if (xVar != null && (linkedList = xVar.f217606x) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.wechat.aff.udr.u) obj).getKey(), c())) {
                    break;
                }
            }
            com.tencent.wechat.aff.udr.u uVar = (com.tencent.wechat.aff.udr.u) obj;
            if (uVar != null) {
                return com.tencent.mm.sdk.platformtools.t8.D1(uVar.getValue(), 0);
            }
        }
        return 0;
    }

    public abstract java.lang.String c();

    public abstract int d();

    public abstract java.lang.String e();

    public final java.lang.String f(java.lang.String unZipPath, java.lang.String folder, java.lang.String file) {
        kotlin.jvm.internal.o.g(unZipPath, "unZipPath");
        kotlin.jvm.internal.o.g(folder, "folder");
        kotlin.jvm.internal.o.g(file, "file");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(unZipPath);
        sb6.append('/');
        sb6.append(folder);
        sb6.append('/');
        sb6.append(wo.w0.q() ? "arm64-v8a" : "armeabi-v7a");
        sb6.append('/');
        sb6.append(file);
        return sb6.toString();
    }

    public abstract java.lang.String g();

    public final boolean h(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path));
        return r6Var.A() && r6Var.m() && r6Var.C() > 0;
    }

    public abstract boolean i(com.tencent.wechat.aff.udr.x xVar);

    public final wl2.b j(com.tencent.wechat.aff.udr.x xVar) {
        java.lang.String c17 = xVar.c();
        if (c17 == null || c17.length() == 0) {
            return new wl2.b(false, "postPath empty");
        }
        java.lang.String str = xVar.c() + "/lib_ktv_so";
        boolean i17 = i(xVar);
        java.lang.String str2 = this.f447052a;
        if (i17) {
            com.tencent.mars.xlog.Log.i(str2, "loadResource file exit, unZipPath: " + str);
            return l(xVar);
        }
        com.tencent.mars.xlog.Log.i(str2, "loadResource secondUnZip");
        java.lang.String path = xVar.getPath();
        if (path == null) {
            path = "";
        }
        wl2.e.a(path, str);
        if (!i(xVar)) {
            return new wl2.b(false, "unZipFail_".concat(str));
        }
        com.tencent.mars.xlog.Log.i(str2, "loadResource file second exit, unZipPath: ".concat(str));
        return l(xVar);
    }

    public final jz5.l k(java.lang.String soFilePath) {
        java.lang.String str = this.f447052a;
        kotlin.jvm.internal.o.g(soFilePath, "soFilePath");
        try {
            com.tencent.mars.xlog.Log.i(str, "loadSo soPathDir: ".concat(soFilePath));
            com.tencent.cso.CsoLoader csoLoader = com.tencent.cso.CsoLoader.f45934a;
            com.tencent.cso.CsoLoader.h(soFilePath);
            return new jz5.l(java.lang.Boolean.TRUE, "");
        } catch (java.lang.Throwable th6) {
            java.lang.String message = th6.getMessage();
            java.lang.String str2 = message != null ? message : "";
            com.tencent.mars.xlog.Log.e(str, "loadSoError: " + jz5.f0.f302826a);
            return new jz5.l(java.lang.Boolean.FALSE, str2);
        }
    }

    public abstract wl2.b l(com.tencent.wechat.aff.udr.x xVar);
}
