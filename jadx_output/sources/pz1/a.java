package pz1;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f359176a;

    /* renamed from: b, reason: collision with root package name */
    public static int f359177b;

    /* renamed from: c, reason: collision with root package name */
    public static int f359178c;

    /* renamed from: d, reason: collision with root package name */
    public static int f359179d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f359180e = new java.util.ArrayList();

    public static boolean a() {
        if (f359176a == null) {
            f359176a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_data_report_is_open_performance_report, false));
            com.tencent.mars.xlog.Log.i("Amoeba.DataReportPerformanceReport", "[isOpenPerformanceReport] mIsOpenPerformanceReport : " + f359176a);
        }
        if (sz1.a.j()) {
            f359176a = java.lang.Boolean.TRUE;
        }
        return f359176a.booleanValue();
    }

    public static void b(java.lang.String str) {
        if (a() && !u46.l.e(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("2");
            arrayList.add(str.replace(",", "`"));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.l(24504, arrayList);
        }
    }
}
