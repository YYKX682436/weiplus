package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI f179540d;

    public z3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI) {
        this.f179540d = wcPayRealnameVerifySuccessUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI = this.f179540d;
        com.tencent.mm.wallet_core.a.c(wcPayRealnameVerifySuccessUI.getContext(), wcPayRealnameVerifySuccessUI.getInput(), 0);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
