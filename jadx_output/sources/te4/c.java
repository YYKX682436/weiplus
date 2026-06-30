package te4;

/* loaded from: classes15.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f418597a;

    public c(com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI, te4.a aVar) {
        this.f418597a = null;
        this.f418597a = new java.lang.ref.WeakReference(soterAuthenticationUI);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i17 = message.what;
        java.lang.ref.WeakReference weakReference = this.f418597a;
        switch (i17) {
            case 0:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: inform ok");
                re4.d0 d0Var = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI) weakReference.get();
                com.tencent.mm.ui.widget.dialog.j0 j0Var = com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI.f171740q;
                android.os.Bundle Q6 = soterAuthenticationUI.Q6(d0Var);
                zt5.r rVar = soterAuthenticationUI.f171747i;
                if (rVar != null) {
                    Q6.putString("authkey_result_json", rVar.f475617e);
                    Q6.putString("authkey_result_json_signature", soterAuthenticationUI.f171747i.f475619g);
                }
                soterAuthenticationUI.f171749n.send(-1, Q6);
                soterAuthenticationUI.O6(d0Var);
                soterAuthenticationUI.finish();
                return;
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: inform cancel");
                re4.d0 d0Var2 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI2 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI) weakReference.get();
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI.f171740q;
                soterAuthenticationUI2.getClass();
                d0Var2.f394526a = 90008;
                d0Var2.f394527b = "user cancelled the authentication process";
                soterAuthenticationUI2.f171749n.send(0, soterAuthenticationUI2.Q6(d0Var2));
                soterAuthenticationUI2.O6(d0Var2);
                soterAuthenticationUI2.finish();
                return;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: inform fail");
                re4.d0 d0Var3 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI3 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI) weakReference.get();
                com.tencent.mm.ui.widget.dialog.j0 j0Var3 = com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI.f171740q;
                soterAuthenticationUI3.P6(d0Var3);
                return;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: request permission");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                java.lang.String[] stringArray = message.getData().getStringArray("permissions");
                int i18 = message.getData().getInt("request_code");
                if (stringArray == null || stringArray.length <= 1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: permission null");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI4 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI) weakReference.get();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(stringArray);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(soterAuthenticationUI4, arrayList.toArray(), "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUI$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                soterAuthenticationUI4.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(soterAuthenticationUI4, "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUI$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                return;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: show progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI5 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI) weakReference.get();
                android.app.ProgressDialog progressDialog = soterAuthenticationUI5.f171743e;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    soterAuthenticationUI5.f171743e = android.app.ProgressDialog.show(soterAuthenticationUI5, "", soterAuthenticationUI5.getString(com.tencent.mm.R.string.jid), true, false, null);
                    return;
                }
                return;
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: dismiss progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI soterAuthenticationUI6 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI) weakReference.get();
                android.app.ProgressDialog progressDialog2 = soterAuthenticationUI6.f171743e;
                if (progressDialog2 == null || !progressDialog2.isShowing()) {
                    return;
                }
                soterAuthenticationUI6.f171743e.dismiss();
                return;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: show dialog");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                } else {
                    com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI.f171740q = (com.tencent.mm.ui.widget.dialog.j0) message.obj;
                    return;
                }
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: unidentified msg: %d", java.lang.Integer.valueOf(i17));
                return;
        }
    }
}
