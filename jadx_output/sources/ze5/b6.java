package ze5;

/* loaded from: classes9.dex */
public final class b6 {
    public b6(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.j a(ze5.b6 b6Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        b6Var.getClass();
        z01.j jVar = new z01.j();
        m15.a aVar = new m15.a();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        aVar.fromXml(j17);
        jVar.f469059d = aVar;
        jVar.f469062g = new com.tencent.mm.ui.chatting.viewitems.h0(dVar, new ze5.a6(f9Var, dVar));
        return jVar;
    }

    public static final boolean b(ze5.b6 b6Var, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        b6Var.getClass();
        java.lang.Object tag = view.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.adapter.q qVar = erVar.f203908d;
        int adapterPosition = qVar != null ? qVar.getAdapterPosition() : 0;
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var.j());
        java.lang.String str = D3.f196358a;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemContactCardMvvm", "onCreateLongClickMenu, parse possible friend msg failed");
            return false;
        }
        int i17 = D3.f196374q;
        java.util.Set set = c01.e2.f37117a;
        if (com.tencent.mm.storage.z3.D3(i17) || (f9Var.getType() != 66 && !com.tencent.mm.storage.z3.m4(dVar.x()) && !com.tencent.mm.storage.z3.n4(dVar.x()))) {
            g4Var.c(adapterPosition, 118, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!f9Var.t2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && f9Var.E2() && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
            g4Var.c(adapterPosition, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!dVar.F()) {
            g4Var.c(adapterPosition, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public static final boolean c(ze5.b6 b6Var, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        b6Var.getClass();
        if (menuItem.getItemId() == 118) {
            android.app.Activity g17 = dVar.g();
            if (com.tencent.mm.ui.chatting.n3.p(f9Var)) {
                db5.e1.y(g17, g17.getString(com.tencent.mm.R.string.fef), "", g17.getString(com.tencent.mm.R.string.l_e), null);
            } else if (com.tencent.mm.ui.chatting.n3.q(f9Var)) {
                db5.e1.y(g17, g17.getString(com.tencent.mm.R.string.feg), "", g17.getString(com.tencent.mm.R.string.l_e), null);
            } else {
                android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
                intent.putExtra("Retr_Msg_Type", 8);
                intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemContactCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemContactCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return false;
    }
}
