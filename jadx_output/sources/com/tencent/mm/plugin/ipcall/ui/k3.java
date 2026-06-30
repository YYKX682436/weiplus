package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class k3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f142890e;

    public k3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI, java.lang.String str) {
        this.f142890e = iPCallRechargeUI;
        this.f142889d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 3L, 1L, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f142889d);
        intent.putExtra("showShare", false);
        j45.l.j(this.f142890e, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
