package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class dq extends com.tencent.mm.ui.chatting.viewitems.bq {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488522vw);
        com.tencent.mm.ui.chatting.viewitems.lq lqVar = new com.tencent.mm.ui.chatting.viewitems.lq();
        lqVar.a(xgVar, true);
        xgVar.setTag(lqVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.lq lqVar = (com.tencent.mm.ui.chatting.viewitems.lq) g0Var;
        if (this.f203502s == null) {
            this.f203502s = new com.tencent.mm.ui.chatting.viewitems.kq(dVar);
        }
        com.tencent.mm.ui.chatting.viewitems.lq.b(lqVar, dVar2, true, g0Var, dVar, this.f203502s, u(dVar));
    }
}
