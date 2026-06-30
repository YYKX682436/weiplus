package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public abstract class hc {
    public static void a(com.tencent.mm.ui.chatting.viewitems.ya yaVar) {
        wl5.x xVar = yaVar.f206059j;
        if (xVar != null) {
            xVar.k();
            wl5.x xVar2 = yaVar.f206059j;
            xVar2.M = true;
            xVar2.N = true;
            xVar2.i();
        }
    }

    public static r15.f b(r15.g gVar, com.tencent.mm.storage.f9 f9Var, android.content.Context context) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = ti3.i.j(context, f9Var.getType(), f9Var.U1(), f9Var.A0() == 1);
        if (gVar != null) {
            return r15.h.b(j17, gVar);
        }
        return null;
    }

    public static ti3.l c(yb5.d dVar, float f17, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        boolean z17 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).T;
        f21.a m07 = f21.r0.wi().m0(dVar.x());
        int intValue = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
        if ((m07 == null || m07.f258833b == -2) && (m07 != null || intValue == -2)) {
            return ti3.i.f(dVar.g(), f17, f9Var, f9Var2, msgQuoteItem);
        }
        int color = z17 ? dVar.g().getResources().getColor(com.tencent.mm.R.color.f478872ji) : dVar.g().getResources().getColor(com.tencent.mm.R.color.a0b);
        android.app.Activity g17 = dVar.g();
        int i17 = ti3.i.f419588a;
        if (f9Var2 == null) {
            return new ti3.l(false, "", 0);
        }
        ui3.b D0 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().D0(f9Var2.Q0(), f9Var2.I0());
        if (f9Var2.getMsgId() == 0 && msgQuoteItem.f149482d == 0) {
            return new ti3.l(false, g17.getString(com.tencent.mm.R.string.gzj), 0);
        }
        if ((D0 != null && D0.field_status == 1) || f9Var2.W2()) {
            return new ti3.l(false, g17.getString(com.tencent.mm.R.string.f492571h03), 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = msgQuoteItem.f149486h;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String d17 = ti3.i.d(f9Var2, str);
        ((ke0.e) xVar).getClass();
        sb6.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.j(g17, d17, f17));
        sb6.append("：");
        int length = sb6.length();
        java.lang.String i18 = ti3.i.i(g17, f9Var2.getType(), f9Var2.getType() == 34 ? f9Var2.j() : f9Var2.U1(), f9Var2.A0() == 1);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "getShowSummaryWithColor() msgQute is null");
            if (com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString())) {
                return new ti3.l(false, "", 0);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
            android.graphics.drawable.Drawable h17 = ti3.i.h(g17, f9Var2);
            com.tencent.mm.ui.uk.f(h17, color);
            if (h17 != null) {
                return new ti3.l(true, ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ai(g17, sb6, h17, true), length);
            }
        } else {
            android.graphics.drawable.Drawable h18 = ti3.i.h(g17, f9Var2);
            com.tencent.mm.ui.uk.f(h18, color);
            if (h18 != null) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(g17, i18, f17);
                ((ke0.e) xVar2).getClass();
                return new ti3.l(true, com.tencent.mm.pluginsdk.ui.span.c0.b(g17, sb6, j17, h18, true, true), length);
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            sb6.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.j(g17, i18, f17));
        }
        return new ti3.l(true, sb6, length);
    }
}
