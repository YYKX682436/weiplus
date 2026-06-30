package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class da implements l44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f168177a;

    public da(com.tencent.mm.plugin.sns.ui.pa paVar) {
        this.f168177a = paVar;
    }

    @Override // l44.a
    public void a(long j17, int i17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$9");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            this.f168177a.C(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$9");
    }
}
