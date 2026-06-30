package ec4;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC f251142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC) {
        super(0);
        this.f251142d = snsFakeVideoPlayUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = (com.tencent.mm.videocomposition.play.VideoCompositionPlayView) this.f251142d.findViewById(com.tencent.mm.R.id.oxx);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
        return videoCompositionPlayView;
    }
}
