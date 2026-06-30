package q74;

/* loaded from: classes4.dex */
public final class d0 implements com.tencent.mm.plugin.sns.ui.b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360440a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.AdFrameLayout f360441b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f360442c;

    /* renamed from: d, reason: collision with root package name */
    public final q74.s0 f360443d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(android.content.Context mContext, int i17, android.view.ViewGroup recycleViewContainer, android.view.View itemRootView, i64.b1 b1Var, w64.n nVar, com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView, z84.h hVar) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(recycleViewContainer, "recycleViewContainer");
        kotlin.jvm.internal.o.g(itemRootView, "itemRootView");
        q74.s0 s0Var = new q74.s0(mContext, i17, recycleViewContainer, itemRootView, nVar, adSlideRecyclerView, hVar);
        this.f360443d = s0Var;
        android.view.ViewStub viewStub = (android.view.ViewStub) itemRootView.findViewById(com.tencent.mm.R.id.rb7);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        this.f360442c = inflate instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) inflate : null;
        android.view.ViewStub viewStub2 = (android.view.ViewStub) itemRootView.findViewById(com.tencent.mm.R.id.f486989rb5);
        android.view.KeyEvent.Callback inflate2 = viewStub2 != null ? viewStub2.inflate() : null;
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = inflate2 instanceof com.tencent.mm.plugin.sns.ui.AdFrameLayout ? (com.tencent.mm.plugin.sns.ui.AdFrameLayout) inflate2 : null;
        this.f360441b = adFrameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        if (adFrameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        } else {
            s0Var.f360499h = adFrameLayout;
            s0Var.f360500i = (android.widget.FrameLayout) adFrameLayout.findViewById(com.tencent.mm.R.id.rbv);
            s0Var.f360501j = (android.widget.FrameLayout) adFrameLayout.findViewById(com.tencent.mm.R.id.raf);
            s0Var.f360502k = (android.widget.ImageView) adFrameLayout.findViewById(com.tencent.mm.R.id.rag);
            s0Var.f360517z = new q74.t(s0Var.f360492a, s0Var.f360493b, (android.view.ViewGroup) adFrameLayout.findViewById(com.tencent.mm.R.id.f486957rb4), s0Var.f360496e, s0Var.f360497f, s0Var.f360498g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listenDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        try {
            if (mContext instanceof androidx.lifecycle.y) {
                ((androidx.lifecycle.y) mContext).mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic$listenDestroy$1$1
                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onDestroy(androidx.lifecycle.y owner) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic$listenDestroy$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "onDestroy");
                        q74.d0.this.c();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic$listenDestroy$1$1");
                    }
                });
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameLogic_listenDestroy", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listenDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        if (!s34.z0.f402836c.a(snsInfo)) {
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "bindData, snsInfo is not slideItemProduct type");
            c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        boolean V = ca4.m0.V(snsInfo, this.f360440a);
        s34.z0 z0Var = null;
        q74.s0 s0Var = this.f360443d;
        if (V) {
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            kotlinx.coroutines.y0 y0Var = s0Var.f360511t;
            if (y0Var != null) {
                kotlinx.coroutines.z0.c(y0Var, null);
            }
            s0Var.f360511t = kotlinx.coroutines.z0.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            d();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindData, same snsInfo");
            sb6.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        this.f360440a = snsInfo;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        kotlinx.coroutines.y0 y0Var2 = s0Var.f360511t;
        if (y0Var2 != null) {
            kotlinx.coroutines.z0.c(y0Var2, null);
        }
        s0Var.f360511t = kotlinx.coroutines.z0.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.f360504m = snsInfo;
        if (snsInfo != null && (adXml = snsInfo.getAdXml()) != null && (a1Var = adXml.adSliderFullCardInfo) != null) {
            z0Var = a1Var.f402569f;
        }
        s0Var.f360505n = z0Var;
        s0Var.f360503l = false;
        q74.t tVar = s0Var.f360517z;
        if (tVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            tVar.f360534p = snsInfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        d();
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = this.f360441b;
        if (adFrameLayout != null) {
            adFrameLayout.setNotifyConfigurationChangedCallback(this);
        }
        s0Var.h();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindData, snsInfo is not same, snsId is ");
        sb7.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", sb7.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        if (!s34.z0.f402836c.a(this.f360440a)) {
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "notifyBindCurrentProductViewData, is not slideItemProduct type");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360440a;
        s34.a1 a1Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adSliderFullCardInfo;
        if (a1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        int i18 = i17 % a1Var.f402564a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        q74.s0 s0Var = this.f360443d;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        kotlinx.coroutines.y0 y0Var = s0Var.f360511t;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new q74.o0(s0Var, i18, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        try {
            android.widget.FrameLayout frameLayout = this.f360442c;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = this.f360441b;
            if (adFrameLayout != null) {
                adFrameLayout.setVisibility(8);
            }
            this.f360443d.n();
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "reset");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameLogic_reset", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.d0.d():void");
    }
}
