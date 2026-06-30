package ze5;

/* loaded from: classes9.dex */
public final class q4 {
    public q4(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.z a(ze5.q4 q4Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        q4Var.getClass();
        z01.z zVar = new z01.z();
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        zVar.f469192d = k17 != null ? (u05.a) k17.getCustom(k17.f432315e + 60) : null;
        zVar.f469195g = new com.tencent.mm.ui.chatting.viewitems.h0(dVar, new ze5.p4(f9Var, dVar));
        return zVar;
    }

    public static final boolean b(ze5.q4 q4Var, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        u05.a aVar;
        q4Var.getClass();
        java.lang.Object tag = view.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.adapter.q qVar = erVar.f203908d;
        int adapterPosition = qVar != null ? qVar.getAdapterPosition() : 0;
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar = (u05.a) k17.getCustom(k17.f432315e + 60)) == null) {
            return false;
        }
        if (aVar.getUsername().length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgPhotoAccountNameCardMvvm", "onCreateLongClickMenu, parse possible friend msg failed");
            return false;
        }
        int n17 = aVar.n();
        java.util.Set set = c01.e2.f37117a;
        if (com.tencent.mm.storage.z3.D3(n17) || (f9Var.getType() != 66 && !com.tencent.mm.storage.z3.m4(dVar.x()) && !com.tencent.mm.storage.z3.n4(dVar.x()))) {
            g4Var.c(adapterPosition, 118, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!f9Var.t2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
            g4Var.c(adapterPosition, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!dVar.F()) {
            g4Var.c(adapterPosition, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public static final boolean c(ze5.q4 q4Var, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        q4Var.getClass();
        if (menuItem.getItemId() == 118) {
            android.app.Activity g17 = dVar.g();
            if (com.tencent.mm.ui.chatting.n3.p(f9Var)) {
                db5.e1.y(g17, g17.getString(com.tencent.mm.R.string.fef), "", g17.getString(com.tencent.mm.R.string.l_e), null);
            } else if (com.tencent.mm.ui.chatting.n3.q(f9Var)) {
                db5.e1.y(g17, g17.getString(com.tencent.mm.R.string.feg), "", g17.getString(com.tencent.mm.R.string.l_e), null);
            } else {
                android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
                intent.putExtra("Retr_Msg_Type", 43);
                intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgPhotoAccountNameCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgPhotoAccountNameCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return false;
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, com.tencent.mm.storage.f9 msg) {
        u05.a aVar;
        java.lang.String str3 = str;
        java.lang.String msgContent = str2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgPhotoAccountNameCardMvvm", "dealClickPhotoAccountNameCardMsgEvent, fromUser:%s, groupChat:%s, recv:%s, msgType:%s,msgContent:%s", str3, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(msg.getType()), msgContent);
        if (z17 && z18) {
            msgContent = c01.w9.u(str2);
        }
        l15.c cVar = new l15.c();
        kotlin.jvm.internal.o.d(msgContent);
        cVar.fromXml(msgContent);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar = (u05.a) k17.getCustom(k17.f432315e + 60)) == null) {
            return;
        }
        java.lang.String username = aVar.getUsername();
        if (com.tencent.mm.sdk.platformtools.f9.SessionOa.k(context, null)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
            if (n17 != null && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                if (h47 == 0 && !n17.r2()) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, username, aVar.getNickname());
                    return;
                } else if (h47 == 2) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, username, aVar.getNickname());
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", username);
            intent.putExtra("Contact_Alias", aVar.j());
            intent.putExtra("Contact_Nick", aVar.getNickname());
            intent.putExtra("Contact_QuanPin", aVar.q());
            intent.putExtra("Contact_PyInitial", aVar.u());
            intent.putExtra("User_From_Fmessage", false);
            intent.putExtra("Contact_Scene", aVar.getScene());
            intent.putExtra("Contact_FMessageCard", true);
            intent.putExtra("Contact_VUser_Info_Flag", aVar.n());
            intent.putExtra("Contact_VUser_Info", aVar.o());
            intent.putExtra("Contact_BrandIconURL", aVar.k());
            intent.putExtra("Contact_Province", aVar.getProvince());
            intent.putExtra("Contact_City", aVar.getCity());
            intent.putExtra("Contact_Sex", aVar.getSex());
            intent.putExtra("Contact_Signature", aVar.w());
            intent.putExtra("Contact_ShowUserName", true);
            intent.putExtra("Contact_KSnsIFlag", 0);
            intent.putExtra("Contact_Source_FMessage", 17);
            intent.putExtra("source_from_user_name", str3);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            intent.putExtra("source_from_nick_name", c01.a2.b(str));
            intent.putExtra("key_add_contact_openim_appid", aVar.r());
            intent.putExtra("key_forward_flag", (msg.F & 512) > 0);
            intent.putExtra("key_msg_id", msg.getMsgId());
            intent.putExtra("key_msg_talker", msg.Q0());
            if ((aVar.n() & 8) > 0) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true).k2()) {
                    intent.putExtra("Contact_Scene", 17);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, aVar.getFromUsername() + ",17");
                } else {
                    intent.putExtra("Contact_Scene", 41);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, aVar.getFromUsername() + ",41");
                }
            }
            if (com.tencent.mm.storage.z3.m4(aVar.getFromUsername()) && aVar.getScene() == 0) {
                intent.putExtra("Contact_Scene", 17);
            }
            int n18 = aVar.n();
            java.util.Set set = c01.e2.f37117a;
            if (com.tencent.mm.storage.z3.D3(n18)) {
                intent.putExtra("preChatTYPE", z17 ? 2 : 1);
                intent.putExtra("prePublishId", "msg_" + msg.I0());
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str3 = c01.z1.r();
                }
                intent.putExtra("preUsername", str3);
                intent.putExtra("preChatName", msg.Q0());
            }
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }
}
