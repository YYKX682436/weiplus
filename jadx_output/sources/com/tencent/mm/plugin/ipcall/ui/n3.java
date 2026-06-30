package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class n3 implements ec0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f142947d;

    public n3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f142947d = iPCallRechargeUI;
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f142947d;
        q83.g gVar = iPCallRechargeUI.f142660p;
        gVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        gVar.f360777f = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.n3 n3Var = iPCallRechargeUI.f142669y;
        if (arrayList == null || arrayList.size() <= 0) {
            android.app.ProgressDialog progressDialog = iPCallRechargeUI.f142666v;
            if (progressDialog != null && progressDialog.isShowing()) {
                iPCallRechargeUI.f142666v.dismiss();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "[onQueryFinish] result=null");
            iPCallRechargeUI.f142656i = 10236;
            if (n3Var != null) {
                n3Var.sendEmptyMessage(1002);
                return;
            }
            return;
        }
        iPCallRechargeUI.f142652e = new java.lang.String[arrayList.size()];
        iPCallRechargeUI.f142653f = new java.lang.String[arrayList.size()];
        com.tencent.mm.pluginsdk.model.q3 q3Var = (com.tencent.mm.pluginsdk.model.q3) arrayList.get(0);
        if (q3Var.f189416f != 10232) {
            android.app.ProgressDialog progressDialog2 = iPCallRechargeUI.f142666v;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                iPCallRechargeUI.f142666v.dismiss();
            }
            iPCallRechargeUI.f142656i = q3Var.f189416f;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product Failed Status:" + iPCallRechargeUI.f142656i);
            if (n3Var != null) {
                n3Var.sendEmptyMessage(1002);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product OK size=" + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.model.q3 q3Var2 = (com.tencent.mm.pluginsdk.model.q3) it.next();
            iPCallRechargeUI.f142652e[i17] = new java.math.BigDecimal(q3Var2.f189415e).divide(new java.math.BigDecimal(1000000)).toString();
            iPCallRechargeUI.f142653f[i17] = q3Var2.f189414d;
            i17++;
        }
        if (iPCallRechargeUI.f142655h > 0) {
            java.lang.String[] strArr = iPCallRechargeUI.f142653f;
            if (strArr.length > 0) {
                java.lang.String str = strArr[0];
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(iPCallRechargeUI.f142654g)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "remote currency:" + iPCallRechargeUI.f142654g + ",google wallet currency:" + str);
                    iPCallRechargeUI.T6(str);
                    return;
                }
            }
        }
        android.app.ProgressDialog progressDialog3 = iPCallRechargeUI.f142666v;
        if (progressDialog3 != null && progressDialog3.isShowing()) {
            iPCallRechargeUI.f142666v.dismiss();
        }
        if (n3Var != null) {
            n3Var.sendEmptyMessage(1002);
        }
    }
}
