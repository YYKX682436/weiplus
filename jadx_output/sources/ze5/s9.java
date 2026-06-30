package ze5;

/* loaded from: classes9.dex */
public final class s9 {
    public s9(kotlin.jvm.internal.i iVar) {
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
            com.tencent.mm.ui.chatting.viewitems.s1.c(ui6, msg, chattingItem.A(ui6, msg), 2000, ze5.r9.f472184a);
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
        if (133 != v18.f348666i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTingSpaceMvvm", "onCreateContextMenu, not ting space type, but enter here.");
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v18.f348646d;
        ((kt.c) i0Var).getClass();
        if (((kt.c) i0Var).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) && !com.tencent.mm.ui.chatting.n3.k(msg) && !com.tencent.mm.ui.chatting.n3.j(msg) && msg.P0() != 1) {
            menu.c(d17, 111, 0, ui6.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (!z17 && ((msg.P0() == 2 || msg.P0() == 3 || msg.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(msg, ui6) && com.tencent.mm.ui.chatting.viewitems.a0.J(msg.Q0()) && !ui6.A())) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!ui6.F()) {
            menu.c(d17, 100, 0, ui6.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public final boolean c(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.j() == null || (v17 = ot0.q.v(msg.U1())) == null) {
            return false;
        }
        il4.a aVar = (il4.a) v17.y(il4.a.class);
        bw5.o50 o50Var = aVar != null ? aVar.f292095e : null;
        if (o50Var == null) {
            return false;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((rk4.k8) aj6).E(g17, o50Var);
        return true;
    }

    public final z01.f0 d(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        java.lang.String d17;
        bw5.g60 e17;
        bw5.mc0 b17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String U1 = msg.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.f0();
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        if (cVar.k() == null) {
            return new z01.f0();
        }
        z01.f0 f0Var = new z01.f0();
        ot0.q v17 = ot0.q.v(msg.U1());
        il4.a aVar = v17 != null ? (il4.a) v17.y(il4.a.class) : null;
        bw5.o50 o50Var = aVar != null ? aVar.f292095e : null;
        f0Var.f469008d = ui6.s().getString(com.tencent.mm.R.string.piq);
        android.content.res.Resources s17 = ui6.s();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String nickname = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        objArr[0] = nickname;
        java.lang.String name = o50Var != null ? o50Var.getName() : null;
        objArr[1] = name != null ? name : "";
        f0Var.f469009e = s17.getString(com.tencent.mm.R.string.pir, objArr);
        java.util.List b18 = kz5.b0.b();
        java.util.LinkedList linkedList = (o50Var == null || (e17 = o50Var.e()) == null) ? null : e17.f27701e;
        if (!(linkedList == null || linkedList.isEmpty())) {
            ((lz5.e) b18).addAll(kz5.n0.K0(linkedList, 4));
        } else if (o50Var != null && (d17 = o50Var.d()) != null) {
            java.lang.String str = d17.length() > 0 ? d17 : null;
            if (str != null) {
                ((lz5.e) b18).add(str);
            }
        }
        java.util.List a17 = kz5.b0.a(b18);
        kotlin.jvm.internal.o.g(a17, "<set-?>");
        f0Var.f469011g = a17;
        f0Var.f469010f = com.tencent.mm.R.drawable.f481244ob;
        return f0Var;
    }
}
