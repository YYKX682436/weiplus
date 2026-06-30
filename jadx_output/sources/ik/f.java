package ik;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ik.f f291821a = new ik.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f291822b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f291823c;

    static {
        rz5.a aVar = ik.b.f291817a;
        int d17 = kz5.b1.d(kz5.d0.q(aVar, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : aVar) {
            linkedHashMap.put(((wj.t0) obj).f446518d, obj);
        }
        f291822b = linkedHashMap;
        jz5.h.b(ik.e.f291820d);
        f291823c = jz5.h.b(ik.c.f291818d);
    }

    public final boolean a(java.lang.String str, long j17) {
        android.content.pm.PackageInfo a17;
        int i17 = (str == null || (a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, str)) == null) ? 0 : a17.versionCode;
        com.tencent.mars.xlog.Log.i("MagicAdCommonUtils", "checkPkgVersionOk, pkg: " + str + ", pkgVersion: " + i17 + ", minVersion: " + j17);
        return ((long) i17) >= j17;
    }

    public final long b() {
        return ((com.tencent.mm.ipcinvoker.type.IPCLong) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), ik.a.class)).f68405d;
    }

    public final wj.t0 c(java.lang.String adPosId) {
        kotlin.jvm.internal.o.g(adPosId, "adPosId");
        wj.t0 t0Var = (wj.t0) ((java.util.LinkedHashMap) f291822b).get(adPosId);
        return t0Var == null ? wj.t0.f446508q : t0Var;
    }

    public final java.lang.String d(java.lang.String posId, java.lang.String serverAid) {
        kotlin.jvm.internal.o.g(posId, "posId");
        kotlin.jvm.internal.o.g(serverAid, "serverAid");
        if (serverAid.length() == 0) {
            return "";
        }
        return posId + '-' + serverAid;
    }

    public final java.lang.String e(wj.t0 posId, java.lang.String serverAid) {
        kotlin.jvm.internal.o.g(posId, "posId");
        kotlin.jvm.internal.o.g(serverAid, "serverAid");
        return d(posId.f446518d, serverAid);
    }
}
