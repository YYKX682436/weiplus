package ze5;

/* loaded from: classes9.dex */
public final class w {
    public w(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.b a(ze5.w wVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        wVar.getClass();
        z01.b bVar = new z01.b();
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.b();
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return new z01.b();
        }
        bVar.f468944d = k17.getString(k17.f368365d + 2);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        bVar.f468945e = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        int i17 = k17.f432315e + 39;
        bVar.f468947g = (s05.d) k17.getCustom(i17);
        s05.d dVar2 = (s05.d) k17.getCustom(i17);
        bVar.f468946f = dVar2 != null ? dVar2.r() : null;
        s05.d dVar3 = (s05.d) k17.getCustom(i17);
        bVar.f468949i = dVar3 != null ? dVar3.j() : 0;
        bVar.f468950m = new ze5.u(dVar, f9Var);
        return bVar;
    }

    public static final boolean b(ze5.w wVar, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        wVar.getClass();
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String string = k17.getString(k17.f368365d + 0);
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(string, false, false)) && !com.tencent.mm.ui.chatting.n3.k(f9Var) && !c01.ia.x(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && !com.tencent.mm.ui.chatting.n3.D(f9Var)) {
            g4Var.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long msgId = f9Var.getMsgId();
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = msgId;
            b6Var.f6220b = f9Var.Q0();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                g4Var.c(d17, 129, 0, view.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
            }
        }
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!dVar.F()) {
            g4Var.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public static final boolean c(ze5.w wVar, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        wVar.getClass();
        if (menuItem.getItemId() != 111) {
            return false;
        }
        ze5.v vVar = new ze5.v(dVar, f9Var);
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, vVar);
        return true;
    }
}
