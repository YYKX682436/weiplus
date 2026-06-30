package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214198d;

    public k0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214198d = walletBaseUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r0.getVisibility() == 4) goto L11;
     */
    @Override // android.content.DialogInterface.OnCancelListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCancel(android.content.DialogInterface r3) {
        /*
            r2 = this;
            com.tencent.mm.wallet_core.ui.WalletBaseUI r3 = r2.f214198d
            android.app.Dialog r0 = r3.mTipDialog
            if (r0 == 0) goto L11
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L11
            android.app.Dialog r0 = r3.mTipDialog
            r0.dismiss()
        L11:
            android.view.View r0 = com.tencent.mm.wallet_core.ui.WalletBaseUI.access$300(r3)
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto L28
            android.view.View r0 = com.tencent.mm.wallet_core.ui.WalletBaseUI.access$400(r3)
            int r0 = r0.getVisibility()
            r1 = 4
            if (r0 != r1) goto L33
        L28:
            java.lang.String r0 = "MicroMsg.WalletBaseUI"
            java.lang.String r1 = "usr cancel, & visibility not visiable, so finish"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r3.finish()
        L33:
            r3.forceCancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.ui.k0.onCancel(android.content.DialogInterface):void");
    }
}
