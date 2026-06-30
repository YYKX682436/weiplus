package o72;

/* loaded from: classes12.dex */
public abstract class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f343461a = new java.util.concurrent.ConcurrentHashMap();

    public static void a(long j17, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f343461a;
        java.lang.String str2 = (java.lang.String) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        concurrentHashMap.put(java.lang.Long.valueOf(j17), str);
        com.tencent.mars.xlog.Log.i("[#FavPost#]", "bindSession localId=%d, curSessionId=%s, newSessionId=%s", java.lang.Long.valueOf(j17), str2, str);
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        d(str2, str3, objArr);
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object... objArr) {
        java.lang.String d17 = d(str2, "[" + str3 + "] " + str4, objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[#FavPost#] ");
        sb6.append(d17);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str3 = "";
        } else {
            str3 = "[" + str + "] ";
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    return str3 + java.lang.String.format(str2, objArr);
                }
            } catch (java.lang.Exception e17) {
                return str3 + str2 + " [FormatError: " + e17.getMessage() + "]";
            }
        }
        return str3 + str2;
    }

    public static java.lang.String e(long j17, long j18) {
        return j17 + "_" + j18;
    }

    public static java.lang.String f(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f343461a;
        return !concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) ? "" : (java.lang.String) concurrentHashMap.get(java.lang.Long.valueOf(j17));
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, "[#FavPost#] " + d(str2, str3, objArr));
    }

    public static void h(java.lang.String str, java.lang.String str2, long j17, int i17, int i18, int i19, int i27, int i28) {
        g(str, str2, "CDN CHECK: localId=%d, total=%d, exist=%d, missing=%d, needUploadData=%d, needUploadThumb=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, boolean z17) {
        g(str, str2, "DB %s: localId=%d, success=%b", str3, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
    }

    public static void j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, int i17, java.lang.String str5, java.lang.Object... objArr) {
        c(str, str2, str3, "ERROR at " + str4 + ": localId=" + j17 + ", retryCount=" + i17 + ", msg=" + str5, objArr);
    }

    public static void k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, long j17) {
        g(str, str2, "FILE %s: src=%s, dst=%s, success=%b, size=%d", str3, n(str4), n(str5), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
    }

    public static void l(java.lang.String str, java.lang.String str2, long j17, int i17, int i18, int i19, boolean z17) {
        if (z17) {
            g(str, str2, "NETWORK RESPONSE: Success localId=%d, favId=%d, errType=%d, errCode=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        } else {
            c(str, str2, "ERR_NETWORK_REQUEST_FAILED", "NETWORK RESPONSE: Fail localId=%d, favId=%d, errType=%d, errCode=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
    }

    public static void m(java.lang.String str, java.lang.String str2, long j17, int i17, int i18) {
        g(str, str2, "Status TRANSITION: localId=%d, itemStatus %d to %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static java.lang.String n(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "null" : str;
    }

    public static void o(final java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        f343461a.entrySet().removeIf(new java.util.function.Predicate() { // from class: o72.s2$$a
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return str.equals(((java.util.Map.Entry) obj).getValue());
            }
        });
    }

    public static void p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w(str, "[#FavPost#] " + d(str2, str3, objArr));
    }
}
