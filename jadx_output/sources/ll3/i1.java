package ll3;

/* loaded from: classes10.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ll3.i1 f319182a = new ll3.i1();

    public final java.lang.String a() {
        return gm0.j1.u().d() + "music/cover/";
    }

    public final java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        return (a() + "img/") + str + ".p";
    }

    public final java.lang.String c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.String str2 = a() + "video/";
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        if (g17 == null) {
            return "";
        }
        return str2 + g17 + ".v";
    }
}
