package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class xe {
    public static boolean a(yb5.d dVar, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, content is null");
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        if (!((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) || com.tencent.mm.ui.chatting.n3.k(f9Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, do not show transmit menu");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, show transmit menu");
        g4Var.c(d17, 111, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        return true;
    }
}
