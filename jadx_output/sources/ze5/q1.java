package ze5;

/* loaded from: classes9.dex */
public final class q1 {
    public q1(kotlin.jvm.internal.i iVar) {
    }

    public boolean a(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17;
        ot0.q v17;
        boolean z17;
        if (f9Var == null) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        if (dVar == null) {
            return false;
        }
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        if (te5.t.b(f9Var, g17) || (j17 = f9Var.j()) == null || (v17 = ot0.q.v(j17)) == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId)) {
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, c01.z1.r(), h17, f9Var.I0(), dVar.x());
        }
        if (com.tencent.mm.sdk.platformtools.t8.G0(v17.f348690o)) {
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String str2 = v17.f348694p;
            com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(str2);
            if (D0 == null || !D0.t0()) {
                z17 = false;
            } else {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(Q0, msgId);
                if (Li.z2()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgTo", "openImg:: msg is clean, attachId %s, msgId: %d, msgSvrId: %d, imgPath: %s", str2, java.lang.Long.valueOf(msgId), java.lang.Long.valueOf(Li.I0()), Li.z0());
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(dVar.g(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                    intent.putExtra("clean_view_type", 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar.a0((android.content.Intent) arrayList.get(0));
                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent2 = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowImageUI.class);
                    intent2.putExtra("key_image_path", D0.field_fileFullPath);
                    intent2.putExtra("key_message_id", msgId);
                    intent2.putExtra("key_message_talker", Q0);
                    intent2.putExtra("key_favorite", true);
                    intent2.putExtra("key_conv_session_id", dVar.f460722q);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar.a0((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        sc5.g gVar = sc5.g.f406572a;
        android.app.Activity g18 = dVar.g();
        kotlin.jvm.internal.o.f(g18, "getContext(...)");
        java.lang.String str3 = dVar.f460722q;
        kotlin.jvm.internal.o.f(str3, "getSessionConv(...)");
        gVar.f(g18, f9Var, new sc5.h(str3));
        return false;
    }
}
