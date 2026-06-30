package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class h0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152142d;

    public h0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152142d = nearbyFriendsUI;
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
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152142d;
        int i18 = nearbyFriendsUI.f152100t <= 0 ? i17 : i17 - 1;
        if (m25.a.c() && nearbyFriendsUI.f152104x != null) {
            i18--;
        }
        if (nearbyFriendsUI.f152099s) {
            i18--;
        }
        if (i18 < 0 || i18 >= ((java.util.LinkedList) nearbyFriendsUI.f152093m).size()) {
            yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) nearbyFriendsUI.f152093m).get(i18);
        if (b64Var.f370556m == 10000) {
            com.tencent.mm.plugin.nearby.ui.l0 l0Var = (com.tencent.mm.plugin.nearby.ui.l0) ((java.util.HashMap) nearbyFriendsUI.f152094n).get(b64Var.f370550d);
            l0Var.f152174l |= 1;
            int i19 = l0Var.f152170h;
            if (i19 == 1) {
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                appBrandStatObject.f87790f = 1134;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(this.f152142d, l0Var.f152171i, "", 0, 0, "", appBrandStatObject);
            } else if (i19 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", l0Var.f152171i);
                intent.putExtra("geta8key_scene", 25);
                intent.putExtra("stastic_scene", 12);
                j45.l.j(nearbyFriendsUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str = b64Var.f370550d;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17.r2()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", 18);
            intent2.putExtra("Sns_from_Scene", 18);
            intent2.putExtra("lbs_ticket", b64Var.C);
            intent2.putExtra("Contact_IsLbsGotoChatting", true);
            if (str != null && str.length() > 0) {
                if (n17.k2()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str.concat(",18"));
                }
                com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
                am.au auVar = setLocalQQMobileEvent.f54766g;
                auVar.f6187a = intent2;
                auVar.f6188b = str;
                setLocalQQMobileEvent.e();
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent2, nearbyFriendsUI);
            }
        } else {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", b64Var.f370550d);
            intent3.putExtra("Contact_Alias", b64Var.f370561r);
            intent3.putExtra("Contact_Nick", b64Var.f370551e);
            intent3.putExtra("Contact_Distance", b64Var.f370555i);
            intent3.putExtra("Contact_Signature", b64Var.f370554h);
            intent3.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(b64Var.f370567x, b64Var.f370552f, b64Var.f370553g));
            intent3.putExtra("Contact_Sex", b64Var.f370556m);
            intent3.putExtra("Contact_IsLBSFriend", true);
            intent3.putExtra("Contact_Scene", 18);
            intent3.putExtra("Contact_VUser_Info", b64Var.f370559p);
            intent3.putExtra("Contact_VUser_Info_Flag", b64Var.f370558o);
            intent3.putExtra("Contact_KWeibo_flag", b64Var.f370564u);
            intent3.putExtra("Contact_KWeibo", b64Var.f370562s);
            intent3.putExtra("Contact_KWeiboNick", b64Var.f370563t);
            intent3.putExtra("Contact_KSnsIFlag", b64Var.f370566w.f371428d);
            intent3.putExtra("Contact_KSnsBgId", b64Var.f370566w.f371430f);
            intent3.putExtra("Contact_KSnsBgUrl", b64Var.f370566w.f371429e);
            intent3.putExtra("lbs_ticket", b64Var.C);
            intent3.putExtra("Contact_IsLbsGotoChatting", true);
            if (b64Var.A != null) {
                dm.h1 h1Var = new dm.h1();
                h1Var.field_brandList = b64Var.A;
                r45.va0 va0Var = b64Var.B;
                h1Var.field_brandFlag = va0Var.f388021d;
                h1Var.field_brandIconURL = va0Var.f388024g;
                h1Var.field_extInfo = va0Var.f388022e;
                h1Var.field_brandInfo = va0Var.f388023f;
                intent3.putExtra("KBrandInfo_item", new com.tencent.mm.cache.MCacheItem(h1Var));
            }
            intent3.putExtra("Sns_from_Scene", 18);
            intent3.putExtra("CONTACT_INFO_UI_SOURCE", 5);
            intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent3, nearbyFriendsUI);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
