package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f157930a;

    public static synchronized com.tencent.mm.plugin.remittance.ui.s1 d() {
        com.tencent.mm.plugin.remittance.ui.s1 s1Var;
        synchronized (com.tencent.mm.plugin.remittance.ui.s1.class) {
            s1Var = com.tencent.mm.plugin.remittance.ui.r1.f157911a;
        }
        return s1Var;
    }

    public void a(android.content.Context context) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = context != null ? context.getClass().getSimpleName() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "attach() %s", objArr);
        this.f157930a = new java.lang.ref.WeakReference(context);
    }

    public boolean b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "finishRemitF2fDCodeAndLMRemindUI()");
        android.content.Context context = (android.content.Context) this.f157930a.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
            return false;
        }
        if (context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fDynamicCodeUI");
            ((android.app.Activity) context).finish();
            return true;
        }
        if (!(context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI)) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fLargeMoneyUI");
        ((android.app.Activity) context).finish();
        return true;
    }

    public android.content.Context c() {
        android.content.Context context = (android.content.Context) this.f157930a.get();
        if (context != null) {
            return context;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    public com.tencent.mm.ui.widget.dialog.j0 e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        objArr[2] = str3 == null ? "" : str3;
        objArr[3] = str4 != null ? str4 : "";
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert1() msg:%s, title:%s, yes:%s, no:%s", objArr);
        android.content.Context context = (android.content.Context) this.f157930a.get();
        if (context != null) {
            return db5.e1.A(context, str, str2, str3, str4, onClickListener, onClickListener2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    public com.tencent.mm.ui.widget.dialog.j0 f(java.lang.String str, java.lang.String str2, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 != null ? str2 : "";
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert2() msg:%s, title:%s", objArr);
        android.content.Context context = (android.content.Context) this.f157930a.get();
        if (context != null) {
            return db5.e1.G(context, str, str2, z17, onClickListener);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    public boolean g() {
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBusiDialogMgr", "showSafeProgress()");
        android.content.Context context = (android.content.Context) this.f157930a.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
            return false;
        }
        if ((context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI) || !(context instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI)) {
            return false;
        }
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) context).showSafeProgress();
        return true;
    }
}
