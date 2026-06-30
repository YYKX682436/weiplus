package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179393d;

    public i3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179393d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179393d;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.U6(wcPayRealnameVerifyIdInputUI);
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(wcPayRealnameVerifyIdInputUI.getContext(), wcPayRealnameVerifyIdInputUI.getResources().getStringArray(com.tencent.mm.R.array.f478040ao));
        c0Var.f212259t = new com.tencent.mm.plugin.wallet_core.id_verify.h3(this, c0Var);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
