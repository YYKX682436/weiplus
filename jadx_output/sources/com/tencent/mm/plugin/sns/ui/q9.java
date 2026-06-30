package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q9 implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f170332a;

    public q9(com.tencent.mm.plugin.sns.ui.pa paVar) {
        this.f170332a = paVar;
    }

    @Override // zy2.c6
    public void a(zy2.dc dcVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.p9(this, dcVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10");
    }
}
