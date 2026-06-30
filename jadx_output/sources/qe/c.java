package qe;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.weapp_core.CronetHttpBinding {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe.f f361923a;

    public c(qe.f fVar) {
        this.f361923a = fVar;
    }

    @Override // com.tencent.mm.weapp_core.CronetHttpBinding
    public boolean checkDomain(java.lang.String url, int i17) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(url, "url");
        qe.f.a(this.f361923a);
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetHttpNativeInstallHelper", "checkDomain: url=%s type=%d", url, java.lang.Integer.valueOf(i17));
        uh1.a aVar = this.f361923a.f361943b;
        if (aVar == null) {
            qe.f.a(this.f361923a);
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetHttpNativeInstallHelper", "checkDomain: networkConfig is null, block url=%s", url);
            return false;
        }
        if (!aVar.f427740d) {
            return true;
        }
        if (i17 == 0) {
            arrayList = aVar.f427749p;
        } else if (i17 == 2) {
            arrayList = aVar.f427751r;
        } else {
            if (i17 != 3) {
                qe.f.a(this.f361923a);
                com.tencent.mars.xlog.Log.w("MicroMsg.CronetHttpNativeInstallHelper", "checkDomain: unknown type=%d url=%s", java.lang.Integer.valueOf(i17), url);
                return false;
            }
            arrayList = aVar.f427752s;
        }
        return uh1.j0.A(arrayList, url, false);
    }

    @Override // com.tencent.mm.weapp_core.CronetHttpBinding
    public int checkIp(java.lang.String ip6) {
        kotlin.jvm.internal.o.g(ip6, "ip");
        return uh1.j0.u(ip6);
    }

    @Override // com.tencent.mm.weapp_core.CronetHttpBinding
    public java.lang.String getCachePath() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i("wcf://networkfiles/", true);
        return i17 == null ? "" : i17;
    }

    @Override // com.tencent.mm.weapp_core.CronetHttpBinding
    public java.lang.String getPhysicalPath(java.lang.String jsPath) {
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem;
        com.tencent.mm.vfs.r6 absoluteFile;
        java.lang.String o17;
        kotlin.jvm.internal.o.g(jsPath, "jsPath");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f361923a.f361942a;
        return (lVar == null || (fileSystem = lVar.getFileSystem()) == null || (absoluteFile = fileSystem.getAbsoluteFile(jsPath)) == null || (o17 = absoluteFile.o()) == null) ? "" : o17;
    }

    @Override // com.tencent.mm.weapp_core.CronetHttpBinding
    public vp5.c saveFile(java.lang.String src, java.lang.String dest) {
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(dest, "dest");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f361923a.f361942a;
        if (lVar == null) {
            return vp5.c.f439097n;
        }
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.file.c2.D(lVar, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(src)), dest, null).f298903a;
        return i17 == 0 ? vp5.c.f439091e : i17 == 1300013 ? vp5.c.f439092f : i17 == 1300002 ? vp5.c.f439093g : i17 == 1301003 ? vp5.c.f439094h : i17 == 1300202 ? vp5.c.f439095i : i17 == 1300036 ? vp5.c.f439096m : vp5.c.f439097n;
    }

    @Override // com.tencent.mm.weapp_core.CronetHttpBinding
    public vp5.d saveFileToTempFs(java.lang.String tempPath, java.lang.String ext) {
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem;
        kotlin.jvm.internal.o.g(tempPath, "tempPath");
        kotlin.jvm.internal.o.g(ext, "ext");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f361923a.f361942a;
        if (lVar == null || (fileSystem = lVar.getFileSystem()) == null) {
            return new vp5.d(vp5.c.f439097n, "");
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = fileSystem.createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(tempPath)), ext, true, b0Var);
        kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
        int ordinal = createTempFileFrom.ordinal();
        if (ordinal != 0) {
            return ordinal != 4 ? ordinal != 6 ? ordinal != 9 ? ordinal != 15 ? ordinal != 17 ? new vp5.d(vp5.c.f439097n, "") : new vp5.d(vp5.c.f439096m, "") : new vp5.d(vp5.c.f439095i, "") : new vp5.d(vp5.c.f439094h, "") : new vp5.d(vp5.c.f439093g, "") : new vp5.d(vp5.c.f439092f, "");
        }
        java.lang.String str = (java.lang.String) b0Var.f291824a;
        return str != null ? new vp5.d(vp5.c.f439091e, str) : new vp5.d(vp5.c.f439097n, "");
    }
}
