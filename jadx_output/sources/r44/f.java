package r44;

/* loaded from: classes4.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.sns.ui.y4 {

    /* renamed from: i */
    public static java.lang.ref.WeakReference f369558i = null;

    /* renamed from: m */
    public static boolean f369559m = true;

    /* renamed from: n */
    public static boolean f369560n = true;

    /* renamed from: o */
    public static boolean f369561o;

    /* renamed from: d */
    public final java.lang.String f369562d;

    /* renamed from: e */
    public boolean f369563e;

    /* renamed from: f */
    public boolean f369564f;

    /* renamed from: g */
    public final t44.o f369565g;

    /* renamed from: h */
    public a94.l f369566h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f369562d = "SnsAdBizUIC";
        t44.o oVar = new t44.o(activity);
        s44.d dVar = new s44.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachLayoutBuilder", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
        oVar.f415522c = dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachLayoutBuilder", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
        this.f369565g = oVar;
    }

    public static final /* synthetic */ boolean O6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSIsEnablePullSession$cp", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z17 = f369559m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSIsEnablePullSession$cp", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        return z17;
    }

    public static final /* synthetic */ java.lang.String P6(r44.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        java.lang.String str = fVar.f369562d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        return str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    public final boolean Q6(a94.l reqController, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        kotlin.jvm.internal.o.g(reqController, "reqController");
        a94.l lVar = this.f369566h;
        java.lang.String str = this.f369562d;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.i(str, "no other shakable ad");
            this.f369566h = reqController;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        if (kotlin.jvm.internal.o.b(lVar, reqController)) {
            com.tencent.mars.xlog.Log.i(str, "same shakable ad");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        a94.l lVar2 = this.f369566h;
        boolean f18 = lVar2 != null ? lVar2.f() : false;
        if (f18 && !reqController.f()) {
            com.tencent.mars.xlog.Log.i(str, "other is highPriorityAd");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return false;
        }
        if (!f18 && reqController.f()) {
            com.tencent.mars.xlog.Log.i(str, "other is lowPriorityAd");
            a94.l lVar3 = this.f369566h;
            if (lVar3 != null) {
                lVar3.b();
            }
            this.f369566h = reqController;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        a94.l lVar4 = this.f369566h;
        float h17 = lVar4 != null ? lVar4.h() : -1.0f;
        a94.l lVar5 = this.f369566h;
        int position = lVar5 != null ? lVar5.getPosition() : Integer.MAX_VALUE;
        reqController.getPosition();
        java.lang.Float.compare(h17, f17);
        if (h17 > f17) {
            com.tencent.mars.xlog.Log.i(str, "smaller ratio than other");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return false;
        }
        if (java.lang.Float.compare(h17, f17) != 0) {
            a94.l lVar6 = this.f369566h;
            if (lVar6 != null) {
                lVar6.b();
            }
            this.f369566h = reqController;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        if (reqController.getPosition() >= position) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return false;
        }
        a94.l lVar7 = this.f369566h;
        if (lVar7 != null) {
            lVar7.b();
        }
        this.f369566h = reqController;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        return true;
    }

    public final void R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observeUIRefresh", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z17 = f369559m;
        java.lang.String str = this.f369562d;
        if (!z17) {
            com.tencent.mars.xlog.Log.w(str, "observeUIRefresh, isEnableSession=false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeUIRefresh", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mars.xlog.Log.i(str, "observeUIRefresh");
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new r44.d(this, (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) a17, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeUIRefresh", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i(this.f369562d, "onConfigurationChanged, hash=" + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        com.tencent.mars.xlog.Log.i(this.f369562d, "onCreate");
        try {
            R6();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_observeUIRefresh", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateBefore", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        super.onCreateBefore(bundle);
        this.f369564f = getContext() instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableAdPullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z18 = this.f369564f;
        java.lang.String str = this.f369562d;
        boolean z19 = true;
        if (z18) {
            int u07 = ca4.m0.u0(e42.c0.clicfg_ad_enable_pull_session_record, 1);
            com.tencent.mars.xlog.Log.i(str, "isEnableAdPullSession=" + u07);
            z17 = u07 > 0;
            if (!z17) {
                jx3.f.INSTANCE.t(2097, 8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableAdPullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        } else {
            com.tencent.mars.xlog.Log.w(str, "isEnableAdPullSession=false, old timeline");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableAdPullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            z17 = false;
        }
        f369559m = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableDeleteConsecutiveAdAfterLoadPage", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        int u08 = ca4.m0.u0(e42.c0.clicfg_ad_enable_delete_ad_after_load_page, 1);
        com.tencent.mars.xlog.Log.i(this.f369562d, "isEnableDeleteConsecutiveAdAfterLoadPage=" + u08);
        if (!(u08 > 0)) {
            jx3.f.INSTANCE.t(2097, 37);
        }
        boolean z27 = u08 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableDeleteConsecutiveAdAfterLoadPage", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        f369560n = z27;
        this.f369563e = false;
        com.tencent.mars.xlog.Log.i(this.f369562d, "onCreateBefore, isNewTimeLineUI=" + this.f369564f + ", isEnableSession=" + f369559m + ", hash=" + hashCode() + ", context=" + getContext().hashCode());
        try {
            java.lang.ref.WeakReference weakReference = f369558i;
            android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
            if (context != null) {
                ca4.n0.b(2097, 11);
                java.lang.String str2 = this.f369562d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateBefore, context maybe leaked, new=");
                android.app.Activity context2 = getContext();
                sb6.append(context2 != null ? java.lang.Integer.valueOf(context2.hashCode()) : null);
                sb6.append(", old=");
                sb6.append(java.lang.Integer.valueOf(context.hashCode()));
                com.tencent.mars.xlog.Log.e(str2, sb6.toString());
            }
            if (f369559m) {
                f369558i = getContext() != null ? new java.lang.ref.WeakReference(getContext()) : null;
                r34.e.f368998a.d();
            } else {
                f369558i = null;
            }
            if (this.f369564f) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 60);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadWhenIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                android.os.Looper.myQueue().addIdleHandler(new r44.b(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWhenIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 61);
            }
            if (this.f369564f) {
                z19 = false;
            }
            synchronized (l44.h3.class) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                l44.h3.f316165a = z19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            }
            android.app.Activity context3 = getContext();
            if (context3 != null) {
                l44.i.b(context3);
            }
            p94.g0 g0Var = (p94.g0) i95.n0.c(p94.g0.class);
            if (g0Var != null) {
                com.tencent.mars.xlog.Log.i(this.f369562d, "init snsAdService, hash=" + g0Var.hashCode());
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdBizUIC_onCreateBefore", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateBefore", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        com.tencent.mars.xlog.Log.i(this.f369562d, "onDestroy, hash=" + hashCode());
        f369558i = null;
        this.f369563e = true;
        this.f369566h = null;
        if (!this.f369564f) {
            t44.o oVar = this.f369565g;
            oVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
            com.tencent.mars.xlog.Log.i("BaseAdLayoutCachePool", "clear");
            java.util.LinkedList linkedList = (java.util.LinkedList) oVar.f415521b;
            if (linkedList.size() != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA, 6);
            }
            linkedList.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        if (f369561o) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        } else {
            f369561o = true;
            if (java.lang.System.currentTimeMillis() % 10 != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            } else {
                ((ku5.t0) ku5.t0.f312615d).q(new r44.e(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            }
        }
        l44.i iVar = l44.i.f316168a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        com.tencent.mars.xlog.Log.i("AdClickCoordinateHelper", "clear");
        l44.i.f316171d.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        n74.u0 u0Var = n74.u0.f335437a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearPreRenderCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        try {
            synchronized (n74.u0.f335439c) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearPreRenderCache, mPreRenderCache is ");
                    n74.s0 s0Var = n74.u0.f335438b;
                    sb6.append(s0Var != null ? s0Var.toString() : null);
                    com.tencent.mars.xlog.Log.i("AdWeappPreRenderHelper", sb6.toString());
                    n74.u0.f335438b = null;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPreRenderCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
                    throw th6;
                }
            }
        } catch (java.lang.Throwable th7) {
            ca4.q.c("AdWeappPreRenderHelper", th7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPreRenderCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        java.util.Set set = a84.q0.f2349a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearAdChainExposure", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
        a84.q0.f2349a.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearAdChainExposure", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f369562d, "onStop, hash=" + hashCode());
        if (f369559m) {
            r34.e.f368998a.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }
}
