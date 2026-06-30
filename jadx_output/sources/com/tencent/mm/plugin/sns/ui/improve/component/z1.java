package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class z1 extends com.tencent.mm.plugin.sns.ui.improve.component.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.SnsObject e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        com.tencent.mm.memory.ui.QPictureView.G = false;
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        o04.g gVar = new o04.g(1);
        ((md0.e) eVar).getClass();
        t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
        if (aVar != null) {
            aVar.S6(gVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        android.content.Intent intent = getIntent();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUpBrowseHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.plugin.sns.ui.kw.B = new com.tencent.mm.plugin.sns.model.l7(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUpBrowseHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        android.app.Activity context2 = getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        kotlin.jvm.internal.o.g(context2, "context");
        sc4.a.f406555a = new com.tencent.mm.plugin.sns.ui.tm(context2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        com.tencent.mm.plugin.sns.model.i7 Pj = com.tencent.mm.plugin.sns.model.l4.Pj();
        Pj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsTimelinePage", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        Pj.f164316i = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "set isInSnsTimeline:%b", java.lang.Boolean.TRUE);
        if ((Pj.f164316i && !ma4.a.a()) || Pj.f164315h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.b7(Pj));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        t21.c2 Ni = t21.o2.Ni();
        boolean z18 = Pj.f164316i;
        Ni.f414725f = z18;
        if (z18) {
            Ni.g();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsTimelinePage", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.plugin.sns.model.k6 Jj = com.tencent.mm.plugin.sns.model.l4.Jj();
        Jj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "create");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.model.k6.f164359i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_retry_edit_expired_time, 300) * 1000;
        com.tencent.mm.plugin.sns.model.k6.f164360j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_retry_edit_enable, 1) == 1;
        com.tencent.mm.plugin.sns.model.k6.f164361k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_retry_edit_interval, 60);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "updateConfig configEnable:%s, configInterval:%s, configExpiredTime:%s", java.lang.Boolean.valueOf(com.tencent.mm.plugin.sns.model.k6.f164360j), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.k6.f164361k), java.lang.Long.valueOf(com.tencent.mm.plugin.sns.model.k6.f164359i));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        long j17 = Jj.f164362a;
        if (j17 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            long j18 = com.tencent.mm.plugin.sns.model.k6.f164359i;
            java.lang.Runnable runnable = Jj.f164366e;
            if (currentTimeMillis >= j18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "already expired, reset directly");
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
            } else {
                long currentTimeMillis2 = j18 - (java.lang.System.currentTimeMillis() - Jj.f164362a);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "delay %s to reset", java.lang.Long.valueOf(currentTimeMillis2));
                com.tencent.mm.sdk.platformtools.u3.i(runnable, currentTimeMillis2);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = Jj.f164364c;
            if (snsInfo != null && (e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo)) != null) {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct C = s0Var.C();
                C.f61297h = C.b("Sessionid", Jj.f164365d, true);
                com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct C2 = s0Var.C();
                C2.f61294e = C2.b("PublishId", ca4.z0.s0(Jj.f164364c.field_snsId), true);
                s0Var.C().f61295f = e17.LikeCount;
                s0Var.C().f61296g = e17.CommentCount;
                com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct C3 = s0Var.C();
                C3.f61298i = C3.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
                com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct t17 = s0Var.t();
                t17.f61297h = t17.b("Sessionid", Jj.f164365d, true);
                com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct t18 = s0Var.t();
                t18.f61294e = t18.b("PublishId", ca4.z0.s0(Jj.f164364c.field_snsId), true);
                s0Var.t().f61295f = e17.LikeCount;
                s0Var.t().f61296g = e17.CommentCount;
                com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct t19 = s0Var.t();
                t19.f61298i = t19.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        xd4.o0 d17 = xd4.o0.d();
        d17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUICreate", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        d17.f453689c++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUICreate", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        java.util.HashMap hashMap = ad4.l.f3188a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_download_cancel_enable, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "onCreate");
            android.os.HandlerThread handlerThread = ad4.l.f3190c;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("Sns-ImageCheck", 5);
            ad4.l.f3190c = a17;
            a17.start();
            ad4.l.f3191d = t26.e.b(new android.os.Handler(a17.getLooper()), null, 1, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null) {
            ((yq1.z) a0Var).f464500e.put("__sns_timeline__", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        ka4.o oVar = ka4.o.f306149a;
        if (oVar.a() && oVar.c() == 1) {
            ka4.m mVar = ka4.m.f306136a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.f306145j = true;
            ((ku5.t0) ku5.t0.f312615d).h(ka4.l.f306135d, "THREAD_SNS_KARA_OPTION");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("syncWithConfig", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        j75.f Ni2 = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni2 != null) {
            Ni2.B3(new sa0.m(1009));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("syncWithConfig", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.m7 m7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsOptionUIC", "onDestroy");
        xd4.o0.d().h(getActivity());
        xd4.g a17 = xd4.g.a();
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayViewManager", "onUIDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        java.util.HashSet hashSet = (java.util.HashSet) a17.f453641a;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((xd4.d) it.next()).stop();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        hashSet.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        ((c50.b1) i95.n0.c(c50.b1.class)).getClass();
        mm0.c.f328575b.a();
        ad4.y yVar = ad4.y.f3210a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCacheFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.TextUtil", "clearCacheFoldCommentContent: ");
        yVar.c().clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCacheFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        sc4.a.f406555a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        ad4.w.f3206d = null;
        android.view.animation.TranslateAnimation translateAnimation = ad4.w.f3204b;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        ad4.w.f3204b = null;
        android.view.animation.TranslateAnimation translateAnimation2 = ad4.w.f3205c;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        ad4.w.f3205c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        nd4.e eVar = nd4.e.f336476a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        nd4.e.f336477b.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        if (!kotlin.jvm.internal.o.b(pc4.a.f353407a, null) && (m7Var = pc4.a.f353407a) != null) {
            m7Var.c();
        }
        pc4.a.f353407a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        com.tencent.mm.plugin.sns.ui.kw.B = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        ik4.l lVar = ik4.l.f291941a;
        ik4.l.f291944d.clear();
        ik4.l.f291943c.clear();
        java.util.HashSet hashSet2 = ik4.l.f291942b;
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            ik4.l.f291941a.c((ik4.g) it6.next(), false);
        }
        hashSet2.clear();
        dd4.u uVar = dd4.y.f229071f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseAllCache", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion");
        java.util.Iterator it7 = dd4.y.a().entrySet().iterator();
        while (it7.hasNext()) {
            ((xd4.b) ((java.util.Map.Entry) it7.next()).getValue()).a().p();
        }
        dd4.y.a().clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseAllCache", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion");
        dd4.r rVar = dd4.s.f229045k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        dd4.s.d().clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        com.tencent.mm.plugin.sns.ui.p5.a();
        java.util.HashMap hashMap = ad4.l.f3188a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        t26.d dVar = ad4.l.f3191d;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "onDestroy");
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, dVar, null, new ad4.i(null), 2, null);
            ad4.l.f3191d = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        }
        com.tencent.mm.memory.ui.QPictureView.G = true;
        ok4.f fVar = ok4.f.f345994a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPredictDataReport", "clear");
        ok4.f.f345995b.clear();
        ka4.o oVar = ka4.o.f306149a;
        if (oVar.a() && oVar.c() == 1) {
            ka4.m mVar = ka4.m.f306136a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "stopKaraPredict");
            ka4.m.f306145j = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        }
        java.util.HashMap hashMap2 = sb4.z.f405591d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportBigPicClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new sb4.d0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBigPicClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.Improve.SnsOptionUIC");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.sns.ui.improve.component.y1 y1Var = com.tencent.mm.plugin.sns.ui.improve.component.y1.f169060d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(y1Var, 1800000L, "MicroMsg.Improve.SnsOptionUIC");
        com.tencent.mm.plugin.sns.ui.widget.x1 x1Var = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearExpiredItem", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.sns.ui.widget.t1.f171273d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearExpiredItem", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.widget.q2 q2Var = com.tencent.mm.plugin.sns.ui.widget.q2.f171251d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.tencent.mm.plugin.sns.ui.widget.q2.f171252e.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerClean", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_post_media_clean_enable, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostMediaCleanManager", "triggerClean enable:" + fj6);
        if (fj6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostMediaCleanManager", "triggerClean start");
            ((ku5.t0) ku5.t0.f312615d).g(s94.c.f405008d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerClean", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerClean", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.onPause();
        xd4.o0.d().i();
        xd4.g.a().b();
        ta4.u0 u0Var = ta4.u0.f416838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        pm0.v.O("MicroMsg.Image.SnsImageLoadReporter", ta4.l0.f416799d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.onResume();
        ta4.u0 u0Var = ta4.u0.f416838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        pm0.v.O("SnsImageLoadReporter", ta4.t0.f416835d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.tencent.mm.plugin.sns.model.l4.hj().m0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }
}
