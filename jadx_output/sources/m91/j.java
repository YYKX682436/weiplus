package m91;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final m91.j f324955a = new m91.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f324956b = new java.util.concurrent.ConcurrentSkipListSet(m91.h.f324954d);

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f324957c = {31, 34, 37};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f324958d = {32, 35, 38};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f324959e = {33, 36, 39};

    public final void a(int[] iArr) {
        int i17;
        java.util.ArrayList<com.tencent.mars.smc.IDKey> arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mars.smc.IDKey(365, iArr[0], 1));
        m91.f fVar = m91.f.f324951a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f324953c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                i17 = ((m91.c) kz5.n0.h0(keySet)).f324947h;
            } else {
                i17 = -1;
            }
        }
        if (i17 == 4) {
            arrayList.add(new com.tencent.mars.smc.IDKey(365, iArr[2], 1));
        } else if (i17 >= 0) {
            arrayList.add(new com.tencent.mars.smc.IDKey(365, iArr[1], 1));
        }
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            for (com.tencent.mars.smc.IDKey iDKey : arrayList) {
                iDKey.GetID();
                iDKey.GetKey();
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
    }

    public final void b() {
        java.util.Iterator it = f324956b.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = (com.tencent.mm.plugin.appbrand.report.quality.h1) ((m91.g) it.next());
            com.tencent.mm.autogen.mmdata.rpt.WAQualityReportStruct b17 = h1Var.b();
            b17.f62038m = 1L;
            b17.f62039n = com.tencent.mm.sdk.platformtools.x2.n() ? 2L : 1L;
            h1Var.c(b17, h1Var.a());
            com.tencent.mm.plugin.appbrand.page.i3 x07 = h1Var.f88199a.x0();
            java.lang.String currentUrl = x07 != null ? x07.getCurrentUrl() : null;
            if (currentUrl == null) {
                currentUrl = "";
            }
            b17.f62046u = b17.b("QualityIssueHappenPagePath", u46.l.t(fp.s0.a(currentUrl), 0, 1024), true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.QualityRuntimeErrorContextReporter", "report 25465 " + b17.n());
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.p(25465, b17.m(), true, true, true);
            } else {
                com.tencent.mm.plugin.appbrand.report.d dVar = com.tencent.mm.plugin.appbrand.report.d.f87824a;
                java.lang.String m17 = b17.m();
                kotlin.jvm.internal.o.f(m17, "toRptValue(...)");
                dVar.c(25465, 1, true, true, true, m17);
                com.tencent.mm.plugin.appbrand.report.d.f(true);
            }
        }
    }
}
