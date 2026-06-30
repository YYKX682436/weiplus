package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI f179350d;

    public c4(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI) {
        this.f179350d = wcPayRealnameVerifySuccessUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String string = this.f179350d.getInput().getString("realname_verify_process_finish_confirm_btn_url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.wallet_core.a.c(this.f179350d.getContext(), this.f179350d.getInput(), 0);
        } else {
            com.tencent.mm.wallet_core.a.c(this.f179350d.getContext(), this.f179350d.getInput(), 0);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.wallet_core.id_verify.b4 b4Var = new com.tencent.mm.plugin.wallet_core.id_verify.b4(this, string);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b4Var, 10L, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
