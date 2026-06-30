package ze5;

/* loaded from: classes9.dex */
public final class n2 {
    public n2(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(ze5.n2 n2Var, android.app.Activity activity, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        n2Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) || (v17 = ot0.q.v(f9Var.j())) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("Retr_Msg_Type", 20);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFinderNameCardMvvm$Companion", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFinderNameCardMvvm$Companion", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(z01.d dVar, android.content.Context context, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        if (i17 > 0) {
            if (i17 == 1) {
                if (!(str == null || str.length() == 0)) {
                    dVar.f468984m = str;
                    return;
                } else {
                    dVar.f468982h = com.tencent.mm.R.raw.icons_filled_star_identify;
                    dVar.f468983i = b3.l.getColor(context, com.tencent.mm.R.color.f478526a7);
                    return;
                }
            }
            if (i17 != 2) {
                return;
            }
            if (str == null || str.length() == 0) {
                dVar.f468982h = com.tencent.mm.R.raw.icons_filled_star_identify_enterprise;
            } else {
                dVar.f468984m = str;
            }
        }
    }

    public final void c(yb5.d ui6, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String U1;
        kotlin.jvm.internal.o.g(ui6, "ui");
        if (f9Var == null || (U1 = f9Var.U1()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        x05.c cVar2 = k17 != null ? (x05.c) k17.getCustom(k17.f432315e + 57) : null;
        if (cVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(cVar2.getUsername())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", f9Var.Q0());
        intent.putExtra("key_from_user_name", ki0.a.a(f9Var));
        intent.putExtra("key_ec_source", cVar2.n());
        intent.putExtra("finder_username", cVar2.getUsername());
        intent.putExtra("key_to_user_name", ki0.a.b(f9Var));
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", cVar2.getNickname());
        intent.putExtra("key_finder_teen_mode_user_id", cVar2.getUsername());
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bj(intent, f9Var, new r45.md5());
        android.app.Activity g17 = ui6.g();
        if (g17 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.w(g17, intent);
        }
    }
}
