package n34;

/* loaded from: classes4.dex */
public final class t3 implements n34.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f334734a;

    public t3(n34.v3 v3Var) {
        this.f334734a = v3Var;
    }

    @Override // n34.b3
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableDrag", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$5");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView a17 = n34.v3.a(this.f334734a);
        if (a17 != null) {
            a17.setEnableDrag(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDrag", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$5");
    }

    @Override // n34.b3
    public void reset() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$5");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView a17 = n34.v3.a(this.f334734a);
        if (a17 != null) {
            a17.g();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$5");
    }

    @Override // n34.b3
    public void startPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$5");
        n34.v3 v3Var = this.f334734a;
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView a17 = n34.v3.a(v3Var);
        if (a17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = v3Var.f334755g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            a17.setTotalTimeMs(f4Var != null ? f4Var.getDuration() : 0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$5");
    }
}
