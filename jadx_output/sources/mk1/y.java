package mk1;

/* loaded from: classes7.dex */
public final class y {
    public y(kotlin.jvm.internal.i iVar) {
    }

    public final mk1.w a(java.lang.String src, boolean z17) {
        mk1.w wVar;
        mk1.x xVar = new mk1.x(src);
        if (z17) {
            wVar = (mk1.w) xVar.invoke();
        } else {
            int i17 = nk1.d.f337949e;
            kotlin.jvm.internal.o.g(src, "src");
            android.net.Uri parse = android.net.Uri.parse(src);
            nk1.a aVar = new nk1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, af1.z.f4516a, nk1.c.f337948r.createDataSource(), null, 8, null);
            kotlin.jvm.internal.o.d(parse);
            nk1.d dVar = new nk1.d(aVar, new ze1.a(aVar, parse, null, 4, null), null);
            try {
                try {
                    boolean a17 = ye1.b.f461179a.a(dVar);
                    java.lang.String b17 = dVar.b();
                    wVar = new mk1.w(src, b17 == null ? src : b17, a17, dVar.a(), dVar.f(), dVar.c());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.VideoDataSource", e17, "create, judge isHls fail", new java.lang.Object[0]);
                    wVar = (mk1.w) xVar.invoke();
                }
                vz5.b.a(dVar, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(dVar, th6);
                    throw th7;
                }
            }
        }
        java.util.Objects.toString(wVar);
        return wVar;
    }

    public final mk1.a0 b(java.lang.String srcUrl) {
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        mk1.w a17 = a(srcUrl, false);
        return new mk1.a0(a17.f327122a, a17.f327123b, a17.f327125d, a17.f327126e, a17.f327127f, a17.f327124c);
    }
}
