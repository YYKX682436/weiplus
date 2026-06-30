package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206712d;

    public g(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206712d = addressUIFragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.g gVar;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick ");
        sb6.append(i17);
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f206712d;
        yk5.u uVar = addressUIFragment.f206310r;
        java.lang.Object obj = uVar;
        if (uVar != null) {
            obj = java.lang.Boolean.valueOf(uVar.f462914x);
        }
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", sb6.toString());
        if (i17 == 0 && !"@biz.contact".equals(addressUIFragment.f206311s)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 < addressUIFragment.f206307o.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int headerViewsCount = i17 - addressUIFragment.f206307o.getHeaderViewsCount();
        yk5.u uVar2 = addressUIFragment.f206310r;
        if (uVar2 == null || !uVar2.f462914x) {
            com.tencent.mm.storage.g item = addressUIFragment.f206309q.getItem(headerViewsCount);
            if (item != null) {
                java.lang.String e17 = item.e();
                android.app.Activity context = addressUIFragment.getContext();
                if (e17 != null && e17.length() > 0 && ((!com.tencent.mm.storage.z3.m4(e17) && !com.tencent.mm.storage.z3.n4(e17)) || com.tencent.mm.sdk.platformtools.f9.ContactWeCom.k(context, null))) {
                    if (com.tencent.mm.storage.z3.k4(e17)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AddressUI", "error, 4.5 do not contain this contact %s", e17);
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("Contact_User", e17);
                        if (c01.e2.M(e17)) {
                            intent.putExtra("Is_group_card", true);
                        }
                        if (e17.length() > 0) {
                            com.tencent.mm.ui.contact.g1.c(intent, e17);
                            intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(e17, 10L);
                        }
                    }
                }
            }
            yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean p17 = uVar2.p(headerViewsCount);
        boolean v17 = addressUIFragment.f206310r.v(headerViewsCount);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "onItemClick " + v17);
        if (v17) {
            yk5.u uVar3 = addressUIFragment.f206310r;
            uVar3.getClass();
            uVar3.x(new yk5.o(uVar3, ""));
            str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            str = "android/widget/AdapterView$OnItemClickListener";
            str3 = "onItemClick";
            gVar = this;
        } else if (p17) {
            r45.gw5 u17 = addressUIFragment.f206310r.u(headerViewsCount);
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
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                    j45.l.j(addressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                }
                str = "android/widget/AdapterView$OnItemClickListener";
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
                str = "android/widget/AdapterView$OnItemClickListener";
                intent3.putExtra("Contact_KSnsBgId", u17.f375580z.f371430f);
                intent3.putExtra("Contact_KSnsBgUrl", u17.f375580z.f371429e);
                r45.va0 va0Var = u17.C;
                if (va0Var != null) {
                    try {
                        intent3.putExtra("Contact_customInfo", va0Var.toByteArray());
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddressUI", e18, "", new java.lang.Object[0]);
                    }
                }
                if ((u17.f375571q & 8) > 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str4 + ",3");
                }
                intent3.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                j45.l.j(addressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
            }
            gVar = this;
            str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            str3 = "onItemClick";
        } else {
            str = "android/widget/AdapterView$OnItemClickListener";
            com.tencent.mm.storage.z3 item2 = addressUIFragment.f206310r.getItem(headerViewsCount);
            if (item2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddressUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", java.lang.Integer.valueOf(addressUIFragment.f206310r.getCount()), java.lang.Integer.valueOf(headerViewsCount));
                yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", str, "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            gVar = this;
            str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            str3 = "onItemClick";
            java.lang.String d17 = item2.d1();
            if (com.tencent.mm.storage.z3.k4(d17)) {
                android.content.Intent intent4 = new android.content.Intent(addressUIFragment.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.contact.AddressUI.class);
                intent4.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment2 = gVar.f206712d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(addressUIFragment2, arrayList2.toArray(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                addressUIFragment2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(addressUIFragment2, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(gVar, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", str, str3, str2);
                return;
            }
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("Contact_User", d17);
            intent5.putExtra("Contact_Scene", 3);
            intent5.putExtra("CONTACT_INFO_UI_SOURCE", 4);
            if (d17 != null && d17.length() > 0) {
                j45.l.j(addressUIFragment.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent5, null);
            }
        }
        yj0.a.h(gVar, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", str, str3, str2);
    }
}
