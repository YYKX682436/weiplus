package pk1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str) {
        super(0);
        this.f355456d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean m17;
        java.lang.String src = this.f355456d;
        kotlin.jvm.internal.o.g(src, "src");
        int i17 = nk1.d.f337949e;
        android.net.Uri parse = android.net.Uri.parse(src);
        nk1.a aVar = new nk1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, af1.z.f4516a, nk1.c.f337948r.createDataSource(), null, 8, null);
        kotlin.jvm.internal.o.d(parse);
        nk1.d dVar = new nk1.d(aVar, new ze1.a(aVar, parse, null, 4, null), null);
        try {
            try {
                m17 = ye1.b.f461179a.a(dVar);
                java.lang.String b17 = dVar.b();
                if (b17 == null) {
                    b17 = src;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbContainerFormatInferer", "isHls, src: " + src + ", finalUrl: " + b17);
                src = b17;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ThumbContainerFormatInferer", e17, "judge isHls fail", new java.lang.Object[0]);
                m17 = ve1.g.m(src);
            }
            vz5.b.a(dVar, null);
            return new pk1.g(m17, src);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(dVar, th6);
                throw th7;
            }
        }
    }
}
