package ze5;

/* loaded from: classes9.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.c a(ze5.o oVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        oVar.getClass();
        z01.c cVar = new z01.c();
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.c();
        }
        l15.c cVar2 = new l15.c();
        cVar2.fromXml(U1);
        v05.b k17 = cVar2.k();
        if (k17 == null) {
            return new z01.c();
        }
        cVar.f468958d = k17.getString(k17.f368365d + 2);
        int i17 = k17.f432315e;
        cVar.f468961g = (s05.d) k17.getCustom(i17 + 39);
        cVar.f468962h = (v05.a) k17.getCustom(i17 + 8);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        cVar.f468959e = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        cVar.f468960f = k17.getString(i17 + 12);
        cVar.f468969r = new ze5.g(dVar, f9Var);
        cVar.f468970s = new ze5.h(dVar, f9Var);
        return cVar;
    }

    public static final boolean b(ze5.o oVar, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        oVar.getClass();
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

    public static final boolean c(ze5.o oVar, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        oVar.getClass();
        if (menuItem.getItemId() != 111) {
            return false;
        }
        ze5.i iVar = new ze5.i(dVar, f9Var);
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, iVar);
        return true;
    }
}
