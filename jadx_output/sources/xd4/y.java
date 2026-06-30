package xd4;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f453719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xd4.z zVar, long j17) {
        super(0);
        this.f453718d = zVar;
        this.f453719e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g17 = xd4.z.g(this.f453718d);
        kotlin.jvm.internal.o.d(g17);
        g17.getMediaControlBar().setTotalTimeMs(this.f453719e);
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g18 = xd4.z.g(this.f453718d);
        boolean z17 = true;
        if (g18 != null) {
            g18.setBarVisible(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_expand_seekbar_duration, 15000);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoExpandSeekBarDurationMs: " + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        xd4.z zVar = this.f453718d;
        if (!ca4.z0.g0() && this.f453719e < Ni) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        zVar.f453722c = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g19 = xd4.z.g(this.f453718d);
        if (g19 != null) {
            xd4.z zVar2 = this.f453718d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            boolean z18 = zVar2.f453722c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isBarExpanded$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            g19.d(z18, false);
        }
        xd4.z zVar3 = this.f453718d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getActivityContext$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        android.app.Activity activity = zVar3.f453723d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getActivityContext$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        zVar3.onConfigurationChanged((activity == null || (resources = activity.getResources()) == null) ? null : resources.getConfiguration());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$refreshBarByTotalTime$1");
        return f0Var;
    }
}
