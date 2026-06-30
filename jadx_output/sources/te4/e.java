package te4;

/* loaded from: classes15.dex */
public class e extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f418598a;

    public e(com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC, te4.d dVar) {
        this.f418598a = null;
        this.f418598a = new java.lang.ref.WeakReference(soterAuthenticationUIWC);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i17 = message.what;
        java.lang.ref.WeakReference weakReference = this.f418598a;
        switch (i17) {
            case 0:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform ok");
                re4.d0 d0Var = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC) weakReference.get();
                com.tencent.mm.ui.widget.dialog.j0 j0Var = com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC.f171752h;
                soterAuthenticationUIWC.setResult(-1, soterAuthenticationUIWC.U6(d0Var));
                soterAuthenticationUIWC.T6(d0Var);
                soterAuthenticationUIWC.finish();
                return;
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform cancel");
                re4.d0 d0Var2 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC2 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC) weakReference.get();
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC.f171752h;
                soterAuthenticationUIWC2.getClass();
                d0Var2.f394526a = 90008;
                d0Var2.f394527b = "user cancelled the authentication process";
                soterAuthenticationUIWC2.setResult(0, soterAuthenticationUIWC2.U6(d0Var2));
                soterAuthenticationUIWC2.T6(d0Var2);
                soterAuthenticationUIWC2.finish();
                return;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform fail");
                re4.d0 d0Var3 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC3 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC) weakReference.get();
                com.tencent.mm.ui.widget.dialog.j0 j0Var3 = com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC.f171752h;
                soterAuthenticationUIWC3.setResult(1, soterAuthenticationUIWC3.U6(d0Var3));
                soterAuthenticationUIWC3.T6(d0Var3);
                soterAuthenticationUIWC3.finish();
                return;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: request permission");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                java.lang.String[] stringArray = message.getData().getStringArray("permissions");
                int i18 = message.getData().getInt("request_code");
                if (stringArray == null || stringArray.length <= 1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: permission null");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC4 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC) weakReference.get();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(stringArray);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(soterAuthenticationUIWC4, arrayList.toArray(), "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUIWC$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                soterAuthenticationUIWC4.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(soterAuthenticationUIWC4, "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUIWC$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                return;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: show progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC5 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC) weakReference.get();
                android.app.ProgressDialog progressDialog = soterAuthenticationUIWC5.f171755e;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    com.tencent.mm.ui.widget.dialog.g4 b17 = com.tencent.mm.ui.widget.dialog.g4.b(soterAuthenticationUIWC5, soterAuthenticationUIWC5.getString(com.tencent.mm.R.string.jid), false, null);
                    soterAuthenticationUIWC5.f171755e = b17;
                    b17.show();
                    return;
                }
                return;
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: dismiss progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC soterAuthenticationUIWC6 = (com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC) weakReference.get();
                android.app.ProgressDialog progressDialog2 = soterAuthenticationUIWC6.f171755e;
                if (progressDialog2 == null || !progressDialog2.isShowing()) {
                    return;
                }
                soterAuthenticationUIWC6.f171755e.dismiss();
                return;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: show dialog");
                if (weakReference == null || weakReference.get() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                } else {
                    com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC.f171752h = (com.tencent.mm.ui.widget.dialog.j0) message.obj;
                    return;
                }
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: unidentified msg: %d", java.lang.Integer.valueOf(i17));
                return;
        }
    }
}
