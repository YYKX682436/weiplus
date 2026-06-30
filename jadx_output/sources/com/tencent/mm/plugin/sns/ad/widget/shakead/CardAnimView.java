package com.tencent.mm.plugin.sns.ad.widget.shakead;

/* loaded from: classes4.dex */
public class CardAnimView extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f163800p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163801d;

    /* renamed from: e, reason: collision with root package name */
    public int f163802e;

    /* renamed from: f, reason: collision with root package name */
    public int f163803f;

    /* renamed from: g, reason: collision with root package name */
    public int f163804g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f163805h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f163806i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f163807m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f163808n;

    /* renamed from: o, reason: collision with root package name */
    public a94.q f163809o;

    public CardAnimView(android.content.Context context) {
        super(context);
        this.f163807m = new java.util.ArrayList();
        this.f163808n = false;
        c(context);
    }

    public static /* synthetic */ a94.q a(com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        a94.q qVar = cardAnimView.f163809o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        return qVar;
    }

    public static /* synthetic */ void b(com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        cardAnimView.setCardVisibility(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    private void setCardVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f163807m;
            if (i18 >= arrayList.size()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                return;
            }
            android.view.View view = (android.view.View) arrayList.get(i18);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "setCardVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "setCardVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i18++;
        }
    }

    public final void c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        this.f163801d = context;
        this.f163802e = i65.a.b(context, 96);
        this.f163803f = i65.a.b(this.f163801d, 162);
        this.f163804g = i65.a.b(this.f163801d, 72);
        android.content.Context context2 = this.f163801d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        int a17 = i65.a.a(this.f163801d, 3.6f);
        for (int i17 = 0; i17 < 5; i17++) {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context2);
            mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            mMRoundCornerImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f163802e, this.f163803f));
            mMRoundCornerImageView.setRadius(a17);
            addView(mMRoundCornerImageView);
            this.f163807m.add(mMRoundCornerImageView);
        }
        setCardVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public final void d(android.view.View view, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", -((getHeight() / 2) + (this.f163803f / 2) + this.f163804g), 0.0f);
        long j17 = i18;
        ofFloat.setDuration(j17);
        ofFloat.addListener(new a94.b(this, view));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 0.33333334f, 1.0f);
        ofFloat2.setDuration(j17);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 0.33333334f, 1.0f);
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, i19);
        ofFloat4.setDuration(j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat);
        animatorSet.setStartDelay(i17);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        super.onLayout(z17, i17, i18, i19, i27);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            return;
        }
        int b17 = i65.a.b(this.f163801d, 16);
        int i28 = (width / 2) - (this.f163802e / 2);
        int height2 = getHeight() / 2;
        int i29 = this.f163803f;
        int i37 = height2 - (i29 / 2);
        int i38 = height2 + (i29 / 2);
        getChildAt(2).layout(i28, i37, this.f163802e + i28, i38);
        int i39 = i28 - (this.f163802e + b17);
        getChildAt(1).layout(i39, i37, this.f163802e + i39, i38);
        int i47 = i28 - ((this.f163802e + b17) * 2);
        getChildAt(0).layout(i47, i37, this.f163802e + i47, i38);
        int i48 = this.f163802e + b17 + i28;
        getChildAt(3).layout(i48, i37, this.f163802e + i48, i38);
        int i49 = i28 + ((b17 + this.f163802e) * 2);
        getChildAt(4).layout(i49, i37, this.f163802e + i49, i38);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public void setAnimCardView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAnimCardView, target=null?");
        sb6.append(view == null);
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", sb6.toString());
        this.f163805h = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public void setOnCardAnimListener(a94.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        this.f163809o = qVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public CardAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163807m = new java.util.ArrayList();
        this.f163808n = false;
        c(context);
    }
}
