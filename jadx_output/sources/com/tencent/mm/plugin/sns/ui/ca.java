package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f168115d;

    public ca(com.tencent.mm.plugin.sns.ui.pa paVar) {
        this.f168115d = paVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$8");
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi != null) {
            com.tencent.mm.plugin.sns.ui.pa paVar = this.f168115d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.ui.pa.k(paVar).clickActionInfo.M)) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.ba(this, Bi.n(com.tencent.mm.plugin.sns.ui.pa.k(paVar).clickActionInfo.M, true)));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$8");
    }
}
