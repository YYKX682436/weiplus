package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class de extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203789s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1g);
        com.tencent.mm.ui.chatting.viewitems.fe feVar = new com.tencent.mm.ui.chatting.viewitems.fe();
        feVar.a(xgVar, true);
        xgVar.setTag(feVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.ui.chatting.viewitems.he.b(this, menuItem, dVar, dVar2.f394254d.f445300b);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.ui.chatting.viewitems.he.a(this, this.f203789s, g4Var, view, dVar.f394254d.f445300b, true);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return com.tencent.mm.ui.chatting.viewitems.he.c(this, dVar, f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        this.f203789s = dVar;
        com.tencent.mm.ui.chatting.viewitems.fe.b(this, (com.tencent.mm.ui.chatting.viewitems.fe) g0Var, dVar2, true, g0Var, dVar, str);
    }
}
