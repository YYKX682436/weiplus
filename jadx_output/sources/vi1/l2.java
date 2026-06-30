package vi1;

/* loaded from: classes7.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final vi1.l2 f437401a = new vi1.l2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f437402b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f437403c = jz5.h.b(vi1.k2.f437383d);

    public final synchronized vi1.j2 a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return (vi1.j2) f437402b.get(appId);
    }

    public final synchronized void b(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.Object value = ((jz5.n) f437403c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) value).getString(appId, "");
        if (string == null) {
            string = "{}";
        }
        if (string.length() > 0) {
            f437402b.put(appId, new vi1.j2(string));
        }
    }

    public final synchronized void c(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        vi1.j2 a17 = a(appId);
        if (a17 != null) {
            java.lang.Object value = ((jz5.n) f437403c).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((com.tencent.mm.sdk.platformtools.o4) value).putString(appId, a17.toString());
        }
    }

    public final synchronized void d(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        vi1.j2 a17 = a(appId);
        if (a17 != null) {
            a17.toString();
        }
        f437402b.remove(appId);
        java.lang.Object value = ((jz5.n) f437403c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).remove(appId);
    }
}
