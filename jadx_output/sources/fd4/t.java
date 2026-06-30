package fd4;

/* loaded from: classes4.dex */
public class t extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView f261336q;

    /* renamed from: r, reason: collision with root package name */
    public final e94.v f261337r = new fd4.s(this);

    @Override // fd4.c, fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.a(i17, snsInfo, nVar, layoutParams);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f261292i;
        if (snsInfo2 != null && (twistCoverView = this.f261336q) != null) {
            int i18 = this.f261289f.T.f425131a == 0 ? 1 : 2;
            com.tencent.mm.plugin.sns.storage.r rVar = snsInfo2.getAdXml().adTwistInfo;
            twistCoverView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            twistCoverView.f163921i = rVar;
            twistCoverView.f163920h = snsInfo2;
            twistCoverView.f163928s = i18;
            if (twistCoverView.f163921i != null && snsInfo2 != null) {
                com.tencent.mars.xlog.Log.i("TwistCoverView", "initData, id=" + ca4.z0.t0(snsInfo2.field_snsId) + ", twistInfo=" + twistCoverView.f163921i + ", scene=" + i18);
                twistCoverView.getContext();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSensor", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (twistCoverView.f163922m == null) {
                    q44.g gVar = new q44.g();
                    twistCoverView.f163922m = gVar;
                    q44.a aVar = twistCoverView.A;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    q44.b bVar = gVar.f360119a;
                    if (bVar != null) {
                        bVar.a(aVar);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    q44.g gVar2 = twistCoverView.f163922m;
                    gVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSensorSupported", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    boolean z17 = gVar2.f360119a != null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorSupported", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    twistCoverView.f163933x = z17;
                    com.tencent.mars.xlog.Log.i("TwistCoverView", "initSensor, isSensorOk=" + twistCoverView.f163933x);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSensor", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            this.f261289f.f425154o.f168417g.setTimerInterval(300);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.d();
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = this.f261336q;
        if (twistCoverView != null) {
            twistCoverView.setSensorEnabled(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        if (this.f261288e == null || this.f261292i == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = this.f261336q;
        if (twistCoverView != null) {
            twistCoverView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.arg1 = (int) j17;
            android.os.Handler handler = twistCoverView.f163934y;
            handler.removeMessages(1);
            handler.sendMessageDelayed(obtain, 50L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f261336q == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) dVar.f425165z.findViewById(com.tencent.mm.R.id.nca);
            if (viewStub != null) {
                this.f261336q = (com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView) viewStub.inflate();
            } else {
                com.tencent.mars.xlog.Log.e("TwistAdBusiness", "coverStub==null");
            }
        }
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = this.f261336q;
        if (twistCoverView != null) {
            twistCoverView.setTwistActionListener(this.f261337r);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void onVideoPause() {
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.onVideoPause();
        if (this.f261292i != null && (twistCoverView = this.f261336q) != null) {
            twistCoverView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayerPaused", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            if (twistCoverView.f163921i == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayerPaused", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            } else {
                com.tencent.mars.xlog.Log.i("TwistCoverView", "onPlayerPaused");
                twistCoverView.f163926q = true;
                twistCoverView.setSensorEnabled(false);
                twistCoverView.f();
                twistCoverView.f163934y.removeMessages(1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayerPaused", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }
}
