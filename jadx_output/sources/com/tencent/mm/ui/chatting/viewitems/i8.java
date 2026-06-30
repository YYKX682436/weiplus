package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f204170a;

    /* renamed from: b, reason: collision with root package name */
    public yb5.d f204171b;

    public i8(boolean z17) {
        this.f204170a = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.ui.chatting.viewitems.a0 r35, com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder r36, com.tencent.mm.ui.chatting.adapter.q r37, yb5.d r38, rd5.d r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.i8.a(com.tencent.mm.ui.chatting.viewitems.a0, com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder, com.tencent.mm.ui.chatting.adapter.q, yb5.d, rd5.d, java.lang.String):void");
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        boolean z17 = this.f204170a;
        com.tencent.mm.ui.chatting.viewitems.xg xgVar = z17 ? new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488503v3) : new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488546wn);
        xgVar.setTag(new com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder().build(xgVar, !z17));
        return xgVar;
    }

    public final boolean c(com.tencent.mm.ui.chatting.viewitems.a0 chattingItem, db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        kotlin.jvm.internal.o.g(chattingItem, "chattingItem");
        com.tencent.mm.storage.f9 f9Var = dVar != null ? dVar.f394254d.f445300b : null;
        if (g4Var == null || view == null) {
            return false;
        }
        yb5.d dVar2 = this.f204171b;
        if (dVar2 != null) {
            if (this.f204170a) {
                java.lang.Object tag = view.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
                if (f9Var != null) {
                    g4Var.removeItem(116);
                }
            } else {
                java.lang.Object tag2 = view.getTag();
                kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag2).d();
                if (f9Var != null) {
                    g4Var.removeItem(116);
                    if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar2) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar2.A()) {
                        g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                    }
                }
            }
        }
        return true;
    }

    public final boolean d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || dVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFinderOrder", "onItemClick content is null");
        } else {
            r45.un2 un2Var = ((zy2.j) v17.y(zy2.j.class)).f477426b;
            android.app.Activity g17 = dVar.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            java.lang.String string = un2Var.getString(6);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = un2Var.getString(7);
            java.lang.String str = string2 != null ? string2 : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFinderOrder", "enterShoppingWeApp appId:" + string + ",enterPath:" + str);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = string;
            b1Var.f317022f = str;
            b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.pay.p0.CTRL_INDEX;
            ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).getClass();
            b1Var.f317016c = zl2.q4.f473933a.x();
            b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, 0, null, false, null, false, null, k91.t2.f305768f, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f77386f, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -67108994, 2047, null);
            b1Var.L = new com.tencent.mm.ui.chatting.viewitems.h8();
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(g17, b1Var);
        }
        com.tencent.mm.ui.chatting.component.c0.f198856r.b(dVar, view, msg);
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", msg, "ecs_kf_card_order");
        return true;
    }

    public final void e(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (this.f204170a || !msg.k2()) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.k0.z(msg);
        c01.w9.f(msg.getMsgId(), msg.Q0());
        ui6.L(true);
    }
}
