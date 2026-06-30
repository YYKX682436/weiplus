package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class r8 {

    /* renamed from: a, reason: collision with root package name */
    public static final yo0.i f205412a;

    static {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        f205412a = fVar.a();
    }

    public static r45.mv2 a(ot0.q qVar) {
        zy2.e eVar = (zy2.e) qVar.y(zy2.e.class);
        if (eVar != null) {
            return eVar.f477372b;
        }
        return null;
    }

    public static void b(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) || (v17 = ot0.q.v(f9Var.j())) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("Retr_Msg_Type", 39);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderTemplate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderTemplate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void c(android.content.Context context, com.tencent.mm.storage.f9 f9Var, r45.mv2 mv2Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_feed_id", pm0.v.Z(mv2Var.getString(7)));
        intent.putExtra("key_topic_title", mv2Var.getString(0));
        intent.putExtra("key_topic_type", mv2Var.getInteger(1));
        if (((r45.ub4) mv2Var.getCustom(8)) != null) {
            intent.putExtra("key_activity_id", pm0.v.Z(((r45.ub4) mv2Var.getCustom(8)).getString(0)));
            intent.putExtra("key_activity_name", mv2Var.getString(0));
        }
        r45.ze2 ze2Var = new r45.ze2();
        if (((r45.hv2) mv2Var.getCustom(4)) != null) {
            ze2Var.set(5, ((r45.hv2) mv2Var.getCustom(4)).getString(0));
            ze2Var.set(0, java.lang.Float.valueOf(((r45.hv2) mv2Var.getCustom(4)).getFloat(1)));
            ze2Var.set(1, java.lang.Float.valueOf(((r45.hv2) mv2Var.getCustom(4)).getFloat(2)));
            try {
                intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("Finder.ChattingItemAppMsgFinderTopic", "location toByteArray exception");
            }
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", f9Var.Q0());
        intent.putExtra("key_report_scene", com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        intent.putExtra("key_entrance_type", 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fl(context, intent);
    }
}
