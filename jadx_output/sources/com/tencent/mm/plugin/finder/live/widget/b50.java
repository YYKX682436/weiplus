package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f117834d;

    public b50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f117834d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.re2 re2Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f117834d;
        if (q50Var.g0().d()) {
            r45.hn1 hn1Var = q50Var.g0().f329587k;
            re2Var = hn1Var != null ? (r45.re2) hn1Var.getCustom(2) : null;
        } else {
            re2Var = q50Var.g0().f329590n;
        }
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var = q50Var.f119497l1;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var2 = com.tencent.mm.plugin.finder.live.widget.o40.f119253h;
        boolean z17 = false;
        boolean z18 = o40Var == o40Var2 && q50Var.A1 == o40Var2;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var3 = com.tencent.mm.plugin.finder.live.widget.o40.f119252g;
        boolean z19 = o40Var == o40Var3 && q50Var.A1 == o40Var2;
        if (o40Var == o40Var3 && q50Var.A1 == o40Var3) {
            z17 = true;
        }
        q50Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", "goto select group");
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = q50Var.f118183e;
        intent.setClassName(context, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        intent.putExtra("key_select_label_click_more_to_contact_list", true);
        intent.putExtra("option_button_wording_res_id_zero", com.tencent.mm.R.string.nwk);
        intent.putExtra("option_button_wording_res_id_more_format", com.tencent.mm.R.string.nwj);
        r45.re2 re2Var2 = q50Var.f119504z1;
        if (z19) {
            intent.putExtra("key_select_label_hide_search_bar", true);
            intent.putStringArrayListExtra("contact_forbid_select_label_id_list", (re2Var == null || (list3 = re2Var.getList(4)) == null) ? null : new java.util.ArrayList<>(list3));
            intent.putExtra("contact_forbid_select_wording_res_id", com.tencent.mm.R.string.f493738ov0);
        } else if (z18) {
            intent.putStringArrayListExtra("label_id", new java.util.ArrayList<>(re2Var2.getList(4)));
            intent.putStringArrayListExtra("contact_label_id_custom_data_list", (re2Var == null || (list2 = re2Var.getList(4)) == null) ? null : new java.util.ArrayList<>(list2));
            intent.putExtra("key_select_label_hide_search_bar", true);
        } else {
            intent.putStringArrayListExtra("label_id", new java.util.ArrayList<>(re2Var2.getList(4)));
            intent.putStringArrayListExtra("contact_forbid_unselect_label_id_list", (re2Var == null || (list = re2Var.getList(4)) == null) ? null : new java.util.ArrayList<>(list));
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.live.widget.a50(q50Var, z17, re2Var, z18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
