package l14;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f314995b = "";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f314996c = true;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f314997d = "";

    /* renamed from: a, reason: collision with root package name */
    public static final l14.b f314994a = new l14.b();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f314998e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f314999f = new java.util.LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f315000g = kz5.c1.k(new jz5.l("settings_sns_switch", 0L), new jz5.l("settings_scan_switch", 1L), new jz5.l("settings_shake_switch", 2L), new jz5.l("settings_search_switch", 3L), new jz5.l("settings_nearby_switch", 4L), new jz5.l("settings_shopping_switch", 6L), new jz5.l("settings_game_switch", 7L), new jz5.l("settings_miniprogram_switch", 8L), new jz5.l("settings_wechatout_switch", 9L), new jz5.l("settings_look_switch", 10L), new jz5.l("settings_finder_switch", 11L), new jz5.l("settings_nearby_live_friend_switch", 12L), new jz5.l("settings_ting_switch", 14L), new jz5.l("settings_ignore", 0L));

    public final long a(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
            return 13L;
        }
        java.lang.Long l17 = (java.lang.Long) f315000g.get(str);
        if (l17 != null) {
            return l17.longValue();
        }
        return 9999L;
    }

    public final void b(long j17, long j18, long j19, long j27) {
        com.tencent.mm.autogen.mmdata.rpt.FindMoreManageReportStruct findMoreManageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FindMoreManageReportStruct();
        findMoreManageReportStruct.f56438d = findMoreManageReportStruct.b("sessionid", f314995b, true);
        findMoreManageReportStruct.f56439e = j17;
        findMoreManageReportStruct.f56440f = j18;
        findMoreManageReportStruct.f56441g = j19;
        if (f314996c) {
            f314997d = kz5.n0.g0(f314998e, "#", null, null, 0, null, null, 62, null);
            f314996c = false;
        }
        findMoreManageReportStruct.f56442h = findMoreManageReportStruct.b("expose_items", f314997d, true);
        findMoreManageReportStruct.f56443i = j27;
        findMoreManageReportStruct.k();
    }

    public final void c(boolean z17, java.lang.String item, long j17, long j18) {
        kotlin.jvm.internal.o.g(item, "item");
        b(z17 ? 3L : 4L, a(item), j17, j18);
    }

    public final void d(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        long a17 = a(key);
        f314999f.add(java.lang.Long.valueOf(a(key)));
        f314998e.remove(java.lang.Long.valueOf(a17));
        f314996c = true;
    }
}
