package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes11.dex */
public class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI f175334d;

    public q(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI) {
        this.f175334d = networkDiagnoseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI = this.f175334d;
        int i17 = networkDiagnoseUI.f175311d + 1;
        networkDiagnoseUI.f175312e = i17;
        networkDiagnoseUI.f175311d = i17;
        if (i17 < 100) {
            networkDiagnoseUI.f175314g.setProgress(i17);
            return true;
        }
        networkDiagnoseUI.f175314g.setProgress(100);
        return false;
    }
}
