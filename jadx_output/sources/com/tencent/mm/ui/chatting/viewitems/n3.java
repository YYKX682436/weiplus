package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class n3 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204902s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1n);
        com.tencent.mm.ui.chatting.viewitems.e3 e3Var = new com.tencent.mm.ui.chatting.viewitems.e3();
        e3Var.a(xgVar, true);
        xgVar.setTag(e3Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() == 111) {
            com.tencent.mm.ui.chatting.viewitems.m3 m3Var = new com.tencent.mm.ui.chatting.viewitems.m3(ui6, f9Var, this);
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, m3Var);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        if (f9Var.j() == null) {
            return true;
        }
        yb5.d dVar = this.f204902s;
        ot0.q v18 = ot0.q.v(dVar != null ? c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()) : null);
        if (v18 == null) {
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v18.f348646d;
        ((kt.c) i0Var).getClass();
        boolean z17 = false;
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var) && ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(j17) && !com.tencent.mm.ui.chatting.n3.k(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && !com.tencent.mm.ui.chatting.n3.D(f9Var) && f9Var.P0() != 1) {
            menu.c(d17, 111, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204902s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())) {
            yb5.d dVar2 = this.f204902s;
            if ((dVar2 == null || dVar2.A()) ? false : true) {
                menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
        }
        if (!c01.ia.A(f9Var)) {
            j45.l.g("favorite");
            if ((j17 == null || !j17.k()) && v18.f348717u2 == 0 && com.tencent.mm.ui.chatting.la.b((com.tencent.mm.pluginsdk.ui.tools.h0) v18.y(com.tencent.mm.pluginsdk.ui.tools.h0.class))) {
                menu.c(d17, 116, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
        }
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long msgId = f9Var.getMsgId();
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = msgId;
            b6Var.f6220b = f9Var.Q0();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (!c01.ia.A(f9Var) && exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                menu.c(d17, 129, 0, v17.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
            }
        }
        yb5.d dVar3 = this.f204902s;
        if (dVar3 != null && !dVar3.F()) {
            z17 = true;
        }
        if (z17) {
            menu.c(d17, 100, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(ui6.g(), msg.G, null)) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        java.lang.String j17 = msg.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId)) {
            com.tencent.mm.ui.chatting.w5.e(ui6, v17, c01.z1.r(), h17, msg.I0(), ui6.x());
        }
        return com.tencent.mm.ui.chatting.viewitems.q3.a(com.tencent.mm.ui.chatting.viewitems.r3.f205405a, v17, ui6);
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new com.tencent.mm.ui.chatting.viewitems.f3(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        this.f204902s = ui6;
        uiBlock.d(new com.tencent.mm.ui.chatting.viewitems.k3(com.tencent.mm.ui.chatting.viewitems.r3.f205405a.b(msgData.f394254d.f445300b, ui6)));
        uiBlock.d(new com.tencent.mm.ui.chatting.viewitems.l3(this, ui6, msgData));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.ui.chatting.viewitems.e3 e3Var = holder instanceof com.tencent.mm.ui.chatting.viewitems.e3 ? (com.tencent.mm.ui.chatting.viewitems.e3) holder : null;
        if (e3Var != null) {
            e(ui6, msgData, str, new we5.y0(new we5.u0(e3Var)));
        }
    }
}
