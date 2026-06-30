package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.m4 f180302d;

    public h4(com.tencent.mm.plugin.wallet_core.ui.m4 m4Var) {
        this.f180302d = m4Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        at4.m0 m0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.j4 j4Var = this.f180302d.f180495i;
        at4.o0 o0Var = j4Var.f180358g;
        if (i17 < o0Var.f13911c.size()) {
            at4.m0 m0Var2 = ((at4.n0) o0Var.f13911c.get(i17)).f13905b;
            at4.m0 m0Var3 = at4.m0.CHECKED;
            int i18 = 0;
            while (true) {
                int size = o0Var.f13911c.size();
                m0Var = at4.m0.UNCHECKED;
                if (i18 >= size) {
                    break;
                }
                o0Var.b(i18, m0Var);
                i18++;
            }
            int ordinal = m0Var2.ordinal();
            if (ordinal == 1) {
                o0Var.b(i17, m0Var);
            } else if (ordinal == 2) {
                o0Var.b(i17, m0Var3);
            }
        }
        j4Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
