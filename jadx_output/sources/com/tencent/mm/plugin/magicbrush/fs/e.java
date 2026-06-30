package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.magicbrush.fs.j implements jc3.k0 {

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.u1 f147960s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f147961t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list) {
        super(instanceName);
        com.tencent.mm.vfs.z7 z7Var;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f147970g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushFileSystem", "file system invalid instanceName:" + instanceName + ",not register");
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = this.f147971h;
        kotlin.jvm.internal.o.d(r6Var);
        java.lang.String o17 = r6Var.o();
        java.lang.String str3 = "/" + this.f147970g;
        com.tencent.mm.vfs.z7 a17 = o17 == null ? null : com.tencent.mm.vfs.z7.a(o17);
        if (a17 == null) {
            z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l(str3, false, false), null, null);
        } else {
            boolean isEmpty = str3.isEmpty();
            java.lang.String str4 = a17.f213279f;
            if (!isEmpty) {
                str4 = com.tencent.mm.vfs.e8.l(str4 + '/' + str3, false, false);
            }
            z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, str4, a17.f213280g, a17.f213281h);
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(z7Var, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        com.tencent.mm.vfs.r6 r6Var2 = this.f147971h;
        kotlin.jvm.internal.o.d(r6Var2);
        java.lang.String o18 = new com.tencent.mm.vfs.r6(r6Var2.o(), "/" + this.f147970g).o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(o18, "files/");
        if (!r6Var3.m()) {
            r6Var3.J();
        }
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = new com.tencent.mm.plugin.appbrand.appstorage.j3(r6Var3.o(), "wxfile://usr");
        j3Var.f76227f = ((java.lang.Number) ((jz5.n) this.f147972i).getValue()).longValue();
        e().add(j3Var);
        jc3.k0.Ag(this, instanceName, str, str2, u1Var, null, 16, null);
        initialize();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "file system established instanceName:" + instanceName + ",pkgPath:" + str + ",prefix:" + str2 + ",assetsFS:" + u1Var);
    }

    @Override // jc3.k0
    public void J(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list) {
        com.tencent.mm.plugin.magicbrush.fs.c cVar;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        if (list != null) {
            this.f147961t = new java.util.concurrent.CopyOnWriteArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
                if (b(u1Var2.getClass()) == null) {
                    e().add(u1Var2);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f147961t;
                    kotlin.jvm.internal.o.d(copyOnWriteArrayList);
                    copyOnWriteArrayList.add(u1Var2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "addExternalFS bizName:" + this.f147970g + ",externalFS:" + u1Var2);
                }
            }
        }
        if (b(com.tencent.mm.plugin.appbrand.appstorage.n1.class) == null) {
            com.tencent.mm.vfs.r6 r6Var = this.f147971h;
            kotlin.jvm.internal.o.d(r6Var);
            java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var.o(), "/" + this.f147970g).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(o17, "objects/");
            if (!r6Var2.m()) {
                r6Var2.J();
            }
            com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = new com.tencent.mm.plugin.appbrand.appstorage.n1(r6Var2.o(), "default_obfuscation_key", "wxfile://");
            n1Var.f76280i = g();
            e().add(n1Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "addFlattenFS instanceName:".concat(instanceName));
        }
        com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class);
        if (n1Var2 != null) {
            n1Var2.c();
        }
        if (str == null) {
            if (u1Var == null || b(u1Var.getClass()) != null) {
                return;
            }
            e().add(u1Var);
            this.f147960s = u1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "addPkgFS instanceName:" + instanceName + ",assetsFS:" + u1Var);
            return;
        }
        if (b(com.tencent.mm.plugin.magicbrush.fs.c.class) == null) {
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
            if (y8Var.a()) {
                cVar = new com.tencent.mm.plugin.magicbrush.fs.c(y8Var, str2);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushFileSystem", "getPkgFileSystem readInfo error calculateMD5:" + com.tencent.mm.vfs.w6.p(str));
                cVar = null;
            }
            if (cVar != null) {
                e().add(cVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "addPkgFS instanceName:" + instanceName + ",pkgPath:" + str + ",prefix:" + str2 + ",assetsFS:" + u1Var);
        }
    }

    @Override // jc3.k0
    public void Vf(java.lang.String pkgPath, java.lang.String customName, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        kotlin.jvm.internal.o.g(customName, "customName");
        if (str != null) {
            str2 = customName + '/' + str;
        } else {
            str2 = customName;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "addCustomPkgFS bizName:" + this.f147970g + ", customName:" + customName + ",pkgPath:" + pkgPath + ",prefix:" + str);
        if (!c().contains(str2)) {
            com.tencent.mm.plugin.magicbrush.fs.d dVar = new com.tencent.mm.plugin.magicbrush.fs.d(customName, pkgPath);
            synchronized (this) {
                synchronized (this.f147983e) {
                    this.f147983e.put(str2, dVar);
                }
            }
            return;
        }
        java.lang.Object obj = c().get(str2);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.fs.MBPkgFileSystemWithModularizingNewImpl");
        com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) ((com.tencent.mm.plugin.magicbrush.fs.d) obj).c();
        sVar.getClass();
        if (sVar.f147997d) {
            return;
        }
        sVar.c(new com.tencent.mm.plugin.magicbrush.fs.q(sVar, pkgPath));
    }

    @Override // jc3.k0
    public java.lang.String X3(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.vfs.r6 r6Var = this.f147971h;
        kotlin.jvm.internal.o.d(r6Var);
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(r6Var.o(), "/" + this.f147970g).o(), "files/");
        if (com.tencent.mm.sdk.platformtools.t8.K0(filePath)) {
            return "";
        }
        if (!r26.i0.y(filePath, r26.i0.n("wxfile://usr", "/", false) ? "wxfile://usr" : "wxfile://usr/", false)) {
            return "";
        }
        java.lang.String quote = java.util.regex.Pattern.quote("wxfile://usr");
        kotlin.jvm.internal.o.f(quote, "quote(...)");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(quote);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceFirst = compile.matcher(filePath).replaceFirst("");
        kotlin.jvm.internal.o.f(replaceFirst, "replaceFirst(...)");
        java.lang.String h17 = com.tencent.mm.plugin.appbrand.appstorage.l1.h(replaceFirst);
        kotlin.jvm.internal.o.f(h17, "removeDuplicatedLeadingSlash(...)");
        java.lang.String a17 = s46.c.a(r6Var2.o(), r26.i0.t(h17, "\u0000", "", false));
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return "";
        }
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "filePath:%s, physicalPath:%s", filePath, r6Var3.o());
        java.lang.String o17 = r6Var3.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // jc3.k0
    public void s7(java.lang.String instanceName) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystem", "removePkgFS instanceName:".concat(instanceName));
        com.tencent.mm.plugin.magicbrush.fs.c cVar = (com.tencent.mm.plugin.magicbrush.fs.c) b(com.tencent.mm.plugin.magicbrush.fs.c.class);
        if (cVar != null) {
            e().remove(cVar);
        }
        if (this.f147960s != null) {
            e().remove(this.f147960s);
            this.f147960s = null;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f147961t;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                e().remove((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next());
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f147961t;
            kotlin.jvm.internal.o.d(copyOnWriteArrayList2);
            copyOnWriteArrayList2.clear();
        }
        java.util.Set entrySet = c().entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it6 = entrySet.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) ((java.util.Map.Entry) it6.next()).getValue();
            if (u1Var != null) {
                u1Var.release();
            }
        }
        release();
        com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = (com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class);
        if (n1Var != null) {
            n1Var.b();
            e().remove(n1Var);
        }
    }
}
