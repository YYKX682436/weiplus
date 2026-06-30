package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class h0 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI f178190a;

    public h0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI walletLqtCheckPwdInputDialogUI) {
        this.f178190a = walletLqtCheckPwdInputDialogUI;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI walletLqtCheckPwdInputDialogUI = this.f178190a;
        if (iTransmitKvData == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: verifyPwdPay fail, data is null");
            walletLqtCheckPwdInputDialogUI.finish();
        } else {
            if (iTransmitKvData.getInt("retCode") != 0) {
                walletLqtCheckPwdInputDialogUI.finish();
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("lqt_fetch_enc_pwd", iTransmitKvData.getString("pwd"));
            intent.putExtra("lqt_redeem_listid", walletLqtCheckPwdInputDialogUI.f177949f);
            walletLqtCheckPwdInputDialogUI.setResult(-1, intent);
            walletLqtCheckPwdInputDialogUI.finish();
        }
    }
}
