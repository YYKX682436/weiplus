package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class dp extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203819s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View.OnClickListener f203820t;

    public static boolean d0(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.er erVar, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        android.widget.RelativeLayout relativeLayout;
        if (f9Var.P0() == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick msg(%s) fail", java.lang.Long.valueOf(f9Var.getMsgId()));
            return true;
        }
        if (!com.tencent.mm.ui.chatting.viewitems.mp.n(f9Var)) {
            com.tencent.mm.ui.chatting.component.ro roVar = (com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class));
            roVar.f199869i = f9Var.getMsgId();
            roVar.f199870m = new java.lang.ref.WeakReference(view);
            if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).q0(f9Var.getMsgId())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick: voice msg show download animation");
                return true;
            }
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).f199871n.put(java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.TRUE);
            if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).Zi(new cg0.a(f9Var.z0(), f9Var.Q0(), f9Var.getMsgId(), f9Var.I0(), f9Var.getCreateTime()));
            } else {
                w21.p0.Bi().e();
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.viewitems.cp(dVar));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick voice msg(%s) no finish download!", java.lang.Long.valueOf(f9Var.getMsgId()));
            return true;
        }
        if (erVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onItemClick tag(%s) is null", java.lang.Long.valueOf(f9Var.getMsgId()));
            return true;
        }
        com.tencent.mm.ui.chatting.component.ro roVar2 = (com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class));
        if (roVar2.f199878u == f9Var.getMsgId()) {
            roVar2.f199874q.set(true);
            android.view.View O0 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) roVar2.f198580d.f460708c.a(sb5.z.class))).O0(roVar2.f199878u);
            if (O0 != null && (relativeLayout = (android.widget.RelativeLayout) O0.findViewById(com.tencent.mm.R.id.blv)) != null) {
                roVar2.f199878u = -1L;
                relativeLayout.setVisibility(8);
            }
        }
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).f199869i = 0L;
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(erVar.c());
        com.tencent.mm.ui.chatting.viewitems.mp.h(dVar, erVar, msgQuoteItem);
        ((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) dVar.f460708c.a(sb5.k2.class))).A0(2);
        ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).f200338i = true;
        te5.t.i(dVar, f9Var, 0);
        ((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) dVar.f460708c.a(sb5.k2.class))).getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(r0.s0(f9Var.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var)))) {
            e0(4, f9Var);
        }
        return true;
    }

    public static void e0(int i17, com.tencent.mm.storage.f9 f9Var) {
        long j17;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "msgInfo is null???");
            return;
        }
        try {
            j17 = new w21.u0(f9Var.j()).f442480b;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "get voice duration failed");
            j17 = 0;
        }
        java.lang.String str = "";
        try {
            w21.w0 D0 = w21.p0.Di().D0(f9Var.I0());
            if (D0 != null) {
                java.lang.String str2 = D0.f442487d;
                if (str2 != null) {
                    str = str2;
                }
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "get voice clientId failed");
        }
        com.tencent.mm.autogen.mmdata.rpt.NewVoiceTransTipsReportStruct newVoiceTransTipsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NewVoiceTransTipsReportStruct();
        newVoiceTransTipsReportStruct.f59726d = i17;
        newVoiceTransTipsReportStruct.f59727e = newVoiceTransTipsReportStruct.b("VoiceID", str, true);
        newVoiceTransTipsReportStruct.f59728f = j17;
        newVoiceTransTipsReportStruct.n();
        newVoiceTransTipsReportStruct.k();
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488521vv);
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = new com.tencent.mm.ui.chatting.viewitems.lp();
        lpVar.b(xgVar, true, false);
        xgVar.setTag(lpVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0051. Please report as an issue. */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.ui.chatting.v0 o07;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) dVar.f460708c.a(sb5.k2.class));
        java.lang.String s07 = xmVar.s0(f9Var.getMsgId(), f9Var.z0());
        if (menuItem.getGroupId() == -1) {
            s07 = f9Var.W0();
        }
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        if (itemId == 100) {
            com.tencent.mm.ui.chatting.component.ro roVar = (com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class));
            roVar.getClass();
            if (f9Var.g3() && (o07 = roVar.o0()) != null && f9Var.getMsgId() == o07.f202766i) {
                o07.J(true);
            }
            com.tencent.mm.ui.chatting.component.ro roVar2 = (com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class));
            roVar2.f199879v = true;
            roVar2.x0();
        } else if (itemId != 103) {
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
                                e0(3, f9Var);
                                com.tencent.mm.ui.chatting.viewitems.mp.d(menuItem.getGroupId(), dVar, f9Var, xmVar, true);
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
                                    break;
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
                                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    dVar.a0((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    com.tencent.mm.ui.chatting.viewitems.mp.e(9, f9Var);
                                    break;
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
                                            jq0Var.e(f9Var.Q0());
                                            jq0Var.j(c01.z1.r());
                                            doFavoriteEvent.e();
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "transform text fav failed");
                                    }
                                    com.tencent.mm.ui.chatting.viewitems.mp.e(10, f9Var);
                                    break;
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
        int i19;
        boolean z18;
        com.tencent.mm.storage.f9 localMsg = dVar.f394254d.f445300b;
        yb5.d dVar2 = this.f203819s;
        if (dVar2 != null) {
            java.lang.String x17 = dVar2.x();
            yd5.r rVar = yd5.r.f461147a;
            kotlin.jvm.internal.o.g(localMsg, "localMsg");
            yd5.r.f461147a.b("chat_voice_msg_menu_hover", "view_exp", localMsg, x17);
        }
        if (c01.d9.b().E()) {
            com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
            int d17 = goVar.d();
            int i27 = goVar.R;
            if (i27 == 1) {
                if ((new w21.u0(localMsg.j()).f442480b != 0 || localMsg.A0() != 0) && (localMsg.P0() != 1 || localMsg.A0() != 1)) {
                    java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, null);
                    if (bool == null) {
                        bool = java.lang.Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        java.lang.String string = view.getContext().getString(com.tencent.mm.R.string.az7);
                        i18 = 2;
                        cls = sb5.k2.class;
                        i17 = com.tencent.mm.R.string.hjg;
                        g4Var.c(d17, 120, 0, string, com.tencent.mm.R.raw.icons_filled_volume_up);
                    } else {
                        cls = sb5.k2.class;
                        i17 = com.tencent.mm.R.string.hjg;
                        i18 = 2;
                        g4Var.c(d17, 119, 0, view.getContext().getString(com.tencent.mm.R.string.az6), com.tencent.mm.R.raw.icons_filled_ear);
                    }
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(localMsg.Q0(), true);
                    boolean z19 = (com.tencent.mm.storage.z3.z4(localMsg.Q0()) || c01.e2.D(localMsg.Q0()) || n17 == null || n17.k2()) ? false : true;
                    j45.l.g("favorite");
                    g4Var.c(d17, 116, 0, view.getContext().getString(i17), com.tencent.mm.R.raw.icons_filled_favorites);
                    boolean z27 = com.tencent.mm.ui.chatting.viewitems.mp.f204600b;
                    if (z27) {
                        g4Var.c(d17, 165, 0, view.getContext().getString(com.tencent.mm.R.string.n7t), com.tencent.mm.R.raw.icons_outlined_voice_back_play);
                    }
                    if (z19) {
                        if ((r01.q3.cj().u1(i18) > 0) && !this.f203819s.F()) {
                            g4Var.add(d17, 114, 0, view.getContext().getString(com.tencent.mm.R.string.b3l));
                        }
                    }
                    sb5.k2 k2Var = (sb5.k2) this.f203819s.f460708c.a(cls);
                    if (!com.tencent.mm.ui.chatting.viewitems.mp.a(localMsg, this.f203819s)) {
                        if (((com.tencent.mm.ui.chatting.component.xm) k2Var).q0(localMsg.getMsgId())) {
                            z17 = false;
                            i19 = -1;
                        }
                        i19 = com.tencent.mm.R.string.b4b;
                        z17 = false;
                    } else if (z27) {
                        yb5.d dVar3 = this.f203819s;
                        if (dVar3 != null) {
                            java.lang.String x18 = dVar3.x();
                            yd5.r rVar2 = yd5.r.f461147a;
                            yd5.r.f461147a.b("hover_win_cancel_convert_text", "view_exp", localMsg, x18);
                        }
                        z17 = true;
                        i19 = com.tencent.mm.R.string.n7u;
                    } else {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.ui.chatting.component.xm) k2Var).s0(localMsg.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg)))) {
                            i19 = -1;
                            z17 = false;
                        }
                        i19 = com.tencent.mm.R.string.b4b;
                        z17 = false;
                    }
                    if (!c01.e2.G(localMsg.Q0()) || (!(com.tencent.mm.sdk.platformtools.m2.j() || com.tencent.mm.sdk.platformtools.m2.d().equals("en")) || i19 == -1)) {
                        z18 = false;
                    } else {
                        g4Var.c(d17, 121, 0, view.getContext().getString(i19), z17 ? com.tencent.mm.R.raw.icons_filled_transfer_text_off : com.tencent.mm.R.raw.icons_filled_transfer_text);
                        z18 = true;
                    }
                    if (!this.f203819s.F()) {
                        g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3r), com.tencent.mm.R.raw.icons_filled_delete);
                    }
                    if (!z18 && ((com.tencent.mm.sdk.platformtools.m2.j() || com.tencent.mm.sdk.platformtools.m2.d().equals("en")) && i19 != -1)) {
                        g4Var.c(d17, 121, 0, view.getContext().getString(i19), z17 ? com.tencent.mm.R.raw.icons_filled_transfer_text_off : com.tencent.mm.R.raw.icons_filled_transfer_text);
                    }
                }
                return true;
            }
            if (i27 == 2 || i27 == 3) {
                if (i27 == 3) {
                    d17 = -1;
                }
                com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) this.f203819s.f460708c.a(sb5.k2.class));
                if (xmVar.t0(localMsg.getMsgId()) == com.tencent.mm.ui.chatting.viewitems.io.Transforming) {
                    g4Var.add(d17, 121, 0, com.tencent.mm.R.string.f490874b45);
                    return false;
                }
                java.lang.String s07 = xmVar.s0(localMsg.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(s07)) {
                    g4Var.c(d17, 141, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
                    int i28 = d17;
                    g4Var.c(i28, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                    j45.l.g("favorite");
                    g4Var.c(i28, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
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
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.P0() == 5) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.getMsgId());
            Li.l1(Li.F | 8192);
            w21.u0 u0Var = new w21.u0(Li.j());
            u0Var.f442481c = false;
            Li.d1(u0Var.b());
            Li.r1(3);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), Li, true);
            w21.w0 D0 = w21.p0.Di().D0(f9Var.I0());
            if (D0.f442491h == 0) {
                D0.f442492i = 5;
            } else {
                D0.f442492i = 6;
            }
            D0.f442494k = java.lang.System.currentTimeMillis() / 1000;
            D0.f442505v = 1;
            D0.f442484a = 1048896;
            w21.x0.w(D0);
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).f199871n.put(java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.TRUE);
            if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).Zi(new cg0.a(f9Var.z0(), f9Var.Q0(), f9Var.getMsgId(), f9Var.I0(), f9Var.getCreateTime()));
            } else {
                w21.p0.Bi().e();
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.viewitems.bp(this, dVar));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "onStateBtnClick voice msg(%s) re-download!", java.lang.Long.valueOf(f9Var.getMsgId()));
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return com.tencent.mm.ui.chatting.viewitems.ip.a(f9Var, context, qVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.io ioVar;
        java.lang.String str2;
        java.lang.String s07;
        com.tencent.mm.ui.chatting.viewitems.io t07;
        android.text.SpannableString spannableString;
        java.lang.String str3;
        com.tencent.mm.ui.chatting.manager.c cVar;
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203819s = dVar;
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = (com.tencent.mm.ui.chatting.viewitems.lp) g0Var;
        lpVar.f204507e.setFromVoice(true);
        lpVar.f204507e.setFromGroup(dVar.D());
        com.tencent.mm.ui.chatting.manager.c cVar2 = dVar.f460708c;
        sb5.z zVar = (sb5.z) cVar2.a(sb5.z.class);
        com.tencent.mm.ui.chatting.viewitems.lp.e(this, lpVar, dVar2, lpVar, dVar, true, I(zVar, f9Var.getMsgId()), u(dVar), this);
        com.tencent.mm.ui.chatting.viewitems.io ioVar2 = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        sb5.k2 k2Var = (sb5.k2) cVar2.a(sb5.k2.class);
        if (com.tencent.mm.ui.chatting.viewitems.mp.a(f9Var, dVar)) {
            s07 = ((com.tencent.mm.ui.chatting.component.xm) k2Var).s0(f9Var.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
            if (com.tencent.mm.sdk.platformtools.t8.K0(s07)) {
                str2 = s07;
                ioVar = ioVar2;
            } else {
                t07 = com.tencent.mm.ui.chatting.viewitems.io.Transformed;
                str2 = s07;
                ioVar = t07;
            }
        } else {
            com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) k2Var;
            if (xmVar.q0(f9Var.getMsgId())) {
                s07 = xmVar.s0(f9Var.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
                t07 = xmVar.t0(f9Var.getMsgId());
                str2 = s07;
                ioVar = t07;
            } else {
                ioVar = ioVar2;
                str2 = null;
            }
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
            i17 = 8;
            cVar = cVar2;
            str3 = null;
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
            c17.i("preUsername", A(this.f203819s, f9Var));
            c17.i("preChatName", z(this.f203819s, f9Var));
            android.text.SpannableString rj6 = ((ke0.e) xVar).rj(context, str2, textSize, 1, null, a17);
            com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar2.a(sb5.u1.class));
            if (jkVar.m0(f9Var.getMsgId())) {
                java.util.ArrayList arrayList = jkVar.f199300n;
                p13.g gVar = p13.g.Background;
                int i18 = com.tencent.mm.plugin.fts.ui.c.f138024b;
                p13.i a18 = p13.i.a(rj6, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, " "), false, false);
                a18.f351097e = gVar;
                a18.f351098f = i18;
                spannableString = new android.text.SpannableString(o13.q.e(a18).f351105a);
            } else {
                spannableString = rj6;
            }
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate4 = lpVar.f204510h;
            long msgId = f9Var.getMsgId();
            ((com.tencent.mm.ui.chatting.component.xm) k2Var).getClass();
            java.util.ArrayList arrayList2 = com.tencent.mm.ui.chatting.component.xm.f200251v;
            java.lang.String str4 = str2;
            str3 = null;
            chattingItemTranslate4.f(spannableString, ioVar, arrayList2.contains(java.lang.Long.valueOf(msgId)), com.tencent.mm.ui.chatting.viewitems.ho.Voice, f9Var.getMsgId(), dVar);
            if (!com.tencent.mm.sdk.platformtools.t8.J0(spannableString) && arrayList2.contains(java.lang.Long.valueOf(f9Var.getMsgId()))) {
                arrayList2.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
            }
            com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(dVar);
            com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar.D(), lpVar, null);
            goVar.R = 2;
            lpVar.f204510h.getContentView().setTag(goVar);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate5 = lpVar.f204510h;
            if (this.f203820t == null) {
                this.f203820t = new com.tencent.mm.ui.chatting.viewitems.ap(this);
            }
            chattingItemTranslate5.setOnClickListener(this.f203820t);
            lpVar.f204510h.setVisibility(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                lpVar.f204510h.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) zVar).B1);
                lpVar.f204510h.setOnDoubleClickListener(new com.tencent.mm.ui.chatting.viewitems.xo(this, str4, dVar, f9Var));
                if (lpVar.f204512j == null) {
                    com.tencent.mm.ui.chatting.viewitems.mp.l(dVar, lpVar, f9Var, u17, x(u17));
                }
            }
            if (com.tencent.mm.app.plugin.k.a()) {
                java.lang.String W0 = (f9Var.i2() && f9Var.b2()) ? f9Var.W0() : null;
                cVar = cVar2;
                com.tencent.mm.ui.chatting.viewitems.io v07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) cVar.a(sb5.l2.class))).v0(f9Var);
                com.tencent.mm.storage.f9 f9Var2 = dVar2.f394254d.f445300b;
                if (com.tencent.mm.sdk.platformtools.t8.K0(W0) && v07 == ioVar2) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate6 = lpVar.f204511i;
                    i17 = 8;
                    if (chattingItemTranslate6 != null) {
                        chattingItemTranslate6.setVisibility(8);
                    }
                } else {
                    i17 = 8;
                    if (lpVar.f204511i == null) {
                        com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate7 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) lpVar.f204508f.inflate();
                        lpVar.f204511i = chattingItemTranslate7;
                        chattingItemTranslate7.c();
                    }
                    lpVar.f204511i.e(W0, v07, f9Var2.getMsgId());
                    lpVar.f204511i.setBrandWording(com.tencent.mm.sdk.platformtools.t8.K0(f9Var2.U0()) ? this.f203819s.s().getString(com.tencent.mm.R.string.jxn) : f9Var2.U0());
                    com.tencent.mm.ui.chatting.viewitems.q0 u18 = u(this.f203819s);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(W0)) {
                        com.tencent.mm.ui.chatting.viewitems.go goVar2 = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, this.f203819s.D(), lpVar, null);
                        goVar2.R = 3;
                        lpVar.f204511i.getContentView().setTag(goVar2);
                        lpVar.f204511i.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f203819s.f460708c.a(sb5.z.class))).B1);
                        lpVar.f204511i.setOnLongClickListener(u18);
                        lpVar.f204511i.setVisibility(0);
                    }
                    if (lpVar.f204514l == null && !com.tencent.mm.sdk.platformtools.t8.J0(wl5.y.o(lpVar.f204511i.getContentView()))) {
                        yb5.d dVar3 = this.f203819s;
                        com.tencent.mm.ui.chatting.viewitems.mp.m(dVar3, lpVar, f9Var2, u18, x(u(dVar3)));
                    }
                }
            } else {
                cVar = cVar2;
                i17 = 8;
            }
        }
        if (!((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).p0()) {
            lpVar.f204528z.setBackgroundResource(com.tencent.mm.R.drawable.b9l);
            lpVar.B.setBackgroundResource(com.tencent.mm.R.drawable.b9l);
        } else if (com.tencent.mm.ui.bk.C()) {
            lpVar.f204528z.setBackgroundResource(com.tencent.mm.R.drawable.d_o);
            lpVar.B.setBackgroundResource(com.tencent.mm.R.drawable.d_o);
        } else {
            lpVar.f204528z.setBackgroundResource(com.tencent.mm.R.drawable.d_p);
            lpVar.B.setBackgroundResource(com.tencent.mm.R.drawable.d_p);
        }
        lpVar.f204528z.setTextSize(0, i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479672c9));
        lpVar.B.setTextSize(0, i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479672c9));
        lpVar.f204506d.setPadding(dVar.g().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv), lpVar.f204506d.getPaddingTop(), lpVar.f204506d.getPaddingRight(), lpVar.f204506d.getPaddingBottom());
        lpVar.f204507e.setPadding(dVar.g().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv), lpVar.f204507e.getPaddingTop(), lpVar.f204507e.getPaddingRight(), lpVar.f204507e.getPaddingBottom());
        if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).f199878u == f9Var.getMsgId()) {
            lpVar.f204527y.setVisibility(0);
        } else {
            lpVar.f204527y.setVisibility(i17);
        }
        lpVar.f204527y.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.yo(this, f9Var, lpVar, dVar, k2Var));
        lpVar.A.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.zo(this, lpVar, dVar, f9Var));
        long j17 = new w21.u0(f9Var.j()).f442480b;
        if (j17 == 0) {
            lpVar.stateIV.setVisibility(i17);
        } else {
            boolean z17 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).s0(f9Var.getMsgId()) || w21.x0.n(f9Var);
            lpVar.stateIV.setVisibility(z17 ? i17 : 0);
            ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
            int m17 = (int) w21.x0.m(j17);
            if (z17) {
                java.lang.CharSequence s08 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) cVar.a(sb5.n.class))).s0(dVar.x());
                la5.b.f317600a.a(lpVar.f204506d, m17, s08 == null ? str3 : s08.toString());
            } else {
                lpVar.f204506d.setContentDescription(java.lang.String.format(dVar.g().getString(com.tencent.mm.R.string.k9h), java.lang.Integer.valueOf(m17)));
            }
        }
        java.lang.String str5 = f9Var.E;
        if (str5 == null || str5.length() == 0) {
            lpVar.f204523u.setVisibility(i17);
        } else {
            lpVar.f204523u.setVisibility(0);
            G(dVar, lpVar.f204523u, com.tencent.mm.ui.chatting.viewitems.er.a(str5));
        }
        com.tencent.mm.ui.chatting.viewitems.ip ipVar = (com.tencent.mm.ui.chatting.viewitems.ip) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, lpVar, this, ipVar.f204206d, ipVar.f204207e);
    }
}
