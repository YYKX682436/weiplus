package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.report.l0 f125109a = new com.tencent.mm.plugin.finder.report.l0();

    public static /* synthetic */ void e(com.tencent.mm.plugin.finder.report.l0 l0Var, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String str, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        l0Var.c(qt2Var, finderItem, i17, str, i18);
    }

    public static /* synthetic */ void f(com.tencent.mm.plugin.finder.report.l0 l0Var, r45.qt2 qt2Var, so2.j5 j5Var, int i17, java.lang.String str, java.util.List list, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            list = null;
        }
        java.util.List list2 = list;
        if ((i18 & 32) != 0) {
            str2 = "";
        }
        l0Var.d(qt2Var, j5Var, i17, str, list2, str2);
    }

    public static /* synthetic */ void h(com.tencent.mm.plugin.finder.report.l0 l0Var, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String str, int i18, java.util.List list, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        int i27 = i18;
        if ((i19 & 32) != 0) {
            list = null;
        }
        l0Var.g(qt2Var, finderItem, i17, str, i27, list);
    }

    public static void i(com.tencent.mm.plugin.finder.report.l0 l0Var, r45.qt2 qt2Var, so2.j5 j5Var, int i17, java.lang.String str, int i18, java.util.List list, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        int i27 = i18;
        if ((i19 & 32) != 0) {
            list = null;
        }
        java.util.List list2 = list;
        l0Var.getClass();
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            l0Var.g(qt2Var, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject(), i17, str, i27, list2);
        }
    }

    public final void a(android.content.Context context, so2.j5 feed, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), feed, i17);
    }

    public final void b(r45.qt2 contextObj, so2.j5 feed, int i17) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(feed, "feed");
        i(this, contextObj, feed, i17, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", java.lang.Integer.valueOf(i17)))), 0, null, 48, null);
    }

    public final void c(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String strValue, int i18) {
        kotlin.jvm.internal.o.g(strValue, "strValue");
        h(this, qt2Var, finderItem, i17, hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", java.lang.Integer.valueOf(i17)), new jz5.l("strValue", strValue))), i18, null, 32, null);
    }

    public final void d(r45.qt2 qt2Var, so2.j5 j5Var, int i17, java.lang.String strValue, java.util.List list, java.lang.String adExtraInfo) {
        kotlin.jvm.internal.o.g(strValue, "strValue");
        kotlin.jvm.internal.o.g(adExtraInfo, "adExtraInfo");
        i(this, qt2Var, j5Var, i17, hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", java.lang.Integer.valueOf(i17)), new jz5.l("strValue", strValue), new jz5.l("ad_extra_info", adExtraInfo))), 0, list, 16, null);
    }

    public final void g(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String feedActionValue, int i18, java.util.List list) {
        kotlin.jvm.internal.o.g(feedActionValue, "feedActionValue");
        if (finderItem == null) {
            com.tencent.mars.xlog.Log.w("FinderExtStatsReport", "feedActionType:" + i17 + " finderItem is null !");
            return;
        }
        if (qt2Var != null) {
            r45.jn0 jn0Var = new r45.jn0();
            jn0Var.set(0, java.lang.Long.valueOf(finderItem.field_id));
            jn0Var.set(12, finderItem.getDupFlag());
            jn0Var.set(1, finderItem.getUserName());
            if (list != null) {
                jn0Var.getList(9).addAll(list);
            }
            int integer = i18 == 0 ? qt2Var.getInteger(5) : i18;
            jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(finderItem.field_id, finderItem.getDupFlag(), integer));
            jn0Var.set(3, feedActionValue);
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(finderItem.getMediaList());
            jn0Var.set(4, java.lang.Integer.valueOf(mb4Var != null ? mb4Var.getInteger(3) : 0));
            jn0Var.set(5, java.lang.Integer.valueOf(finderItem.getMediaType()));
            com.tencent.mars.xlog.Log.i("FinderExtStatsReport", "sendExtStatsReportWithValue feedId:" + pm0.v.u(jn0Var.getLong(0)) + " refScene:" + integer + " commentScene:" + qt2Var.getInteger(5) + " feedActionType:" + i17 + " feedActionValue:" + feedActionValue + " videoDuration:" + jn0Var.getInteger(4) + " mediaType:" + jn0Var.getInteger(5) + " username:" + finderItem.getUserName());
            java.lang.String string = i18 != qt2Var.getInteger(5) ? jn0Var.getString(2) : null;
            if (!bq.t.f23523s.a()) {
                gm0.j1.d().g(new db2.g5(qt2Var, 18054, jn0Var, string));
                return;
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cq.j1.f((cq.k) c17, qt2Var, 18054, kz5.c0.d(jn0Var), string);
        }
    }
}
