package tc4;

/* loaded from: classes4.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.i2 f417340d;

    public g2(tc4.i2 i2Var) {
        this.f417340d = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadNickName$1");
        tc4.i2 i2Var = this.f417340d;
        int width = i2Var.getWeComTagImage().getWidth() > 0 ? i2Var.getWeComTagImage().getWidth() : i65.a.h(i2Var.getContext(), com.tencent.mm.R.dimen.f479716d9);
        ad4.b0 b0Var = ad4.c0.f3175a;
        b0Var.b(i2Var.getNickNameText());
        b0Var.b(i2Var.getCompanyNameText());
        b0Var.a(i2Var.getRightPanelLayout(), i2Var.getNickNameText(), i2Var.getCompanyNameText(), width + 10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadNickName$1");
    }
}
