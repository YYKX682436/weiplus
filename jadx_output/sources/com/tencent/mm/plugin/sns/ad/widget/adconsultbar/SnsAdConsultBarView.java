package com.tencent.mm.plugin.sns.ad.widget.adconsultbar;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/adconsultbar/SnsAdConsultBarView;", "Landroid/widget/LinearLayout;", "Landroid/os/Handler;", "y", "Landroid/os/Handler;", "getMUIHandler", "()Landroid/os/Handler;", "setMUIHandler", "(Landroid/os/Handler;)V", "mUIHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g84/a", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsAdConsultBarView extends android.widget.LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final g84.a f163272z = new g84.a(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f163273d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f163274e;

    /* renamed from: f, reason: collision with root package name */
    public long f163275f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f163276g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer f163277h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView f163278i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView f163279m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer f163280n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f163281o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView f163282p;

    /* renamed from: q, reason: collision with root package name */
    public int f163283q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163284r;

    /* renamed from: s, reason: collision with root package name */
    public w64.n f163285s;

    /* renamed from: t, reason: collision with root package name */
    public int f163286t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.AnimatorSet f163287u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.AnimatorSet f163288v;

    /* renamed from: w, reason: collision with root package name */
    public float f163289w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f163290x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public android.os.Handler mUIHandler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsAdConsultBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final /* synthetic */ w64.n a(com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdClickActionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        w64.n nVar = snsAdConsultBarView.f163285s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdClickActionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        return nVar;
    }

    public static final /* synthetic */ java.util.List b(com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdConsultBarInfoList$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        java.util.List list = snsAdConsultBarView.f163274e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdConsultBarInfoList$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        return list;
    }

    public static final /* synthetic */ int c(com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentIndex$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        int i17 = snsAdConsultBarView.f163286t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentIndex$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        return i17;
    }

    public final void d(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            return;
        }
        textView.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateRollingText", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f163274e;
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateRollingText", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        } else {
            s34.g gVar = (s34.g) arrayList.get(this.f163286t % arrayList.size());
            gVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
            java.lang.String str = gVar.f402633a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
            textView.setText(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateRollingText", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        }
        com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer consultAlphaContainer = this.f163277h;
        android.animation.ObjectAnimator ofFloat = consultAlphaContainer != null && consultAlphaContainer.isPressed() ? android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.5f, 0.5f) : android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        g84.a aVar = f163272z;
        ofFloat.setInterpolator(aVar.a());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, "translationY", this.f163289w, 0.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(aVar.a());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f163287u = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = this.f163287u;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new g84.b(textView, this));
        }
        android.animation.AnimatorSet animatorSet3 = this.f163287u;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    public final void e(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer consultAlphaContainer = this.f163277h;
        android.animation.ObjectAnimator ofFloat = consultAlphaContainer != null && consultAlphaContainer.isPressed() ? android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.5f, 0.5f) : android.animation.ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(500L);
        g84.a aVar = f163272z;
        ofFloat.setInterpolator(aVar.a());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -this.f163289w);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(aVar.a());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f163288v = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = this.f163288v;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new g84.c(textView));
        }
        android.animation.AnimatorSet animatorSet3 = this.f163288v;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        com.tencent.mars.xlog.Log.i("AdConsultBarView", "consult bar start anim");
        this.mUIHandler.removeCallbacksAndMessages(null);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f163274e;
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            return;
        }
        if (arrayList.size() != 1) {
            this.f163290x = true;
            this.mUIHandler.sendEmptyMessageDelayed(1, this.f163276g ? this.f163275f : 2000L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            return;
        }
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = this.f163278i;
        if (improveTextView != null) {
            s34.g gVar = (s34.g) arrayList.get(0);
            gVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
            java.lang.String str = gVar.f402633a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
            improveTextView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = this.f163279m;
        if (improveTextView2 != null) {
            improveTextView2.setVisibility(8);
        }
        this.f163290x = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    public final void g() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        com.tencent.mars.xlog.Log.i("AdConsultBarView", "consult bar stop anim");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.animation.AnimatorSet animatorSet = this.f163288v;
            if (animatorSet != null) {
                animatorSet.end();
            }
            android.animation.AnimatorSet animatorSet2 = this.f163287u;
            if (animatorSet2 != null) {
                animatorSet2.end();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        this.f163290x = false;
        this.mUIHandler.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    public final android.os.Handler getMUIHandler() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMUIHandler", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        android.os.Handler handler = this.mUIHandler;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMUIHandler", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        return handler;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("AdConsultBarView", "onAttachedToWindow");
        if (this.f163283q != 0 && !this.f163290x) {
            f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("AdConsultBarView", "onDetachedFromWindow");
        g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        super.onStartTemporaryDetach();
        com.tencent.mars.xlog.Log.i("AdConsultBarView", "onStartTemporaryDetach");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    public final void setMUIHandler(android.os.Handler handler) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMUIHandler", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        kotlin.jvm.internal.o.g(handler, "<set-?>");
        this.mUIHandler = handler;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMUIHandler", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsAdConsultBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163274e = new java.util.ArrayList();
        this.f163275f = 3000L;
        this.f163276g = true;
        this.mUIHandler = new g84.d(this, android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
        com.tencent.mars.xlog.Log.i("AdConsultBarView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        android.view.View.inflate(context, com.tencent.mm.R.layout.dwt, this);
        this.f163277h = (com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer) findViewById(com.tencent.mm.R.id.s6f);
        this.f163278i = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) findViewById(com.tencent.mm.R.id.sal);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) findViewById(com.tencent.mm.R.id.sam);
        this.f163279m = improveTextView;
        if (improveTextView != null) {
            improveTextView.setVisibility(4);
        }
        this.f163280n = (com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer) findViewById(com.tencent.mm.R.id.s6b);
        this.f163281o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.s6c);
        this.f163282p = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) findViewById(com.tencent.mm.R.id.s6d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
    }
}
