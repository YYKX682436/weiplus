package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class l9 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204407s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488549ws);
        com.tencent.mm.ui.chatting.viewitems.j9 j9Var = new com.tencent.mm.ui.chatting.viewitems.j9();
        j9Var.a(xgVar, true);
        xgVar.setTag(j9Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId == 100) {
            return true;
        }
        if (itemId != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGameShare$ChattingItemAppMsgGameShareTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGameShare$ChattingItemAppMsgGameShareTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var != null) {
            g4Var.c(d17, 111, 0, this.f204407s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            g4Var.c(d17, 136, 0, this.f204407s.s().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204407s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204407s.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            com.tencent.mm.ui.chatting.viewitems.o9.c(v17, view, dVar, f9Var, new com.tencent.mm.ui.chatting.viewitems.qq(this));
            ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(v17, java.lang.Long.valueOf(f9Var.I0()), 2);
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(v17, java.lang.Long.valueOf(f9Var.I0()), 2);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.j9 j9Var = (com.tencent.mm.ui.chatting.viewitems.j9) g0Var;
        this.f204407s = dVar;
        j9Var.b(j9Var, g0Var, dVar, dVar2, str, this, false);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = v17 == null ? null : (com.tencent.mm.pluginsdk.ui.tools.h0) v17.y(com.tencent.mm.pluginsdk.ui.tools.h0.class);
        if (h0Var != null) {
            com.tencent.mm.ui.chatting.viewitems.o9.b(dVar, h0Var.f191665b, h0Var.f191666c);
        }
    }
}
