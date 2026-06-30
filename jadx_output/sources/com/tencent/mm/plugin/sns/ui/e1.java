package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e1 implements al5.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.l1 f168220a;

    public e1(com.tencent.mm.plugin.sns.ui.l1 l1Var) {
        this.f168220a = l1Var;
    }

    @Override // al5.n1
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$5");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f168220a;
        if (l1Var.f169710k.getVisibility() == 0) {
            l1Var.f169710k.setVisibility(8);
        } else {
            ((android.app.Activity) com.tencent.mm.plugin.sns.ui.l1.a(l1Var)).finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$5");
    }
}
