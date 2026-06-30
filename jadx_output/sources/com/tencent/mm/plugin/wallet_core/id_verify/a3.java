package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179334d;

    public a3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179334d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179334d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(wcPayRealnameVerifyIdInputUI.getContext(), 1, 2);
        z2Var.q(wcPayRealnameVerifyIdInputUI.G.f385629e);
        r45.sc6 sc6Var = wcPayRealnameVerifyIdInputUI.G;
        z2Var.m(sc6Var.f385631g, sc6Var.f385633i);
        com.tencent.mm.plugin.wallet_core.id_verify.o2 o2Var = new com.tencent.mm.plugin.wallet_core.id_verify.o2(this, z2Var);
        com.tencent.mm.plugin.wallet_core.id_verify.p2 p2Var = new com.tencent.mm.plugin.wallet_core.id_verify.p2(this, z2Var);
        z2Var.D = o2Var;
        z2Var.E = p2Var;
        android.view.View inflate = android.view.LayoutInflater.from(wcPayRealnameVerifyIdInputUI.getContext()).inflate(com.tencent.mm.R.layout.d9h, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pqz)).setText(wcPayRealnameVerifyIdInputUI.G.f385630f);
        z2Var.j(inflate);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
