package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f157732a;

    public static synchronized com.tencent.mm.plugin.remittance.ui.h2 b() {
        com.tencent.mm.plugin.remittance.ui.h2 h2Var;
        synchronized (com.tencent.mm.plugin.remittance.ui.h2.class) {
            h2Var = com.tencent.mm.plugin.remittance.ui.g2.f157719a;
        }
        return h2Var;
    }

    public boolean a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceControlLogic", "finishRemitLargeMoneyUI()，scene %s", java.lang.Integer.valueOf(i17));
        android.content.Context context = (android.content.Context) this.f157732a.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            return false;
        }
        if (!(context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceLargeMoneyUI)) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceControlLogic", "is RemittanceLargeMoneyUI");
        com.tencent.mm.plugin.remittance.ui.RemittanceLargeMoneyUI remittanceLargeMoneyUI = (com.tencent.mm.plugin.remittance.ui.RemittanceLargeMoneyUI) context;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_close_scene", i17);
        remittanceLargeMoneyUI.setResult(-1, intent);
        remittanceLargeMoneyUI.finish();
        return true;
    }

    public void c(android.content.Context context) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = context != null ? context.getClass().getSimpleName() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceControlLogic", "attach() %s", objArr);
        this.f157732a = new java.lang.ref.WeakReference(context);
    }

    public boolean d() {
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceControlLogic", "showSafeProgress()");
        android.content.Context context = (android.content.Context) this.f157732a.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            return false;
        }
        if ((context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceUI) || !(context instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI)) {
            return false;
        }
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) context).showSafeProgress();
        return true;
    }
}
