package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes3.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179537d;

    public z1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179537d = wcPayRealnameVerifyCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179537d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) wcPayRealnameVerifyCodeUI.getContext(), 1, false);
        android.view.View inflate = wcPayRealnameVerifyCodeUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.d9b, (android.view.ViewGroup) null);
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.h5h)).setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.x1(this, k0Var));
        k0Var.f211872n = new com.tencent.mm.plugin.wallet_core.id_verify.y1(this, k0Var, inflate);
        k0Var.e(true);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
