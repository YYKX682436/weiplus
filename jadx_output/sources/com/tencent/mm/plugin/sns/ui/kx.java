package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class kx implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f169694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f169695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i2 f169696c;

    public kx(android.content.Context context, boolean z17, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        this.f169694a = context;
        this.f169695b = z17;
        this.f169696c = i2Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
        boolean z17 = this.f169695b;
        android.content.Context context = this.f169694a;
        if (z17) {
            android.view.View view = new android.view.View(context);
            view.setTag(this.f169696c);
            com.tencent.mm.plugin.sns.ui.kw.D.onClick(view);
        } else {
            db5.t7.makeText(context, com.tencent.mm.R.string.ggb, 0).show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
        db5.t7.makeText(this.f169694a, com.tencent.mm.R.string.ggd, 0).show();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
    }
}
