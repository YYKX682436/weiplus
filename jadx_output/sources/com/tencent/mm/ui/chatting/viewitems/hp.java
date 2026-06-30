package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class hp extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204141s;

    public static boolean d0(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.er erVar, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        if (f9Var.P0() == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick msg(%s) fail", java.lang.Long.valueOf(f9Var.getMsgId()));
            return true;
        }
        if (com.tencent.mm.ui.chatting.viewitems.mp.n(f9Var)) {
            if (erVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick tag(%s) is null", java.lang.Long.valueOf(f9Var.getMsgId()));
                return true;
            }
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).f199869i = 0L;
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(erVar.c());
            com.tencent.mm.ui.chatting.viewitems.mp.h(dVar, erVar, null);
            ((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) dVar.f460708c.a(sb5.k2.class))).A0(2);
            ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).f200338i = true;
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
            return true;
        }
        com.tencent.mm.ui.chatting.component.ro roVar = (com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class));
        roVar.f199869i = f9Var.getMsgId();
        roVar.f199870m = new java.lang.ref.WeakReference(view);
        if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).q0(f9Var.getMsgId())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onCreateContextMenu: voice msg show download animation");
            return true;
        }
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).f199871n.put(java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.TRUE);
        if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).Zi(new cg0.a(f9Var.z0(), f9Var.Q0(), f9Var.getMsgId(), f9Var.I0(), f9Var.getCreateTime()));
        } else {
            w21.p0.Bi().e();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.viewitems.gp(dVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick voice msg(%s) no finish download!", java.lang.Long.valueOf(f9Var.getMsgId()));
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488563xe);
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = new com.tencent.mm.ui.chatting.viewitems.lp();
        lpVar.b(xgVar, false, false);
        xgVar.setTag(lpVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0050. Please report as an issue. */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) dVar.f460708c.a(sb5.k2.class));
        java.lang.String s07 = xmVar.s0(f9Var.getMsgId(), f9Var.z0());
        if (menuItem.getGroupId() == -1) {
            s07 = f9Var.W0();
        }
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        if (itemId != 103) {
            if (itemId != 124) {
                if (itemId == 137) {
                    java.lang.String str = "65_" + c01.id.c();
                    ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(s07);
                    su4.j2 j2Var = new su4.j2();
                    j2Var.f412938a = dVar.g();
                    j2Var.f412939b = 65;
                    j2Var.f412941d = s07;
                    j2Var.f412942e = str;
                    j2Var.f412943f = true;
                    j2Var.f412946i = false;
                    j2Var.f412953p = true;
                    ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                } else if (itemId == 152) {
                    ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) cVar.a(sb5.l2.class))).o0(f9Var);
                } else {
                    if (itemId == 179) {
                        qn4.y.c(dVar.g(), f9Var, null, dVar);
                        return true;
                    }
                    switch (itemId) {
                        case 119:
                            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).w0(true);
                            return true;
                        case 120:
                            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).w0(false);
                            return true;
                        case 121:
                            if (!com.tencent.mm.sdk.platformtools.f9.SessionSpeech2TextSnd.k(dVar.g(), null)) {
                                return true;
                            }
                            if (!com.tencent.mm.ui.chatting.viewitems.mp.f204600b || !com.tencent.mm.ui.chatting.viewitems.mp.a(f9Var, dVar)) {
                                com.tencent.mm.ui.chatting.viewitems.mp.d(menuItem.getGroupId(), dVar, f9Var, xmVar, false);
                                return true;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onContextItemSelected: cancel trancform text");
                            java.lang.String x17 = dVar.x();
                            yd5.r rVar = yd5.r.f461147a;
                            yd5.r.f461147a.b("hover_win_cancel_convert_text", "view_clk", f9Var, x17);
                            ((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) cVar.a(sb5.k2.class))).p0(f9Var, true, menuItem.getGroupId(), 1);
                            return true;
                        default:
                            switch (itemId) {
                                case 141:
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(s07)) {
                                        com.tencent.mm.sdk.platformtools.b0.e(s07);
                                    }
                                    com.tencent.mm.ui.chatting.viewitems.mp.e(8, f9Var);
                                    return true;
                                case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                    android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                                    if (f9Var.X2()) {
                                        intent.putExtra("Retr_Msg_content", s07);
                                        intent.putExtra("Retr_Msg_Type", 6);
                                    } else {
                                        intent.putExtra("Retr_Msg_content", s07);
                                        intent.putExtra("Retr_Msg_Type", 4);
                                    }
                                    intent.putExtra("scene_from", 17);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    dVar.a0((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    com.tencent.mm.ui.chatting.viewitems.mp.e(9, f9Var);
                                    return true;
                                case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                                    com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, s07, 1);
                                    com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
                                    am.c4 c4Var = doFavoriteEvent.f54090g;
                                    c4Var.f6324j = baseChattingUIFragment;
                                    c4Var.f6327m = 43;
                                    r45.bq0 bq0Var = c4Var.f6315a;
                                    if (bq0Var != null) {
                                        r45.jq0 jq0Var = bq0Var.f370962d;
                                        if (jq0Var != null) {
                                            jq0Var.e(c01.z1.r());
                                            jq0Var.j(f9Var.Q0());
                                            doFavoriteEvent.e();
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "transform text fav failed");
                                    }
                                    com.tencent.mm.ui.chatting.viewitems.mp.e(10, f9Var);
                                    return true;
                                default:
                                    switch (itemId) {
                                        case 165:
                                            com.tencent.mm.ui.chatting.viewitems.mp.f(menuItem.getGroupId(), dVar, f9Var);
                                            break;
                                    }
                            }
                    }
                }
            }
            ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) cVar.a(sb5.l2.class))).t0(menuItem, f9Var);
        } else {
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).m0(f9Var);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        java.lang.Class cls;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        com.tencent.mm.storage.f9 localMsg = dVar.f394254d.f445300b;
        yb5.d dVar2 = this.f204141s;
        if (dVar2 != null) {
            java.lang.String x17 = dVar2.x();
            yd5.r rVar = yd5.r.f461147a;
            kotlin.jvm.internal.o.g(localMsg, "localMsg");
            yd5.r.f461147a.b("chat_voice_msg_menu_hover", "view_exp", localMsg, x17);
        }
        if (c01.d9.b().E()) {
            com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
            int d17 = goVar.d();
            int i19 = goVar.R;
            if (i19 == 1) {
                long j17 = new w21.u0(localMsg.j()).f442480b;
                if ((j17 == 0 && localMsg.A0() == 0) || (localMsg.P0() == 1 && localMsg.A0() == 1)) {
                    cls = sb5.k2.class;
                    i17 = com.tencent.mm.R.string.hjg;
                } else if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f204141s.f460708c.a(sb5.q2.class))).f199865e) {
                    java.lang.String string = view.getContext().getString(com.tencent.mm.R.string.az7);
                    cls = sb5.k2.class;
                    i17 = com.tencent.mm.R.string.hjg;
                    g4Var.c(d17, 120, 0, string, com.tencent.mm.R.raw.icons_filled_volume_up);
                } else {
                    cls = sb5.k2.class;
                    i17 = com.tencent.mm.R.string.hjg;
                    g4Var.c(d17, 119, 0, view.getContext().getString(com.tencent.mm.R.string.az6), com.tencent.mm.R.raw.icons_filled_ear);
                }
                if (localMsg.P0() == 5) {
                    g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
                }
                j45.l.g("favorite");
                g4Var.c(d17, 116, 0, view.getContext().getString(i17), com.tencent.mm.R.raw.icons_filled_favorites);
                boolean z19 = com.tencent.mm.ui.chatting.viewitems.mp.f204600b;
                if (z19) {
                    g4Var.c(d17, 165, 0, view.getContext().getString(com.tencent.mm.R.string.n7t), com.tencent.mm.R.raw.icons_outlined_voice_back_play);
                }
                if (!localMsg.t2() && localMsg.g3() && ((localMsg.K1() || localMsg.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(localMsg, this.f204141s) && com.tencent.mm.ui.chatting.viewitems.a0.J(localMsg.Q0()))) {
                    g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                }
                sb5.k2 k2Var = (sb5.k2) this.f204141s.f460708c.a(cls);
                if (!com.tencent.mm.ui.chatting.viewitems.mp.a(localMsg, this.f204141s)) {
                    i18 = ((com.tencent.mm.ui.chatting.component.xm) k2Var).q0(localMsg.getMsgId()) ? -1 : com.tencent.mm.R.string.b4b;
                    z17 = false;
                } else if (z19) {
                    yb5.d dVar3 = this.f204141s;
                    if (dVar3 != null) {
                        java.lang.String x18 = dVar3.x();
                        yd5.r rVar2 = yd5.r.f461147a;
                        yd5.r.f461147a.b("hover_win_cancel_convert_text", "view_exp", localMsg, x18);
                    }
                    z17 = true;
                    i18 = com.tencent.mm.R.string.n7u;
                } else {
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.ui.chatting.component.xm) k2Var).s0(localMsg.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg)));
                    i18 = !K0 ? com.tencent.mm.R.string.n7u : com.tencent.mm.R.string.b4b;
                    z17 = !K0;
                }
                if (!c01.e2.G(localMsg.Q0()) || (!(com.tencent.mm.sdk.platformtools.m2.j() || com.tencent.mm.sdk.platformtools.m2.d().equals("en")) || i18 == -1)) {
                    z18 = false;
                } else {
                    g4Var.c(d17, 121, 0, view.getContext().getString(i18), z17 ? com.tencent.mm.R.raw.icons_filled_transfer_text_off : com.tencent.mm.R.raw.icons_filled_transfer_text);
                    z18 = true;
                }
                if ((j17 != 0 || localMsg.A0() != 0) && ((localMsg.P0() != 1 || localMsg.A0() != 1) && !this.f204141s.F())) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3r), com.tencent.mm.R.raw.icons_filled_delete);
                }
                if (!z18 && ((com.tencent.mm.sdk.platformtools.m2.j() || com.tencent.mm.sdk.platformtools.m2.d().equals("en")) && i18 != -1)) {
                    g4Var.c(d17, 121, 0, view.getContext().getString(i18), z17 ? com.tencent.mm.R.raw.icons_filled_transfer_text_off : com.tencent.mm.R.raw.icons_filled_transfer_text);
                }
                return true;
            }
            if (i19 == 2 || i19 == 3) {
                if (i19 == 3) {
                    d17 = -1;
                }
                com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) this.f204141s.f460708c.a(sb5.k2.class));
                if (xmVar.t0(localMsg.getMsgId()) == com.tencent.mm.ui.chatting.viewitems.io.Transforming) {
                    g4Var.add(d17, 121, 0, com.tencent.mm.R.string.f490874b45);
                    return false;
                }
                java.lang.String s07 = xmVar.s0(localMsg.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(s07)) {
                    g4Var.c(d17, 141, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
                    int i27 = d17;
                    g4Var.c(i27, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                    j45.l.g("favorite");
                    g4Var.c(i27, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
                }
                if (goVar.R == 2) {
                    if (com.tencent.mm.app.plugin.k.a() && com.tencent.mm.plugin.record.ui.l2.d(s07)) {
                        if (localMsg.i2() && localMsg.b2()) {
                            g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                        } else {
                            g4Var.c(d17, 124, 0, view.getContext().getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
                        }
                    }
                    g4Var.c(d17, 121, 0, view.getContext().getString(com.tencent.mm.R.string.n7u), com.tencent.mm.R.raw.icons_filled_transfer_text_off);
                } else {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                    g4Var.c(d17, 164, 0, view.getContext().getString(com.tencent.mm.R.string.lsg), com.tencent.mm.R.raw.language_transfer_filled);
                    qn4.y.a(g4Var, d17, view.getContext(), localMsg);
                    g4Var.c(d17, 152, 0, view.getContext().getString(com.tencent.mm.R.string.b3s), com.tencent.mm.R.raw.icons_filled_feedback_error);
                }
                g4Var.c(d17, 137, 0, view.getContext().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        d0(view, dVar, f9Var, (com.tencent.mm.ui.chatting.viewitems.er) view.getTag(), null);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).m0(f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return com.tencent.mm.ui.chatting.viewitems.ip.a(f9Var, context, qVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.io ioVar;
        java.lang.String str2;
        android.text.SpannableString spannableString;
        yb5.d dVar3;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204141s = dVar;
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = (com.tencent.mm.ui.chatting.viewitems.lp) g0Var;
        lpVar.f204507e.setFromVoice(false);
        lpVar.f204507e.setFromGroup(dVar.D());
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        sb5.z zVar = (sb5.z) cVar.a(sb5.z.class);
        com.tencent.mm.ui.chatting.viewitems.lp.e(this, lpVar, dVar2, lpVar, dVar, false, I(zVar, f9Var.getMsgId()), u(dVar), this);
        sb5.k2 k2Var = (sb5.k2) cVar.a(sb5.k2.class);
        com.tencent.mm.ui.chatting.viewitems.io ioVar2 = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        if (com.tencent.mm.ui.chatting.viewitems.mp.a(f9Var, dVar)) {
            java.lang.String s07 = ((com.tencent.mm.ui.chatting.component.xm) k2Var).s0(f9Var.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
            if (com.tencent.mm.sdk.platformtools.t8.K0(s07)) {
                str2 = s07;
                ioVar = ioVar2;
            } else {
                ioVar = com.tencent.mm.ui.chatting.viewitems.io.Transformed;
                str2 = s07;
            }
        } else {
            com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) k2Var;
            if (xmVar.q0(f9Var.getMsgId())) {
                str2 = xmVar.s0(f9Var.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
                ioVar = xmVar.t0(f9Var.getMsgId());
            } else {
                ioVar = ioVar2;
                str2 = null;
            }
        }
        android.widget.TextView textView = lpVar.f204525w;
        if (textView != null) {
            textView.setTag(lpVar.f204506d.getTag());
            lpVar.f204525w.setOnLongClickListener(u(dVar));
            lpVar.f204525w.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) cVar.a(sb5.z.class))).B1);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && ioVar == ioVar2) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = lpVar.f204510h;
            if (chattingItemTranslate != null) {
                chattingItemTranslate.setVisibility(8);
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate2 = lpVar.f204511i;
                if (chattingItemTranslate2 != null) {
                    chattingItemTranslate2.setVisibility(8);
                }
            }
            dVar3 = dVar;
        } else {
            if (lpVar.f204510h == null) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate3 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) lpVar.f204509g.inflate();
                lpVar.f204510h = chattingItemTranslate3;
                chattingItemTranslate3.setMinimumWidth(lpVar.f204504b - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 5));
                lpVar.f204510h.c();
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = lpVar.f204520r.getContext();
            int textSize = (int) lpVar.f204510h.getContentView().getTextSize();
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", A(this.f204141s, f9Var));
            c17.i("preChatName", z(this.f204141s, f9Var));
            android.text.SpannableString rj6 = ((ke0.e) xVar).rj(context, str2, textSize, 1, null, a17);
            com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class));
            if (jkVar.m0(f9Var.getMsgId())) {
                java.util.ArrayList arrayList = jkVar.f199300n;
                p13.g gVar = p13.g.Background;
                int i17 = com.tencent.mm.plugin.fts.ui.c.f138024b;
                p13.i a18 = p13.i.a(rj6, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, " "), false, false);
                a18.f351097e = gVar;
                a18.f351098f = i17;
                spannableString = new android.text.SpannableString(o13.q.e(a18).f351105a);
            } else {
                spannableString = rj6;
            }
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate4 = lpVar.f204510h;
            long msgId = f9Var.getMsgId();
            ((com.tencent.mm.ui.chatting.component.xm) k2Var).getClass();
            java.util.ArrayList arrayList2 = com.tencent.mm.ui.chatting.component.xm.f200251v;
            java.lang.String str3 = str2;
            chattingItemTranslate4.f(spannableString, ioVar, arrayList2.contains(java.lang.Long.valueOf(msgId)), com.tencent.mm.ui.chatting.viewitems.ho.Voice, f9Var.getMsgId(), dVar);
            if (!com.tencent.mm.sdk.platformtools.t8.J0(spannableString) && arrayList2.contains(java.lang.Long.valueOf(f9Var.getMsgId()))) {
                arrayList2.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
            }
            dVar3 = dVar;
            com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(dVar3);
            com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar.D(), lpVar, null);
            goVar.R = 2;
            lpVar.f204510h.getContentView().setTag(goVar);
            lpVar.f204510h.setVisibility(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                lpVar.f204510h.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) zVar).B1);
                lpVar.f204510h.setOnDoubleClickListener(new com.tencent.mm.ui.chatting.viewitems.ep(this, str3, dVar3, f9Var));
                if (lpVar.f204512j == null) {
                    com.tencent.mm.ui.chatting.viewitems.mp.l(dVar3, lpVar, f9Var, u17, x(u17));
                }
            }
            if (com.tencent.mm.app.plugin.k.a()) {
                java.lang.String W0 = (f9Var.i2() && f9Var.b2()) ? f9Var.W0() : null;
                com.tencent.mm.ui.chatting.viewitems.io v07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) cVar.a(sb5.l2.class))).v0(f9Var);
                com.tencent.mm.storage.f9 f9Var2 = dVar2.f394254d.f445300b;
                if (com.tencent.mm.sdk.platformtools.t8.K0(W0) && v07 == ioVar2) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate5 = lpVar.f204511i;
                    if (chattingItemTranslate5 != null) {
                        chattingItemTranslate5.setVisibility(8);
                    }
                } else {
                    if (lpVar.f204511i == null) {
                        com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate6 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) lpVar.f204508f.inflate();
                        lpVar.f204511i = chattingItemTranslate6;
                        chattingItemTranslate6.c();
                    }
                    lpVar.f204511i.e(W0, v07, f9Var2.getMsgId());
                    lpVar.f204511i.setBrandWording(com.tencent.mm.sdk.platformtools.t8.K0(f9Var2.U0()) ? this.f204141s.s().getString(com.tencent.mm.R.string.jxn) : f9Var2.U0());
                    com.tencent.mm.ui.chatting.viewitems.q0 u18 = u(this.f204141s);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(W0)) {
                        com.tencent.mm.ui.chatting.viewitems.go goVar2 = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, this.f204141s.D(), lpVar, null);
                        goVar2.R = 3;
                        lpVar.f204511i.getContentView().setTag(goVar2);
                        lpVar.f204511i.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f204141s.f460708c.a(sb5.z.class))).B1);
                        lpVar.f204511i.setVisibility(0);
                    }
                    if (lpVar.f204514l == null && !com.tencent.mm.sdk.platformtools.t8.J0(wl5.y.o(lpVar.f204511i.getContentView()))) {
                        yb5.d dVar4 = this.f204141s;
                        com.tencent.mm.ui.chatting.viewitems.mp.m(dVar4, lpVar, f9Var2, u18, x(u(dVar4)));
                    }
                }
            }
        }
        if (!((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).p0()) {
            lpVar.B.setBackgroundResource(com.tencent.mm.R.drawable.b9l);
        } else if (com.tencent.mm.ui.bk.C()) {
            lpVar.B.setBackgroundResource(com.tencent.mm.R.drawable.d_o);
        } else {
            lpVar.B.setBackgroundResource(com.tencent.mm.R.drawable.d_p);
        }
        lpVar.B.setTextSize(0, i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479672c9));
        android.widget.TextView textView2 = lpVar.f204506d;
        textView2.setPadding(textView2.getPaddingLeft(), lpVar.f204506d.getPaddingTop(), dVar.g().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv), lpVar.f204506d.getPaddingBottom());
        com.tencent.mm.ui.base.AnimImageView animImageView = lpVar.f204507e;
        animImageView.setPadding(animImageView.getPaddingLeft(), lpVar.f204507e.getPaddingTop(), dVar.g().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv), lpVar.f204507e.getPaddingBottom());
        lpVar.A.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.fp(this, lpVar, dVar3, f9Var));
        android.widget.ProgressBar progressBar = lpVar.f204524v;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            if (f9Var.P0() >= 2) {
                lpVar.f204524v.setVisibility(8);
            }
        }
        V(lpVar, dVar2, dVar.t(), dVar.D(), dVar, this);
        com.tencent.mm.ui.chatting.viewitems.ip ipVar = (com.tencent.mm.ui.chatting.viewitems.ip) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, lpVar, this, ipVar.f204206d, ipVar.f204207e);
    }
}
