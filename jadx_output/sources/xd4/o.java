package xd4;

/* loaded from: classes4.dex */
public final class o implements z35.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453685a;

    public o(xd4.z zVar) {
        this.f453685a = zVar;
    }

    @Override // z35.h0
    public long a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPlayTimeMs", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f453685a.f453726g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        kotlin.jvm.internal.o.d(f4Var);
        long currentPosition = f4Var.getCurrentPosition();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPlayTimeMs", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$7");
        return currentPosition;
    }
}
