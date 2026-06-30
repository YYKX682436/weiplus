package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes14.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI f175325d;

    public f(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI) {
        this.f175325d = networkDiagnoseAllInOneUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = this.f175325d;
        networkDiagnoseAllInOneUI.f175293o++;
        int i17 = networkDiagnoseAllInOneUI.f175293o;
        if (i17 > 99) {
            return false;
        }
        if (networkDiagnoseAllInOneUI.f175285d == 1) {
            networkDiagnoseAllInOneUI.f175290i.setText(networkDiagnoseAllInOneUI.getString(com.tencent.mm.R.string.bpi, java.lang.Integer.valueOf(i17)));
        }
        return true;
    }
}
