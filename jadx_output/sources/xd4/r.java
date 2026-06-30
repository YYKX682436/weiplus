package xd4;

/* loaded from: classes4.dex */
public final class r implements z35.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453697a;

    public r(xd4.z zVar) {
        this.f453697a = zVar;
    }

    @Override // z35.e
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStatusChange", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$3");
        xd4.z zVar = this.f453697a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        zVar.f453722c = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStatusChange", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$3");
    }
}
