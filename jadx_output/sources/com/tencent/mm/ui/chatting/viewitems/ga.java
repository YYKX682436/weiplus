package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ga extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f, com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204020s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ia f204022u;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f204021t = "";

    /* renamed from: v, reason: collision with root package name */
    public int f204023v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f204024w = -1;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488550wt);
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = new com.tencent.mm.ui.chatting.viewitems.q9();
        q9Var.a(xgVar, true);
        xgVar.setTag(q9Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        int t17;
        int t18;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            java.lang.String str = ot0.q.v(c01.w9.l(dVar.C(), f9Var.j(), f9Var.A0())).f348654f;
            com.tencent.mm.sdk.platformtools.b0.e(str);
            w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.tencent.mm.sdk.platformtools.t8.o0(str));
            return false;
        }
        if (itemId == 103) {
            d0(f9Var);
        } else {
            if (itemId == 111) {
                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
            if (itemId == 179) {
                qn4.y.c(dVar.g(), f9Var, null, dVar);
                return true;
            }
            if (itemId != 124 && itemId != 125) {
                if (itemId == 151) {
                    com.tencent.mm.ui.chatting.w5.m(dVar, f9Var.Q0(), f9Var.getMsgId(), 2);
                    return false;
                }
                if (itemId == 152) {
                    ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).o0(f9Var);
                } else if (itemId != 163 && itemId != 164) {
                    switch (itemId) {
                        case 141:
                            java.lang.String W0 = f9Var.W0();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(W0)) {
                                com.tencent.mm.sdk.platformtools.b0.e(W0);
                            }
                            db5.e1.T(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490361st));
                            return true;
                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                            android.content.Intent intent2 = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                            java.lang.String W02 = f9Var.W0();
                            if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t17 = c01.w9.t(W02)) != -1) {
                                W02 = W02.substring(t17 + 1).trim();
                            }
                            if (f9Var.X2()) {
                                intent2.putExtra("Retr_Msg_content", W02);
                                intent2.putExtra("Retr_Msg_Type", 6);
                            } else {
                                intent2.putExtra("Retr_Msg_content", W02);
                                intent2.putExtra("Retr_Msg_Type", 4);
                            }
                            intent2.putExtra("scene_from", 17);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(intent2);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            dVar.a0((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return true;
                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                            java.lang.String W03 = f9Var.W0();
                            if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t18 = c01.w9.t(W03)) != -1) {
                                W03 = W03.substring(t18 + 1).trim();
                            }
                            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, W03, 1);
                            am.c4 c4Var = doFavoriteEvent.f54090g;
                            c4Var.f6324j = dVar.f460717l;
                            c4Var.f6327m = 43;
                            r45.bq0 bq0Var = c4Var.f6315a;
                            if (bq0Var == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", " transform text fav failed");
                                break;
                            } else {
                                r45.jq0 jq0Var = bq0Var.f370962d;
                                if (jq0Var != null) {
                                    jq0Var.e(f9Var.Q0());
                                    jq0Var.j(c01.z1.r());
                                    doFavoriteEvent.e();
                                    return true;
                                }
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).t0(menuItem, f9Var);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        int i18;
        int i19;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        java.lang.String str = f9Var.G;
        boolean z17 = str != null && str.contains("announcement@all");
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
        int d17 = goVar.d();
        int i27 = goVar.R;
        if (i27 == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "接龙消息右键菜单");
            if (x63.g.G(f9Var)) {
                java.lang.String string = this.f204020s.s().getString(com.tencent.mm.R.string.fsr);
                i17 = 2;
                i18 = com.tencent.mm.R.string.b3m;
                i19 = com.tencent.mm.R.string.f492836i24;
                g4Var.c(d17, 151, 0, string, com.tencent.mm.R.raw.icons_filled_continued_form);
            } else {
                i17 = 2;
                i18 = com.tencent.mm.R.string.b3m;
                i19 = com.tencent.mm.R.string.f492836i24;
            }
            if (!c01.ia.x(f9Var)) {
                g4Var.c(d17, 102, 0, this.f204020s.s().getString(i18), com.tencent.mm.R.raw.icons_filled_copy);
                g4Var.c(d17, 111, 0, this.f204020s.s().getString(i19), com.tencent.mm.R.raw.icons_filled_share);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f204020s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (!z17 && !f9Var.t2() && ((f9Var.P0() == i17 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204020s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204020s.A())) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
            if (com.tencent.mm.app.plugin.k.a()) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
                }
            }
            if (!this.f204020s.F()) {
                g4Var.c(d17, 100, 0, this.f204020s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
        } else if (i27 == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "翻译消息右键菜单");
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
        d0(f9Var);
    }

    public final void d0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.H2()) {
            y63.a L0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(f9Var.Q0(), f9Var.W1(), true);
            if (L0 != null && com.tencent.mm.sdk.platformtools.t8.B0(L0.field_firstMsgId, f9Var.getMsgId())) {
                L0.field_firstMsgId = 0L;
                ((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L0, true);
            }
            android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            if (z17 != null && z17.second != null) {
                x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
                long msgId = f9Var.getMsgId();
                long longValue = ((java.lang.Long) z17.second).longValue();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = Ai.f452266a;
                android.util.Pair pair = (android.util.Pair) concurrentHashMap.remove(java.lang.Long.valueOf(msgId));
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = Ai.f452267b;
                java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap2.remove(java.lang.Long.valueOf(msgId));
                if (pair != null) {
                    concurrentHashMap.put(java.lang.Long.valueOf(longValue), pair);
                    concurrentHashMap2.put(java.lang.Long.valueOf(longValue), bool);
                }
            }
            if (z17 == null || z17.second != null) {
                c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            }
            this.f204020s.L(true);
        }
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        if (com.tencent.mm.ui.chatting.viewitems.ja.b(view)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap solitaire fold double click");
            return true;
        }
        java.lang.CharSequence a17 = ((com.tencent.mm.ui.widget.MMNeat7extView) view).a();
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", a17);
        intent.putExtra("key_chat_from", view.getContext().getClass().getName());
        if ((view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.er) && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag()) != null) {
            intent.putExtra("Chat_Msg_Id", erVar.c().getMsgId());
            intent.putExtra("Chat_User", erVar.c().Q0());
        }
        yb5.d dVar = this.f204020s;
        if (dVar != null) {
            intent.putExtra("is_group_chat", dVar.D());
        }
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(view.getContext());
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.un(f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.tencent.mm.ui.chatting.viewitems.io ioVar;
        java.lang.String str2;
        android.view.ViewStub viewStub;
        java.lang.String str3;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = (com.tencent.mm.ui.chatting.viewitems.q9) g0Var;
        this.f204020s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var);
        q9Var.f205329b.setTag(com.tencent.mm.R.id.bon, java.lang.Long.valueOf(f9Var.getMsgId()));
        q9Var.f205329b.setTag(com.tencent.mm.R.id.rfh, f9Var.Q0());
        q9Var.f205329b.setTag(com.tencent.mm.R.id.bom, java.lang.Boolean.TRUE);
        com.tencent.mm.ui.chatting.viewitems.ja.a(dVar, q9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        yd5.h.f461099a.a(q9Var.f205329b, f9Var, dVar.D(), str);
        android.os.Bundle c17 = com.tencent.mm.ui.chatting.viewitems.bo.c(f9Var, dVar, str);
        com.tencent.mm.pluginsdk.ui.span.l1.f191253g.b(c17, k01.d.a(f9Var.Q0()));
        if (v17 == null || v17.f348666i != 53) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = q9Var.f205329b.getContext();
        java.lang.String str4 = v17.f348654f;
        int textSize = (int) q9Var.f205329b.getTextSize();
        le0.r rVar = le0.x.P0;
        android.text.SpannableString fj6 = ((ke0.e) xVar).fj(context, str4, textSize, 4, c17, rVar);
        java.lang.String c18 = com.tencent.mm.ui.chatting.viewitems.ja.c(q9Var.f205329b.getContext(), dVar, v17.f348654f, fj6, q9Var.f205329b, f9Var, 4);
        q9Var.f205329b.setClickable(true);
        java.util.ArrayList arrayList = q9Var.f205336i;
        if (fj6 != null) {
            android.text.SpannableString fj7 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(q9Var.f205329b.getContext(), c18, (int) q9Var.f205329b.getTextSize(), 1, c17, rVar);
            com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) fj7.getSpans(0, fj6.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
            arrayList.clear();
            for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                int[] iArr = {fj7.getSpanStart(z0Var), fj7.getSpanEnd(z0Var), com.tencent.mm.ui.chatting.viewitems.a0.y(z0Var)};
                if (iArr[1] - iArr[0] < c18.length()) {
                    arrayList.add(iArr);
                }
            }
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str5 = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str5);
        java.lang.String str6 = (h17 == null || (str3 = h17.field_appName) == null || str3.trim().length() <= 0) ? v17.H : h17.field_appName;
        java.lang.String str7 = v17.f348646d;
        if (str7 == null || str7.length() <= 0 || !com.tencent.mm.ui.chatting.w5.y(str6)) {
            q9Var.f205330c.setVisibility(8);
        } else {
            q9Var.f205330c.setText(dVar.s().getString(com.tencent.mm.R.string.f490891b65, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), h17, str6)));
            q9Var.f205330c.setVisibility(0);
            com.tencent.mm.ui.chatting.w5.r(dVar, q9Var.f205330c, v17.f348646d);
            com.tencent.mm.ui.chatting.w5.w(dVar, q9Var.f205330c, v17.f348646d);
        }
        if (x63.g.G(f9Var)) {
            q9Var.f205330c.setText(dVar.s().getString(com.tencent.mm.R.string.fsw));
            q9Var.f205330c.setVisibility(0);
            q9Var.f205330c.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.z9(this, f9Var, dVar));
        }
        Z(q9Var, f9Var.P0() < 2, true);
        com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar.D(), q9Var, null);
        boolean k17 = ti3.i.k(f9Var);
        android.content.Context context2 = q9Var.f205329b.getContext();
        q9Var.f205329b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
        if (q9Var.f205332e == null) {
            rl5.r rVar2 = new rl5.r(context2, q9Var.f205329b);
            q9Var.f205332e = rVar2;
            rVar2.L = new com.tencent.mm.ui.chatting.viewitems.aa(this, dVar, q9Var, f9Var);
            rVar2.C = true;
            rVar2.f397355y = new com.tencent.mm.ui.chatting.viewitems.ba(this, context2, k17);
            rVar2.f397354x = new com.tencent.mm.ui.chatting.viewitems.ca(this, q9Var, context2, dVar);
        }
        com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(dVar);
        wl5.v x17 = x(u(dVar));
        wl5.x xVar2 = q9Var.f205333f;
        if (xVar2 != null) {
            xVar2.c();
        }
        int[] iArr2 = new int[2];
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = q9Var.f205329b;
        if (mMNeat7extView != null) {
            mMNeat7extView.getLocationInWindow(iArr2);
            int i18 = iArr2[0];
            if (i18 == 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                q9Var.f205329b.getGlobalVisibleRect(rect);
                i18 = rect.left;
            }
            i17 = i18;
        } else {
            i17 = 0;
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = q9Var.f205329b;
        rl5.r rVar3 = q9Var.f205332e;
        if (this.f204022u == null) {
            this.f204022u = new com.tencent.mm.ui.chatting.viewitems.ia(this.f204020s);
        }
        wl5.o oVar = new wl5.o(mMNeat7extView2, rVar3, x17, this.f204022u, q9Var.f205334g);
        oVar.f447123g = com.tencent.mm.R.color.f478810hv;
        oVar.f447124h = 18;
        oVar.f447122f = com.tencent.mm.R.color.f478808ht;
        if (i17 != 0) {
            oVar.a(i17 + com.tencent.mm.ui.zk.e(q9Var.f205329b.getContext(), com.tencent.mm.R.dimen.f479672c9));
        }
        wl5.x xVar3 = new wl5.x(oVar);
        q9Var.f205333f = xVar3;
        q9Var.f205335h = new com.tencent.mm.ui.chatting.viewitems.ha(xVar3);
        xVar3.f447159d = new com.tencent.mm.ui.chatting.viewitems.da(this);
        if (arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = q9Var.f205333f.f447172q;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        u17.f205293h = new com.tencent.mm.ui.chatting.viewitems.ea(this, q9Var);
        q9Var.f205333f.Y = q9Var.f205335h;
        q9Var.f205329b.setOnDoubleClickListener(this);
        q9Var.f205329b.setTag(goVar);
        q9Var.f205329b.setTextListener(new com.tencent.mm.ui.chatting.viewitems.fa(this, q9Var));
        com.tencent.mm.ui.chatting.viewitems.io ioVar2 = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        boolean a17 = com.tencent.mm.app.plugin.k.a();
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        if (a17) {
            str2 = (f9Var.i2() && f9Var.b2()) ? f9Var.W0() : null;
            ioVar = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) cVar.a(sb5.l2.class))).v0(f9Var);
        } else {
            ioVar = ioVar2;
            str2 = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && ioVar == ioVar2) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = q9Var.f205339l;
            if (chattingItemTranslate != null) {
                chattingItemTranslate.setVisibility(8);
            }
        } else {
            if (q9Var.f205339l == null && (viewStub = q9Var.f205338k) != null) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate2 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) viewStub.inflate();
                q9Var.f205339l = chattingItemTranslate2;
                chattingItemTranslate2.c();
            }
            android.os.Bundle a18 = com.tencent.mm.pluginsdk.ui.span.l1.f191253g.a(k01.d.a(f9Var.Q0()));
            le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = q9Var.f205329b.getContext();
            int textSize2 = (int) q9Var.f205329b.getTextSize();
            java.lang.String a19 = c01.n2.a("" + f9Var.I0());
            c01.l2 c19 = c01.n2.d().c(a19, true);
            c19.i("prePublishId", "msg_" + f9Var.I0());
            c19.i("preUsername", A(this.f204020s, f9Var));
            c19.i("preChatName", z(this.f204020s, f9Var));
            le0.r rVar4 = le0.x.P0;
            ((ke0.e) xVar4).getClass();
            android.text.SpannableString s17 = com.tencent.mm.pluginsdk.ui.span.c0.s(context3, str2, textSize2, 1, a18, a19, 0, rVar4, true);
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "spannableString：%s", s17);
            q9Var.f205339l.e(s17, ioVar, f9Var.getMsgId());
            q9Var.f205339l.setBrandWording(com.tencent.mm.sdk.platformtools.t8.K0(f9Var.U0()) ? dVar.s().getString(com.tencent.mm.R.string.jxn) : f9Var.U0());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mm.ui.chatting.viewitems.go goVar2 = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar.D(), q9Var, null);
                goVar2.R = 2;
                q9Var.f205339l.setTag(goVar2);
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate3 = q9Var.f205339l;
                if (this.f204022u == null) {
                    this.f204022u = new com.tencent.mm.ui.chatting.viewitems.ia(this.f204020s);
                }
                chattingItemTranslate3.setOnClickListener(this.f204022u);
                q9Var.f205339l.setOnDoubleClickListener(this);
                q9Var.f205339l.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) cVar.a(sb5.z.class))).B1);
                q9Var.f205339l.setOnLongClickListener(u(dVar));
                q9Var.f205339l.setVisibility(0);
            }
        }
        V(q9Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
