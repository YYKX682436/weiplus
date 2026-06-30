package v74;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: v, reason: collision with root package name */
    public static final v74.l0 f433890v = new v74.l0(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f433891a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433892b;

    /* renamed from: c, reason: collision with root package name */
    public v74.m f433893c;

    /* renamed from: d, reason: collision with root package name */
    public s34.s f433894d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAnimContainer f433895e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f433896f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f433897g;

    /* renamed from: h, reason: collision with root package name */
    public int f433898h;

    /* renamed from: i, reason: collision with root package name */
    public int f433899i;

    /* renamed from: j, reason: collision with root package name */
    public int f433900j;

    /* renamed from: k, reason: collision with root package name */
    public double f433901k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f433902l;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f433903m;

    /* renamed from: n, reason: collision with root package name */
    public int f433904n;

    /* renamed from: o, reason: collision with root package name */
    public long f433905o;

    /* renamed from: p, reason: collision with root package name */
    public int f433906p;

    /* renamed from: q, reason: collision with root package name */
    public int f433907q;

    /* renamed from: r, reason: collision with root package name */
    public final v74.o0 f433908r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f433909s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f433910t;

    /* renamed from: u, reason: collision with root package name */
    public final int f433911u;

    public s0(android.content.Context mContext, int i17) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f433891a = mContext;
        this.f433892b = "";
        this.f433902l = true;
        this.f433903m = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f433906p = Integer.MAX_VALUE;
        this.f433908r = new v74.o0(this);
        this.f433911u = 150;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "clearAll");
        this.f433903m.removeCallbacksAndMessages(null);
        b();
        e();
        this.f433892b = "";
        this.f433893c = null;
        this.f433894d = null;
        this.f433898h = 0;
        this.f433899i = 0;
        this.f433900j = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearAll", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearPagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "clearPagView");
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f433896f;
            if (mMPAGView != null) {
                mMPAGView.n();
            }
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f433897g;
            if (mMPAGView2 != null) {
                mMPAGView2.n();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdLookbookPagAnimLogic", th6);
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAnimContainer adLookbookAnimContainer = this.f433895e;
        if (adLookbookAnimContainer != null) {
            adLookbookAnimContainer.removeAllViews();
        }
        this.f433896f = null;
        this.f433897g = null;
        android.animation.ValueAnimator valueAnimator = this.f433909s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f433910t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f433902l = true;
        this.f433901k = 0.0d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        int i17 = this.f433906p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        return i17;
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        this.f433903m.removeCallbacksAndMessages(null);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f433896f;
        if (mMPAGView != null) {
            mMPAGView.getAlpha();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideThemePagView$default", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f433896f;
            if (mMPAGView2 != null) {
                android.animation.ValueAnimator valueAnimator = this.f433909s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ValueAnimator valueAnimator2 = this.f433910t;
                boolean isRunning = valueAnimator2 != null ? valueAnimator2.isRunning() : false;
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "hideThemePagView, isAnimRun=" + isRunning + ", curAlpha=" + mMPAGView2.getAlpha());
                if (mMPAGView2.getAlpha() > 0.0f && !isRunning) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(mMPAGView2.getAlpha(), 0.0f);
                    ofFloat.setDuration(mMPAGView2.getAlpha() * this.f433911u);
                    ofFloat.addUpdateListener(new v74.n0(this));
                    com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "do hideThemePagView, duration=" + ofFloat.getDuration());
                    ofFloat.start();
                    this.f433910t = ofFloat;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideThemePagView$default", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            if (mMPAGView.f()) {
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "doPause themePag, progress=" + this.f433901k);
                mMPAGView.n();
                com.tencent.mm.view.MMPAGView mMPAGView3 = this.f433896f;
                this.f433901k = mMPAGView3 != null ? mMPAGView3.getProgress() : 0.0d;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "clearFrameRate");
        this.f433907q = 0;
        this.f433904n = 0;
        this.f433905o = 0L;
        this.f433906p = Integer.MAX_VALUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetFrameRate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFrameCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        this.f433904n = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFrameCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }

    public final void g(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f433896f;
        if (mMPAGView != null) {
            if (!z17) {
                mMPAGView.setAlpha(1.0f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
                return;
            }
            android.animation.ValueAnimator valueAnimator = this.f433910t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f433909s;
            boolean isRunning = valueAnimator2 != null ? valueAnimator2.isRunning() : false;
            com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "showThemePagView, isAnimRun=" + isRunning + ", curAlpha=" + mMPAGView.getAlpha());
            if (mMPAGView.getAlpha() < 1.0f && !isRunning) {
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(mMPAGView.getAlpha(), 1.0f);
                ofFloat.setDuration((1 - mMPAGView.getAlpha()) * this.f433911u);
                ofFloat.addUpdateListener(new v74.q0(this));
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "do showThemePagView, duration=" + ofFloat.getDuration());
                ofFloat.start();
                this.f433909s = ofFloat;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
    }
}
