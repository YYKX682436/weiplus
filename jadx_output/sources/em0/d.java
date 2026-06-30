package em0;

/* loaded from: classes13.dex */
public abstract class d {
    public static void a(java.lang.String str, em0.c cVar) {
        if (java.lang.Math.random() > com.tencent.mm.sdk.platformtools.t8.F(j62.e.g().j("clicfg_android_kara_prophet_report", java.lang.String.valueOf(1.0E-5d), true, true), 1.0E-5d) || com.tencent.mm.sdk.platformtools.t8.F(j62.e.g().j("clicfg_android_kara_prophet_report", java.lang.String.valueOf(1.0E-5d), true, true), 1.0E-5d) < 0.0d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Kara.KaraFullLinkDataReport", "report %s", cVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25581, cVar.f254992a, java.lang.Integer.valueOf(cVar.f254993b), cVar.f254994c, cVar.f254995d, cVar.f254996e, cVar.f254997f, cVar.f254998g, cVar.f254999h, cVar.f255000i, cVar.f255001j, cVar.f255002k, cVar.f255003l, cVar.f255004m, cVar.f255005n, cVar.f255006o, cVar.f255007p, cVar.f255008q, cVar.f255009r, cVar.f255010s, 0, cVar.f255011t, "");
        em0.b.b(str, 102);
    }
}
