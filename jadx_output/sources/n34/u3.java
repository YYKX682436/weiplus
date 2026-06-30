package n34;

/* loaded from: classes4.dex */
public final class u3 implements z35.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f334741a;

    public u3(n34.v3 v3Var) {
        this.f334741a = v3Var;
    }

    @Override // z35.h0
    public long a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPlayTimeMs", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$showSeekBarIfLessThanLimit$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f334741a.f334755g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        kotlin.jvm.internal.o.d(f4Var);
        long currentPosition = f4Var.getCurrentPosition();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPlayTimeMs", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$showSeekBarIfLessThanLimit$1");
        return currentPosition;
    }
}
