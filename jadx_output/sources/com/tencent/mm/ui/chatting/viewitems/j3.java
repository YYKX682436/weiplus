package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class j3 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204224s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e17);
        com.tencent.mm.ui.chatting.viewitems.e3 e3Var = new com.tencent.mm.ui.chatting.viewitems.e3();
        e3Var.a(xgVar, true);
        xgVar.setTag(e3Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() == 111) {
            if (!com.tencent.mm.ui.chatting.la.a(f9Var)) {
                db5.e1.y(ui6.g(), ui6.g().getString(com.tencent.mm.R.string.c96), "", ui6.g().getString(com.tencent.mm.R.string.l_e), null);
                return false;
            }
            com.tencent.mm.ui.chatting.viewitems.i3 i3Var = new com.tencent.mm.ui.chatting.viewitems.i3(ui6, f9Var, this);
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, i3Var);
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
        yb5.d dVar = this.f204224s;
        ot0.q v18 = ot0.q.v(dVar != null ? c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()) : null);
        boolean z17 = false;
        if (v18 == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v18.f348646d;
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) && !com.tencent.mm.ui.chatting.n3.k(f9Var) && !c01.ia.x(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && !com.tencent.mm.ui.chatting.n3.D(f9Var)) {
            menu.c(d17, 111, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long msgId = f9Var.getMsgId();
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = msgId;
            b6Var.f6220b = f9Var.Q0();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                menu.c(d17, 129, 0, v17.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
            }
        }
        if (c01.ia.A(f9Var)) {
            menu.clear();
        }
        yb5.d dVar2 = this.f204224s;
        if (dVar2 != null && !dVar2.F()) {
            z17 = true;
        }
        if (z17) {
            menu.c(d17, 100, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(ui6.g(), msg.G, null)) {
            return false;
        }
        com.tencent.mm.modelstat.b.d(msg, com.tencent.mm.modelstat.a.Click, ui6.f460722q, ui6.k());
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        if (msg.j() == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v(c01.w9.l(ui6.D(), msg.j(), msg.A0()));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        kotlin.jvm.internal.o.d(v17);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        java.lang.String t17 = com.tencent.mm.ui.chatting.viewitems.a0.t(ui6, msg);
        if (j17 != null) {
            com.tencent.mm.ui.chatting.w5.e(ui6, v17, t17, j17, msg.I0(), ui6.x());
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
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f204224s = ui6;
        uiBlock.d(new com.tencent.mm.ui.chatting.viewitems.g3(com.tencent.mm.ui.chatting.viewitems.r3.f205405a.b(f9Var, ui6)));
        uiBlock.d(new com.tencent.mm.ui.chatting.viewitems.h3(this, ui6, msgData));
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
