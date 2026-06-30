package n34;

/* loaded from: classes4.dex */
public final class s3 implements z35.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f334726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OnlineVideoView f334727e;

    public s3(n34.v3 v3Var, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        this.f334726d = v3Var;
        this.f334727e = onlineVideoView;
    }

    @Override // z35.d0
    public void D0(android.widget.SeekBar seekBar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStopTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getShowCutSameView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n34.v3 v3Var = this.f334726d;
        boolean z17 = v3Var.f334752d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getShowCutSameView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            android.view.View view = v3Var.f334751c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStopTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStopTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f334727e;
        if (onlineVideoView != null) {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView a17 = n34.v3.a(v3Var);
            kotlin.jvm.internal.o.d(a17);
            onlineVideoView.Z((int) (a17.c(i17) / 1000), true);
        }
        if (onlineVideoView != null) {
            onlineVideoView.setAllowStart(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n34.o3 o3Var = v3Var.f334759k;
        o3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispose", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.sdk.platformtools.n3 n3Var = o3Var.f334696f.f334758j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n3Var.removeCallbacks(o3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispose", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStopTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
    }

    @Override // z35.d0
    public void g6(android.widget.SeekBar seekBar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        android.view.View view = this.f334726d.f334751c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMjJumperView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStartTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/SnsOnlineSeekBarHelper$init$4", "onStartTrackingTouch", "(Landroid/widget/SeekBar;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f334727e;
        if (onlineVideoView != null) {
            onlineVideoView.F();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
    }

    @Override // z35.d0
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
        if (z17) {
            n34.v3 v3Var = this.f334726d;
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView a17 = n34.v3.a(v3Var);
            kotlin.jvm.internal.o.d(a17);
            int c17 = (int) (a17.c(i17) / 1000);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            n34.o3 o3Var = v3Var.f334759k;
            o3Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("schedule", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
            o3Var.f334694d = c17;
            if (android.os.SystemClock.uptimeMillis() - o3Var.f334695e > 100) {
                o3Var.run();
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                n34.v3 v3Var2 = o3Var.f334696f;
                com.tencent.mm.sdk.platformtools.n3 n3Var = v3Var2.f334758j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                n3Var.removeCallbacks(o3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                com.tencent.mm.sdk.platformtools.n3 n3Var2 = v3Var2.f334758j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                n3Var2.postDelayed(o3Var, 100L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("schedule", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$4");
    }
}
