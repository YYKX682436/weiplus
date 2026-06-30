package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f170566d;

    public u6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f170566d = i6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$9");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "showProgress");
        com.tencent.mm.plugin.sns.ui.i6 i6Var = this.f170566d;
        com.tencent.mm.ui.MMActivity mMActivity = i6Var.f169957c;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), i6Var.f169957c.getString(com.tencent.mm.R.string.jeu), false, false, new com.tencent.mm.plugin.sns.ui.t6(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        i6Var.f168559b0 = Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$9");
    }
}
