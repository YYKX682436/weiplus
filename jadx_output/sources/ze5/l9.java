package ze5;

/* loaded from: classes9.dex */
public final class l9 {
    public l9(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.ui.chatting.viewitems.a0 chattingItem, android.view.MenuItem item, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(chattingItem, "chattingItem");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (item.getItemId() != 111) {
            return false;
        }
        if (com.tencent.mm.ui.chatting.la.a(msg)) {
            com.tencent.mm.ui.chatting.viewitems.s1.c(ui6, msg, chattingItem.A(ui6, msg), 2000, new ze5.k9(msg, chattingItem));
            return false;
        }
        db5.e1.y(ui6.g(), ui6.g().getString(com.tencent.mm.R.string.c96), "", ui6.g().getString(com.tencent.mm.R.string.l_e), null);
        return false;
    }

    public final boolean b(yb5.d ui6, db5.g4 menu, android.view.View v17, com.tencent.mm.storage.f9 msg, boolean z17) {
        ot0.q v18;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        if (msg.j() == null || (v18 = ot0.q.v(c01.w9.l(ui6.D(), msg.j(), msg.A0()))) == null) {
            return true;
        }
        if (93 != v18.f348666i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTingCategoryMvvm", "onCreateContextMenu(from), not ting list type, but enter here.");
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v18.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (((kt.c) i0Var).nj(j17) && !com.tencent.mm.ui.chatting.n3.k(msg) && !com.tencent.mm.ui.chatting.n3.j(msg) && msg.P0() != 1) {
            menu.c(d17, 111, 0, ui6.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!z17 && ((msg.P0() == 2 || msg.P0() == 3 || msg.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(msg, ui6) && com.tencent.mm.ui.chatting.viewitems.a0.J(msg.Q0()) && !ui6.A())) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        j45.l.g("favorite");
        if (j17 == null || !j17.k()) {
            menu.c(d17, 116, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        }
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        long msgId = msg.getMsgId();
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        b6Var.f6219a = msgId;
        b6Var.f6220b = msg.Q0();
        exDeviceHaveBindNetworkDeviceEvent.e();
        if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
            menu.c(d17, 129, 0, v17.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
        }
        if (!ui6.F()) {
            menu.c(d17, 100, 0, ui6.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public final boolean c(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.modelstat.b.d(msg, com.tencent.mm.modelstat.a.Click, ui6.f460722q, ui6.k());
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        if (msg.j() == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v(c01.w9.l(ui6.D(), msg.j(), msg.A0()));
        com.tencent.mm.ui.chatting.o6 o6Var = com.tencent.mm.ui.chatting.o6.f202065a;
        kotlin.jvm.internal.o.d(v17);
        return o6Var.c(v17, msg);
    }

    public final z01.e0 d(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String U1 = msg.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.e0();
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        if (cVar.k() == null) {
            return new z01.e0();
        }
        z01.e0 e0Var = new z01.e0();
        ot0.q v17 = ot0.q.v(msg.U1());
        ot0.h y17 = v17.y(il4.a.class);
        kotlin.jvm.internal.o.f(y17, "piece(...)");
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        r45.lm6 a17 = il4.d.a(g17, (il4.a) y17, v17, msg);
        android.app.Activity g18 = ui6.g();
        kotlin.jvm.internal.o.f(g18, "getContext(...)");
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = new com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView(g18);
        tingCategoryMvvmView.c();
        tingCategoryMvvmView.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
        tingCategoryMvvmView.g(a17, null);
        java.lang.String str = a17.f379637d;
        if (str == null) {
            str = "";
        }
        e0Var.f469000e = str;
        java.lang.String str2 = a17.f379638e;
        e0Var.f469001f = str2 != null ? str2 : "";
        e0Var.f468999d = tingCategoryMvvmView;
        e0Var.f469002g = com.tencent.mm.R.drawable.f481244ob;
        return e0Var;
    }
}
