package we5;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.ui.chatting.viewitems.nn implements we5.b {
    @Override // we5.b
    public rd5.d b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new we5.p0(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f204935s = ui6;
        int h17 = i65.a.h(ui6.g(), com.tencent.mm.R.dimen.f479897ia);
        uiBlock.d(new we5.d0(f9Var, msgData, ui6));
        uiBlock.d(new we5.e0(this, f9Var));
        java.lang.String b17 = com.tencent.mm.ui.chatting.viewitems.bo.b(f9Var);
        if (j65.e.b() && j65.e.f()) {
            uiBlock.d(new we5.f0(f9Var, ui6));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
        }
        boolean z19 = f9Var.G != null && (f9Var.r2() || f9Var.y2());
        uiBlock.d(new we5.g0(f9Var, ui6, str));
        boolean D = ui6.D();
        int a17 = k01.d.a(f9Var.Q0());
        android.os.Bundle a18 = (D ? com.tencent.mm.pluginsdk.ui.span.l1.f191253g : com.tencent.mm.pluginsdk.ui.span.l1.f191252f).a(a17);
        a18.putInt("key_wxa_short_link_launch_chat_type", a17);
        com.tencent.mm.plugin.wallet_core.utils.t.f180986a.a(a18, f9Var);
        android.os.Bundle c17 = com.tencent.mm.ui.chatting.viewitems.bo.c(f9Var, ui6, str);
        c17.putAll(a18);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        boolean z27 = !c01.ia.D(f9Var);
        boolean z28 = ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).Ai() && c01.ia.d(f9Var);
        if (z19) {
            obj = com.tencent.mm.pluginsdk.ui.span.z0.class;
            z17 = z27;
            if (z19) {
                c17.putInt("geta8key_scene", 31);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = ui6.g();
                java.lang.String i17 = com.tencent.mm.ui.chatting.viewitems.bo.i(ui6.g(), b17, f9Var);
                java.lang.String d07 = d0(f9Var);
                le0.r rVar = le0.x.P0;
                ((ke0.e) xVar).getClass();
                h0Var.f310123d = com.tencent.mm.pluginsdk.ui.span.c0.t(g17, i17, h17, 4, c17, d07, 0, rVar, z17, z28);
            }
            z18 = true;
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g18 = ui6.g();
            java.lang.String d08 = d0(f9Var);
            le0.r rVar2 = le0.x.P0;
            ((ke0.e) xVar2).getClass();
            z17 = z27;
            h0Var.f310123d = com.tencent.mm.pluginsdk.ui.span.c0.t(g18, b17, h17, 4, c17, d08, 0, rVar2, z17, z28);
            com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) ui6.f460708c.a(sb5.u1.class));
            if (jkVar.m0(f9Var.getMsgId())) {
                java.util.ArrayList arrayList = jkVar.f199300n;
                kotlin.jvm.internal.o.f(arrayList, "getHighlightKeywordList(...)");
                java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
                p13.g gVar = p13.g.Background;
                int i18 = com.tencent.mm.plugin.fts.ui.c.f138024b;
                p13.i a19 = p13.i.a(charSequence, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, " "), false, false);
                a19.f351097e = gVar;
                a19.f351098f = i18;
                uiBlock.d(new we5.h0(o13.q.e(a19)));
                z18 = false;
            } else {
                z18 = true;
            }
            android.text.SpannableString spannableString = (android.text.SpannableString) h0Var.f310123d;
            com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) spannableString.getSpans(0, spannableString.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
            kotlin.jvm.internal.o.d(z0VarArr);
            int length = z0VarArr.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                if (z0VarArr[i19].getType() == 44) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 6, "");
                    break;
                }
                i19++;
            }
            obj = com.tencent.mm.pluginsdk.ui.span.z0.class;
        }
        java.lang.Object obj2 = h0Var.f310123d;
        if (obj2 != null) {
            android.text.SpannableString spannableString2 = (android.text.SpannableString) obj2;
            com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr2 = (com.tencent.mm.pluginsdk.ui.span.z0[]) spannableString2.getSpans(0, spannableString2.length(), obj);
            uiBlock.d(we5.i0.f445343d);
            kotlin.jvm.internal.o.d(z0VarArr2);
            for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr2) {
                int[] iArr = {((android.text.SpannableString) h0Var.f310123d).getSpanStart(z0Var), ((android.text.SpannableString) h0Var.f310123d).getSpanEnd(z0Var), com.tencent.mm.ui.chatting.viewitems.a0.y(z0Var)};
                if (iArr[1] - iArr[0] < b17.length()) {
                    uiBlock.d(new we5.j0(iArr));
                }
            }
        }
        if (z18) {
            uiBlock.d(new we5.k0(ui6, f9Var, h0Var));
        }
        if (x63.g.G(f9Var)) {
            uiBlock.d(new we5.m0(ui6));
        } else {
            uiBlock.d(we5.w.f445394d);
        }
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        if (f9Var.r2() || f9Var.y2()) {
            h0Var2.f310123d = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        }
        uiBlock.d(new we5.x(f9Var, h0Var2, ui6));
        uiBlock.d(we5.y.f445401d);
        uiBlock.d(new we5.z(this, f9Var));
        uiBlock.d(new we5.a0(ui6, c01.ia.j(f9Var), h0Var, z17));
        uiBlock.d(new we5.b0(this, f9Var, c01.ia.A(f9Var), c01.ia.y(f9Var), c01.ia.x(f9Var)));
        uiBlock.d(new we5.c0(f9Var, ui6, this, msgData, c17));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        e(ui6, msgData, str, new we5.y0(new we5.u0((com.tencent.mm.ui.chatting.viewitems.ao) tag)));
    }
}
