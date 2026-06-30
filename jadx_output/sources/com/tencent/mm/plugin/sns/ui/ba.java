package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f167905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ca f167906e;

    public ba(com.tencent.mm.plugin.sns.ui.ca caVar, com.tencent.mm.storage.z3 z3Var) {
        this.f167906e = caVar;
        this.f167905d = z3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$8$1");
        com.tencent.mm.plugin.sns.ui.ca caVar = this.f167906e;
        com.tencent.mm.storage.z3 z3Var = this.f167905d;
        if (z3Var == null || !z3Var.r2()) {
            com.tencent.mm.plugin.sns.ui.pa.i(caVar.f168115d).setText(com.tencent.mm.plugin.sns.ui.pa.k(caVar.f168115d).btnTitle);
        } else {
            com.tencent.mm.plugin.sns.ui.pa.i(caVar.f168115d).setText(com.tencent.mm.plugin.sns.ui.pa.k(caVar.f168115d).clickActionInfo.Q);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$8$1");
    }
}
