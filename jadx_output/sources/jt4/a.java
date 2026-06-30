package jt4;

/* loaded from: classes8.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ka5 f301640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f301641e;

    public a(r45.ka5 ka5Var, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, jt4.e eVar) {
        this.f301640d = ka5Var;
        this.f301641e = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.ka5 ka5Var = this.f301640d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ka5Var.f378564g)) {
            java.lang.String str = ka5Var.f378564g;
            com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "url: %s", str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (str.startsWith("native.")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "goto native");
                    if (!str.equals("native.qryacctdesc") && !str.equals("native.openecardauth") && !str.equals("native.cancloseecard")) {
                        str.equals("native.withdraw");
                    }
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("showShare", false);
                    com.tencent.mm.wallet_core.ui.r1.T(this.f301641e, intent);
                }
            }
        }
        dialogInterface.dismiss();
    }
}
