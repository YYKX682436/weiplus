package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistUI f169699d;

    public l0(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        this.f169699d = artistUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$1");
        if (com.tencent.mm.plugin.sns.ui.ArtistUI.T6(this.f169699d) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$1");
        } else {
            com.tencent.mm.plugin.sns.model.l4.hj().G();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$1");
        }
    }
}
