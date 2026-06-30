package d44;

/* loaded from: classes4.dex */
public abstract class h {
    public static vd2.h5 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        if (((zy2.b6) i95.n0.c(zy2.b6.class)) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return null;
        }
        vd2.t3 t3Var = vd2.t3.f435921a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        return t3Var;
    }

    public static void b(android.content.Context context, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingRequest", "promptResult, errCode=" + i17);
        } catch (java.lang.Throwable unused) {
        }
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        if (i17 == 0) {
            db5.t7.h(context, context.getString(com.tencent.mm.R.string.j7_));
        } else if (i17 == -200045) {
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.j78));
        } else if (i17 == -200023) {
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.j77));
        } else {
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.j79));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, d44.b bVar) {
        vd2.h5 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            a17 = a();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "requestLivingNoticeState is failed: sns id = " + str);
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in requestLivingNoticeState, is there something wrong in wechat??!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        } else {
            ((vd2.t3) a17).c(str2, str3, new d44.f(str, 1, bVar), new d44.e(str, 1, bVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3, d44.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLivingState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "requestLivingState is failed: sns id = " + str);
        }
        if (a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in requestLivingState, is there something wrong in wechat??!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLivingState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        d44.f fVar = new d44.f(str, 3, bVar);
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str3);
        if (E1 != 0) {
            i95.m c17 = i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            s40.w0.u9((s40.w0) c17, E1, false, null, new vd2.p3(fVar), 0, null, null, null, 246, null);
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "is the liveId not number in requestLivingState????, liveId=" + str3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLivingState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }

    public static void e(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, java.lang.String str5, d44.b bVar) {
        com.tencent.mm.plugin.report.service.g0 g0Var;
        vd2.h5 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1837, 6);
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingRequest", "showLivingRoom, liveId=" + str2 + ", username=" + str + ", snsId=" + str5);
            a17 = a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "showLivingRoom is failed! sns id = " + str5 + ", exp=" + th6.toString());
            if (bVar != null) {
                try {
                    bVar.a(str5, 4, -1, null);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in showLivingRoom, is there something wrong in wechat??!!, snsId=" + str5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str2);
        if (E1 != 0) {
            ((vd2.t3) a17).m(context, str, E1, str3, str4, map, new d44.g(str5, 4, bVar), new d44.e(str5, 4, bVar));
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "is the liveId not number in showLivingRoom????, snsId=" + str5 + ", livingId=" + E1);
            g0Var.A(1837, 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.String str3, d44.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "subscribeLivingNotice is failed: sns id = " + str);
        }
        if (a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in subscribeLivingNotice, is there something wrong in wechat??!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        d44.g gVar = new d44.g(str, 2, bVar);
        d44.e eVar = new d44.e(str, 2, bVar);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3) && str2 != null && str3 != null) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ri(str2, str3, 1, null, 1).l().K(new vd2.s3(gVar, eVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        }
        eVar.a(-1000);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }
}
