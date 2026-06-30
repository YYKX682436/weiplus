package z35;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f470005d;

    public c(com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView) {
        this.f470005d = expandableHeroSeekBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/ExpandableHeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f470005d.f191120v) {
            x25.a reporter = this.f470005d.getReporter();
            if (reporter != null) {
                xd4.l0 l0Var = (xd4.l0) reporter;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCollapseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var.a();
                l0Var.f453674i++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCollapseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        } else {
            x25.a reporter2 = this.f470005d.getReporter();
            if (reporter2 != null) {
                xd4.l0 l0Var2 = (xd4.l0) reporter2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExpandClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var2.a();
                l0Var2.f453673h++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExpandClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        }
        this.f470005d.d(!r7.f191120v, true);
        if (!this.f470005d.isAccessibilityEnable) {
            this.f470005d.a();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/seekbar/ExpandableHeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
