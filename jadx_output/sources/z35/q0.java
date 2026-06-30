package z35;

/* loaded from: classes4.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView f470038d;

    public q0(com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView) {
        this.f470038d = suspendableHeroSeekBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f470038d.M) {
            x25.b reporter = this.f470038d.getReporter();
            if (reporter != null) {
                xd4.l0 l0Var = (xd4.l0) reporter;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPauseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var.a();
                l0Var.f453672g++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPauseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        } else {
            x25.b reporter2 = this.f470038d.getReporter();
            if (reporter2 != null) {
                xd4.l0 l0Var2 = (xd4.l0) reporter2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var2.a();
                l0Var2.f453671f++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        }
        this.f470038d.n(!r7.M);
        this.f470038d.e();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
