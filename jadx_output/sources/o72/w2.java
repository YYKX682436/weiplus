package o72;

/* loaded from: classes4.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o72.w2 f343509a = new o72.w2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f343510b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f343511c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f343512d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f343513e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f343514f = new java.util.HashMap();

    public final com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct a(long j17) {
        java.util.HashMap hashMap = f343510b;
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct favAddQualityStruct = (com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct) hashMap.get(java.lang.Long.valueOf(j17));
        if (favAddQualityStruct != null) {
            return favAddQualityStruct;
        }
        com.tencent.mars.xlog.Log.e("MircoMsg.FavReportManager", "[getAddQualityReporter] struct = null, session = " + j17);
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct favAddQualityStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct();
        hashMap.put(java.lang.Long.valueOf(j17), favAddQualityStruct2);
        return favAddQualityStruct2;
    }

    public final com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct b() {
        java.lang.Long l17 = (java.lang.Long) f343513e.get(1);
        if (l17 != null) {
            return f343509a.a(l17.longValue());
        }
        return null;
    }

    public final com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct c() {
        java.lang.Long l17 = (java.lang.Long) f343513e.get(3);
        if (l17 == null) {
            return null;
        }
        long longValue = l17.longValue();
        java.util.HashMap hashMap = f343512d;
        com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct favForwardQualityStruct = (com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct) hashMap.get(java.lang.Long.valueOf(longValue));
        if (favForwardQualityStruct != null) {
            return favForwardQualityStruct;
        }
        com.tencent.mars.xlog.Log.e("MircoMsg.FavReportManager", "[getForwardQualityReporter] struct = null, session = " + longValue);
        com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct favForwardQualityStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct();
        hashMap.put(java.lang.Long.valueOf(longValue), favForwardQualityStruct2);
        return favForwardQualityStruct2;
    }

    public final long d(int i17) {
        java.lang.Long l17 = (java.lang.Long) f343513e.get(java.lang.Integer.valueOf(i17));
        if (l17 == null) {
            return -4369L;
        }
        return l17.longValue();
    }

    public final com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e() {
        java.lang.Long l17 = (java.lang.Long) f343513e.get(2);
        if (l17 == null) {
            return null;
        }
        long longValue = l17.longValue();
        java.util.HashMap hashMap = f343511c;
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct favSyncQualityStruct = (com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct) hashMap.get(java.lang.Long.valueOf(longValue));
        if (favSyncQualityStruct != null) {
            return favSyncQualityStruct;
        }
        com.tencent.mars.xlog.Log.e("MircoMsg.FavReportManager", "[getSyncQualityReporter] struct = null, session = " + longValue);
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct favSyncQualityStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct();
        hashMap.put(java.lang.Long.valueOf(longValue), favSyncQualityStruct2);
        return favSyncQualityStruct2;
    }

    public final void f(int i17, long j17) {
        f343513e.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[registerCurrentSession] type = " + i17 + ", session = " + j17);
        if (i17 == 1) {
            f343510b.put(java.lang.Long.valueOf(j17), new com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct());
            com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[registerReporter] register addQuality reporter, session = " + j17);
            return;
        }
        if (i17 == 2) {
            f343511c.put(java.lang.Long.valueOf(j17), new com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct());
            com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[registerReporter] register syncQuality reporter, session = " + j17);
            return;
        }
        if (i17 != 3) {
            com.tencent.mars.xlog.Log.e("MircoMsg.FavReportManager", "[registerReporter] error report type = " + i17);
        } else {
            f343512d.put(java.lang.Long.valueOf(j17), new com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct());
            com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[registerReporter] register forwardQuality reporter, session = " + j17);
        }
    }

    public final void g(int i17) {
        java.util.HashMap hashMap = f343513e;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17));
        if (l17 != null) {
            long longValue = l17.longValue();
            if (i17 == 1) {
                f343510b.remove(java.lang.Long.valueOf(longValue));
                com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[unRegisterReporter] remove addQuality reporter, session = " + longValue);
            } else if (i17 == 2) {
                f343511c.remove(java.lang.Long.valueOf(longValue));
                com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[unRegisterReporter] remove syncQuality reporter, session = " + longValue);
            } else if (i17 != 3) {
                com.tencent.mars.xlog.Log.e("MircoMsg.FavReportManager", "[unRegisterReporter] error report type = " + i17);
            } else {
                f343512d.remove(java.lang.Long.valueOf(longValue));
                com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[unRegisterReporter] remove forwardQuality reporter, session = " + longValue);
            }
        }
        hashMap.put(java.lang.Integer.valueOf(i17), -11L);
        com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[unRegisterCurrentSession] type = " + i17 + ", set not register");
    }
}
