package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class he {
    public static boolean a(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        ot0.q v17;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var.j() != null && (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) != null) {
            if (118 != v17.f348666i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgTingChatRoom", "onCreateContextMenu(from), not ting chatroom type, but enter here.");
            } else {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = v17.f348646d;
                ((kt.c) i0Var).getClass();
                com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
                if (!z17 && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar.A())) {
                    g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                }
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                long msgId = f9Var.getMsgId();
                am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
                b6Var.f6219a = msgId;
                b6Var.f6220b = f9Var.Q0();
                exDeviceHaveBindNetworkDeviceEvent.e();
                if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                    g4Var.c(d17, 129, 0, view.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
                }
                if (!dVar.F()) {
                    g4Var.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                }
            }
        }
        return true;
    }

    public static boolean b(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (menuItem.getItemId() != 111) {
            return false;
        }
        if (com.tencent.mm.ui.chatting.la.a(f9Var)) {
            com.tencent.mm.ui.chatting.viewitems.s1.c(dVar, f9Var, a0Var.A(dVar, f9Var), 2000, new com.tencent.mm.ui.chatting.viewitems.ce(f9Var, a0Var));
            return false;
        }
        db5.e1.y(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.c96), "", dVar.g().getString(com.tencent.mm.R.string.l_e), null);
        return false;
    }

    public static boolean c(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.modelstat.b.d(f9Var, com.tencent.mm.modelstat.a.Click, dVar.f460722q, dVar.k());
        boolean z17 = true;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        if (f9Var.j() == null) {
            return false;
        }
        ot0.q content = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        kotlin.jvm.internal.o.g(content, "content");
        il4.b bVar = (il4.b) content.y(il4.b.class);
        if (bVar == null) {
            z17 = false;
        } else {
            bw5.o50 v17 = il4.d.v(bVar.f292097c);
            if (v17 != null) {
                qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                qk.f9.a(aj6, context, v17, bw5.ar0.TingScene_Chat, false, null, 24, null);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMusicPlayHelper", "openChatRoomCategoryItem categoryItem parse failed");
            }
        }
        return z17;
    }
}
