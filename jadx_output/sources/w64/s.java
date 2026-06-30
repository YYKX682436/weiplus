package w64;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str) {
        super(2);
        this.f443335d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$3");
        com.tencent.mars.xlog.Log.i("AdJumpTextStatusUIHelper", "onDownloaded, isOk is " + ((java.lang.Boolean) obj2) + ", videoUrl is " + this.f443335d + ", path is " + ((java.lang.String) obj));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$3");
        return f0Var;
    }
}
