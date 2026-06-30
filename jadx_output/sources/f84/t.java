package f84;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f260203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f84.u uVar) {
        super(0);
        this.f260203d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mSnsAdBrandTopicStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mSnsAdBrandTopicStub$2");
        f84.u uVar = this.f260203d;
        uVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View view = uVar.f260205o;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f486969v71) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mSnsAdBrandTopicStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mSnsAdBrandTopicStub$2");
        return viewStub;
    }
}
