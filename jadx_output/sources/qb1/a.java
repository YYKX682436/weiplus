package qb1;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(com.tencent.mm.plugin.appbrand.jsapi.f fVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l env, int i18, java.lang.String errMsg, java.util.HashMap hashMap, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            hashMap = null;
        }
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(i18));
        env.a(i17, fVar.p(errMsg, hashMap));
    }

    public static final void b(com.tencent.mm.plugin.appbrand.jsapi.f fVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l env, java.util.HashMap hashMap) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(env, "env");
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("errCode", 0);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        env.a(i17, fVar.t("ok", hashMap));
    }

    public static final int c() {
        return c06.f.a(java.lang.System.currentTimeMillis()).e(1, Integer.MAX_VALUE);
    }

    public static final boolean d(java.lang.String permission) {
        kotlin.jvm.internal.o.g(permission, "permission");
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return nf.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, null, permission);
    }
}
