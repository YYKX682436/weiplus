package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class ix implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f169454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f169455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f169456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i2 f169457d;

    public ix(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        this.f169454a = u3Var;
        this.f169455b = z17;
        this.f169456c = context;
        this.f169457d = i2Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
        boolean z17 = this.f169455b;
        android.content.Context context = this.f169456c;
        if (z17) {
            android.view.View view = new android.view.View(context);
            view.setTag(this.f169457d);
            com.tencent.mm.plugin.sns.ui.kw.D.onClick(view);
        } else {
            db5.t7.makeText(context, com.tencent.mm.R.string.ggb, 0).show();
        }
        this.f169454a.cancel();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 33L, 1L);
        this.f169454a.cancel();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
    }
}
