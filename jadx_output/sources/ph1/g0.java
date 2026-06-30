package ph1;

/* loaded from: classes7.dex */
public final class g0 implements ph1.h, ph1.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f354327d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ik1.x f354328e = new ik1.x();

    /* renamed from: f, reason: collision with root package name */
    public final ze.n f354329f;

    public g0(ze.n nVar) {
        this.f354329f = nVar;
    }

    public static void h(ph1.g0 g0Var, java.lang.String str, ph1.g gVar) {
        synchronized (g0Var.f354327d) {
            ((java.util.HashSet) g0Var.f354327d).remove(str);
        }
        java.util.Set g17 = g0Var.f354328e.g(str);
        if (g17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "markLoadingFinished %s, result %s, get null callbackSet, maybe canceled by user before", str, gVar.name());
            return;
        }
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            ph1.d dVar = ((ph1.f0) it.next()).f354320a;
            if (dVar != null) {
                dVar.a(gVar);
            }
        }
    }

    @Override // ph1.h
    public void a(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17) {
        m(str, dVar, cVar, z17, null);
    }

    @Override // ph1.h
    public ph1.b b() {
        return new ph1.a0(this);
    }

    @Override // ph1.h
    public boolean c(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = this.f354329f.f74803n;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(str);
        java.lang.String str4 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                str2 = "";
            } else {
                str2 = "$" + a17;
            }
            sb6.append(str2);
            str4 = sb6.toString();
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 b17 = com.tencent.mm.plugin.appbrand.appcache.da.f75492a.b(str4, 0, new java.lang.String[0]);
        return (b17 == null || com.tencent.mm.sdk.platformtools.t8.K0(b17.field_pkgPath) || !com.tencent.mm.vfs.w6.j(b17.field_pkgPath)) ? false : true;
    }

    @Override // ph1.h
    public java.lang.String d(java.lang.String str) {
        return k(str).name;
    }

    @Override // ph1.h
    public boolean e() {
        return true;
    }

    @Override // ph1.h
    public com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f(java.lang.String pathOrModuleName) {
        if (android.text.TextUtils.isEmpty(pathOrModuleName)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f354329f.E0().f305852r;
        kotlin.jvm.internal.o.g(pathOrModuleName, "pathOrModuleName");
        if (kotlin.jvm.internal.o.b(ph1.i0.b(kz5.b0.c(wxaPkgWrappingInfo), pathOrModuleName, "findModuleInfoByModuleName", false, 4, null), wxaPkgWrappingInfo)) {
            return wxaPkgWrappingInfo;
        }
        if (!com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(pathOrModuleName)) {
            pathOrModuleName = com.tencent.mm.plugin.appbrand.appstorage.l1.b(pathOrModuleName, false);
        }
        java.lang.String pathOrModule = pathOrModuleName;
        com.tencent.mm.plugin.appbrand.appcache.la.o(this.f354329f, false).j();
        java.util.LinkedList linkedList = wxaPkgWrappingInfo.f75402g;
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        kotlin.jvm.internal.o.g(pathOrModule, "pathOrModule");
        return (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) ph1.i0.b(linkedList, pathOrModule, "findModuleInfoByModuleName", false, 4, null);
    }

    @Override // ph1.h
    public void g(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, ph1.d dVar) {
        ph1.e0 e0Var = new ph1.e0(null);
        e0Var.f354316a = true;
        e0Var.f354317b = com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH == wdVar && this.f354329f.u0().r() != k91.z3.TRANSPARENT;
        e0Var.f354318c = true;
        e0Var.f354319d = ph1.o.f354345a;
        if (this.f354329f.L0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule with path(%s), but runtime(%s) finished", str, this.f354329f.f74803n);
            if (dVar != null) {
                dVar.a(ph1.g.FAIL);
                return;
            }
            return;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo k17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? this.f354329f.E0().f305852r : k(str);
        b0Var.f291824a = k17;
        if (j(k17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule appId:%s path:%s, module:%s, options:%b, [loaded]", this.f354329f.f74803n, str, ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) b0Var.f291824a).name, e0Var);
            if (dVar != null) {
                if (e0Var.f354318c) {
                    l(((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) b0Var.f291824a).name, "options.injectModuleJS");
                }
                dVar.a(ph1.g.OK);
                return;
            }
        }
        ik1.b0 b0Var2 = new ik1.b0();
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        if (e0Var.f354316a) {
            this.f354329f.m(new ph1.v(this, pBool, b0Var, e0Var, b0Var2));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, appId:%s path:%s, module:%s, options:%b [do loadOrAddPendingCallback]", this.f354329f.f74803n, str, ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) b0Var.f291824a).name, e0Var);
        n((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) b0Var.f291824a, new ph1.x(this, dVar, pBool, e0Var, b0Var, b0Var2), true, new ph1.y(this, b0Var, null, b0Var2), e0Var.f354319d, null);
    }

    public final void i(java.lang.String str, ph1.d dVar, ph1.c cVar) {
        boolean contains;
        if (dVar == null && cVar == null) {
            return;
        }
        synchronized (this.f354327d) {
            contains = ((java.util.HashSet) this.f354327d).contains(str);
        }
        if (!contains) {
            if (j(com.tencent.mm.sdk.platformtools.t8.K0(str) ? this.f354329f.E0().f305852r : k(str))) {
                if (dVar != null) {
                    dVar.a(ph1.g.OK);
                    return;
                }
                return;
            }
        }
        this.f354328e.e(str, new ph1.f0(dVar, cVar));
    }

    public final boolean j(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(modulePkgInfo.pkgPath) && com.tencent.mm.vfs.w6.j(modulePkgInfo.pkgPath);
        if (z17) {
            if (!modulePkgInfo.independent) {
                l(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, "checkModuleLoaded");
            }
            l(modulePkgInfo.name, "checkModuleLoaded");
        }
        return z17;
    }

    public com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo k(java.lang.String pathOrModule) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f354329f.E0().f305852r;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(pathOrModule) && !com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(pathOrModule)) {
            com.tencent.mm.plugin.appbrand.appcache.la.o(this.f354329f, false).j();
            java.util.LinkedList linkedList = wxaPkgWrappingInfo.f75402g;
            kotlin.jvm.internal.o.g(linkedList, "<this>");
            kotlin.jvm.internal.o.g(pathOrModule, "pathOrModule");
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) ph1.i0.b(linkedList, pathOrModule, "findModuleInfoByResourcePath", false, 4, null);
            if (modulePkgInfo != null) {
                return modulePkgInfo;
            }
        }
        return wxaPkgWrappingInfo;
    }

    public final void l(java.lang.String str, java.lang.String str2) {
        com.tencent.luggage.sdk.jsapi.component.service.y C0 = this.f354329f.C0();
        if (C0 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "injectServiceScriptSafe appId:%s, module:%s, reason:%s ret:%b", this.f354329f.f74803n, str, str2, java.lang.Boolean.valueOf(C0.y(str)));
    }

    public final void m(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f17 = f(str);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [not found]", this.f354329f.f74803n, str, java.lang.Boolean.valueOf(z17));
            if (dVar != null) {
                dVar.a(ph1.g.MODULE_NOT_FOUND);
                return;
            }
            return;
        }
        if (!j(f17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [do loadOrAddPendingCallback]", this.f354329f.f74803n, str, java.lang.Boolean.valueOf(z17));
            n(f17, new ph1.z(this, z17, f17, dVar), true, cVar, ph1.o.f354347c, str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [loaded]", this.f354329f.f74803n, str, java.lang.Boolean.valueOf(z17));
        if (z17) {
            l(f17.name, "options.injectModuleJS");
        }
        if (dVar != null) {
            dVar.a(ph1.g.OK);
        }
    }

    public final void n(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo, ph1.d dVar, boolean z17, ph1.c cVar, java.util.concurrent.Executor executor, java.lang.String str) {
        boolean contains;
        java.lang.String str2 = modulePkgInfo.name;
        boolean z18 = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(str2) || modulePkgInfo.independent || j(this.f354329f.E0().f305852r)) ? false : true;
        if (z17 && dVar != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str2);
            if (z18) {
                linkedList.add(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME);
            }
            dVar.b(linkedList);
        }
        if (z18) {
            n(this.f354329f.E0().f305852r, null, false, null, executor, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, name %s, independent %b, should ensure __APP__ %b", modulePkgInfo.name, java.lang.Boolean.valueOf(modulePkgInfo.independent), java.lang.Boolean.valueOf(z18));
        i(str2, dVar, cVar);
        synchronized (this.f354327d) {
            contains = ((java.util.HashSet) this.f354327d).contains(str2);
            if (!contains) {
                ((java.util.HashSet) this.f354327d).add(str2);
            }
        }
        if (contains) {
            return;
        }
        ph1.i iVar = new ph1.i(2);
        if (z18) {
            i(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, new ph1.b0(this, iVar), null);
        } else {
            iVar.a(null);
        }
        ph1.r b17 = ph1.q.f354348a.b(this.f354329f, this.f354329f.E0().f305852r.e(this.f354329f.f74803n, str2), str);
        b17.b(new ph1.d0(this, str2, iVar));
        b17.a(executor);
    }
}
