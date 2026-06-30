package vc4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f435303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xc4.p pVar) {
        super(1);
        this.f435303d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadWsFoldView$1");
        java.lang.Long l17 = (java.lang.Long) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadWsFoldView$1");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(l17 != null && l17.longValue() == this.f435303d.y0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadWsFoldView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadWsFoldView$1");
        return valueOf;
    }
}
