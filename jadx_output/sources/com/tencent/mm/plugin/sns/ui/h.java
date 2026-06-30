package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f168471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.j f168472f;

    public h(com.tencent.mm.plugin.sns.ui.j jVar, int i17, int i18) {
        this.f168472f = jVar;
        this.f168470d = i17;
        this.f168471e = i18;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        com.tencent.mm.plugin.sns.ui.j jVar = this.f168472f;
        ((android.widget.RelativeLayout.LayoutParams) jVar.f169473o.getLayoutParams()).bottomMargin = f17 == 1.0f ? 0 : (int) ((this.f168470d - this.f168471e) * (1.0f - f17));
        jVar.f169473o.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("willChangeBounds", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("willChangeBounds", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        return true;
    }
}
