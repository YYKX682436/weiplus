package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class c1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f206638d;

    public c1(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f206638d = chatroomContactUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = this.f206638d;
        yk5.u uVar = chatroomContactUI.f206346n;
        java.lang.Object obj = uVar;
        if (uVar != null) {
            obj = java.lang.Boolean.valueOf(uVar.f462914x);
        }
        java.util.Objects.toString(obj);
        java.lang.String str3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
        if (i17 < chatroomContactUI.f206339d.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int headerViewsCount = i17 - chatroomContactUI.f206339d.getHeaderViewsCount();
        yk5.u uVar2 = chatroomContactUI.f206346n;
        if (uVar2 == null || !uVar2.f462914x) {
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) chatroomContactUI.f206345m.getItem(headerViewsCount);
            if (z3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactUI", "position=%s cont is null", java.lang.Integer.valueOf(headerViewsCount));
                yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (com.tencent.mm.storage.z3.q4(z3Var.d1())) {
                com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct();
                openIMChatRoomLogStruct.p(z3Var.d1());
                openIMChatRoomLogStruct.f59786e = 2L;
                openIMChatRoomLogStruct.k();
            }
            java.lang.String d17 = z3Var.d1();
            if (d17 != null && d17.length() > 0) {
                if (com.tencent.mm.storage.z3.k4(d17)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactUI", "error, 4.5 do not contain this contact %s", d17);
                } else {
                    android.content.Intent intent = new android.content.Intent(chatroomContactUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
                    intent.putExtra("Chat_User", d17);
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    intent.putExtra("specific_chat_from_scene", 10);
                    intent.putExtra("chat_from_scene_for_group_chats", 4);
                    androidx.appcompat.app.AppCompatActivity context = chatroomContactUI.getContext();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI", "dealSelectContact", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/ui/contact/ChatroomContactUI", "dealSelectContact", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean p17 = uVar2.p(headerViewsCount);
        if (chatroomContactUI.f206346n.v(headerViewsCount)) {
            yk5.u uVar3 = chatroomContactUI.f206346n;
            a31.v vVar = chatroomContactUI.f206343h;
            java.lang.String g17 = vVar != null ? vVar.g() : "";
            uVar3.getClass();
            uVar3.x(new yk5.o(uVar3, g17));
            str = "onItemClick";
        } else if (p17) {
            r45.gw5 u17 = chatroomContactUI.f206346n.u(headerViewsCount);
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
                    j45.l.j(chatroomContactUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                }
                str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                str = "onItemClick";
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Contact_User", u17.f375561d.f372756d);
                intent3.putExtra("Contact_Alias", u17.f375574t);
                intent3.putExtra("Contact_Nick", u17.f375562e.f372756d);
                intent3.putExtra("Contact_Signature", u17.f375569o);
                str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                intent3.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(u17.A, u17.f375567m, u17.f375568n));
                intent3.putExtra("Contact_Sex", u17.f375565h);
                intent3.putExtra("Contact_VUser_Info", u17.f375572r);
                intent3.putExtra("Contact_VUser_Info_Flag", u17.f375571q);
                intent3.putExtra("Contact_KWeibo_flag", u17.f375576v);
                intent3.putExtra("Contact_KWeibo", u17.f375573s);
                intent3.putExtra("Contact_KWeiboNick", u17.f375575u);
                intent3.putExtra("Contact_KSnsIFlag", u17.f375580z.f371428d);
                str = "onItemClick";
                intent3.putExtra("Contact_KSnsBgId", u17.f375580z.f371430f);
                intent3.putExtra("Contact_KSnsBgUrl", u17.f375580z.f371429e);
                r45.va0 va0Var = u17.C;
                if (va0Var != null) {
                    try {
                        intent3.putExtra("Contact_customInfo", va0Var.toByteArray());
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatroomContactUI", e17, "", new java.lang.Object[0]);
                    }
                }
                if ((u17.f375571q & 8) > 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str4 + ",3");
                }
                j45.l.j(chatroomContactUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
            }
            str3 = str2;
        } else {
            str = "onItemClick";
            com.tencent.mm.storage.z3 item = chatroomContactUI.f206346n.getItem(headerViewsCount);
            if (item == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", java.lang.Integer.valueOf(chatroomContactUI.f206346n.getCount()), java.lang.Integer.valueOf(headerViewsCount));
                yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str, "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            str3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            com.tencent.mm.ui.contact.c9.a(chatroomContactUI.f206343h.g(), 9, 3, headerViewsCount + 1);
            java.lang.String d18 = item.d1();
            if (com.tencent.mm.storage.z3.q4(d18)) {
                com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct openIMChatRoomLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct();
                openIMChatRoomLogStruct2.p(d18);
                openIMChatRoomLogStruct2.f59786e = 2L;
                openIMChatRoomLogStruct2.k();
            }
            android.content.Intent intent4 = new android.content.Intent(chatroomContactUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent4.putExtra("Chat_User", d18);
            intent4.putExtra("finish_direct", true);
            intent4.putExtra("Chat_Mode", 1);
            androidx.appcompat.app.AppCompatActivity context2 = chatroomContactUI.getContext();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context2, arrayList3.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str, str3);
    }
}
