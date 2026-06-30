package ku4;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ku4.z f312539a = new ku4.z();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f312540b = lp0.b.e() + "/WebCanvasPkg";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f312541c = lp0.b.e() + "/WebPrefetcherPkg";

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f312542d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f312543e = jz5.h.b(ku4.t.f312533d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f312544f = jz5.h.b(ku4.r.f312531d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f312545g = jz5.h.b(ku4.u.f312534d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f312546h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f312547i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f312548j;

    static {
        jz5.h.b(ku4.s.f312532d);
        f312546h = jz5.h.b(ku4.l.f312523d);
        f312547i = jz5.h.b(ku4.v.f312535d);
        f312548j = jz5.h.b(ku4.y.f312538d);
    }

    public static final void a(ku4.z zVar, com.tencent.mm.vfs.r6 r6Var, java.lang.String appId, long j17) {
        com.tencent.mm.vfs.r6[] G;
        zVar.getClass();
        if (r6Var.m()) {
            com.tencent.mm.plugin.appbrand.service.o6 o6Var = (com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
            if (o6Var != null) {
                kotlin.jvm.internal.o.g(appId, "appId");
                r45.mt g17 = zVar.g(appId);
                o6Var.Uf(appId, g17 != null ? g17.f380818f : 0);
            }
            com.tencent.mm.sdk.platformtools.o4 f17 = zVar.f();
            kotlin.jvm.internal.o.g(appId, "<this>");
            java.lang.String u17 = f17.u("webcanvas_last_use_pkg_path_".concat(appId), "");
            long q17 = zVar.f().q("webcanvas_last_use_pkg_time_".concat(appId), 0L);
            java.lang.String l17 = zVar.l(appId);
            if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    r6Var2.o();
                    r6Var2.getName();
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(r6Var2.o(), u17) && !com.tencent.mm.sdk.platformtools.t8.D0(r6Var2.o(), l17)) {
                        r6Var2.l();
                        d(appId, r6Var2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg appId=" + appId + ", path=" + r6Var2.o());
                        jx3.f.INSTANCE.w(1454L, 120L, 1L);
                    } else if (f312539a.j().contains(appId) && q17 != 0 && j17 - q17 > 2592000000L) {
                        r6Var2.l();
                        d(appId, r6Var2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg on timeout appId=" + appId + ", path=" + r6Var2.o() + '}');
                        jx3.f.INSTANCE.w(1454L, 121L, 1L);
                    }
                }
            }
        }
    }

    public static final void d(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = f312542d;
        synchronized (copyOnWriteArraySet) {
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((zs1.a) ((ku4.j) it.next())).getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPkgClear appId: ");
                sb6.append(str);
                sb6.append(", pkgFile: ");
                sb6.append(r6Var != null ? r6Var.o() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherPkgManager", sb6.toString());
            }
        }
    }

    public static final java.lang.String i(java.lang.String str) {
        if (str == null) {
            return "";
        }
        ku4.z zVar = f312539a;
        java.lang.String h17 = zVar.k() == 1 ? zVar.h(str, 2) : zVar.l(str);
        return h17 == null ? "" : h17;
    }

    public final synchronized void b(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if ((appId.length() > 0) && !j().contains(appId)) {
            j().add(appId);
            com.tencent.mm.plugin.appbrand.service.o6 o6Var = (com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
            if (o6Var != null) {
                o6Var.Uf(appId, 0);
            }
            m();
        }
    }

    public final void c(boolean z17) {
        long q17 = f().q("webcanvas_last_clear_pkg_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - q17);
        if (z17 || abs >= 86400000) {
            f().B("webcanvas_last_clear_pkg_time", currentTimeMillis);
            ((ku5.t0) ku5.t0.f312615d).k(ku4.o.f312526d, 20000L);
        }
    }

    public final java.lang.Object e(nu4.a aVar, java.lang.String str, java.lang.String str2, int i17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        ku4.z zVar = f312539a;
        long longValue = ((java.lang.Number) ((jz5.n) f312548j).getValue()).longValue();
        zVar.b(str);
        if (zVar.k() == 1) {
            ((com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class)).A7("wx97b7aebac2183fd2", 2, new ku4.m("wx97b7aebac2183fd2"), new ku4.n("wx97b7aebac2183fd2"));
            ((com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class)).A7(str, 2, new ku4.m(str), new ku4.n(str));
        } else {
            zVar.o();
            zVar.p(str, longValue, 10);
        }
        if (com.tencent.mm.vfs.w6.j(zVar.l(str))) {
            zw4.g.a(zw4.e.f476910e, zw4.f.f476917g, aVar.f340233a.f379226d, i17, aVar.f340236d, aVar.f340237e, "", "");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg pkg not exist, wait for download complete. appId=".concat(str));
            zw4.g.a(zw4.e.f476912g, zw4.f.f476917g, aVar.f340233a.f379226d, i17, aVar.f340236d, aVar.f340237e, "", "");
            ((com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class)).A7(str, zVar.k() != 1 ? 0 : 2, new ku4.p(str, nVar), new ku4.q(str, nVar));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar2 = pz5.a.f359186d;
        return a17;
    }

    public final com.tencent.mm.sdk.platformtools.o4 f() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f312544f).getValue();
    }

    public final r45.mt g(java.lang.String appId) {
        com.tencent.mm.protobuf.f fVar;
        byte[] j17;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.sdk.platformtools.o4 f17 = f();
        kotlin.jvm.internal.o.f(f17, "<get-mmkv>(...)");
        java.lang.String concat = "webcanvas_pkg_info_".concat(appId);
        if (f17.f(concat) && (j17 = f17.j(concat)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.mt.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    fVar = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.mt) fVar;
            }
        }
        fVar = null;
        return (r45.mt) fVar;
    }

    public final java.lang.String h(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        try {
            com.tencent.mm.plugin.appbrand.appcache.n9 q66 = ((com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class)).q6(appId, i17, 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPreviewPkgPath appId=");
            sb6.append(appId);
            sb6.append(", pkgType=");
            sb6.append(i17);
            sb6.append(", md5=");
            sb6.append(q66 != null ? q66.field_versionMd5 : null);
            sb6.append(" download version= ");
            sb6.append(q66 != null ? java.lang.Integer.valueOf(q66.field_version) : null);
            sb6.append(" path=");
            sb6.append(q66 != null ? q66.field_pkgPath : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", sb6.toString());
            if (q66 != null) {
                return q66.field_pkgPath;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebCanvasStorageLogic", "getPreviewPkgPath ex " + e17.getMessage());
            return null;
        }
    }

    public final java.util.LinkedList j() {
        return (java.util.LinkedList) ((jz5.n) f312543e).getValue();
    }

    public final int k() {
        return ((java.lang.Number) ((jz5.n) f312545g).getValue()).intValue();
    }

    public final java.lang.String l(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            return null;
        }
        r45.mt g17 = g(appId);
        if (g17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath pkgInfo is null, appId: %s", appId);
            return null;
        }
        if (com.tencent.mm.vfs.w6.j(g17.f380817e)) {
            f().D("webcanvas_last_use_pkg_path_".concat(appId), new com.tencent.mm.vfs.r6(g17.f380817e).o());
            f().B("webcanvas_last_use_pkg_time_".concat(appId), java.lang.System.currentTimeMillis());
            return g17.f380817e;
        }
        java.lang.String h17 = h(appId, 0);
        if (!com.tencent.mm.vfs.w6.j(h17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath pkgInfo " + g17.f380817e + " not exist");
            return null;
        }
        jx3.f.INSTANCE.w(1454L, 123L, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath use wxa appId=" + appId + ", md5=" + g17.f380820h + " download version= " + g17.f380818f + " path=" + h17);
        return h17;
    }

    public final synchronized void m() {
        try {
            com.tencent.mm.sdk.platformtools.o4 f17 = f();
            r45.wb5 wb5Var = new r45.wb5();
            wb5Var.f389037d = f312539a.j();
            f17.H("KPrefetcherBizAppIds", wb5Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebCanvasStorageLogic", "saveBizAppIds ex " + e17.getMessage());
        }
    }

    public final void n(java.lang.String appId, r45.mt pkg) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkg, "pkg");
        f().H("webcanvas_pkg_info_".concat(appId), pkg.toByteArray());
    }

    public final void o() {
        if (p("wx97b7aebac2183fd2", ((java.lang.Number) ((jz5.n) f312547i).getValue()).longValue(), 6)) {
            jx3.f.INSTANCE.w(1454L, 54L, 1L);
        }
    }

    public final boolean p(java.lang.String str, long j17, int i17) {
        com.tencent.mm.sdk.platformtools.o4 f17 = f();
        kotlin.jvm.internal.o.g(str, "<this>");
        long j18 = f17.getLong(str.concat("-lastDownLoawnTime"), 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - j18);
        if ((k() == 0 && abs < j17) || (k() != 0 && abs < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT)) {
            k();
            return false;
        }
        f().B(str.concat("-lastDownLoawnTime"), currentTimeMillis);
        if (((java.util.List) ((jz5.n) f312546h).getValue()).contains(str)) {
            ((com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class)).A7(str, 0, new ku4.w(str), new ku4.x(str));
            return true;
        }
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).z8(null, str, i17);
        return true;
    }
}
