package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class te extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205581s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ve f205582t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488566xh);
        com.tencent.mm.ui.chatting.viewitems.we weVar = new com.tencent.mm.ui.chatting.viewitems.we();
        weVar.a(xgVar);
        xgVar.setTag(weVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() == 111) {
            ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
            if (v17 != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16979, v17.f348677k2, v17.f348669i2, 0, 2);
            }
            com.tencent.mm.ui.chatting.viewitems.s1.c(dVar, f9Var, A(dVar, f9Var), -1, null);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.ui.chatting.viewitems.xe.a(this.f205581s, g4Var, view, dVar.f394254d.f445300b);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205581s = dVar;
        com.tencent.mm.ui.chatting.viewitems.we weVar = (com.tencent.mm.ui.chatting.viewitems.we) g0Var;
        if (this.f205582t == null) {
            this.f205582t = new com.tencent.mm.ui.chatting.viewitems.ve(this.f205581s, this);
        }
        weVar.b(this, weVar, g0Var, dVar, dVar2, true, this.f205582t, u(dVar));
        V(weVar, dVar2, dVar.t(), dVar.D(), dVar, this);
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).Q4();
    }
}
