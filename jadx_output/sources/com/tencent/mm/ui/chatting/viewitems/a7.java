package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.a7 f203285a = new com.tencent.mm.ui.chatting.viewitems.a7();

    public static final void a(com.tencent.mm.ui.chatting.viewitems.a7 a7Var, android.app.Activity activity, com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        ot0.q v17;
        java.lang.String U1;
        a7Var.getClass();
        if (f9Var != null && (U1 = f9Var.U1()) != null) {
            if (U1.length() > 0) {
                z17 = true;
                if (z17 || (v17 = ot0.q.v(f9Var.U1())) == null) {
                }
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("Retr_Msg_Type", 40);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderCollection", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderCollection", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final java.util.Map b(com.tencent.mm.storage.f9 msg, java.lang.String username) {
        r45.ev2 ev2Var;
        int i17;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(username, "username");
        ot0.q v17 = ot0.q.v(msg.U1());
        zy2.g gVar = (zy2.g) v17.y(zy2.g.class);
        if (gVar == null || (ev2Var = gVar.f477383b) == null) {
            return null;
        }
        boolean R4 = com.tencent.mm.storage.z3.R4(msg.Q0());
        r45.fv2 fv2Var = r45.fv2.SingleChat;
        if (R4) {
            username = username + '-' + msg.Q0();
            fv2Var = r45.fv2.GroupChat;
            i17 = 3;
        } else {
            i17 = 2;
        }
        return kz5.c1.k(new jz5.l("share_src_username", username), new jz5.l("collection_id", pm0.v.u(ev2Var.getLong(0))), new jz5.l("share_src_scene", java.lang.Integer.valueOf(fv2Var.f374620d)), new jz5.l("share_content_type", java.lang.Integer.valueOf(v17.f348666i == 119 ? 2 : 3)), new jz5.l("longpress_fav_scene", java.lang.Integer.valueOf(i17)), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)));
    }

    public final void c(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f477383b) == null || ev2Var.getLong(0) == 0) {
            return;
        }
        int i17 = com.tencent.mm.storage.z3.R4(msg.Q0()) ? 3 : 2;
        int i18 = v17.f348666i;
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (i18 == 119) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            e1Var.u(g17, ev2Var, i17);
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity g18 = ui6.g();
        kotlin.jvm.internal.o.f(g18, "getContext(...)");
        e1Var.n(g18, ev2Var, i17);
    }

    public final void d(com.tencent.mm.storage.f9 msg, java.lang.String username) {
        r45.ev2 ev2Var;
        long j17;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(username, "username");
        ot0.q v17 = ot0.q.v(msg.U1());
        zy2.g gVar = (zy2.g) v17.y(zy2.g.class);
        if (gVar == null || (ev2Var = gVar.f477383b) == null) {
            return;
        }
        if (com.tencent.mm.storage.z3.R4(msg.Q0())) {
            username = username + '-' + msg.Q0();
            j17 = 2;
        } else {
            j17 = 1;
        }
        long j18 = v17.f348666i == 119 ? 7L : 8L;
        com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct finderEnterSharedCardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderEnterSharedCardStruct.f56705d = finderEnterSharedCardStruct.b("SessionId", Ri, true);
        finderEnterSharedCardStruct.f56706e = j17;
        finderEnterSharedCardStruct.f56707f = j18;
        finderEnterSharedCardStruct.f56708g = finderEnterSharedCardStruct.b("SourceUsr", username, true);
        finderEnterSharedCardStruct.f56722u = finderEnterSharedCardStruct.b("collection_id", pm0.v.u(ev2Var.getLong(0)), true);
        finderEnterSharedCardStruct.f56721t = ev2Var.getInteger(13);
        finderEnterSharedCardStruct.f56723v = msg.getCreateTime();
        finderEnterSharedCardStruct.f56724w = finderEnterSharedCardStruct.b("messageid", java.lang.String.valueOf(msg.I0()), true);
        finderEnterSharedCardStruct.k();
    }

    public final void e(com.tencent.mm.storage.f9 msg, java.lang.String str) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        java.lang.String username = str;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(username, "username");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f477383b) == null) {
            return;
        }
        boolean R4 = com.tencent.mm.storage.z3.R4(msg.Q0());
        if (R4) {
            username = username + '-' + msg.Q0();
        }
        java.lang.String str2 = username;
        int i17 = R4 ? 2 : 1;
        int i18 = v17.f348666i == 119 ? 7 : 8;
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.tencent.mm.plugin.finder.report.m0.f125120d.c(i17, i18, str2, null, "", ev2Var.getInteger(13), str2, pm0.v.u(ev2Var.getLong(0)), msg.getCreateTime(), pm0.v.u(msg.I0()));
    }
}
