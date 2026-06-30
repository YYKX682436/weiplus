package x11;

/* loaded from: classes12.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x11.b0 f451350a = new x11.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f451351b = new java.util.LinkedHashMap();

    public final void a(com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct struct, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(struct, "struct");
        long j17 = struct.f59699p;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewInitReportRecorder", "record:" + j17);
        java.lang.String str = struct.f59700q;
        java.util.Map map = f451351b;
        x11.a0 a0Var = (x11.a0) ((java.util.LinkedHashMap) map).get(str);
        if (a0Var == null) {
            kotlin.jvm.internal.o.d(str);
            a0Var = new x11.a0(str);
            map.put(str, a0Var);
        }
        java.util.List list = a0Var.f451348a;
        x11.c0 c0Var = (x11.c0) kz5.n0.k0(list);
        long j18 = c0Var != null ? c0Var.f451354b : 0L;
        x11.c0 c0Var2 = (x11.c0) kz5.n0.Z(list);
        long j19 = c0Var2 != null ? c0Var2.f451354b : 0L;
        long longValue = l17 != null ? l17.longValue() : android.os.SystemClock.elapsedRealtime();
        long j27 = longValue - j18;
        long j28 = longValue - j19;
        ((java.util.ArrayList) list).add(new x11.c0(j17, longValue, j27, j28, c0Var, c0Var2));
        struct.f59704u = j27;
        struct.f59706w = j28;
        struct.f59703t = c0Var != null ? c0Var.f451353a : 0L;
        struct.f59705v = c0Var2 != null ? c0Var2.f451353a : 0L;
        x11.e0[] e0VarArr = x11.e0.f451357d;
        if (j17 == 0) {
            map.remove(str);
        }
    }
}
