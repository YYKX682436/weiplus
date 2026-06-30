package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.appstorage.n3 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f147953f;

    public c(com.tencent.mm.plugin.appbrand.appcache.y8 y8Var, java.lang.String str) {
        super(y8Var);
        this.f147953f = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgMBFileSystem", "mPathPrefix:%s", str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        java.lang.String str2 = this.f147953f;
        if (str2 == null) {
            return true;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith(str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        return super.access(d(str));
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String str3 = this.f147953f;
        if (str3 == null) {
            return str;
        }
        if (str3.endsWith("/")) {
            str2 = str3;
        } else {
            str2 = str3 + "/";
        }
        if (str.equals(str3)) {
            str = str2;
        } else if (!str.startsWith(str2)) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.appstorage.l1.h(str.replaceFirst(java.util.regex.Pattern.quote(str3), "")).replace("\u0000", "");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        return super.getAbsoluteFile(d(str), z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return super.isdir(d(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        return super.readDir(d(str), b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        return super.readFile(d(str), j17, j18, b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        return super.stat(d(str), fileStructStat);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        return super.statDir(d(str), list);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.n3, com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        return super.readFile(d(str), b0Var);
    }
}
