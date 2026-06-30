package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class t3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f143012d;

    public t3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f143012d = iPCallRechargeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f143012d;
        com.tencent.mm.plugin.ipcall.ui.y3 y3Var = iPCallRechargeUI.f142664t;
        if (y3Var != null) {
            y3Var.f143083d = null;
            y3Var.notifyDataSetChanged();
        }
        android.widget.ListView listView = iPCallRechargeUI.f142663s;
        if (listView != null) {
            listView.setVisibility(4);
        }
        android.app.ProgressDialog progressDialog = iPCallRechargeUI.f142666v;
        if (progressDialog != null) {
            progressDialog.show();
        }
        iPCallRechargeUI.T6("");
    }
}
