package x44;

/* loaded from: classes4.dex */
public final /* synthetic */ class j3 extends kotlin.jvm.internal.m implements yz5.l {
    public j3(java.lang.Object obj) {
        super(1, obj, x44.m3.class, "resultToJS", "resultToJS(I)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice$doAction$1");
        x44.m3 m3Var = (x44.m3) this.receiver;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        m3Var.p(intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice$doAction$1");
        return f0Var;
    }
}
