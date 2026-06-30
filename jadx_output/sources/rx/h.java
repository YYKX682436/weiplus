package rx;

@j95.b
/* loaded from: classes9.dex */
public final class h extends i95.w implements gk0.k0 {
    public gk0.j Ai() {
        return new gk0.j(kz5.c0.k(gk0.l.class, gk0.r.class, dv1.b.class, gk0.f.class, gk0.w.class, gk0.o.class));
    }

    public java.lang.String wi(gk0.k options, y01.a cdnParams) {
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(cdnParams, "cdnParams");
        java.lang.String str = options.f272431b + '_' + options.f272430a + '_' + options.f272432c + '_' + options.f272433d + '_' + cdnParams.f458572a + '_' + cdnParams.f458573b + '_' + cdnParams.f458575d + '_' + cdnParams.f458574c;
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf8");
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            kotlin.jvm.internal.o.d(g17);
            return g17;
        } catch (java.lang.Exception unused) {
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            kotlin.jvm.internal.o.f(defaultCharset, "defaultCharset(...)");
            byte[] bytes2 = str.getBytes(defaultCharset);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            java.lang.String g18 = kk.k.g(bytes2);
            kotlin.jvm.internal.o.d(g18);
            return g18;
        }
    }
}
