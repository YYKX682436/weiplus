package cx4;

/* loaded from: classes7.dex */
public abstract class s {

    /* renamed from: a */
    public static final jz5.g f224654a = jz5.h.b(cx4.o.f224643d);

    public static final long a(java.lang.String str, hy4.k0 k0Var, long j17) {
        long b17 = k0Var.b(str, j17) - j17;
        if (b17 > 0) {
            return b17;
        }
        return 0L;
    }

    public static final cx4.r b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return cx4.r.f224650f;
        }
        java.lang.String a17 = bm5.f1.a();
        if (!(a17 == null || a17.length() == 0)) {
            kotlin.jvm.internal.o.d(a17);
            if (r26.i0.n(a17, ":tools", false)) {
                return cx4.r.f224651g;
            }
        }
        return cx4.r.f224649e;
    }

    public static final void c(long j17, long j18, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1281L, j17, j18);
        g0Var.C(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? 1287L : 1286L : 1285L : 1284L : 1282L : 1283L, j17, j18);
    }

    public static final java.lang.String d(java.lang.String str, hy4.k0 k0Var, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(k0Var.b(str, j17) - j17);
        sb6.append(',');
        return sb6.toString();
    }

    public static final void e(int i17, int i18) {
        c(0L, i17, i18);
    }

    public static final void f(int i17, int i18) {
        c(6L, i17, i18);
    }

    public static final void g(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 0L, i17);
    }

    public static final void h(int i17, int i18) {
        c(2L, i17, i18);
    }

    public static final void i(int i17, java.lang.String url, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(",");
        sb6.append(fp.s0.b(url, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append(",");
        ((yq1.x0) ((zq1.m0) ((jz5.n) f224654a).getValue())).getClass();
        java.lang.String i18 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.i(url, false);
        if (i18 == null) {
            i18 = "";
        }
        sb6.append(i18);
        sb6.append(",");
        sb6.append(z17 ? 1 : 0);
        sb6.append(",");
        sb6.append(z18 ? 1 : 0);
        sb6.append(",");
        sb6.append(android.net.Uri.parse(url).getHost());
        sb6.append(",");
        sb6.append(z19 ? 1 : 0);
        sb6.append(",");
        sb6.append(z27 ? 1 : 0);
        sb6.append(",");
        sb6.append(z28 ? 1 : 0);
        sb6.append(",");
        sb6.append(z29 ? 1 : 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18919, sb6.toString());
    }
}
