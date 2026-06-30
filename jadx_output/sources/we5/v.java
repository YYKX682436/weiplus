package we5;

/* loaded from: classes9.dex */
public class v extends com.tencent.mm.ui.chatting.viewitems.gn implements we5.b {

    /* renamed from: x, reason: collision with root package name */
    public static final we5.e f445393x = new we5.e(null);

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
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlocks) {
        int i17;
        com.tencent.mm.ui.chatting.manager.c cVar;
        kotlin.jvm.internal.h0 h0Var;
        boolean z17;
        android.text.SpannableString t17;
        android.text.SpannableString t18;
        int t19;
        java.lang.Object m521constructorimpl;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlocks, "uiBlocks");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f204055s = ui6;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = com.tencent.mm.ui.chatting.viewitems.bo.b(f9Var);
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        h0Var3.f310123d = ui6.x();
        int h17 = i65.a.h(ui6.g(), com.tencent.mm.R.dimen.f479897ia);
        uiBlocks.d(new we5.p(this, ui6, f9Var, msgData));
        if (j65.e.b() && j65.e.f()) {
            uiBlocks.d(new we5.q(f9Var, ui6));
        }
        kotlin.jvm.internal.h0 h0Var4 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var5 = new kotlin.jvm.internal.h0();
        h0Var5.f310123d = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        boolean a17 = com.tencent.mm.app.plugin.k.a();
        com.tencent.mm.ui.chatting.manager.c cVar2 = ui6.f460708c;
        if (a17) {
            if (f9Var.i2() && f9Var.b2()) {
                h0Var4.f310123d = f9Var.W0();
            }
            h0Var5.f310123d = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) cVar2.a(sb5.l2.class))).v0(f9Var);
        }
        if (!ui6.D() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar2.a(sb5.f.class))).f198753r || (t19 = c01.w9.t((java.lang.String) h0Var2.f310123d)) == -1) {
            i17 = h17;
            cVar = cVar2;
            h0Var = h0Var5;
        } else {
            java.lang.Object element = h0Var2.f310123d;
            kotlin.jvm.internal.o.f(element, "element");
            java.lang.String substring = ((java.lang.String) element).substring(0, t19);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            cVar = cVar2;
            h0Var = h0Var5;
            int length = substring.length() - 1;
            int i18 = 0;
            boolean z18 = false;
            while (true) {
                i17 = h17;
                if (i18 > length) {
                    break;
                }
                boolean z19 = kotlin.jvm.internal.o.i(substring.charAt(!z18 ? i18 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z19) {
                    i18++;
                } else {
                    h17 = i17;
                    z18 = true;
                }
                h17 = i17;
            }
            java.lang.String obj = substring.subSequence(i18, length + 1).toString();
            if (obj != null && obj.length() > 0) {
                h0Var3.f310123d = obj;
            }
            java.lang.Object element2 = h0Var2.f310123d;
            kotlin.jvm.internal.o.f(element2, "element");
            int i19 = t19 + 1;
            java.lang.String substring2 = ((java.lang.String) element2).substring(i19);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            int length2 = substring2.length() - 1;
            boolean z27 = false;
            int i27 = 0;
            while (i27 <= length2) {
                boolean z28 = kotlin.jvm.internal.o.i(substring2.charAt(!z27 ? i27 : length2), 32) <= 0;
                if (z27) {
                    if (!z28) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z28) {
                    i27++;
                } else {
                    z27 = true;
                }
            }
            h0Var2.f310123d = substring2.subSequence(i27, length2 + 1).toString();
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var4.f310123d)) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    java.lang.String str3 = (java.lang.String) h0Var4.f310123d;
                    if (str3 != null) {
                        java.lang.String substring3 = str3.substring(i19);
                        kotlin.jvm.internal.o.f(substring3, "substring(...)");
                        int length3 = substring3.length() - 1;
                        boolean z29 = false;
                        int i28 = 0;
                        while (i28 <= length3) {
                            boolean z37 = kotlin.jvm.internal.o.i(substring3.charAt(!z29 ? i28 : length3), 32) <= 0;
                            if (z29) {
                                if (!z37) {
                                    break;
                                } else {
                                    length3--;
                                }
                            } else if (z37) {
                                i28++;
                            } else {
                                z29 = true;
                            }
                        }
                        str2 = substring3.subSequence(i28, length3 + 1).toString();
                    } else {
                        str2 = null;
                    }
                    h0Var4.f310123d = str2;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFrom", "substring error!");
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemTextFrom", m524exceptionOrNullimpl, "substring error", new java.lang.Object[0]);
                }
            }
        }
        uiBlocks.d(new we5.r(this, ui6, f9Var, h0Var3));
        uiBlocks.d(new we5.s(this, ui6, h0Var3, f9Var));
        boolean z38 = f9Var.G != null && (f9Var.r2() || f9Var.y2());
        uiBlocks.d(new we5.t(f9Var, ui6, h0Var3));
        boolean D = ui6.D();
        int a18 = k01.d.a(f9Var.Q0());
        android.os.Bundle a19 = (D ? com.tencent.mm.pluginsdk.ui.span.l1.f191253g : com.tencent.mm.pluginsdk.ui.span.l1.f191252f).a(a18);
        a19.putInt("key_wxa_short_link_launch_chat_type", a18);
        com.tencent.mm.plugin.wallet_core.utils.t.f180986a.a(a19, f9Var);
        android.os.Bundle c17 = com.tencent.mm.ui.chatting.viewitems.bo.c(f9Var, ui6, (java.lang.String) h0Var3.f310123d);
        c17.putAll(a19);
        kotlin.jvm.internal.h0 h0Var6 = new kotlin.jvm.internal.h0();
        boolean z39 = !c01.ia.D(f9Var);
        boolean z47 = ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).Ai() && c01.ia.d(f9Var);
        if (z38) {
            int i29 = i17;
            if (z38) {
                c17.putInt("geta8key_scene", 31);
                if (com.tencent.mm.storage.z3.m4((java.lang.String) h0Var3.f310123d)) {
                    android.app.Activity g17 = ui6.g();
                    java.lang.String i37 = com.tencent.mm.ui.chatting.viewitems.bo.i(ui6.g(), (java.lang.String) h0Var2.f310123d, f9Var);
                    java.lang.String d07 = d0(f9Var);
                    le0.r rVar = le0.x.P0;
                    com.tencent.mm.pluginsdk.ui.span.j1 w17 = com.tencent.mm.pluginsdk.ui.span.c0.w(g17, z39, 1, c17, d07);
                    w17.f191226e = false;
                    ((le0.v) rVar).a(g17, w17);
                    t17 = w17.e(i37, i29, true);
                } else {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g18 = ui6.g();
                    java.lang.String i38 = com.tencent.mm.ui.chatting.viewitems.bo.i(ui6.g(), (java.lang.String) h0Var2.f310123d, f9Var);
                    java.lang.String d08 = d0(f9Var);
                    le0.r rVar2 = le0.x.P0;
                    ((ke0.e) xVar).getClass();
                    t17 = com.tencent.mm.pluginsdk.ui.span.c0.t(g18, i38, i29, 1, c17, d08, 0, rVar2, z39, z47);
                }
                h0Var6.f310123d = t17;
            }
            z17 = true;
        } else {
            if (com.tencent.mm.storage.z3.m4((java.lang.String) h0Var3.f310123d)) {
                android.app.Activity g19 = ui6.g();
                java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var2.f310123d;
                java.lang.String d09 = d0(f9Var);
                le0.r rVar3 = le0.x.P0;
                com.tencent.mm.pluginsdk.ui.span.j1 w18 = com.tencent.mm.pluginsdk.ui.span.c0.w(g19, z39, 1, c17, d09);
                w18.f191226e = false;
                ((le0.v) rVar3).a(g19, w18);
                t18 = w18.e(charSequence, i17, true);
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g27 = ui6.g();
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) h0Var2.f310123d;
                java.lang.String d010 = d0(f9Var);
                le0.r rVar4 = le0.x.P0;
                ((ke0.e) xVar2).getClass();
                t18 = com.tencent.mm.pluginsdk.ui.span.c0.t(g27, charSequence2, i17, 1, c17, d010, 0, rVar4, z39, z47);
            }
            h0Var6.f310123d = t18;
            com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class));
            if (jkVar.m0(f9Var.getMsgId())) {
                java.util.ArrayList arrayList = jkVar.f199300n;
                kotlin.jvm.internal.o.f(arrayList, "getHighlightKeywordList(...)");
                java.lang.CharSequence charSequence3 = (java.lang.CharSequence) h0Var6.f310123d;
                p13.g gVar = p13.g.Background;
                int i39 = com.tencent.mm.plugin.fts.ui.c.f138024b;
                p13.i a27 = p13.i.a(charSequence3, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, " "), false, false);
                a27.f351097e = gVar;
                a27.f351098f = i39;
                uiBlocks.d(new we5.u(o13.q.e(a27)));
                z17 = false;
            } else {
                z17 = true;
            }
            android.text.SpannableString spannableString = (android.text.SpannableString) h0Var6.f310123d;
            com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) spannableString.getSpans(0, spannableString.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
            kotlin.jvm.internal.o.d(z0VarArr);
            int length4 = z0VarArr.length;
            int i47 = 0;
            while (true) {
                if (i47 >= length4) {
                    break;
                }
                if (z0VarArr[i47].getType() == 44) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 7, "");
                    break;
                }
                i47++;
            }
        }
        java.lang.Object obj2 = h0Var6.f310123d;
        if (obj2 != null) {
            android.text.SpannableString spannableString2 = (android.text.SpannableString) obj2;
            uiBlocks.d(new we5.f((com.tencent.mm.pluginsdk.ui.span.z0[]) spannableString2.getSpans(0, spannableString2.length(), com.tencent.mm.pluginsdk.ui.span.z0.class), h0Var6, h0Var2));
        }
        if (z17) {
            uiBlocks.d(new we5.g(ui6, f9Var, h0Var6));
        }
        if (x63.g.G(f9Var)) {
            uiBlocks.d(new we5.i(ui6));
        } else {
            uiBlocks.d(we5.j.f445344d);
        }
        kotlin.jvm.internal.h0 h0Var7 = new kotlin.jvm.internal.h0();
        if (f9Var.r2() || f9Var.y2()) {
            h0Var7.f310123d = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        }
        uiBlocks.d(new we5.k(f9Var, h0Var7, ui6));
        uiBlocks.d(we5.l.f445352d);
        uiBlocks.d(new we5.m(this, f9Var));
        uiBlocks.d(new we5.n(ui6, c01.ia.j(f9Var), h0Var6, z39));
        uiBlocks.d(new we5.o(ui6, f9Var, this, c01.ia.A(f9Var), c01.ia.y(f9Var), c01.ia.x(f9Var), msgData, c17, h0Var4, h0Var));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        e(ui6, msgData, str, new we5.y0(new we5.u0((com.tencent.mm.ui.chatting.viewitems.ao) tag)));
    }
}
