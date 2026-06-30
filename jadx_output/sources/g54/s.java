package g54;

/* loaded from: classes15.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView f268952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView) {
        super(1);
        this.f268952d = adThumbPlayerVideoView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$setResourceDownloader$2");
        ok4.d report = (ok4.d) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$setResourceDownloader$2");
        kotlin.jvm.internal.o.g(report, "$this$report");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoPath$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        java.lang.String str = this.f268952d.f163020m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoPath$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        report.l(true, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$setResourceDownloader$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$setResourceDownloader$2");
        return f0Var;
    }
}
