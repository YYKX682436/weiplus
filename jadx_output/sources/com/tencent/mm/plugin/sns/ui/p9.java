package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f170187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.q9 f170188e;

    public p9(com.tencent.mm.plugin.sns.ui.q9 q9Var, zy2.dc dcVar) {
        this.f170188e = q9Var;
        this.f170187d = dcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10$1");
        zy2.dc dcVar = this.f170187d;
        if (dcVar != null) {
            int i17 = ((ya2.b2) dcVar).field_follow_Flag;
            com.tencent.mm.plugin.sns.ui.q9 q9Var = this.f170188e;
            com.tencent.mm.plugin.sns.ui.pa paVar = q9Var.f170332a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.A = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl", "getFinderContact, followFlg=" + i17 + ", userName=" + ((ya2.b2) dcVar).D0());
            q9Var.f170332a.A(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", "getFinderContact, iLocalFinderContact==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10$1");
    }
}
