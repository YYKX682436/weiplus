package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class nn extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f, com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204935s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.zn f204936t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f204937u = "";

    /* renamed from: v, reason: collision with root package name */
    public int f204938v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f204939w = -1;

    private void g0(com.tencent.mm.storage.f9 f9Var) {
        sb5.s sVar = (sb5.s) this.f204935s.f460708c.a(sb5.s.class);
        if (sVar.u()) {
            sVar.D(new com.tencent.mm.ui.chatting.viewitems.nn$$a(this, f9Var));
        } else {
            h0(f9Var);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488533w7);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = new com.tencent.mm.ui.chatting.viewitems.ao();
        aoVar.a(xgVar, false);
        xgVar.setTag(aoVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean O(android.view.MenuItem menuItem, final yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        int t17;
        if (erVar == null) {
            return false;
        }
        final com.tencent.mm.storage.f9 c17 = erVar.c();
        int itemId = menuItem.getItemId();
        if (itemId == 4) {
            java.lang.String str = "65_" + c01.id.c();
            java.lang.String W0 = c17.W0();
            if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t17 = c01.w9.t(W0)) != -1) {
                W0 = W0.substring(t17 + 1).trim();
            }
            ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(W0);
            su4.j2 j2Var = new su4.j2();
            j2Var.f412938a = dVar.g();
            j2Var.f412939b = 65;
            j2Var.f412941d = W0;
            j2Var.f412942e = str;
            j2Var.f412943f = true;
            j2Var.f412946i = false;
            j2Var.f412953p = true;
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        } else if (itemId == 108) {
            com.tencent.mm.ui.chatting.viewitems.bo.a(c17, 4, 0);
            com.tencent.mm.ui.chatting.manager.t.a(c17, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.nn$$c
                @Override // java.lang.Runnable
                public final void run() {
                    yb5.d dVar2 = yb5.d.this;
                    com.tencent.mm.ui.chatting.component.ym ymVar = (com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar2.f460708c.a(sb5.l2.class));
                    com.tencent.mm.storage.f9 f9Var = c17;
                    ymVar.q0(f9Var, false);
                    ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) dVar2.g();
                    n13.r rVar = new n13.r();
                    rVar.f334117a = true;
                    rVar.f334120d.f334139a = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.b(f9Var.Q0());
                    rVar.f334127k = 1;
                    ne5.a aVar = new ne5.a();
                    java.lang.String Q0 = f9Var.Q0();
                    int i17 = aVar.f43702d;
                    aVar.set(i17 + 1, Q0);
                    aVar.set(i17 + 0, java.lang.Long.valueOf(f9Var.getMsgId()));
                    aVar.n(f9Var.U1());
                    com.tencent.mm.sdk.platformtools.t8.K0(te5.e2.d(f9Var));
                    ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(appCompatActivity, aVar, rVar);
                }
            });
        } else {
            if (itemId == 179) {
                qn4.y.c(dVar.g(), c17, erVar, dVar);
                return true;
            }
            if (itemId == 102) {
                java.lang.CharSequence q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).q0(((com.tencent.mm.ui.chatting.viewitems.go) erVar).c(), false);
                dVar.f460710e.k0(c17.Q0(), c17.getMsgId(), q07);
                menuItem.getGroupId();
                try {
                    if (c01.ia.j(c17) >= 2 && !com.tencent.mm.sdk.platformtools.t8.J0(((com.tencent.mm.ui.chatting.viewitems.go) erVar).S)) {
                        q07 = ((com.tencent.mm.ui.chatting.viewitems.go) erVar).S;
                    }
                    com.tencent.mm.sdk.platformtools.b0.e(q07);
                    w04.a.INSTANCE.A9(1, c17.I0() + "", com.tencent.mm.sdk.platformtools.t8.o0(q07.toString()));
                    com.tencent.mm.ui.chatting.viewitems.bo.a(erVar.c(), 3, q07.length());
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextToBase", "clip.setText error ");
                }
                try {
                    com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct shareMsgClipStruct = new com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct();
                    shareMsgClipStruct.f60342d = c17.I0();
                    shareMsgClipStruct.f60344f = q07.length();
                    shareMsgClipStruct.f60343e = this.f204937u.length();
                    shareMsgClipStruct.f60345g = c01.ia.i(c17);
                    shareMsgClipStruct.k();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextToBase", "report occur exception! %s", e17.getMessage());
                }
                db5.e1.T(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490361st));
                return true;
            }
            if (itemId != 103) {
                if (itemId != 124 && itemId != 125) {
                    if (itemId == 151) {
                        com.tencent.mm.ui.chatting.w5.m(dVar, c17.Q0(), c17.getMsgId(), 2);
                        return false;
                    }
                    if (itemId == 152) {
                        ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).o0(c17);
                    } else if (itemId != 163 && itemId != 164) {
                        switch (itemId) {
                            case 141:
                                java.lang.String W02 = c17.W0();
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(W02)) {
                                    com.tencent.mm.sdk.platformtools.b0.e(W02);
                                }
                                db5.e1.T(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490361st));
                                return true;
                            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                                intent.putExtra("Retr_Msg_Id", c17.getMsgId());
                                intent.putExtra("Retr_MsgTalker", c17.Q0());
                                java.lang.String W03 = c17.W0();
                                if (c17.X2()) {
                                    intent.putExtra("Retr_Msg_content", W03);
                                    intent.putExtra("Retr_Msg_Type", 6);
                                } else {
                                    intent.putExtra("Retr_Msg_content", W03);
                                    intent.putExtra("Retr_Msg_Type", 4);
                                }
                                intent.putExtra("scene_from", 17);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextToBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                dVar.a0((android.content.Intent) arrayList.get(0));
                                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextToBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return true;
                            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                                com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, c17.W0(), 1);
                                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
                                am.c4 c4Var = doFavoriteEvent.f54090g;
                                c4Var.f6324j = baseChattingUIFragment;
                                c4Var.f6327m = 43;
                                r45.bq0 bq0Var = c4Var.f6315a;
                                if (bq0Var != null) {
                                    r45.jq0 jq0Var = bq0Var.f370962d;
                                    if (jq0Var != null) {
                                        jq0Var.e(c17.Q0());
                                        jq0Var.j(c01.z1.r());
                                        doFavoriteEvent.e();
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextToBase", "transform text fav failed");
                                }
                                return true;
                        }
                    }
                }
                ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).t0(menuItem, c17);
            } else {
                g0(c17);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        java.lang.String str = f9Var.G;
        if (str != null) {
            str.contains("announcement@all");
        }
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        if (!f9Var.b3() && !f9Var.X2() && f9Var.getType() != 1107296305) {
            return true;
        }
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
        int d17 = goVar.d();
        int i18 = goVar.R;
        if (i18 == 1) {
            if (f9Var.b3()) {
                if (x63.g.G(f9Var)) {
                    java.lang.String string = this.f204935s.s().getString(com.tencent.mm.R.string.fsr);
                    i17 = com.tencent.mm.R.string.b3m;
                    g4Var.c(d17, 151, 0, string, com.tencent.mm.R.raw.icons_filled_continued_form);
                } else {
                    i17 = com.tencent.mm.R.string.b3m;
                }
                if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                    g4Var.c(d17, 102, 0, view.getContext().getString(i17), com.tencent.mm.R.raw.icons_filled_copy);
                }
            }
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 108, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
            }
            j45.l.g("favorite");
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
            if (!f9Var.t2() && f9Var.b3() && ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204935s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204935s.A())) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
            if (com.tencent.mm.app.plugin.k.a() && com.tencent.mm.plugin.record.ui.l2.d(f9Var.j()) && !c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
                }
            }
            if (!this.f204935s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
            if (c01.ia.A(f9Var) || c01.ia.j(f9Var) == 4) {
                g4Var.clear();
                if (!this.f204935s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                }
            }
        } else if (i18 == 2) {
            g4Var.c(d17, 141, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
            g4Var.c(d17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            j45.l.g("favorite");
            g4Var.c(d17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (com.tencent.mm.app.plugin.k.a() && f9Var.i2() && f9Var.b2()) {
                g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                g4Var.c(d17, 164, 0, view.getContext().getString(com.tencent.mm.R.string.lsg), com.tencent.mm.R.raw.language_transfer_filled);
                qn4.y.a(g4Var, d17, view.getContext(), f9Var);
                g4Var.c(d17, 152, 0, view.getContext().getString(com.tencent.mm.R.string.b3s), com.tencent.mm.R.raw.icons_filled_feedback_error);
            }
            if (isTeenMode) {
                return false;
            }
            g4Var.c(d17, 4, 0, view.getContext().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
            return false;
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        f9Var.unsetOmittedFailResend();
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        if (f9Var.b3() && f9Var.A0() == 1) {
            g0(f9Var);
        }
    }

    public java.lang.String d0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String a17 = c01.n2.a("" + f9Var.I0());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", "msg_" + f9Var.I0());
        c17.i("preUsername", A(this.f204935s, f9Var));
        c17.i("preChatName", z(this.f204935s, f9Var));
        return a17;
    }

    public void e0(com.tencent.mm.ui.chatting.viewitems.ao aoVar, com.tencent.mm.storage.f9 f9Var, boolean z17, boolean z18, boolean z19) {
        if (z17 || z18 || z19) {
            aoVar.f203379b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.FALSE);
            aoVar.f203379b.setOnTouchListener(aoVar.f203387j);
            aoVar.f203379b.setOnLongClickListener(u(this.f204935s));
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = aoVar.f203379b;
            if (this.f204936t == null) {
                this.f204936t = new com.tencent.mm.ui.chatting.viewitems.zn(this.f204935s);
            }
            mMNeat7extView.setOnClickListener(this.f204936t);
        } else {
            int i17 = c01.ia.i(f9Var);
            int i18 = 0;
            if (i17 <= 0 || i17 >= wl5.y.o(aoVar.f203379b).length()) {
                i17 = 0;
            }
            wl5.x xVar = aoVar.f203386i;
            if (xVar != null) {
                xVar.c();
            }
            com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(this.f204935s);
            wl5.v x17 = x(u(this.f204935s));
            int[] iArr = new int[2];
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = aoVar.f203379b;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.getLocationInWindow(iArr);
                i18 = iArr[0];
                if (i18 == 0) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    aoVar.f203379b.getGlobalVisibleRect(rect);
                    i18 = rect.left;
                }
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = aoVar.f203379b;
            rl5.r rVar = aoVar.f203385h;
            if (this.f204936t == null) {
                this.f204936t = new com.tencent.mm.ui.chatting.viewitems.zn(this.f204935s);
            }
            wl5.o oVar = new wl5.o(mMNeat7extView3, rVar, x17, this.f204936t, aoVar.f203387j);
            oVar.f447123g = com.tencent.mm.R.color.f478810hv;
            oVar.f447124h = 18;
            oVar.f447122f = com.tencent.mm.R.color.f478808ht;
            if (i18 != 0) {
                oVar.a(i18 + com.tencent.mm.ui.zk.e(aoVar.f203379b.getContext(), com.tencent.mm.R.dimen.f479672c9));
            }
            wl5.x xVar2 = new wl5.x(oVar);
            aoVar.f203386i = xVar2;
            aoVar.f203388k = new com.tencent.mm.ui.chatting.viewitems.wn(xVar2);
            xVar2.f447159d = new com.tencent.mm.ui.chatting.viewitems.on(this);
            java.util.ArrayList arrayList = aoVar.f203389l;
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = aoVar.f203386i.f447172q;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
            com.tencent.mm.ui.chatting.viewitems.pn pnVar = new com.tencent.mm.ui.chatting.viewitems.pn(this, aoVar);
            wl5.x xVar3 = aoVar.f203386i;
            xVar3.C = i17;
            u17.f205293h = pnVar;
            xVar3.Y = aoVar.f203388k;
        }
        aoVar.f203379b.setOnDoubleClickListener(this);
        aoVar.f203379b.setTextListener(new com.tencent.mm.ui.chatting.viewitems.qn(this, aoVar));
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String q07;
        if (com.tencent.mm.ui.chatting.viewitems.ja.b(view)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTextToBase", "onDoubleTap solitaire fold double click");
            return true;
        }
        if (com.tencent.mm.ui.tk.f209956c.a()) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(this.f204935s.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.addFlags(67108864);
        if (view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.go) {
            final com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
            long msgId = goVar.c().getMsgId();
            intent.putExtra("Chat_Msg_Id", msgId);
            intent.putExtra("Chat_User", goVar.c().Q0());
            if (((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) this.f204935s.f460708c.a(sb5.i2.class))).f199059e == msgId || ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) this.f204935s.f460708c.a(sb5.i2.class))).f199060f == msgId) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTextToBase", "speechPlaying stop!!");
                ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) this.f204935s.f460708c.a(sb5.i2.class))).w0(this.f204935s, true);
            }
            if (((com.tencent.mm.ui.chatting.component.pc) ((sb5.v0) this.f204935s.f460708c.a(sb5.v0.class))).m0(goVar.c())) {
                q07 = ((com.tencent.mm.ui.widget.MMNeat7extView) view).a().toString();
            } else {
                q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) this.f204935s.f460708c.a(sb5.l2.class))).q0(goVar.c(), goVar.R == 2);
            }
            intent.putExtra("key_chat_text", q07);
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("is_group_chat", this.f204935s.D());
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(goVar.c().Q0(), 1);
            j45.l.q(this.f204935s.f460709d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.nn$$b
                @Override // j45.g
                public final void onActivityResult(int i17, int i18, android.content.Intent intent2) {
                    com.tencent.mm.ui.chatting.viewitems.nn nnVar = com.tencent.mm.ui.chatting.viewitems.nn.this;
                    nnVar.getClass();
                    if (i17 == 1010 && i18 == 101) {
                        java.lang.Object a17 = ok5.d.a(intent2, "kPartialQuoteContent");
                        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) nnVar.f204935s.f460708c.a(sb5.s0.class))).o0(goVar.c(), a17 instanceof r15.g ? (r15.g) a17 : null);
                    }
                }
            });
            db5.f.j(view.getContext());
        }
        return true;
    }

    public void f0(com.tencent.mm.ui.chatting.viewitems.ao aoVar, rd5.d dVar, android.os.Bundle bundle, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.io ioVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && ioVar == com.tencent.mm.ui.chatting.viewitems.io.NoTransform) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = aoVar.f203382e;
            if (chattingItemTranslate != null) {
                chattingItemTranslate.setVisibility(8);
                return;
            }
            return;
        }
        if (aoVar.f203382e == null) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate2 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) aoVar.f203381d.inflate();
            aoVar.f203382e = chattingItemTranslate2;
            chattingItemTranslate2.c();
        }
        aoVar.f203382e.e(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(aoVar.f203379b.getContext(), str, (int) aoVar.f203379b.getTextSize(), 1, bundle, d0(f9Var)), ioVar, f9Var.getMsgId());
        aoVar.f203382e.setBrandWording(com.tencent.mm.sdk.platformtools.t8.K0(f9Var.U0()) ? this.f204935s.s().getString(com.tencent.mm.R.string.jxn) : f9Var.U0());
        com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(this.f204935s);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar, this.f204935s.D(), aoVar, null);
            goVar.R = 2;
            aoVar.f203382e.getContentView().setTag(goVar);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate3 = aoVar.f203382e;
            if (this.f204936t == null) {
                this.f204936t = new com.tencent.mm.ui.chatting.viewitems.zn(this.f204935s);
            }
            chattingItemTranslate3.setOnClickListener(this.f204936t);
            aoVar.f203382e.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f204935s.f460708c.a(sb5.z.class))).B1);
            aoVar.f203382e.setOnDoubleClickListener(this);
            aoVar.f203382e.setVisibility(0);
        }
        if (aoVar.f203390m != null || com.tencent.mm.sdk.platformtools.t8.J0(wl5.y.o(aoVar.f203382e.getContentView()))) {
            return;
        }
        yb5.d dVar2 = this.f204935s;
        com.tencent.mm.ui.chatting.viewitems.bo.e(dVar2, aoVar, f9Var, u17, x(u(dVar2)));
    }

    public final void h0(com.tencent.mm.storage.f9 f9Var) {
        if (!this.f204935s.x().equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.ui.chatting.ic.g(f9Var);
        this.f204935s.L(true);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.un(f9Var);
    }
}
