package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.s f125337a = new com.tencent.mm.plugin.finder.report.s();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.i f125338b = new com.google.gson.i();

    public final java.util.Map a(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, int i18, r45.ey0 ey0Var, r45.en2 en2Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (en2Var == null || (str = en2Var.getString(0)) == null) {
            str = "";
        }
        linkedHashMap.put("feed_column_name", str);
        linkedHashMap.put("feed_columnid", java.lang.Integer.valueOf(ey0Var != null ? ey0Var.getInteger(0) : 0));
        linkedHashMap.put("column_exp_index", java.lang.Integer.valueOf(i18 + 1));
        linkedHashMap.put("column_card_index", java.lang.Integer.valueOf(i17 + 1));
        linkedHashMap.put("session_buffer", feed.g0());
        linkedHashMap.put("feed_id", pm0.v.u(feed.getItemId()));
        return linkedHashMap;
    }

    public final void b(android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, int i18, r45.ey0 ey0Var, r45.en2 en2Var, ey2.u uVar, android.content.Context context, int i19, int i27) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Map a17 = a(feed, i17, i18, ey0Var, en2Var);
        com.tencent.mm.plugin.finder.report.r rVar = new com.tencent.mm.plugin.finder.report.r(uVar, feed, context, i19);
        if (i27 == 8) {
            hc2.v0.d(view, "column_card", "view_clk", true, a17, null, 16, null);
        } else {
            hc2.v0.e(view, "column_card", i27, 0, false, false, a17, rVar, 28, null);
        }
    }
}
