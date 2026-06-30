package vc4;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f435291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f435293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xc4.p pVar, com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f435291d = pVar;
        this.f435292e = improveItemFooter;
        this.f435293f = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        xc4.p pVar = this.f435291d;
        wa4.f0 b17 = wa4.b0.f444203a.b(pVar.W0());
        if (b17 != null && booleanValue) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShouldShowShare", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            b17.f444229e = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShouldShowShare", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            ym5.a1.f(new vc4.k(this.f435293f));
        }
        ta4.k1.f416795a.d("sns_post_finder_return", booleanValue ? 1 : 2, pVar);
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.e(this.f435292e, "MicroMsg.Improve.ItemFooter", "loadFinderPostView -> hasClickPost: " + booleanValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        return f0Var;
    }
}
