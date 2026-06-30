package com.tencent.mm.plugin.sns.ad.widget.interactionlabel;

/* loaded from: classes4.dex */
public class SnsAdInteractionLabelView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163588d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f163589e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f163590f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f163591g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f163592h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f163593i;

    /* renamed from: m, reason: collision with root package name */
    public int f163594m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f163595n;

    /* renamed from: o, reason: collision with root package name */
    public long f163596o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.AnimatorSet f163597p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.AnimatorSet f163598q;

    /* renamed from: r, reason: collision with root package name */
    public int f163599r;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.Handler f163600s;

    public SnsAdInteractionLabelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView snsAdInteractionLabelView, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        snsAdInteractionLabelView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        float b17 = i65.a.b(snsAdInteractionLabelView.f163588d, 4);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, b17);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", b17, -i65.a.b(snsAdInteractionLabelView.f163588d, 12));
        ofFloat2.setDuration(200L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(200L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.addListener(new u84.s1(snsAdInteractionLabelView, view));
        snsAdInteractionLabelView.f163598q = animatorSet;
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public static void b(com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView snsAdInteractionLabelView, android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        snsAdInteractionLabelView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        textView.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        java.util.ArrayList arrayList = snsAdInteractionLabelView.f163593i;
        if (arrayList.size() == 0) {
            textView.setText("");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else {
            textView.setText((java.lang.CharSequence) arrayList.get(snsAdInteractionLabelView.f163594m % arrayList.size()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 0.0f);
        ofFloat.setDuration(300L);
        int b17 = i65.a.b(snsAdInteractionLabelView.f163588d, 16);
        float f17 = -i65.a.b(snsAdInteractionLabelView.f163588d, 2);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, "translationY", b17, f17);
        ofFloat2.setDuration(200L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        ofFloat3.setDuration(200L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(textView, "translationY", f17, 0.0f);
        ofFloat4.setDuration(200L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.play(ofFloat4).after(ofFloat3);
        snsAdInteractionLabelView.f163597p = animatorSet;
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        try {
            android.animation.AnimatorSet animatorSet = this.f163598q;
            if (animatorSet != null) {
                animatorSet.end();
            }
            android.animation.AnimatorSet animatorSet2 = this.f163597p;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
        } catch (java.lang.Exception unused) {
        }
        this.f163591g.setVisibility(0);
        this.f163592h.setVisibility(4);
        this.f163591g.setAlpha(1.0f);
        this.f163592h.setAlpha(1.0f);
        this.f163591g.setTranslationY(0.0f);
        this.f163592h.setTranslationY(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (ca4.m0.a0(getContext())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAdInteractionLabelView", "--startAnim--");
        android.os.Handler handler = this.f163600s;
        handler.removeCallbacksAndMessages(null);
        java.util.ArrayList arrayList = this.f163593i;
        if (arrayList.size() == 0) {
            this.f163591g.setText("");
            this.f163592h.setText("");
            this.f163595n = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        if (arrayList.size() == 1) {
            c();
            this.f163591g.setText((java.lang.CharSequence) arrayList.get(0));
            this.f163592h.setText("");
            this.f163595n = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        this.f163595n = false;
        this.f163594m = 0;
        c();
        this.f163591g.setText((java.lang.CharSequence) arrayList.get(0));
        this.f163592h.setText("");
        handler.sendEmptyMessageDelayed(1, 1800L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("SnsAdInteractionLabelView", "onAttachedToWindow");
        if (this.f163599r != 0) {
            d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("SnsAdInteractionLabelView", "onDetachedFromWindow");
        this.f163596o = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (ca4.m0.a0(getContext())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else {
            com.tencent.mars.xlog.Log.i("SnsAdInteractionLabelView", "stopAnim");
            this.f163595n = true;
            this.f163600s.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public SnsAdInteractionLabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f163593i = new java.util.ArrayList();
        this.f163594m = 0;
        this.f163595n = false;
        this.f163600s = new u84.r1(this, android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        setOrientation(0);
        setGravity(16);
        this.f163588d = context;
        android.view.View.inflate(context, com.tencent.mm.R.layout.f489487cp3, this);
        this.f163589e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f163590f = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f483050v9);
        this.f163591g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483051va);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483052vb);
        this.f163592h = textView;
        textView.setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }
}
