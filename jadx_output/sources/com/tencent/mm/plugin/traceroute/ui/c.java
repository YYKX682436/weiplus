package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.e f175322d;

    public c(com.tencent.mm.plugin.traceroute.ui.e eVar) {
        this.f175322d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.traceroute.ui.e eVar = this.f175322d;
        eVar.f175324d.f175286e.setEnabled(true);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = eVar.f175324d.f175292n;
        if (u3Var != null && u3Var.isShowing()) {
            eVar.f175324d.f175292n.dismiss();
        }
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = eVar.f175324d;
        networkDiagnoseAllInOneUI.f175285d = 6;
        networkDiagnoseAllInOneUI.T6();
    }
}
