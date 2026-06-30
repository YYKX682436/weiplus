package s74;

/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.z0 f404547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s74.z0 z0Var) {
        super(0);
        this.f404547d = z0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$mMaskImage$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$mMaskImage$2");
        s74.p0 F = s74.z0.F(this.f404547d);
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (F == null || (b17 = F.b()) == null) ? null : (com.tencent.mm.plugin.sns.ui.MaskImageView) b17.findViewById(com.tencent.mm.R.id.f486993n43);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$mMaskImage$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$mMaskImage$2");
        return maskImageView;
    }
}
