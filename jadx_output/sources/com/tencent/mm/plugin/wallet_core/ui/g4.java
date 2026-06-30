package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.m4 f180285d;

    public g4(com.tencent.mm.plugin.wallet_core.ui.m4 m4Var) {
        this.f180285d = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.m4 m4Var = this.f180285d;
        com.tencent.mm.plugin.wallet_core.ui.j4 j4Var = m4Var.f180495i;
        if (j4Var != null) {
            at4.o0 o0Var = j4Var.f180358g;
            m4Var.f180496m.a(m4Var.f180494h.g(o0Var.a(o0Var.f13911c, -1)));
        }
        m4Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
