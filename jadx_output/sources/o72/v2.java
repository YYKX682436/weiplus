package o72;

/* loaded from: classes12.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f343502a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f343503b = new java.util.HashMap();

    public static long a(long j17) {
        java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) f343502a).get(java.lang.Long.valueOf(j17));
        if (l17 == null) {
            return -1L;
        }
        return java.lang.System.currentTimeMillis() - l17.longValue();
    }

    public static final void b(int i17) {
        jx3.f.INSTANCE.idkeyStat(802L, i17, 1L, false);
    }

    public static final void c(int i17, int i18) {
        jx3.f.INSTANCE.idkeyStat(802L, i17, i18, false);
    }

    public static void d(long j17, int i17, int i18) {
        e(j17, i17, i18, -1, 0, -1, -1, -1);
    }

    public static void e(long j17, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        if (F != null) {
            if (i37 < 0) {
                int i38 = F.field_type;
                r45.bq0 bq0Var = F.field_favProto;
                if (i38 != 8 && i38 == 5 && bq0Var != null) {
                    r45.qp0 qp0Var = bq0Var.K;
                }
            }
            r45.jq0 jq0Var = F.field_favProto.f370962d;
            int i39 = jq0Var.f378034d;
            java.lang.String str = jq0Var.f378036f;
            int i47 = 1;
            if (i17 != 1) {
                i47 = 0;
            } else if (com.tencent.mm.storage.z3.R4(str)) {
                i47 = 2;
            }
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 40;
            z9Var.f8531d = F.field_favProto;
            favoriteOperationEvent.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10651, java.lang.Integer.valueOf(F.field_type), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(F.field_id), o72.x1.M(F), java.lang.Long.valueOf(F.field_updateTime / 1000), java.lang.Integer.valueOf(i39), str, java.lang.Integer.valueOf(i47), "", 0, favoriteOperationEvent.f54244h.f6143j, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        }
    }

    public static void f(long j17, int i17, int i18) {
        o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(j17);
        if (re6 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11122, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().c()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(re6.field_type), o72.x1.M(re6), java.lang.Long.valueOf(re6.field_updateTime), java.lang.Integer.valueOf(re6.field_favProto.f370962d.f378034d), re6.field_favProto.f370962d.f378036f);
        }
    }
}
