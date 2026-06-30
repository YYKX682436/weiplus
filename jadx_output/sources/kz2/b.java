package kz2;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final kz2.b f313858a = new kz2.b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f313859b;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f313859b = false;
    }

    public final java.lang.String a() {
        java.lang.String str = "";
        if (!f313859b) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\nstack=>");
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        if (stackTrace.length >= 4) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int length = stackTrace.length;
            for (int i17 = 3; i17 < length; i17++) {
                java.lang.String className = stackTrace[i17].getClassName();
                kotlin.jvm.internal.o.f(className, "getClassName(...)");
                if (r26.n0.B(className, "com.tencent.", false)) {
                    java.lang.String className2 = stackTrace[i17].getClassName();
                    kotlin.jvm.internal.o.f(className2, "getClassName(...)");
                    if (!r26.n0.B(className2, "sdk.platformtools.Log", false)) {
                        sb7.append("[");
                        java.lang.String className3 = stackTrace[i17].getClassName();
                        kotlin.jvm.internal.o.f(className3, "getClassName(...)");
                        sb7.append(r26.i0.t(className3, "com.tencent.mm", "", false));
                        sb7.append(":");
                        sb7.append(stackTrace[i17].getMethodName());
                        sb7.append("(" + stackTrace[i17].getLineNumber() + ")]");
                        if (i17 >= 6) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            str = sb7.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final void b(java.lang.String str, java.lang.String str2, int i17) {
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i(str, str2);
        } else if (i17 == 3) {
            com.tencent.mars.xlog.Log.w(str, str2);
        } else {
            if (i17 != 4) {
                return;
            }
            com.tencent.mars.xlog.Log.e(str, str2);
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String substring;
        if (!f313859b) {
            b(str, str2, i17);
            return;
        }
        if (str2.length() < 4000) {
            b(str, str2, i17);
            return;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < str2.length()) {
            int i27 = i18 + 4000;
            if (str2.length() <= i27) {
                substring = str2.substring(i18);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
            } else {
                substring = str2.substring(i18, i27);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
            }
            b(str, "=>id:" + i19 + ' ' + substring, i17);
            i19++;
            i18 = i27;
        }
    }

    public final void d(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        c("Finder.LiveTracker", tag + ':' + msg + ' ' + a(), 2);
    }
}
