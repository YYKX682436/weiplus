package gg4;

/* loaded from: classes11.dex */
public class o implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI f271766e;

    public o(com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI contactSearchResultUI, int i17) {
        this.f271766e = contactSearchResultUI;
        this.f271765d = i17;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI contactSearchResultUI = this.f271766e;
        int headerViewsCount = i17 - contactSearchResultUI.f172420d.getHeaderViewsCount();
        if (headerViewsCount < 0 || headerViewsCount >= contactSearchResultUI.f172420d.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (headerViewsCount >= contactSearchResultUI.f172421e.size()) {
            r45.cx5 cx5Var = (r45.cx5) contactSearchResultUI.f172422f.get(i17 - contactSearchResultUI.f172421e.size());
            contactSearchResultUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            int i18 = cx5Var.f371908o;
            qk.p.b(intent, cx5Var, 2 == i18 ? 15 : 1 == i18 ? 1 : 0);
            j45.l.j(contactSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        r45.gw5 gw5Var = (r45.gw5) contactSearchResultUI.f172421e.get(headerViewsCount);
        java.lang.String str = gw5Var.f375561d.f372756d;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17.r2()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", 3);
            if (str != null && str.length() > 0) {
                if (n17.k2()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str.concat(",35"));
                    intent2.putExtra("Contact_Scene", 35);
                }
                j45.l.j(contactSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            }
        } else {
            if ((gw5Var.f375571q & 8) > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, gw5Var.f375561d.f372756d + ",35");
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", gw5Var.f375561d.f372756d);
            intent3.putExtra("Contact_Alias", gw5Var.f375574t);
            intent3.putExtra("Contact_Nick", gw5Var.f375562e.f372756d);
            intent3.putExtra("Contact_Signature", gw5Var.f375569o);
            intent3.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(gw5Var.A, gw5Var.f375567m, gw5Var.f375568n));
            intent3.putExtra("Contact_Sex", gw5Var.f375565h);
            intent3.putExtra("Contact_VUser_Info", gw5Var.f375572r);
            intent3.putExtra("Contact_VUser_Info_Flag", gw5Var.f375571q);
            intent3.putExtra("Contact_KWeibo_flag", gw5Var.f375576v);
            intent3.putExtra("Contact_KWeibo", gw5Var.f375573s);
            intent3.putExtra("Contact_KWeiboNick", gw5Var.f375575u);
            intent3.putExtra("Contact_KSnsIFlag", gw5Var.f375580z.f371428d);
            intent3.putExtra("Contact_KSnsBgId", gw5Var.f375580z.f371430f);
            intent3.putExtra("Contact_KSnsBgUrl", gw5Var.f375580z.f371429e);
            intent3.putExtra("Contact_Scene", 35);
            int i19 = this.f271765d;
            if (i19 != 0) {
                intent3.putExtra("add_more_friend_search_scene", i19);
            }
            r45.va0 va0Var = gw5Var.C;
            if (va0Var != null) {
                try {
                    intent3.putExtra("Contact_customInfo", va0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactSearchResultUI", e17, "", new java.lang.Object[0]);
                }
            }
            if ((gw5Var.f375571q & 8) > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, gw5Var.f375561d.f372756d + ",35");
            }
            j45.l.j(contactSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
