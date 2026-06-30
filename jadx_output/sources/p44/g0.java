package p44;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p44.o0 f351791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p44.o0 o0Var) {
        super(0);
        this.f351791d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$checkPlayAllDonePagAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$checkPlayAllDonePagAnim$1");
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "checkPlayAllDonePagAnim, delay");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagContainer$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        p44.o0 o0Var = this.f351791d;
        android.widget.FrameLayout frameLayout = o0Var.f351819i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagContainer$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        if (frameLayout != null && frameLayout.isAttachedToWindow()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            android.content.Context context = o0Var.f351811a;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (!(activity != null && activity.isFinishing())) {
                com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "checkPlayAllDonePagAnim, delay start");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doPlayAllDonePagAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                o0Var.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doPlayAllDonePagAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$checkPlayAllDonePagAnim$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$checkPlayAllDonePagAnim$1");
        return f0Var;
    }
}
