package cq2;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static long f221432e;

    /* renamed from: f, reason: collision with root package name */
    public static r45.wo1 f221433f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.protobuf.g f221434g;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f221437j;

    /* renamed from: k, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f221438k;

    /* renamed from: l, reason: collision with root package name */
    public static r45.rk0 f221439l;

    /* renamed from: m, reason: collision with root package name */
    public static int f221440m;

    /* renamed from: n, reason: collision with root package name */
    public static int f221441n;

    /* renamed from: o, reason: collision with root package name */
    public static int f221442o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f221443p;

    /* renamed from: a, reason: collision with root package name */
    public static final cq2.q f221428a = new cq2.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f221429b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f221430c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f221431d = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f221435h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f221436i = "";

    public static final void a(cq2.q qVar, ys5.e eVar) {
        zy2.fa nk6;
        com.tencent.mm.plugin.finder.extension.reddot.jb L0;
        qVar.getClass();
        if (eVar == ys5.e.f465260h || (L0 = (nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk()).L0("FinderLiveEntrance")) == null || L0.I0("FinderLiveEntrance") == null || L0.getType() != 16) {
            return;
        }
        nk6.a0(L0);
    }

    public final void b(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearNewEntranceCache: source=");
        sb6.append(source);
        sb6.append(", curPreloadJob=");
        sb6.append(f221438k);
        sb6.append(", isActive=");
        kotlinx.coroutines.r2 r2Var = f221438k;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = f221438k;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        f221438k = null;
        aq2.i iVar = aq2.k.f13140l;
        by1.b bVar = by1.c.f36353b;
        by1.d a17 = bVar.a().a(iVar.a("default"));
        aq2.k kVar = a17 instanceof aq2.k ? (aq2.k) a17 : null;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clearNewEntranceCache: source=");
        sb7.append(source);
        sb7.append(", cache=");
        sb7.append(kVar);
        sb7.append(" data=");
        sb7.append(kVar != null ? (com.tencent.mm.modelbase.f) kVar.f36361b : null);
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", sb7.toString());
        if ((kVar != null ? (com.tencent.mm.modelbase.f) kVar.f36361b : null) != null) {
            by1.d a18 = bVar.a().a(iVar.a("default"));
            aq2.k kVar2 = a18 instanceof aq2.k ? (aq2.k) a18 : null;
            if (kVar2 != null) {
                kVar2.g();
            }
        }
        sp2.b.f410972a.d(iVar.a("default"), 0);
    }

    public final com.tencent.mm.protobuf.g c() {
        if (f221434g == null) {
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_MORE_LIVE_OBJECTS_BUFFER_STRING, "");
            kotlin.jvm.internal.o.d(v17);
            if (v17.length() == 0) {
                return null;
            }
            byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(v17);
            f221434g = new com.tencent.mm.protobuf.g(h17, 0, h17.length);
        }
        return f221434g;
    }

    public final r45.wo1 d() {
        if (f221433f == null) {
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_NO_REDDOT_PRELOAD_CONFIG_STRING, "");
            kotlin.jvm.internal.o.d(v17);
            if (v17.length() == 0) {
                return null;
            }
            try {
                r45.wo1 wo1Var = new r45.wo1();
                wo1Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
                f221433f = wo1Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("NewSquarePreloadUtil", e17, "get noRedDotPreloadConfig", new java.lang.Object[0]);
            }
        }
        return f221433f;
    }

    public final java.lang.String e(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        r45.xs2 xs2Var = jbVar != null ? jbVar.N : null;
        java.lang.String str = jbVar != null ? jbVar.field_tipsId : null;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(xs2Var != null ? xs2Var.getString(0) : null);
        sb6.append('_');
        sb6.append(xs2Var != null ? java.lang.Long.valueOf(xs2Var.getLong(3)) : null);
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(r45.qt2 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.q.f(r45.qt2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String g(r45.wo1 wo1Var) {
        kotlin.jvm.internal.o.g(wo1Var, "<this>");
        return "refresh_preload_config: " + wo1Var.getBoolean(0) + ", preload_control_flag: " + wo1Var.getLong(1) + ", preload_feed_effective_time: " + wo1Var.getInteger(2) + ", preload_config_effective_unix_time: " + wo1Var.getLong(3) + ", preload_freq_limit_retry_delay_time: " + wo1Var.getInteger(4) + ", request_preload_buff: " + wo1Var.getByteString(5) + " preload_feed_refresh_time=" + wo1Var.getInteger(10);
    }

    public final void h(java.lang.String source, r45.wo1 config) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "updateNoRedDotPreloadConfig: source=" + source + ", switch=" + config.getInteger(7));
        if (config.getInteger(7) == 0) {
            return;
        }
        f221433f = config;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_NO_REDDOT_PRELOAD_CONFIG_STRING, com.tencent.mm.sdk.platformtools.t8.l(config.toByteArray()));
    }

    public final void i(java.lang.String source, r45.dk2 resp) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "updatePreloadControlConfig: source=".concat(source));
        r45.wo1 wo1Var = (r45.wo1) resp.getCustom(18);
        cq2.q qVar = f221428a;
        if (wo1Var != null) {
            r45.bk2 bk2Var = (r45.bk2) resp.getCustom(16);
            if (bk2Var != null) {
                wo1Var.set(8, java.lang.Integer.valueOf(bk2Var.getInteger(11)));
            }
            qVar.h(source, wo1Var);
        }
        r45.bk2 bk2Var2 = (r45.bk2) resp.getCustom(16);
        if (bk2Var2 != null) {
            if (bk2Var2.getInteger(13) == 1 || bk2Var2.getInteger(12) == 1) {
                com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "update preload config, disable red dot preload");
                java.util.Iterator it = f221429b.entrySet().iterator();
                while (it.hasNext()) {
                    r45.wo1 wo1Var2 = (r45.wo1) ((java.util.Map.Entry) it.next()).getValue();
                    if (wo1Var2 != null) {
                        wo1Var2.set(1, 0L);
                    }
                }
            }
            if (bk2Var2.getInteger(13) == 1 || bk2Var2.getInteger(10) == 1) {
                com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "update preload config, disable no red dot preload");
                r45.wo1 d17 = qVar.d();
                if (d17 != null) {
                    d17.set(7, 1);
                    qVar.h("disablePreload", d17);
                    return;
                }
                return;
            }
            if (bk2Var2.getInteger(6) == 1) {
                r45.wo1 d18 = qVar.d();
                boolean z17 = false;
                if (d18 != null && d18.getInteger(7) == 5) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "update preload config, disable no red dot client model preload");
                    r45.wo1 d19 = qVar.d();
                    if (d19 != null) {
                        d19.set(7, 1);
                        qVar.h("disableClientModel", d19);
                    }
                }
            }
        }
    }
}
