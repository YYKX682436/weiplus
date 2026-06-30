package gd4;

/* loaded from: classes4.dex */
public final class y extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public final int f270873q;

    /* renamed from: r, reason: collision with root package name */
    public final gd4.r f270874r;

    /* renamed from: s, reason: collision with root package name */
    public w64.n f270875s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f270876t;

    public y(int i17) {
        this.f270873q = i17;
        this.f270874r = new gd4.r(i17);
    }

    @Override // fd4.c, fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.a(i17, snsInfo, nVar, layoutParams);
        u74.d dVar = this.f261289f;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return;
        }
        android.app.Activity activity = this.f261287d;
        i64.b1 b1Var = this.f261288e;
        gd4.r rVar = this.f270874r;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        rVar.f270817b = dVar;
        if (snsInfo != null) {
            rVar.f270818c = snsInfo;
        }
        if (activity != null) {
            rVar.f270819d = activity;
        }
        if (b1Var != null) {
            rVar.f270820e = b1Var;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mars.xlog.Log.i("BreakFrameAdBusiness", "onRefresh called");
        u74.d dVar2 = this.f261289f;
        android.view.View view = dVar2 != null ? dVar2.P : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f270873q == 1) {
            u74.d dVar3 = this.f261289f;
            android.view.View view3 = dVar3 != null ? dVar3.P : null;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view4 = view3;
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f261289f.f425156q;
        if (snsAdBreakFrameVideoView != null) {
            snsAdBreakFrameVideoView.setDetachedListener(new gd4.u(this));
        }
        if (((kotlinx.coroutines.flow.h3) rVar.d()).getValue() != null) {
            ((kotlinx.coroutines.flow.h3) rVar.d()).k(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerReadyToMeasureViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        if (!this.f270876t) {
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView2 = this.f261289f.f425156q;
            android.view.ViewTreeObserver viewTreeObserver = snsAdBreakFrameVideoView2 != null ? snsAdBreakFrameVideoView2.getViewTreeObserver() : null;
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new gd4.x(this, f0Var));
            }
            this.f270876t = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerReadyToMeasureViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f261287d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return;
        }
        gd4.r rVar = this.f270874r;
        if (fVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBreakFrameWrapperDelegate", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            fVar.f425172g = rVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBreakFrameWrapperDelegate", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        }
        u74.d dVar2 = this.f261289f;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f261292i;
        android.app.Activity activity2 = this.f261287d;
        i64.b1 b1Var2 = this.f261288e;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (dVar2 != null) {
            rVar.f270817b = dVar2;
        }
        if (snsInfo != null) {
            rVar.f270818c = snsInfo;
        }
        if (activity2 != null) {
            rVar.f270819d = activity2;
        }
        if (b1Var2 != null) {
            rVar.f270820e = b1Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (dVar.f425156q == null) {
            android.view.View inflate = ((android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.n1v)).inflate();
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            dVar.f425156q = (com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView) inflate;
        } else {
            com.tencent.mars.xlog.Log.e("BreakFrameAdBusiness", "buildContent many times");
        }
        if (dVar.P == null) {
            dVar.P = ((android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.n49)).inflate();
        } else {
            com.tencent.mars.xlog.Log.e("BreakFrameAdBusiness", "buildContent many times");
        }
        this.f270875s = new w64.n(this.f261287d, u(), this.f261288e, null, new gd4.s(this));
        gd4.t tVar = new gd4.t(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        rVar.f270822g = tVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mm.plugin.sns.ui.listener.i iVar2 = this.f261291h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimelineClickListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        rVar.f270823h = iVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimelineClickListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = dVar.f425156q;
        if (snsAdBreakFrameVideoView != null) {
            snsAdBreakFrameVideoView.setOnProgressListener(rVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.j();
        gd4.r rVar = this.f270874r;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        gd4.b bVar = rVar.f270832q;
        if (bVar != null) {
            bVar.k(rVar.f270818c);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    public final gd4.r s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getController", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getController", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return this.f270874r;
    }

    public final android.view.View t() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        if (this.f270873q == 1) {
            u74.d dVar = this.f261289f;
            r4 = dVar != null ? dVar.H : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return r4;
        }
        u74.d dVar2 = this.f261289f;
        if (dVar2 != null && (view = dVar2.f425163x) != null) {
            r4 = view.findViewById(com.tencent.mm.R.id.f482894r2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return r4;
    }

    public final int u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        i64.b1 b1Var = this.f261288e;
        int i17 = b1Var != null ? b1Var != null ? b1Var.f289095j : 0 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return i17;
    }
}
