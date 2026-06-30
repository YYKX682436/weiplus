package rb4;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void O6(rb4.c cVar, android.view.ViewGroup viewGroup, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView) cVar.getActivity().findViewById(com.tencent.mm.R.id.vmg);
        android.widget.SeekBar seekBar = (android.widget.SeekBar) viewGroup.findViewById(com.tencent.mm.R.id.gzy);
        int progress = seekBar.getProgress() + (java.lang.Math.max(seekBar.getMax() / 10, 1) * (z17 ? 1 : -1));
        seekBar.setProgress(progress);
        suspendableHeroSeekBarView.m(progress, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        root(com.tencent.mm.R.id.vly).focusOrder().next(com.tencent.mm.R.id.v1w).next(com.tencent.mm.R.id.f487549vm3).next(com.tencent.mm.R.id.s0s).next(com.tencent.mm.R.id.v1v);
        view(com.tencent.mm.R.id.vmg, com.tencent.mm.R.id.f487549vm3).type(com.tencent.mm.accessibility.type.ViewType.SeekBar).onSeekForward(new rb4.a(this)).onSeekBackward(new rb4.b(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
    }
}
