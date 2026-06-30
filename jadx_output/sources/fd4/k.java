package fd4;

/* loaded from: classes4.dex */
public class k extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView f261316q;

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView s(fd4.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView snsDrawGestureView = kVar.f261316q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        return snsDrawGestureView;
    }

    @Override // fd4.c, fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        super.a(i17, snsInfo, nVar, layoutParams);
        t(this.f261289f, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.storage.n nVar;
        s34.l0 l0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        u74.d dVar = this.f261289f;
        com.tencent.mm.plugin.sns.storage.n nVar2 = this.f261293m;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f261292i;
        int i18 = (int) j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        s34.l0 l0Var2 = nVar2 == null ? null : nVar2.f166072g;
        if (l0Var2 != null) {
            long j18 = l0Var2.f402699a;
            if (j18 >= 0) {
                long j19 = l0Var2.f402700b;
                if (j19 > j18) {
                    long j27 = i18;
                    if (j18 > j27 || j19 < j27) {
                        t(dVar, false);
                    } else {
                        com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView snsDrawGestureView = this.f261316q;
                        if (snsDrawGestureView != null && snsDrawGestureView.getOnGestureListener() == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
                            com.tencent.mm.sdk.platformtools.u3.h(new fd4.i(this, snsInfo, l0Var2, dVar));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        if (this.f261293m.f166072g != null && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdGestureShowSamplePoints()) == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
            com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView snsDrawGestureView2 = this.f261316q;
            if (snsDrawGestureView2 == null || (nVar = this.f261293m) == null || (l0Var = nVar.f166072g) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
            } else {
                java.util.List d17 = l44.n5.d(l0Var, snsDrawGestureView2.getWidth(), this.f261316q.getHeight());
                float e17 = l44.n5.e(this.f261293m.f166072g, this.f261316q.getHeight());
                com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView snsDrawGestureView3 = this.f261316q;
                snsDrawGestureView3.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDebugDrawPointsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
                s34.k0 k0Var = snsDrawGestureView3.f170882i;
                k0Var.f402688a = d17;
                k0Var.f402689b = e17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugDrawPointsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
                this.f261316q.setWillNotDraw(false);
                this.f261316q.invalidate();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f261316q == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) dVar.f425165z.findViewById(com.tencent.mm.R.id.ncb);
            if (viewStub != null) {
                this.f261316q = (com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView) viewStub.inflate();
            } else {
                com.tencent.mars.xlog.Log.e("GestureAdBusiness", "coverStub==null");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        super.j();
        com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.b(1, 3, this.f261292i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void onVideoPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        super.onVideoPause();
        t(this.f261289f, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    public void t(u74.d dVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        com.tencent.mm.sdk.platformtools.u3.h(new fd4.j(this, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }
}
