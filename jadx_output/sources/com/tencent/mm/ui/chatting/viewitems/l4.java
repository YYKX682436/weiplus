package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class l4 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204389s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488490up);
        com.tencent.mm.ui.chatting.viewitems.k4 k4Var = new com.tencent.mm.ui.chatting.viewitems.k4();
        k4Var.a(xgVar, false);
        xgVar.setTag(k4Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return menuItem.getItemId() == 100;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, this.f204389s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "click honey pay");
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            java.lang.String str = bVar.C;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "no routeInfo, fallback to nativeUrl");
                java.lang.String queryParameter = android.net.Uri.parse(bVar.f348377c).getQueryParameter("cardNo");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_is_payer", false);
                intent.putExtra("key_card_no", queryParameter);
                if (!com.tencent.mm.sdk.platformtools.f9.SessionPayment.k(view.getContext(), null)) {
                    return true;
                }
                j45.l.j(dVar.g(), "honey_pay", ".ui.HoneyPayProxyUI", intent, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 1);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "has routeInfo, try handle");
                com.tencent.mm.ui.chatting.viewitems.p4.g(str, A(dVar, f9Var), dVar.x(), dVar.g());
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204389s = dVar;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.ui.chatting.viewitems.k4 k4Var = (com.tencent.mm.ui.chatting.viewitems.k4) g0Var;
        if (v17 != null) {
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            com.tencent.mm.ui.chatting.viewitems.p4.a(k4Var, v17, false);
            com.tencent.mm.ui.chatting.viewitems.p4.b(dVar, f9Var, bVar, k4Var, v17);
            com.tencent.mm.ui.chatting.viewitems.p4.c(dVar, f9Var, bVar, k4Var, v17);
            com.tencent.mm.ui.chatting.viewitems.p4.d(dVar, f9Var, bVar, k4Var, v17);
            com.tencent.mm.ui.chatting.viewitems.p4.e(dVar, f9Var, bVar, k4Var, v17);
        }
        k4Var.clickArea.setOnClickListener(w(dVar));
        k4Var.clickArea.setOnLongClickListener(u(dVar));
        k4Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        k4Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f204389s.D(), g0Var, null));
    }
}
