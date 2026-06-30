package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class k6 {
    public static void a(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.h6 h6Var, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (te5.e2.e(v17)) {
            com.tencent.mm.modelmulti.WxaInfo g17 = te5.e2.g(v17);
            com.tencent.mm.pluginsdk.ui.chat.ca caVar = new com.tencent.mm.pluginsdk.ui.chat.ca();
            caVar.f190246a = g17;
            caVar.f190247b = dVar.x();
            caVar.f190248c = te5.e2.d(f9Var);
            com.tencent.mm.ui.chatting.w5.q(dVar, h6Var.f204085f, caVar);
            h6Var.f204085f.setVisibility(0);
            h6Var.f204086g.setText(dVar.g().getString(com.tencent.mm.R.string.epp, g17.f71262e));
            h6Var.f204087h.setImageResource(com.tencent.mm.R.raw.app_brand_source_view_icon);
            return;
        }
        if (v17 == null || (str = v17.f348646d) == null || str.isEmpty()) {
            h6Var.f204085f.setVisibility(8);
            return;
        }
        java.lang.String str3 = v17.f348646d;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        int i17 = v17.G;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m i18 = com.tencent.mm.pluginsdk.model.app.w.i(str3, i17);
        java.lang.String str4 = (i18 == null || (str2 = i18.field_appName) == null || str2.trim().isEmpty()) ? v17.H : i18.field_appName;
        if (!com.tencent.mm.ui.chatting.w5.y(str4)) {
            h6Var.f204085f.setVisibility(8);
            return;
        }
        h6Var.f204085f.setVisibility(0);
        h6Var.f204086g.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), i18, str4));
        com.tencent.mm.ui.chatting.w5.u(dVar, h6Var.f204087h, str3);
        if (i18 == null || !i18.k()) {
            com.tencent.mm.ui.chatting.w5.r(dVar, h6Var.f204086g, str3);
        } else {
            com.tencent.mm.ui.chatting.w5.p(dVar, h6Var.f204086g, f9Var, v17, i18.field_packageName, f9Var.I0());
        }
    }

    public static void b(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        if (c01.d9.b().E()) {
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppEmojClickListener", "exit in teen mode");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(dVar.g());
                return;
            }
            java.lang.String x17 = com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? dVar.x() : null;
            s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
            android.app.Activity g17 = dVar.g();
            ((y12.h) wi6).getClass();
            if (g17 != null) {
                com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
                ot0.q v17 = ot0.q.v(f9Var.j());
                if (v17 == null) {
                    v17 = new ot0.q();
                    v17.f348698q = y4Var.f196356d;
                }
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(v17.f348698q);
                if (u17 == null || !u17.E0()) {
                    y12.h.G(f9Var.getMsgId(), v17);
                } else if (f9Var.A0() == 1) {
                    y12.h.X(g17, v17.f348698q, v17.f348646d, v17.H, f9Var.I0(), f9Var.Q0(), f9Var.j(), x17);
                } else {
                    y12.h.X(g17, u17.getMd5(), v17.f348646d, v17.H, f9Var.I0(), f9Var.Q0(), f9Var.j(), x17);
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiMgrImpl", "context or msg is null");
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11592, 0);
        }
    }
}
