package o84;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout f343670d;

    public a(com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout edgeAlphaFrameLayout) {
        this.f343670d = edgeAlphaFrameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout$2");
        com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout edgeAlphaFrameLayout = this.f343670d;
        int i39 = com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout.f163492v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f17 = edgeAlphaFrameLayout.f163495f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout edgeAlphaFrameLayout2 = this.f343670d;
        float f18 = edgeAlphaFrameLayout2.f163496g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f19 = edgeAlphaFrameLayout2.f163497h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f27 = edgeAlphaFrameLayout2.f163498i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f28 = edgeAlphaFrameLayout2.f163499m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f29 = edgeAlphaFrameLayout2.f163500n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f37 = edgeAlphaFrameLayout2.f163501o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBColor$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        float f38 = edgeAlphaFrameLayout2.f163502p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBAlpha$p", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        edgeAlphaFrameLayout.a(f17, f18, f19, f27, f28, f29, f37, f38);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout$2");
    }
}
