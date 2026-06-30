package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ib implements com.tencent.mm.pluginsdk.ui.span.z {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f201846a;

    public ib(yb5.d dVar) {
        this.f201846a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    @Override // com.tencent.mm.pluginsdk.ui.span.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(r35.m3 r28) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.ib.a(r35.m3):java.lang.Object");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object b(r35.m3 m3Var) {
        h45.g0.f278945a = 6;
        int i17 = m3Var.f369195d;
        yb5.d dVar = this.f201846a;
        if (i17 == 1) {
            return dVar.x();
        }
        if (i17 != 2) {
            if (i17 == 4) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (com.tencent.mm.storage.z3.R4(dVar.x())) {
                    int lastIndexOf = m3Var.e().lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        linkedList.add(m3Var.e().substring(lastIndexOf + 1));
                    }
                } else {
                    linkedList.add(dVar.x());
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                    linkedList2.add(6);
                }
                if (dVar.u() == null || !com.tencent.mm.storage.z3.m4(dVar.u().d1())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingSpanClickCallback", "doSend, hrefInfo.getURL() = %s.", m3Var.e());
                    if (!com.tencent.mm.storage.z3.R4(dVar.u().d1())) {
                        c(dVar.g(), dVar.u(), 6, m3Var, -1);
                    } else if (linkedList.size() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) linkedList.getFirst())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingSpanClickCallback", "doSend, error.");
                    } else {
                        java.lang.String str = (java.lang.String) linkedList.getFirst();
                        gm0.j1.i();
                        c(dVar.g(), ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true), 6, m3Var, -1);
                    }
                } else {
                    new r35.e4(dVar.g(), new com.tencent.mm.ui.chatting.jb(this)).f(linkedList, linkedList2, null);
                }
            } else if (i17 != 9) {
                if (i17 != 25 && i17 != 33) {
                    if (i17 != 6 && i17 != 7) {
                        if (i17 != 30 && i17 != 31) {
                            switch (i17) {
                                default:
                                    switch (i17) {
                                    }
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    dVar.d();
                                    break;
                            }
                        }
                    }
                }
                return dVar.x();
            }
            return null;
        }
        dVar.d();
        return null;
    }

    public final void c(android.app.Activity activity, com.tencent.mm.storage.z3 z3Var, int i17, r35.m3 m3Var, int i18) {
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && i17 != 14 && i17 != 30) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).na(activity, activity.getString(com.tencent.mm.R.string.jtx));
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ((com.tencent.mm.storage.z3.m4(z3Var.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.class : com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class));
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_Source_Add", 184);
        intent.putExtra("key_force_use_contact_label", true);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", "");
        intent.putExtra("sayhi_verify_add_errcode", i18);
        com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
        if (f9Var != null) {
            intent.putExtra("key_msg_id", f9Var.getMsgId());
            intent.putExtra("key_msg_talker", m3Var.f369206o.Q0());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/MMChattingSpanClickCallback", "gotoSayHiPage", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/MMChattingSpanClickCallback", "gotoSayHiPage", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
