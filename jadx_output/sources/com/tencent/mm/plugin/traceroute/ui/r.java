package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes11.dex */
public class r extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI f175335a;

    public r(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI) {
        this.f175335a = networkDiagnoseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI = this.f175335a;
        if (i17 == 1) {
            networkDiagnoseUI.f175316i.d();
            jn4.m mVar = networkDiagnoseUI.f175313f;
            if (mVar != null) {
                mVar.d();
            }
            if (networkDiagnoseUI.f175312e < 95) {
                networkDiagnoseUI.f175314g.setProgress(95);
            }
            jn4.m mVar2 = networkDiagnoseUI.f175313f;
            synchronized (mVar2) {
                jn4.h hVar = mVar2.f300817b;
                if (hVar != null) {
                    hVar.a();
                }
            }
            return;
        }
        if (i17 == 2) {
            if (networkDiagnoseUI.f175312e < 95) {
                networkDiagnoseUI.f175314g.setProgress(95);
            }
            jn4.m mVar3 = networkDiagnoseUI.f175313f;
            synchronized (mVar3) {
                jn4.h hVar2 = mVar3.f300817b;
                if (hVar2 != null) {
                    hVar2.a();
                }
            }
            return;
        }
        if (i17 == 3) {
            networkDiagnoseUI.f175314g.setProgress(100);
            com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.T6(networkDiagnoseUI, false);
        } else {
            if (i17 != 4) {
                return;
            }
            networkDiagnoseUI.f175314g.setProgress(100);
            com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.T6(networkDiagnoseUI, true);
        }
    }
}
