package jt4;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ka5 f301644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f301645e;

    public c(r45.ka5 ka5Var, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f301644d = ka5Var;
        this.f301645e = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f301644d.f378565h;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f301645e;
        if (i18 == 14586999) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "do end process");
            com.tencent.mm.wallet_core.h process = walletBaseUI.getProcess();
            if (process != null) {
                process.f(walletBaseUI, new android.os.Bundle());
            } else {
                walletBaseUI.finish();
            }
        } else if (i18 == 14586996) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "back bank list");
            com.tencent.mm.wallet_core.h process2 = walletBaseUI.getProcess();
            if (process2 != null) {
                process2.c(walletBaseUI, 100);
            } else {
                walletBaseUI.finish();
            }
        }
        dialogInterface.dismiss();
    }
}
