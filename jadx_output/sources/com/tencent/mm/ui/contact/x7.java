package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class x7 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207249d;

    public x7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207249d = openIMAddressUIFragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String e17;
        com.tencent.mm.ui.contact.x7 x7Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick ");
        sb6.append(i17);
        com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f207249d;
        yk5.u uVar = openIMAddressUIFragment.f206521g;
        java.lang.Object obj = uVar;
        if (uVar != null) {
            obj = java.lang.Boolean.valueOf(uVar.f462914x);
        }
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", sb6.toString());
        int headerViewsCount = i17 - openIMAddressUIFragment.f206519e.getHeaderViewsCount();
        yk5.u uVar2 = openIMAddressUIFragment.f206521g;
        if (uVar2 == null || !uVar2.f462914x) {
            com.tencent.mm.storage.g item = openIMAddressUIFragment.f206520f.getItem(headerViewsCount);
            if (item != null && (e17 = item.e()) != null && e17.length() > 0) {
                if (com.tencent.mm.storage.z3.k4(e17)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMAddressUI", "error, 4.5 do not contain this contact %s", e17);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Contact_User", e17);
                    if (c01.e2.M(e17)) {
                        intent.putExtra("Is_group_card", true);
                    }
                    if (e17.length() > 0) {
                        com.tencent.mm.ui.contact.g1.c(intent, e17);
                        j45.l.j(openIMAddressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                    }
                }
            }
            yj0.a.h(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean p17 = uVar2.p(headerViewsCount);
        boolean v17 = openIMAddressUIFragment.f206521g.v(headerViewsCount);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "onItemClick " + v17);
        if (v17) {
            yk5.u uVar3 = openIMAddressUIFragment.f206521g;
            uVar3.getClass();
            uVar3.x(new yk5.o(uVar3, ""));
            x7Var = this;
            str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            str2 = "onItemClick";
        } else if (p17) {
            r45.gw5 u17 = openIMAddressUIFragment.f206521g.u(headerViewsCount);
            java.lang.String str4 = u17.f375561d.f372756d;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str4, true);
            if (n17.r2()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Contact_User", str4);
                intent2.putExtra("Contact_Scene", 3);
                if (str4 != null && str4.length() > 0) {
                    if (n17.k2()) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str4.concat(",3"));
                    }
                    com.tencent.mm.ui.contact.g1.c(intent2, str4);
                    j45.l.j(openIMAddressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                }
                str3 = "onItemClick";
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Contact_User", u17.f375561d.f372756d);
                intent3.putExtra("Contact_Alias", u17.f375574t);
                intent3.putExtra("Contact_Nick", u17.f375562e.f372756d);
                intent3.putExtra("Contact_Signature", u17.f375569o);
                intent3.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(u17.A, u17.f375567m, u17.f375568n));
                intent3.putExtra("Contact_Sex", u17.f375565h);
                intent3.putExtra("Contact_VUser_Info", u17.f375572r);
                intent3.putExtra("Contact_VUser_Info_Flag", u17.f375571q);
                intent3.putExtra("Contact_KWeibo_flag", u17.f375576v);
                intent3.putExtra("Contact_KWeibo", u17.f375573s);
                intent3.putExtra("Contact_KWeiboNick", u17.f375575u);
                intent3.putExtra("Contact_KSnsIFlag", u17.f375580z.f371428d);
                str3 = "onItemClick";
                intent3.putExtra("Contact_KSnsBgId", u17.f375580z.f371430f);
                intent3.putExtra("Contact_KSnsBgUrl", u17.f375580z.f371429e);
                r45.va0 va0Var = u17.C;
                if (va0Var != null) {
                    try {
                        intent3.putExtra("Contact_customInfo", va0Var.toByteArray());
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMAddressUI", e18, "", new java.lang.Object[0]);
                    }
                }
                if ((u17.f375571q & 8) > 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str4 + ",3");
                }
                j45.l.j(openIMAddressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
            }
            x7Var = this;
            str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            str2 = str3;
        } else {
            com.tencent.mm.storage.z3 item2 = openIMAddressUIFragment.f206521g.getItem(headerViewsCount);
            if (item2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMAddressUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", java.lang.Integer.valueOf(openIMAddressUIFragment.f206521g.getCount()), java.lang.Integer.valueOf(headerViewsCount));
                yj0.a.h(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            x7Var = this;
            str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            str2 = "onItemClick";
            java.lang.String d17 = item2.d1();
            if (com.tencent.mm.storage.z3.k4(d17)) {
                android.content.Intent intent4 = new android.content.Intent(openIMAddressUIFragment.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.contact.OpenIMAddressUI.class);
                intent4.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment2 = x7Var.f207249d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(openIMAddressUIFragment2, arrayList2.toArray(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                openIMAddressUIFragment2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(openIMAddressUIFragment2, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(x7Var, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", str2, str);
                return;
            }
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("Contact_User", d17);
            intent5.putExtra("Contact_Scene", 3);
            if (d17 != null && d17.length() > 0) {
                j45.l.j(openIMAddressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent5, null);
            }
        }
        yj0.a.h(x7Var, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", str2, str);
    }
}
