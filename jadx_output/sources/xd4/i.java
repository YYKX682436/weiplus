package xd4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xd4.z zVar) {
        super(1);
        this.f453646d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInsectValue$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        xd4.z zVar = this.f453646d;
        int i17 = zVar.f453728i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInsectValue$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        if (intValue != i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setInsectValue$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            zVar.f453728i = intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setInsectValue$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getActivityContext$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            android.app.Activity activity = zVar.f453723d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getActivityContext$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            zVar.onConfigurationChanged((activity == null || (resources = activity.getResources()) == null) ? null : resources.getConfiguration());
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$1");
        return bool;
    }
}
