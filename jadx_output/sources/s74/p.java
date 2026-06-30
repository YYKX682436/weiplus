package s74;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s74.o0 o0Var) {
        super(0);
        this.f404477d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$mMaskImage$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$mMaskImage$2");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) this.f404477d.C().c().findViewById(com.tencent.mm.R.id.f486993n43);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$mMaskImage$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$mMaskImage$2");
        return maskImageView;
    }
}
