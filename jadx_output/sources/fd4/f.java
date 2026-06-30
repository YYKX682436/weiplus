package fd4;

/* loaded from: classes4.dex */
public class f extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer f261299q;

    /* renamed from: r, reason: collision with root package name */
    public int f261300r;

    /* renamed from: s, reason: collision with root package name */
    public int f261301s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Point f261302t;

    /* renamed from: u, reason: collision with root package name */
    public s34.k f261303u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f261304v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Bitmap f261305w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f261306x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f261307y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f261308z = true;
    public long A = 0;
    public long B = 0;
    public final s84.a C = new s84.a();
    public long D = 0;
    public final s84.j E = new fd4.d(this);
    public final android.os.Handler F = new fd4.e(this, android.os.Looper.getMainLooper());

    public static /* synthetic */ s84.a s(fd4.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        s84.a aVar = fVar.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return aVar;
    }

    public static int t(fd4.f fVar) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcDragTime", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (fVar.D != 0) {
            i17 = (int) (java.lang.System.currentTimeMillis() - fVar.D);
            if (i17 > 0) {
                fVar.C.f404889a += i17;
            }
            fVar.D = 0L;
        } else {
            com.tencent.mars.xlog.Log.w("DragAdBusiness", "calcDragTime, startTime==0");
            i17 = -1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcDragTime", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return i17;
    }

    @Override // fd4.c, fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.a(i17, snsInfo, nVar, layoutParams);
        if (ca4.m0.V(this.f261304v, snsInfo)) {
            com.tencent.mars.xlog.Log.i("DragAdBusiness", "onRefresh, same ad:" + ca4.z0.y0(snsInfo) + ", hash=" + hashCode());
        } else {
            com.tencent.mars.xlog.Log.i("DragAdBusiness", "onRefresh, snsInfo changed, last=" + ca4.z0.y0(this.f261304v) + ", cur=" + ca4.z0.y0(snsInfo) + ", hash=" + hashCode());
            v();
            this.f261304v = snsInfo;
        }
        s34.k kVar = nVar.adDragInfo;
        this.f261303u = kVar;
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("DragAdBusiness", "mAdDragInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        } else {
            w();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        }
    }

    @Override // fd4.c, fd4.l
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.e();
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = this.f261299q;
        if (adDragViewContainer != null) {
            adDragViewContainer.setDragEnabled(false);
            this.f261299q.b(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.arg1 = (int) j17;
        obtain.arg2 = i17;
        android.os.Handler handler = this.F;
        handler.removeMessages(1);
        handler.sendMessageDelayed(obtain, 50L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = new com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer(activity);
        this.f261299q = adDragViewContainer;
        adDragViewContainer.setDragEventCallback(this.E);
        this.f261299q.setDragEnabled(false);
        this.f261299q.b(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.j();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f261292i;
        int i17 = this.f261289f.T.f425131a;
        s84.a aVar = this.C;
        a84.t0.a(new s84.b(snsInfo, i17, aVar));
        com.tencent.mars.xlog.Log.i("DragAdBusiness", "onAdRemoved, reportData:" + aVar);
        v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c
    public boolean n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return true;
    }

    @Override // fd4.c
    public void o(android.widget.FrameLayout frameLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.o(frameLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c
    public void p(android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.p(frameLayout, i17, i18);
        if (this.f261299q.getParent() == null) {
            frameLayout.addView(this.f261299q, m() ? new android.widget.FrameLayout.LayoutParams(-1, -1) : new android.widget.FrameLayout.LayoutParams(i17, i18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c
    public void q(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        u(this.f261289f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    public final void u(u74.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        this.f261300r = dVar.f425165z.getWidth();
        this.f261301s = dVar.f425165z.getHeight();
        int[] iArr = new int[2];
        dVar.f425163x.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        dVar.f425165z.getLocationOnScreen(iArr2);
        this.f261302t = new android.graphics.Point(iArr2[0], iArr2[1] - iArr[1]);
        com.tencent.mars.xlog.Log.i("DragAdBusiness", "calcOffset, w=" + this.f261300r + ", h=" + this.f261301s + ", offset=" + this.f261302t + ", root[0]=" + iArr[0] + ", root[1]=" + iArr[1] + ", content[0]=" + iArr2[0] + ", content[1]=" + iArr2[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        this.F.removeCallbacksAndMessages(null);
        s84.a aVar = this.C;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
        aVar.f404889a = 0;
        aVar.f404890b = 0;
        aVar.f404891c = 0;
        aVar.f404892d = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
        this.f261299q.setDragEnabled(false);
        this.f261299q.b(false);
        this.f261299q.setDragViewImg(null);
        this.f261304v = null;
        this.f261303u = null;
        this.f261305w = null;
        this.f261306x = false;
        this.f261307y = false;
        this.f261308z = true;
        this.A = 0L;
        this.D = 0L;
        this.B = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    public final void w() {
        android.graphics.Point point;
        s34.k kVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryInitData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (!this.f261306x) {
            if (this.f261300r == 0 || this.f261302t == null) {
                u(this.f261289f);
            }
            int i17 = this.f261300r;
            if (i17 <= 0 || this.f261301s <= 0 || (point = this.f261302t) == null || (kVar = this.f261303u) == null) {
                com.tencent.mars.xlog.Log.e("DragAdBusiness", "tryInitData, mContentW=" + this.f261300r + ", mOffset=" + this.f261302t);
            } else {
                this.f261306x = true;
                android.graphics.Rect a17 = s34.k.a(kVar.f402682c, i17, point);
                android.graphics.Rect a18 = s34.k.a(this.f261303u.f402684e, this.f261300r, this.f261302t);
                android.graphics.Rect a19 = s34.k.a(this.f261303u.f402683d, this.f261300r, this.f261302t);
                android.graphics.Rect a27 = s34.k.a(this.f261303u.f402685f, this.f261300r, this.f261302t);
                com.tencent.mars.xlog.Log.i("DragAdBusiness", "tryInitData succ");
                com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = this.f261299q;
                adDragViewContainer.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                com.tencent.mars.xlog.Log.i("AdDragViewContainer", "initData");
                android.graphics.Rect rect = adDragViewContainer.f163560e;
                rect.set(a17);
                adDragViewContainer.f163563h.set(a18);
                adDragViewContainer.f163561f.set(a19);
                adDragViewContainer.f163562g.set(a27);
                int i18 = rect.right - rect.left;
                int i19 = rect.bottom - rect.top;
                android.view.ViewGroup.LayoutParams layoutParams = adDragViewContainer.f163565m.getLayoutParams();
                layoutParams.width = i18;
                layoutParams.height = i19;
                adDragViewContainer.f163565m.setLayoutParams(layoutParams);
                adDragViewContainer.f163565m.setVisibility(8);
                adDragViewContainer.d();
                if (adDragViewContainer.f163573u) {
                    adDragViewContainer.invalidate();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDragBmp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        try {
            if (this.f261305w == null && java.lang.System.currentTimeMillis() - this.A >= 1000) {
                this.A = java.lang.System.currentTimeMillis();
                this.f261305w = this.f261303u.b();
            }
            if (this.f261305w != null && !this.f261307y) {
                this.f261307y = true;
                com.tencent.mars.xlog.Log.i("DragAdBusiness", "onVideoPlaying, setDragViewImg");
                this.f261299q.setDragViewImg(this.f261305w);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("DragAdBusiness", "checkSetDragBmp, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDragBmp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryInitData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }
}
