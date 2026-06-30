package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes3.dex */
public class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f179525d;

    public x1(com.tencent.mm.plugin.wallet_core.id_verify.z1 z1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f179525d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f179525d.u();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
