package yd5;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final yd5.n f461124a = new yd5.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f461125b = new java.util.LinkedHashMap();

    public final int a(java.lang.String str) {
        if (str.length() == 0) {
            return 4;
        }
        if (r26.n0.B(str, "LauncherUI", true)) {
            return 1;
        }
        if (r26.n0.B(str, "finder", true)) {
            return 3;
        }
        return r26.n0.B(str, "appbrand", true) ? 2 : 4;
    }
}
