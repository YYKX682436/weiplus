package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c8 implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180177a;

    public c8(com.tencent.mm.plugin.wallet_core.ui.n8 n8Var) {
        this.f180177a = n8Var;
    }

    @Override // lz2.a
    public void onAuthCancel() {
        android.view.View view = this.f180177a.f180521d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // lz2.a
    public void onAuthFail(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f180177a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "face id auth fail: %s, %s", valueOf, java.lang.Integer.valueOf(n8Var.X.D));
        android.view.View view = n8Var.f180521d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthFail", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthFail", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n8Var.M.setVisibility(8);
        n8Var.c();
        n8Var.X.D++;
    }

    @Override // lz2.a
    public void onAuthSuccess(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "face id auth success");
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f180177a;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = n8Var.X;
        payInfo.f192125x = 1;
        payInfo.A = "";
        payInfo.B = "";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((pz2.a) gm0.j1.s(pz2.a.class)).Uh());
            jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            n8Var.X.G = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletPwdDialog", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = n8Var.X;
        payInfo2.C = i17;
        payInfo2.D = i18;
        n8Var.e();
    }
}
