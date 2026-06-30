package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.c3 f124978a = new com.tencent.mm.plugin.finder.report.c3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f124979b = jz5.h.b(com.tencent.mm.plugin.finder.report.b3.f124966d);

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.report.y2 f124980c;

    public final void a(int i17, r45.qt2 qt2Var, so2.j5 j5Var, int i18) {
        com.tencent.mm.plugin.finder.report.z2 c17 = c(i17);
        com.tencent.mars.xlog.Log.i("Finder.RefreshReporter", "tab_" + i17 + ",tab刷新文案点击（刷新次数：" + c17.f125486c + "）,playPercent=" + i18 + ',' + b(j5Var));
        if (c17.f125486c == 0) {
            c17.a(i17);
        }
        d(qt2Var, j5Var, i18, c17.f125486c, com.tencent.mm.plugin.finder.report.a3.f124944g);
        c17.f125484a = false;
        c17.f125485b = null;
        c17.a(i17);
        f124980c = null;
    }

    public final java.lang.String b(so2.j5 j5Var) {
        if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        sb6.append(pm0.v.u(baseFinderFeed.getFeedObject().getId()));
        sb6.append(" nick:");
        sb6.append(baseFinderFeed.getFeedObject().getNickName());
        return sb6.toString();
    }

    public final com.tencent.mm.plugin.finder.report.z2 c(int i17) {
        jz5.g gVar = f124979b;
        com.tencent.mm.plugin.finder.report.z2 z2Var = (com.tencent.mm.plugin.finder.report.z2) ((java.util.HashMap) ((jz5.n) gVar).getValue()).get(java.lang.Integer.valueOf(i17));
        if (z2Var != null) {
            return z2Var;
        }
        com.tencent.mm.plugin.finder.report.z2 z2Var2 = new com.tencent.mm.plugin.finder.report.z2(false, null, 0, 7, null);
        ((java.util.HashMap) ((jz5.n) gVar).getValue()).put(java.lang.Integer.valueOf(i17), z2Var2);
        return z2Var2;
    }

    public final void d(r45.qt2 qt2Var, so2.j5 j5Var, int i17, int i18, com.tencent.mm.plugin.finder.report.a3 a3Var) {
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (qt2Var != null && baseFinderFeed != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("finder_timeline_top_refresh", null, kz5.c1.k(new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("finder_context_id", qt2Var.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5))), new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("session_buffer", baseFinderFeed.g0()), new jz5.l("timeline_top_refresh_type", java.lang.Integer.valueOf(a3Var.f124946d)), new jz5.l("top_refresh_max_playpercent", java.lang.Integer.valueOf(i17)), new jz5.l("top_refresh_count", java.lang.Integer.valueOf(i18))), 1, false);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.RefreshReporter", "finder_timeline_top_refresh report fail,reporterContext=" + qt2Var + ",curFeed=" + j5Var);
        }
    }
}
