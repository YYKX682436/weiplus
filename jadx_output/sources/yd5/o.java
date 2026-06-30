package yd5;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final yd5.o f461126a = new yd5.o();

    public final void a(com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17, long j17) {
        if (f9Var == null || str == null) {
            return;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return;
        }
        t21.j3 d17 = t21.j3.f414800h.d(h17.g());
        com.tencent.mm.autogen.mmdata.rpt.VideoDownloadReporterStruct videoDownloadReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoDownloadReporterStruct();
        if (d17 != null) {
            videoDownloadReporterStruct.f61588g = d17.f414803a;
            videoDownloadReporterStruct.f61587f = videoDownloadReporterStruct.b("FildID", z17 ? d17.f414806d : d17.f414807e, true);
            videoDownloadReporterStruct.f61592k = z17 ? d17.f414809g : h17.f415008f;
            videoDownloadReporterStruct.f61585d = !x51.t1.b(d17.f414806d) ? 1 : 0;
        }
        boolean N4 = com.tencent.mm.storage.z3.N4(f9Var.Q0());
        videoDownloadReporterStruct.f61590i = videoDownloadReporterStruct.b("ChatName", ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true).g2(), true);
        videoDownloadReporterStruct.f61589h = N4 ? 1 : 0;
        if (N4) {
            videoDownloadReporterStruct.f61591j = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(f9Var.Q0());
        }
        videoDownloadReporterStruct.f61586e = z17 ? 1 : 0;
        videoDownloadReporterStruct.f61593l = j17;
        videoDownloadReporterStruct.k();
    }
}
