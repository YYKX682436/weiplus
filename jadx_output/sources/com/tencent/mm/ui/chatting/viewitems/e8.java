package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class e8 {
    public static void a(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
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
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderNameCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderNameCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void b(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        zy2.h hVar;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (hVar = (zy2.h) v17.y(zy2.h.class)) == null || com.tencent.mm.sdk.platformtools.t8.K0(hVar.f477392c)) {
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
        intent.putExtra("key_ec_source", hVar.f477398i);
        intent.putExtra("finder_username", hVar.f477392c);
        intent.putExtra("key_to_user_name", ki0.a.b(f9Var));
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", hVar.f477394e);
        intent.putExtra("key_finder_teen_mode_user_id", hVar.f477392c);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bj(intent, f9Var, new r45.md5());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(dVar.g(), intent);
    }
}
