package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class se extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205514s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ve f205515t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488524vy);
        com.tencent.mm.ui.chatting.viewitems.we weVar = new com.tencent.mm.ui.chatting.viewitems.we();
        weVar.a(xgVar);
        xgVar.setTag(weVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.se$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.chatting.viewitems.se seVar = com.tencent.mm.ui.chatting.viewitems.se.this;
                seVar.getClass();
                yb5.d dVar3 = dVar;
                boolean D = dVar3.D();
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                ot0.q v17 = ot0.q.v(c01.w9.l(D, f9Var2.j(), f9Var2.A0()));
                if (v17 != null) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16979, v17.f348677k2, v17.f348669i2, 0, 2);
                }
                com.tencent.mm.ui.chatting.viewitems.s1.c(dVar3, f9Var2, seVar.A(dVar3, f9Var2), -1, null);
            }
        });
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.ui.chatting.viewitems.xe.a(this.f205514s, g4Var, view, dVar.f394254d.f445300b);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205514s = dVar;
        com.tencent.mm.ui.chatting.viewitems.we weVar = (com.tencent.mm.ui.chatting.viewitems.we) g0Var;
        if (this.f205515t == null) {
            this.f205515t = new com.tencent.mm.ui.chatting.viewitems.ve(this.f205514s, this);
        }
        weVar.b(this, weVar, g0Var, dVar, dVar2, false, this.f205515t, u(dVar));
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).Q4();
    }
}
