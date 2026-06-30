package dd4;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd4.y f229060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dd4.y yVar, kotlinx.coroutines.q qVar) {
        super(1);
        this.f229060d = yVar;
        this.f229061e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$awaitResourceReady$2$1");
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = (com.tencent.mars.cdn.CdnManager.VideoInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$awaitResourceReady$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$logI", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        dd4.y yVar = this.f229060d;
        yVar.c("moov ready:" + videoInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$logI", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMoovReadyInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        yVar.f229077e = videoInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMoovReadyInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        ((kotlinx.coroutines.r) this.f229061e).resumeWith(kotlin.Result.m521constructorimpl(videoInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$awaitResourceReady$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$awaitResourceReady$2$1");
        return f0Var;
    }
}
