package df3;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final df3.m f232026d = new df3.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            ((et.a) ((com.tencent.mm.plugin.appbrand.service.a5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.a5.class))).getClass();
            java.io.InputStream a17 = com.tencent.mm.plugin.appbrand.appcache.e8.b().a("WAGameVConsole.html");
            if (a17 != null) {
                return s46.d.d(a17, java.nio.charset.StandardCharsets.UTF_8);
            }
        } catch (java.lang.Exception unused) {
            ym5.a1.f(df3.l.f232025d);
        }
        return null;
    }
}
