package sb4;

/* loaded from: classes4.dex */
public abstract class z extends android.widget.BaseAdapter implements com.tencent.mm.plugin.sns.ui.x4 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f405591d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f405592e = false;

    /* renamed from: f, reason: collision with root package name */
    public static final int f405593f = 2;

    public static /* synthetic */ java.util.HashMap a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        java.util.HashMap hashMap = f405591d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return hashMap;
    }

    public static void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addClickInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new sb4.a0(snsInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addClickInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        r45.a90 a90Var = timeLineObject.ContentObj;
        if (a90Var == null || android.text.TextUtils.isEmpty(a90Var.f369839g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        r45.a90 a90Var2 = timeLineObject.ContentObj;
        java.lang.String str = a90Var2.f369839g;
        int i17 = f405593f;
        r45.y8 y8Var = timeLineObject.AppInfo;
        ((yq1.x0) m0Var).e(str, i17, y8Var != null ? y8Var.f390846d : "", a90Var2.f369838f, a90Var2.f369836d, "timeline", 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void f(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.hh4 hh4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (android.text.TextUtils.isEmpty(timeLineObject.ContentObj.f369839g) || !timeLineObject.ContentObj.f369839g.contains(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        r45.hh4 hh4Var2 = timeLineObject.ContentObj.f369843n;
        int i17 = hh4Var2 != null ? hh4Var2.f376149d : -1;
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        java.lang.String str = timeLineObject.ContentObj.f369839g;
        int i18 = f405593f;
        ((yq1.z) a0Var).c(str, i17, i18, timeLineObject.publicUserName, timeLineObject.Id, null, null, timeLineObject.UserName, java.lang.Integer.valueOf(timeLineObject.CreateTime), java.lang.Long.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).h("__sns_timeline__")));
        if (!f405592e && i17 != -1) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(24)) {
                f405592e = true;
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(i18);
            }
        }
        if (i17 == 16 && (hh4Var = timeLineObject.ContentObj.f369843n) != null && !com.tencent.mm.sdk.platformtools.t8.K0(hh4Var.f376158p)) {
            rv.r2 r2Var = (rv.r2) i95.n0.c(rv.r2.class);
            java.lang.String str2 = timeLineObject.ContentObj.f369843n.f376158p;
            ((qv.k) r2Var).getClass();
            java.lang.String b17 = qk.c.b(str2, 4, true);
            java.lang.String b18 = tv.a.b(b17);
            if (!com.tencent.mm.vfs.w6.j(b18)) {
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342082f = b18;
                n11.a.b().d(b17, fVar.a(), null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void g(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordScan", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new sb4.c0(snsInfo, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordScan", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void h(java.util.List list, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.Map map = (java.util.Map) it.next();
                java.util.Map h17 = p52.h.f352016a.h((java.util.Map) map.get("event_params"), i17);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Pj(((java.lang.Long) map.get("event_time")).longValue(), (java.lang.String) map.get("event_id"), h17, 26236, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineVendingAdapter", "err !!!" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }
}
