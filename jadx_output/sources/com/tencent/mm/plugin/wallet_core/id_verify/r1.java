package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179484d;

    public r1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179484d = wcPayRealnameVerifyCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179484d;
        if (wcPayRealnameVerifyCodeUI.f179274n == null) {
            wcPayRealnameVerifyCodeUI.f179274n = new com.tencent.mm.plugin.wallet_core.id_verify.a2(wcPayRealnameVerifyCodeUI, 60000L, 1000L);
        }
        wcPayRealnameVerifyCodeUI.f179276p = true;
        wcPayRealnameVerifyCodeUI.f179269f.setEnabled(false);
        wcPayRealnameVerifyCodeUI.f179274n.start();
        np5.g netController = wcPayRealnameVerifyCodeUI.getNetController();
        if (netController instanceof com.tencent.mm.plugin.wallet_core.id_verify.u) {
            com.tencent.mm.plugin.wallet_core.id_verify.u uVar = (com.tencent.mm.plugin.wallet_core.id_verify.u) netController;
            java.lang.String text = wcPayRealnameVerifyCodeUI.f179267d.getText();
            java.lang.String str = wcPayRealnameVerifyCodeUI.f179275o;
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "do resend verify code");
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "do send sms: %s", text);
            com.tencent.mm.plugin.wallet_core.id_verify.a aVar = uVar.f179499d;
            java.lang.String string = aVar.f213801c.getString("realname_verify_process_req_key", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f179322l)) {
                string = aVar.f179322l;
            }
            new ys4.b(text, str, uVar.f179498c, string).l().h(new com.tencent.mm.plugin.wallet_core.id_verify.t(uVar));
            int i17 = uVar.f179498c;
            if (i17 == 0) {
                uVar.f179498c = i17 + 1;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WcPayRealNameVerifyCodeUI", "wrong controller");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
