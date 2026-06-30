package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class s0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162331d;

    public s0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI) {
        this.f162331d = shakeSayHiListUI;
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
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.storage.pa paVar = (com.tencent.mm.storage.pa) this.f162331d.f162213e.getItem(i17);
        if (paVar == null || (str = paVar.field_content) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", f17.f193859a);
        intent.putExtra("Contact_Encryptusername", f17.f193882x);
        intent.putExtra("Contact_Alias", f17.f193860b);
        intent.putExtra("Contact_Nick", f17.f193861c);
        intent.putExtra("Contact_QuanPin", f17.f193862d);
        intent.putExtra("Contact_PyInitial", f17.f193863e);
        intent.putExtra("Contact_Sex", f17.f193873o);
        intent.putExtra("Contact_Signature", f17.f193874p);
        intent.putExtra("Contact_Scene", f17.f193866h);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_City", f17.a());
        intent.putExtra("Contact_Province", f17.d());
        intent.putExtra("Contact_Content", com.tencent.mm.sdk.platformtools.t8.K0(paVar.field_sayhicontent) ? this.f162331d.getString(com.tencent.mm.R.string.f490860b26) : paVar.field_sayhicontent);
        intent.putExtra("Contact_verify_Scene", f17.f193866h);
        intent.putExtra("Contact_Uin", f17.f193869k);
        intent.putExtra("Contact_QQNick", f17.f193870l);
        intent.putExtra("Contact_Mobile_MD5", f17.f193867i);
        intent.putExtra("User_From_Fmessage", true);
        intent.putExtra("Contact_from_msgType", 37);
        intent.putExtra("Verify_ticket", f17.f193878t);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("Contact_Source_FMessage", f17.f193866h);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(f17.f193859a, true);
        if (n17 != null && ((int) n17.E2) >= 0 && !n17.r2()) {
            int i18 = f17.f193881w;
            if (i18 == 0 || i18 == 2 || i18 == 5) {
                intent.putExtra("User_Verify", true);
            }
            intent.putExtra("Contact_IsLBSFriend", true);
            intent.putExtra("Sns_from_Scene", 18);
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 31);
        intent.putExtra("CONTACT_INFO_UI_SUB_SOURCE", this.f162331d.getIntent().getBooleanExtra("IntentNewSayHiMsg", false) ? 3101 : 3103);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f162331d);
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        shakeActionReportStruct.f60328h = i17 + 1;
        shakeActionReportStruct.f60326f = shakeActionReportStruct.b("ToUsername", f17.f193859a, true);
        shakeActionReportStruct.f60331k = com.tencent.mm.sdk.platformtools.t8.K0(f17.f193874p) ? 1L : 2L;
        shakeActionReportStruct.f60329i = f17.f193873o;
        ku5.u0 u0Var = ku5.t0.f312615d;
        y24.a aVar = new y24.a(shakeActionReportStruct, 151);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
