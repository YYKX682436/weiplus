package com.tencent.mm.plugin.sns.ad.widget.shakead;

/* loaded from: classes4.dex */
public class GLCardAnimView extends com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f163810z = 0;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f163811q;

    /* renamed from: r, reason: collision with root package name */
    public int f163812r;

    /* renamed from: s, reason: collision with root package name */
    public int f163813s;

    /* renamed from: t, reason: collision with root package name */
    public int f163814t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f163815u;

    /* renamed from: v, reason: collision with root package name */
    public t84.c f163816v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f163817w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f163818x;

    /* renamed from: y, reason: collision with root package name */
    public a94.q f163819y;

    public GLCardAnimView(android.content.Context context) {
        super(context, null);
        this.f163817w = new java.util.ArrayList();
        this.f163818x = false;
        j(context);
    }

    public static /* synthetic */ a94.q h(com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        a94.q qVar = gLCardAnimView.f163819y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        return qVar;
    }

    public static /* synthetic */ void i(com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        gLCardAnimView.setCardVisibility(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    private void setCardVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f163817w;
            if (i18 >= arrayList.size()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                return;
            }
            t84.c cVar = (t84.c) arrayList.get(i18);
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            cVar.f416439t = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            i18++;
        }
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer
    public void g(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            return;
        }
        int b17 = i65.a.b(this.f163811q, 16);
        int i19 = (i17 / 2) - (this.f163812r / 2);
        int height = getHeight() / 2;
        int i27 = this.f163813s;
        int i28 = height - (i27 / 2);
        int i29 = height + (i27 / 2);
        ((t84.c) e(2)).i(i19, i28, this.f163812r + i19, i29);
        int i37 = i19 - (this.f163812r + b17);
        ((t84.c) e(1)).i(i37, i28, this.f163812r + i37, i29);
        int i38 = i19 - ((this.f163812r + b17) * 2);
        ((t84.c) e(0)).i(i38, i28, this.f163812r + i38, i29);
        int i39 = this.f163812r + b17 + i19;
        ((t84.c) e(3)).i(i39, i28, this.f163812r + i39, i29);
        int i47 = i19 + ((b17 + this.f163812r) * 2);
        ((t84.c) e(4)).i(i47, i28, this.f163812r + i47, i29);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public final void j(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        this.f163811q = context;
        this.f163812r = i65.a.b(context, 96);
        this.f163813s = i65.a.b(this.f163811q, 162);
        this.f163814t = i65.a.b(this.f163811q, 72);
        android.content.Context context2 = this.f163811q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        for (int i17 = 0; i17 < 5; i17++) {
            t84.c cVar = new t84.c(context2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            cVar.f416427h = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            cVar.k(new t84.b(this.f163812r, this.f163813s));
            d(cVar);
            this.f163817w.add(cVar);
        }
        setCardVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public final void k(t84.c cVar, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar, "translationY", -((getHeight() / 2) + (this.f163813s / 2) + this.f163814t), 0.0f);
        long j17 = i18;
        ofFloat.setDuration(j17);
        ofFloat.addListener(new a94.g(this, cVar));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleX", 0.33333334f, 1.0f);
        ofFloat2.setDuration(j17);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleY", 0.33333334f, 1.0f);
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(cVar, "translationX", 0.0f, i19);
        ofFloat4.setDuration(j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat);
        animatorSet.setStartDelay(i17);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public void setAnimCardView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAnimCardView, target=null?");
        sb6.append(view == null);
        com.tencent.mars.xlog.Log.i("GLCardAnimView", sb6.toString());
        this.f163815u = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public void setOnCardAnimListener(a94.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        this.f163819y = qVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public GLCardAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163817w = new java.util.ArrayList();
        this.f163818x = false;
        j(context);
    }
}
