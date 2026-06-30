package ts1;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f421588a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f421589b;

    /* renamed from: c, reason: collision with root package name */
    public final nu4.b f421590c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.v3 f421591d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f421592e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f421593f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f421594g;

    /* renamed from: h, reason: collision with root package name */
    public final nu4.a f421595h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f421596i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f421597j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f421598k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f421599l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f421600m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f421601n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f421602o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f421603p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f421604q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f421605r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f421606s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f421607t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f421608u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f421609v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f421610w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f421611x;

    public o(java.lang.String url, java.lang.String webId, nu4.b bVar, com.tencent.mm.sdk.platformtools.v3 headerSlot, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, nu4.a aVar, boolean z17, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 16) != 0 ? null : str;
        str2 = (i17 & 32) != 0 ? null : str2;
        bool = (i17 & 64) != 0 ? java.lang.Boolean.FALSE : bool;
        aVar = (i17 & 128) != 0 ? null : aVar;
        z17 = (i17 & 256) != 0 ? false : z17;
        str3 = (i17 & 512) != 0 ? null : str3;
        str4 = (i17 & 1024) != 0 ? null : str4;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(webId, "webId");
        kotlin.jvm.internal.o.g(headerSlot, "headerSlot");
        this.f421588a = url;
        this.f421589b = webId;
        this.f421590c = bVar;
        this.f421591d = headerSlot;
        this.f421592e = str;
        this.f421593f = str2;
        this.f421594g = bool;
        this.f421595h = aVar;
        this.f421596i = z17;
        this.f421597j = str3;
        this.f421598k = str4;
        this.f421599l = jz5.h.b(new ts1.j(this));
        this.f421600m = jz5.h.b(new ts1.c(this));
        this.f421601n = jz5.h.b(new ts1.b(this));
        this.f421602o = jz5.h.b(new ts1.g(this));
        this.f421603p = jz5.h.b(new ts1.f(this));
        this.f421604q = jz5.h.b(new ts1.d(this));
        this.f421605r = jz5.h.b(new ts1.n(this));
        this.f421606s = jz5.h.b(new ts1.m(this));
        this.f421607t = jz5.h.b(new ts1.i(this));
        this.f421608u = jz5.h.b(new ts1.k(this));
        this.f421609v = jz5.h.b(new ts1.e(this));
        this.f421610w = jz5.h.b(new ts1.l(this));
        this.f421611x = jz5.h.b(new ts1.h(this));
    }

    public static final r45.o97 a(ts1.o oVar) {
        return (r45.o97) ((jz5.n) oVar.f421599l).getValue();
    }

    public final zq1.j0 b() {
        java.lang.String str;
        java.lang.String str2;
        nu4.b bVar = this.f421590c;
        if (bVar == null) {
            return null;
        }
        int size = l().size();
        boolean O = bVar.O(d());
        if (size == 0 || !O) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PrefetchTarget", "createResponse fail headerSize:" + size + ", containsFile:" + O);
            return null;
        }
        java.util.List list = (java.util.List) l().get("x-cos-meta-md5");
        java.lang.String str3 = list != null ? (java.lang.String) kz5.n0.Z(list) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PrefetchTarget", "md5 check header md5 null, not check");
        } else {
            java.lang.String a17 = kk.k.a(bVar.Q(d()));
            d();
            if (!kotlin.jvm.internal.o.b(str3, a17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PrefetchTarget", "md5 check fail header md5:" + str3 + ", file md5:" + a17 + ", url:" + this.f421588a + ", bizId:" + d());
                jz5.g gVar = cx4.s.f224654a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1281L, 15L, 1L);
                bVar.Q(d()).l();
                return null;
            }
        }
        zq1.j0 j0Var = new zq1.j0();
        j0Var.f474995a = (java.lang.String) ((jz5.n) this.f421602o).getValue();
        j0Var.f474997c = this.f421589b;
        j0Var.f474996b = d();
        j0Var.f475000f = t().f94227d;
        j0Var.f474999e = u();
        j0Var.f474998d = e();
        j0Var.f475002h = s();
        j0Var.f475003i = j();
        j0Var.f475004j = (java.lang.String) ((jz5.n) this.f421601n).getValue();
        j0Var.f475005k = (com.tencent.mm.protobuf.g) ((jz5.n) this.f421607t).getValue();
        j0Var.f475006l = p();
        j0Var.f475008n = x51.j1.b((com.tencent.mm.protobuf.g) ((jz5.n) this.f421609v).getValue());
        java.util.HashMap l17 = l();
        l17.remove("content-length");
        l17.remove("keep-alive");
        l17.remove("upgrade");
        l17.remove("cookie2");
        l17.remove("trailer");
        l17.remove("te");
        l17.remove("host");
        l17.remove("set-cookie");
        l17.remove("transfer-encoding");
        java.lang.String bizId = j0Var.f474996b;
        kotlin.jvm.internal.o.f(bizId, "bizId");
        com.tencent.mm.vfs.r6 Q = bVar.Q(bizId);
        com.tencent.mars.xlog.Log.i("MicroMsg.PrefetchTarget", "createResponse webId: %s, bizId: %s, fileSize: %s", j0Var.f474997c, j0Var.f474996b, java.lang.Long.valueOf(Q.C()));
        zq1.l0 l0Var = new zq1.l0();
        java.util.List list2 = (java.util.List) l().get("content-type");
        if (list2 == null || (str2 = (java.lang.String) kz5.n0.X(list2)) == null || (str = r26.n0.u0(r26.n0.q0(str2, ";", str2)).toString()) == null) {
            str = "text/html";
        }
        java.lang.String str4 = str;
        java.util.HashMap l18 = l();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(l18.size()));
        for (java.util.Map.Entry entry : l18.entrySet()) {
            java.lang.Object key = entry.getKey();
            linkedHashMap.put(key, (java.lang.String) kz5.n0.X((java.util.List) entry.getValue()));
        }
        l0Var.f475013a = new com.tencent.xweb.y0(str4, com.tencent.mapsdk.internal.rv.f51270c, 200, "OK", linkedHashMap, com.tencent.mm.vfs.w6.C(Q));
        j0Var.f475001g = l0Var;
        return j0Var;
    }

    public final java.lang.String c() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-prefetch-pkg-base-ver");
        return (list == null || (str = (java.lang.String) kz5.n0.Z(list)) == null) ? "" : str;
    }

    public final java.lang.String d() {
        return (java.lang.String) ((jz5.n) this.f421600m).getValue();
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) this.f421604q).getValue()).intValue();
    }

    public final long f() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-client-cache-time");
        if (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) {
            return -1L;
        }
        return java.lang.Long.parseLong(str);
    }

    public final long g() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-client-check-update-time");
        long parseLong = (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) ? -1L : java.lang.Long.parseLong(str);
        return parseLong > 0 ? java.lang.Math.max(parseLong, 60L) : parseLong;
    }

    public final long h() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-check-update-time-interval");
        if (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) {
            return -1L;
        }
        return java.lang.Long.parseLong(str);
    }

    public final java.lang.String i() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("etag");
        return (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) ? "" : str;
    }

    public final int j() {
        return ((java.lang.Number) ((jz5.n) this.f421603p).getValue()).intValue();
    }

    public final java.lang.String k() {
        java.lang.String str;
        java.lang.String string;
        if (com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.a()) {
            java.lang.String str2 = (java.lang.String) kz5.n0.Z(r26.n0.f0((!com.tencent.mm.plugin.webview.core.s1.f181972a.a() || (string = com.tencent.mm.plugin.webview.core.t1.a().getString("debugPatchInfo", "")) == null) ? "" : string, new java.lang.String[]{","}, false, 0, 6, null));
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                return str2;
            }
        }
        java.util.List list = (java.util.List) l().get("x-wx-prefetch-pkg-url");
        return (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) ? "" : str;
    }

    public final java.util.HashMap l() {
        return (java.util.HashMap) ((jz5.n) this.f421611x).getValue();
    }

    public final java.lang.String m() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get(ya.b.LOCATION);
        return (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) ? "" : str;
    }

    public final int n() {
        java.lang.String str;
        java.lang.String str2;
        java.util.List list = (java.util.List) l().get("x-wx-max-cache");
        if (list != null && (str2 = (java.lang.String) kz5.n0.X(list)) != null) {
            return java.lang.Integer.parseInt(str2);
        }
        java.util.List list2 = (java.util.List) l().get("max-age");
        if (list2 == null || (str = (java.lang.String) kz5.n0.X(list2)) == null) {
            return 600;
        }
        return java.lang.Integer.parseInt(str);
    }

    public final boolean o() {
        if (h() < 0 || g() < 0) {
            return false;
        }
        return com.tencent.mm.sdk.platformtools.y3.b(g(), h());
    }

    public final java.lang.String p() {
        return (java.lang.String) ((jz5.n) this.f421608u).getValue();
    }

    public final java.lang.String q() {
        java.lang.String str;
        java.lang.String string;
        if (com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.a()) {
            java.lang.String str2 = (java.lang.String) kz5.n0.k0(r26.n0.f0((!com.tencent.mm.plugin.webview.core.s1.f181972a.a() || (string = com.tencent.mm.plugin.webview.core.t1.a().getString("debugPatchInfo", "")) == null) ? "" : string, new java.lang.String[]{","}, false, 0, 6, null));
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                return str2;
            }
        }
        java.util.List list = (java.util.List) l().get("x-wx-prefetch-pkg-ver");
        return (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zq1.j0 r() {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts1.o.r():zq1.j0");
    }

    public final int s() {
        return ((java.lang.Number) ((jz5.n) this.f421605r).getValue()).intValue();
    }

    public final com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 t() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-client-prefetch-type");
        if (list != null && (str = (java.lang.String) kz5.n0.X(list)) != null) {
            java.lang.String upperCase = str.toUpperCase();
            kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 valueOf = com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.valueOf(upperCase);
            if (valueOf != null) {
                return valueOf;
            }
        }
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94222g;
    }

    public final long u() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-version");
        if (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) {
            return -1L;
        }
        return java.lang.Long.parseLong(str);
    }

    public final java.lang.String v() {
        java.lang.String str;
        java.util.List list = (java.util.List) l().get("x-wx-etag");
        return (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) ? "" : str;
    }

    public final boolean w() {
        nu4.b bVar;
        java.util.List list = (java.util.List) l().get("status");
        java.lang.String str = list != null ? (java.lang.String) kz5.n0.Z(list) : null;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case 49586:
                if (str.equals("200") && (bVar = this.f421590c) != null) {
                    return bVar.O(d());
                }
                return false;
            case 50548:
                if (!str.equals("301")) {
                    return false;
                }
                break;
            case 50549:
                if (!str.equals("302")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return !r26.n0.N(m());
    }

    public final boolean x() {
        return f() > 0 && n() > 0 && com.tencent.mm.sdk.platformtools.y3.a(f(), n());
    }

    public final boolean y() {
        java.util.List list = (java.util.List) l().get("status");
        java.lang.String str = list != null ? (java.lang.String) kz5.n0.X(list) : null;
        if (kotlin.jvm.internal.o.b(str, "301")) {
            return true;
        }
        return kotlin.jvm.internal.o.b(str, "302");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c3, code lost:
    
        if (r5.equals(ya.b.LOCATION) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0134, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r5.equals("set-cookie") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r5.equals("content-type") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts1.o.z(com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2, java.lang.String):void");
    }
}
