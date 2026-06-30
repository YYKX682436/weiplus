package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class b3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p57 f142760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.d3 f142761e;

    public b3(com.tencent.mm.plugin.ipcall.ui.d3 d3Var, r45.p57 p57Var) {
        this.f142761e = d3Var;
        this.f142760d = p57Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI = this.f142761e.f142780d.f142826e;
        iPCallPackageUI.f142649n.f360758d++;
        java.lang.String str = this.f142760d.f382781m;
        iPCallPackageUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPackageUI", "startPurchasePackage productID:%s", str);
        android.app.ProgressDialog progressDialog = iPCallPackageUI.f142645g;
        if (progressDialog == null) {
            iPCallPackageUI.f142645g = db5.e1.Q(iPCallPackageUI.getContext(), iPCallPackageUI.getString(com.tencent.mm.R.string.f490573yv), iPCallPackageUI.getString(com.tencent.mm.R.string.g5w), true, false, new com.tencent.mm.plugin.ipcall.ui.y2(iPCallPackageUI));
        } else {
            progressDialog.show();
        }
        iPCallPackageUI.f142648m = new p83.j(str);
        c01.d9.e().g(iPCallPackageUI.f142648m);
    }
}
