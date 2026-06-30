package fd4;

/* loaded from: classes4.dex */
public class o extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView f261319q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f261320r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.td f261321s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.b1 f261322t = new fd4.n(this);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r11.f166159b <= r5) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    @Override // fd4.c, fd4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, com.tencent.mm.plugin.sns.storage.SnsInfo r10, com.tencent.mm.plugin.sns.storage.n r11, android.view.ViewGroup.LayoutParams r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd4.o.a(int, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.n, android.view.ViewGroup$LayoutParams):void");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        com.tencent.mm.plugin.sns.ui.td tdVar = this.f261321s;
        tdVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        if (tdVar.f170514h) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.od(tdVar, j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f261319q == null) {
            this.f261319q = (com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView) ((android.view.ViewStub) dVar.f425165z.findViewById(com.tencent.mm.R.id.n5s)).inflate();
        } else {
            com.tencent.mars.xlog.Log.e("LongPressAdBusiness", "buildContent many times");
        }
        if (this.f261320r == null) {
            android.view.View inflate = ((android.view.ViewStub) dVar.f425165z.findViewById(com.tencent.mm.R.id.f482657kf)).inflate();
            this.f261320r = (android.view.ViewGroup) inflate;
        } else {
            com.tencent.mars.xlog.Log.e("LongPressAdBusiness", "buildContent many times2");
        }
        this.f261319q.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.td tdVar = new com.tencent.mm.plugin.sns.ui.td(this.f261287d, this.f261319q, dVar.f425154o, this.f261294n == 0 ? 1 : 2, this.f261320r);
        this.f261321s = tdVar;
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var2 = this.f261322t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnActionListener", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        tdVar.f170520n = b1Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnActionListener", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.j();
        com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.b(2, 3, this.f261292i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void onVideoPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.onVideoPause();
        this.f261321s.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }
}
