package cz3;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final cz3.e f225027a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f225028b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.v3 f225029c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f225030d;

    /* renamed from: e, reason: collision with root package name */
    public static final kk.j f225031e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f225032f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f225033g;

    static {
        cz3.e eVar = new cz3.e();
        f225027a = eVar;
        f225030d = new java.util.HashMap();
        f225031e = new jt0.j(20);
        f225032f = jz5.h.b(cz3.c.f225025d);
        f225033g = jz5.h.b(cz3.d.f225026d);
        if (eVar.c()) {
            try {
                boolean a17 = gm0.j1.a();
                if (a17 && f225028b == null) {
                    java.lang.String str = c01.z1.r() + "scan_crash_protect_mmkv";
                    f225028b = com.tencent.mm.sdk.platformtools.o4.M(str);
                    com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(str);
                    kotlin.jvm.internal.o.f(M, "getMMKV(...)");
                    f225029c = new com.tencent.mm.sdk.platformtools.v3(M, eVar.d());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanFileCrashManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f225028b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanFileCrashManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
            }
        }
        if (f225027a.c()) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = f225028b;
            int i17 = o4Var != null ? o4Var.getInt("key_client_version", 0) : 0;
            int i18 = o45.wf.f343029g;
            if (i17 != i18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanFileCrashManager", "initCrashInfo clientVersion not the same, and clear crash info. last: %X, current: %X", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.tencent.mm.sdk.platformtools.v3 v3Var = f225029c;
                if (v3Var != null) {
                    v3Var.a();
                }
                f225031e.clear();
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = f225028b;
                if (o4Var2 != null) {
                    o4Var2.putInt("key_client_version", i18);
                }
            }
        }
    }

    public static final r45.tu5 a(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.protobuf.f fVar;
        byte[] j17;
        try {
            r45.tu5 tu5Var = (r45.tu5) ((lt0.f) f225031e).i(str);
            if (tu5Var == null) {
                com.tencent.mm.sdk.platformtools.v3 v3Var = f225029c;
                if (v3Var == null || (o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.i()) == null) {
                    return null;
                }
                if (o4Var.f(str) && (j17 = o4Var.j(str)) != null) {
                    if (!(j17.length == 0)) {
                        try {
                            java.lang.Object newInstance = r45.tu5.class.newInstance();
                            ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                            fVar = (com.tencent.mm.protobuf.f) newInstance;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                        }
                        tu5Var = (r45.tu5) fVar;
                    }
                }
                fVar = null;
                tu5Var = (r45.tu5) fVar;
            }
            return tu5Var;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String b(kd0.a aVar, java.lang.String str) {
        return "key_crash_info-" + aVar.f306599d + '-' + str;
    }

    public static final void e(java.lang.String str, r45.tu5 tu5Var) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.sdk.platformtools.v3 v3Var = f225029c;
        if (v3Var != null && (o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.i()) != null) {
            o4Var.H(str, tu5Var.toByteArray());
        }
        ((lt0.f) f225031e).put(str, tu5Var);
    }

    public final boolean c() {
        return ((java.lang.Boolean) f225032f.getValue()).booleanValue();
    }

    public final long d() {
        return ((java.lang.Number) f225033g.getValue()).longValue();
    }
}
