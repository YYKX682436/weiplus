package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class wi implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f211239a;

    public wi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f211239a = singleChatInfoUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f211239a;
        if (com.tencent.mm.storage.z3.L3(singleChatInfoUI.f197077n)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.o9y, singleChatInfoUI.f197071e.g2());
            java.util.HashMap hashMap = new java.util.HashMap();
            int intExtra = singleChatInfoUI.getIntent().getIntExtra("chat_from_scene", 0);
            java.lang.String stringExtra = singleChatInfoUI.getIntent().getStringExtra("chat_session");
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            hashMap.put("enter_sessionid", stringExtra);
            hashMap.put("chat_name", singleChatInfoUI.f197077n);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("yuanbao_toast_exp", hashMap, 34004);
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(singleChatInfoUI);
            e4Var.f211776c = string;
            e4Var.f211779f = false;
            e4Var.c();
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10170, "1");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(singleChatInfoUI.f197077n);
        linkedList.add(c01.z1.r());
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", singleChatInfoUI.getString(com.tencent.mm.R.string.f489933fw));
        intent.putExtra("list_type", 0);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206783d);
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
        intent.putExtra("key_create_chatroom_from_username", singleChatInfoUI.f197077n);
        pf5.j0.a(intent, aj5.i1.class);
        pf5.j0.a(intent, aj5.l1.class);
        intent.putExtra("from_create_group_scene", 3);
        pf5.j0.a(intent, aj5.r.class);
        pf5.j0.a(intent, kk5.c0.class);
        pf5.j0.a(intent, kk5.h0.class);
        pf5.j0.a(intent, aj5.r0.class);
        pf5.j0.a(intent, kk5.q.class);
        pf5.j0.a(intent, cj5.f.class);
        pf5.j0.a(intent, kj5.f.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        j45.l.u(singleChatInfoUI, ".ui.mvvm.MvvmContactListUI", intent, null);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f211239a.f197073g;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.storage.ya z07;
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f211239a;
        java.lang.String c17 = lz.a.c(singleChatInfoUI.f197073g, i17);
        java.lang.String b17 = lz.a.b(singleChatInfoUI.f197073g, i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (b17 == null) {
            b17 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17) && (z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(c17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            b17 = z07.field_conRemark;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return;
        }
        if (com.tencent.mm.storage.z3.V3(singleChatInfoUI.f197077n)) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.o oVar = com.tencent.mm.plugin.finder.report.p.f125225d;
            oVar.f125200e++;
            com.tencent.mars.xlog.Log.i("RecordFinderChatProfile", "incChatInfoClickCount:" + oVar.f125200e);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
            java.lang.String h17 = m4Var.h(singleChatInfoUI.f197077n);
            if (com.tencent.mm.storage.z3.S3(h17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", h17);
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Bi(viewGroup.getContext(), intent, 0L, null, 0, 10, false, -1);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.w(viewGroup.getContext(), intent);
                return;
            }
            if (!com.tencent.mm.storage.z3.U3(h17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "talkerName :".concat(h17));
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            zy2.dc mj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).mj(h17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
            koVar.b(mj6, intent2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String c18 = m4Var.c(h17, 3);
            intent2.putExtra("IsPoster", true);
            intent2.putExtra("Action", 1);
            intent2.putExtra("SessionId", c18);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            koVar.g(viewGroup.getContext(), intent2, 2);
            return;
        }
        if (com.tencent.mm.storage.z3.H4(singleChatInfoUI.f197077n)) {
            android.content.Intent intent3 = new android.content.Intent(singleChatInfoUI, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.class);
            intent3.putExtra(dm.i4.COL_USERNAME, singleChatInfoUI.f197077n);
            ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(singleChatInfoUI.f197077n, 154);
            com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI2 = this.f211239a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(singleChatInfoUI2, arrayList.toArray(), "com/tencent/mm/ui/SingleChatInfoUI$6", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            singleChatInfoUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(singleChatInfoUI2, "com/tencent/mm/ui/SingleChatInfoUI$6", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (com.tencent.mm.storage.z3.a4(singleChatInfoUI.f197077n)) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Di(singleChatInfoUI.getContext(), singleChatInfoUI.f197077n, 1);
            return;
        }
        if (com.tencent.mm.storage.z3.p4(c17)) {
            q41.f.a(c17, 10, 0);
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("Contact_User", c17);
        intent4.putExtra("Contact_RemarkName", b17);
        java.lang.String a17 = lz.a.a(singleChatInfoUI.f197073g, i17);
        intent4.putExtra("Contact_Nick", a17 != null ? a17 : "");
        intent4.putExtra("Contact_RoomMember", true);
        intent4.putExtra("chat_session", singleChatInfoUI.getIntent().getStringExtra("chat_session"));
        intent4.putExtra("chat_from_scene", singleChatInfoUI.getIntent().getIntExtra("chat_from_scene", 0));
        intent4.putExtra("CONTACT_INFO_UI_SOURCE", 9);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c17, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.ui.contact.g1.c(intent4, c17);
        }
        intent4.putExtra("Kdel_from", 0);
        j45.l.n(singleChatInfoUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent4, 0);
    }
}
