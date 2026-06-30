package yb0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yb0.a f460612a = new yb0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f460613b = new java.util.LinkedHashMap();

    public final void a(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("AdApkAttributionInfoManager", "apply traceid , downloadUrl=" + str + "  traceId=" + str2);
        ((kotlinx.coroutines.flow.h3) ((kotlinx.coroutines.flow.j2) d(str))).k(str2);
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{"|"}, false, 0, 6, null);
        if (f07.size() > 1) {
            java.lang.String str3 = (java.lang.String) f07.get(1);
            com.tencent.mars.xlog.Log.i("AdApkAttributionInfoManager", "apply traceid by biz , downloadUrl=" + str + "  traceId=" + str3);
            ((kotlinx.coroutines.flow.h3) ((kotlinx.coroutines.flow.j2) d(str))).k(str3);
        }
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            return null;
        }
        java.util.Map map = f460613b;
        synchronized (map) {
            kotlinx.coroutines.flow.j2 j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) map).get(str);
            str2 = j2Var != null ? (java.lang.String) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null;
        }
        return str2;
    }

    public final kotlinx.coroutines.flow.j d(java.lang.String k17) {
        kotlinx.coroutines.flow.j2 j2Var;
        kotlin.jvm.internal.o.g(k17, "k");
        java.util.Map map = f460613b;
        synchronized (map) {
            j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) map).get(k17);
            if (j2Var == null) {
                j2Var = kotlinx.coroutines.flow.i3.a(null);
                map.put(k17, j2Var);
            }
        }
        return j2Var;
    }
}
