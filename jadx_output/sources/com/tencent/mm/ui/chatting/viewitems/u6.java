package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class u6 {
    static {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.a();
    }

    public static r45.dv2 a(ot0.q qVar) {
        zy2.f fVar = (zy2.f) qVar.y(zy2.f.class);
        if (fVar != null) {
            return fVar.f477382b;
        }
        return null;
    }

    public static void b(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.dv2 dv2Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("TITLE_WORDING", dv2Var.getString(1));
        intent.putExtra("AUTO_REFRESH", true);
        try {
            intent.putExtra("FINDER_SHARE_ALBUM", dv2Var.toByteArray());
        } catch (java.io.IOException unused) {
        }
        intent.putExtra("GET_REL_SCENE", 14);
        intent.putExtra("STREAM_CARD_BUFFER", dv2Var.getByteString(5).g());
        intent.putExtra("COMMENT_SCENE", 51);
        intent.putExtra("CARD_ID", ca4.z0.F0(dv2Var.getString(0)));
        intent.putExtra("SHARED_USERNAME", f9Var.Q0());
        intent.putExtra("FROM_SHARE_SCENE", com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : 1);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "[enterRelatedTimelineUI] ".concat(context.getClass().getName()));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ni(context, intent);
    }

    public static void c(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_Msg_Type", 22);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderAlbum", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderAlbum", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
