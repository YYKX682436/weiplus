package g84;

/* loaded from: classes4.dex */
public final class b extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f269546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView f269547f;

    public b(android.widget.TextView textView, com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView) {
        this.f269546e = textView;
        this.f269547f = snsAdConsultBarView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r3.isPressed() == true) goto L8;
     */
    @Override // c84.f, android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            java.lang.String r0 = "onAnimationEnd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$doAppearAnim$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "animation"
            kotlin.jvm.internal.o.g(r5, r2)
            g84.a r5 = com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.f163272z
            java.lang.String r5 = "access$getMTitleContainer$p"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView r3 = r4.f269547f
            com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer r3 = r3.f163277h
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            if (r3 == 0) goto L27
            boolean r5 = r3.isPressed()
            r2 = 1
            if (r5 != r2) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L2d
            r5 = 1056964608(0x3f000000, float:0.5)
            goto L2f
        L2d:
            r5 = 1065353216(0x3f800000, float:1.0)
        L2f:
            android.widget.TextView r2 = r4.f269546e
            r2.setAlpha(r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.b.onAnimationEnd(android.animation.Animator):void");
    }
}
