package s74;

/* loaded from: classes4.dex */
public final class f1 implements com.tencent.mm.plugin.sns.ui.w4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404264d;

    public f1(s74.o2 o2Var) {
        this.f404264d = o2Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.w4
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
        this.f404264d.b0(z17, z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.w4
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
        s74.o2 o2Var = this.f404264d;
        android.widget.Button T = o2Var.T();
        if (T != null) {
            T.setText(str);
        }
        com.tencent.mars.xlog.Log.i(o2Var.k(), "updateButtonText=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
    }
}
