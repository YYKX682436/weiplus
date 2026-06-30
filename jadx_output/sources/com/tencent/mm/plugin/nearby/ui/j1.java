package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class j1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152152d;

    public j1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152152d = nearbySayHiListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152152d;
        com.tencent.mm.storage.t8 t8Var = (com.tencent.mm.storage.t8) nearbySayHiListUI.f152111e.getItem(nearbySayHiListUI.f152112f.getHeaderViewsCount() > 0 ? i17 - nearbySayHiListUI.f152112f.getHeaderViewsCount() : i17);
        if (t8Var == null || (str = t8Var.field_content) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(str);
        android.content.Intent intent = new android.content.Intent();
        if (m25.a.c()) {
            intent.putExtra("Chat_User", t8Var.field_sayhiencryptuser);
            intent.putExtra("lbs_mode", true);
            intent.putExtra("add_scene", 18);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, nearbySayHiListUI);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
            intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", nearbySayHiListUI.f152120q ? 503 : 502);
            intent2.putExtra("Contact_User", com.tencent.mm.sdk.platformtools.t8.K0(f17.f193859a) ? t8Var.field_sayhiuser : f17.f193859a);
            intent2.putExtra("Contact_Alias", f17.f193860b);
            intent2.putExtra("Contact_Nick", f17.f193861c);
            intent2.putExtra("Contact_QuanPin", f17.f193862d);
            intent2.putExtra("Contact_PyInitial", f17.f193863e);
            intent2.putExtra("Contact_Sex", f17.f193873o);
            intent2.putExtra("Contact_Signature", f17.f193874p);
            intent2.putExtra("Contact_Scene", f17.f193866h);
            intent2.putExtra("Contact_FMessageCard", true);
            intent2.putExtra("Contact_City", f17.a());
            intent2.putExtra("Contact_Province", f17.d());
            intent2.putExtra("Contact_Content", com.tencent.mm.sdk.platformtools.t8.K0(t8Var.field_sayhicontent) ? nearbySayHiListUI.getString(com.tencent.mm.R.string.f490860b26) : t8Var.field_sayhicontent);
            intent2.putExtra("Contact_verify_Scene", f17.f193866h);
            intent2.putExtra("Contact_Uin", f17.f193869k);
            intent2.putExtra("Contact_QQNick", f17.f193870l);
            intent2.putExtra("Contact_Mobile_MD5", f17.f193867i);
            intent2.putExtra("User_From_Fmessage", true);
            intent2.putExtra("Contact_from_msgType", 37);
            intent2.putExtra("Verify_ticket", f17.f193878t);
            intent2.putExtra("Contact_Source_FMessage", f17.f193866h);
            intent2.putExtra("Contact_ShowFMessageList", true);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f17.f193859a, true);
            if (n17 != null && ((int) n17.E2) >= 0 && !n17.r2()) {
                int i18 = f17.f193881w;
                if (i18 == 0 || i18 == 2 || i18 == 5) {
                    intent2.putExtra("User_Verify", true);
                }
                intent2.putExtra("Contact_IsLBSFriend", true);
                intent2.putExtra("Sns_from_Scene", 18);
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent2, nearbySayHiListUI);
            ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
            int i19 = f17.f193873o;
            ((wo2.k) gVar).getClass();
            rq2.u.c(rq2.u.f398889a, null, null, null, null, 0L, 6L, 0L, 0L, 0L, 0L, i17 + 1, i19, 0L, 5087, null);
        }
        com.tencent.mm.autogen.events.AddFMessageCardClickEvent addFMessageCardClickEvent = new com.tencent.mm.autogen.events.AddFMessageCardClickEvent();
        addFMessageCardClickEvent.f53971g.getClass();
        addFMessageCardClickEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
