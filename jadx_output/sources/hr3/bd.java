package hr3;

/* loaded from: classes10.dex */
public final class bd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f283427d;

    public bd(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        this.f283427d = recommendDeleteContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI.A;
        com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f283427d;
        recommendDeleteContactUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "showDeleteTipsBottomSheet() called");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) recommendDeleteContactUI.getContext(), 1, true);
        k0Var.f211872n = new hr3.ed(recommendDeleteContactUI, 1);
        k0Var.q(recommendDeleteContactUI.getContext().getResources().getString(com.tencent.mm.R.string.mf_), 17);
        k0Var.f211881s = new hr3.fd(1, recommendDeleteContactUI);
        k0Var.v();
        java.util.List list = recommendDeleteContactUI.f153799s.f453011d;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((xb5.a) obj).f453008f) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((xb5.a) it.next()).f453006d);
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList4 = arrayList;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("infrequentcontactsortpage_delete_button", "view_clk", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", recommendDeleteContactUI.W6()), new jz5.l("infrequentcontactsortpage_sessionid", recommendDeleteContactUI.f153805y), new jz5.l("infrequentcontactsortpage_recommend_user_cnt", java.lang.Integer.valueOf(recommendDeleteContactUI.f153798r.size())), new jz5.l("delete_user_cnt", java.lang.Integer.valueOf(arrayList4.size())), new jz5.l("delete_user_list", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null))), 32337);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
