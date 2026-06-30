package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142855d;

    public i0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142855d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue = ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142855d;
        if (booleanValue) {
            m0Var.f142938j.setVisibility(0);
        } else {
            m0Var.f142938j.setVisibility(8);
        }
        java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING, "");
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            m0Var.f142937i.setText(str);
            m0Var.f142936h.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            m0Var.f142937i.setText("");
            m0Var.f142936h.setVisibility(8);
        } else {
            m0Var.f142937i.setText(str2);
            m0Var.f142936h.setVisibility(0);
        }
    }
}
