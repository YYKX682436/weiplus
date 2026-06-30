package fj1;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f263139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(fj1.y yVar) {
        super(0);
        this.f263139d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fj1.y yVar = this.f263139d;
        fj1.t tVar = yVar.f263152l;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("pkgReader");
            throw null;
        }
        java.io.InputStream i17 = tVar.f263138b.i("/app-config.json");
        java.lang.String d17 = i17 != null ? s46.d.d(i17, java.nio.charset.StandardCharsets.UTF_8) : null;
        boolean z17 = true;
        if (d17 == null || d17.length() == 0) {
            java.lang.String str = yVar.f263143c.f84246h;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                if (!r26.i0.o(str, "/", false, 2, null)) {
                    str = str.concat("/");
                }
                fj1.t tVar2 = yVar.f263152l;
                if (tVar2 == null) {
                    kotlin.jvm.internal.o.o("pkgReader");
                    throw null;
                }
                java.io.InputStream i18 = tVar2.f263138b.i(str + "app-config.json");
                d17 = i18 != null ? s46.d.d(i18, java.nio.charset.StandardCharsets.UTF_8) : null;
            }
        }
        java.lang.String str2 = yVar.f263146f;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = yVar.c();
        nf.y yVar2 = nf.x.f336616b;
        return k91.r.h(str2, d17, "", false, yVar2 != null ? yVar2.i(c17) : false);
    }
}
