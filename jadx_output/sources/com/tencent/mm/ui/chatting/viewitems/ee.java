package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ee extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203870s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1v);
        com.tencent.mm.ui.chatting.viewitems.fe feVar = new com.tencent.mm.ui.chatting.viewitems.fe();
        feVar.a(xgVar, false);
        xgVar.setTag(feVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.ui.chatting.viewitems.he.b(this, menuItem, dVar, dVar2.f394254d.f445300b);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.ui.chatting.viewitems.he.a(this, this.f203870s, g4Var, view, dVar.f394254d.f445300b, false);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return com.tencent.mm.ui.chatting.viewitems.he.c(this, dVar, f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            return;
        }
        f9Var.unsetOmittedFailResend();
        android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
        if (z17 == null || z17.second != null) {
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
        }
        if (dVar != null) {
            dVar.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203870s = dVar;
        com.tencent.mm.ui.chatting.viewitems.fe feVar = (com.tencent.mm.ui.chatting.viewitems.fe) g0Var;
        com.tencent.mm.ui.chatting.viewitems.fe.b(this, feVar, dVar2, false, g0Var, dVar, str);
        V(feVar, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
