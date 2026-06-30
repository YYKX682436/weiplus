package kf3;

/* loaded from: classes.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307317d;

    public a1(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307317d = massSendHistoryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.platformtools.SensorController sensorController = com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.f148525q;
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307317d;
        massSendHistoryUI.getClass();
        android.content.Intent intent = new android.content.Intent(massSendHistoryUI, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", massSendHistoryUI.getContext().getString(com.tencent.mm.R.string.m6m));
        intent.putExtra("list_type", 0);
        intent.putExtra("list_attr", 64);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("key_confirm_menu_name", massSendHistoryUI.getString(com.tencent.mm.R.string.df7));
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra("need_show_expand_btn", true);
        intent.putExtra("default_multi_search", true);
        intent.putExtra("need_show_multiSelect_bottom", true);
        intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
        intent.putExtra("max_limit_num", if3.k0.Bi().c());
        intent.putExtra("too_many_member_tip_string", massSendHistoryUI.getString(com.tencent.mm.R.string.m69, java.lang.Integer.valueOf(if3.k0.Bi().c())));
        intent.putExtra("too_many_member_tip_ok_string", massSendHistoryUI.getString(com.tencent.mm.R.string.f490454vi));
        pf5.j0.a(intent, kk5.q0.class);
        pf5.j0.a(intent, kk5.w.class);
        pf5.j0.a(intent, kk5.v0.class);
        pf5.j0.a(intent, cj5.d1.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        massSendHistoryUI.startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
