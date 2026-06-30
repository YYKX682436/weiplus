package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class pd extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205251s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f205252t = "";

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488512vg);
        com.tencent.mm.ui.chatting.viewitems.od odVar = new com.tencent.mm.ui.chatting.viewitems.od();
        odVar.a(xgVar, true);
        xgVar.setTag(odVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId != 102) {
            if (itemId != 111) {
                return false;
            }
            com.tencent.mm.ui.chatting.manager.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.pd$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yb5.d dVar3 = yb5.d.this;
                    android.content.Intent intent = new android.content.Intent(dVar3.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                    boolean D = dVar3.D();
                    com.tencent.mm.storage.f9 f9Var2 = f9Var;
                    intent.putExtra("Retr_Msg_content", c01.w9.l(D, f9Var2.j(), f9Var2.A0()));
                    intent.putExtra("Retr_Msg_Type", 2);
                    intent.putExtra("Retr_Msg_Id", f9Var2.getMsgId());
                    intent.putExtra("Retr_MsgTalker", f9Var2.Q0());
                    java.lang.String d17 = te5.e2.d(f9Var2);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                        intent.putExtra("weAppSourceUserName", d17);
                    }
                    intent.putExtra("scene_from", 17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(dVar3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar3.a0((android.content.Intent) arrayList.get(0));
                    yj0.a.f(dVar3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            });
            return false;
        }
        java.lang.String str = ot0.q.v(c01.w9.l(dVar.C(), f9Var.j(), f9Var.A0())).f348654f;
        com.tencent.mm.sdk.platformtools.b0.e(str);
        w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.tencent.mm.sdk.platformtools.t8.o0(str));
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (!c01.ia.x(f9Var)) {
            g4Var.c(d17, 102, 0, this.f205251s.s().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
            g4Var.c(d17, 111, 0, this.f205251s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, this.f205251s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if (this.f205251s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, this.f205251s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        return com.tencent.mm.ui.chatting.viewitems.ld.b(this.f205251s, view);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, final yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr;
        java.lang.String str2;
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205251s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var);
        com.tencent.mm.ui.chatting.viewitems.od odVar = (com.tencent.mm.ui.chatting.viewitems.od) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        int i18 = 0;
        if (v17 != null && v17.f348666i == 1) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str3 = v17.f348646d;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str3);
            java.lang.String str4 = (h17 == null || (str2 = h17.field_appName) == null || str2.trim().length() <= 0) ? v17.H : h17.field_appName;
            java.lang.String str5 = v17.f348646d;
            if (str5 == null || str5.length() <= 0 || !com.tencent.mm.ui.chatting.w5.y(str4)) {
                odVar.f205180c.setVisibility(8);
            } else {
                odVar.f205180c.setText(dVar.s().getString(com.tencent.mm.R.string.f490891b65, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), h17, str4)));
                odVar.f205180c.setVisibility(0);
                com.tencent.mm.ui.chatting.w5.r(dVar, odVar.f205180c, v17.f348646d);
                com.tencent.mm.ui.chatting.w5.w(dVar, odVar.f205180c, v17.f348646d);
                android.widget.TextView textView = odVar.f205180c;
                android.graphics.drawable.Drawable drawable = com.tencent.mm.ui.bk.C() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getDrawable(com.tencent.mm.R.raw.spannable_app_brand_link_logo_dark) : com.tencent.mm.sdk.platformtools.x2.f193071a.getDrawable(com.tencent.mm.R.raw.spannable_app_brand_link_logo);
                if (drawable != null) {
                    int dimension = (int) dVar.s().getDimension(com.tencent.mm.R.dimen.f479930ja);
                    drawable.setBounds(0, 0, dimension, dimension);
                    textView.setCompoundDrawables(drawable, null, null, null);
                }
            }
            if (te5.e2.e(v17)) {
                com.tencent.mm.modelmulti.WxaInfo g17 = te5.e2.g(v17);
                com.tencent.mm.pluginsdk.ui.chat.ca caVar = new com.tencent.mm.pluginsdk.ui.chat.ca();
                caVar.f190246a = g17;
                caVar.f190247b = dVar.x();
                caVar.f190248c = te5.e2.d(f9Var);
                com.tencent.mm.ui.chatting.w5.q(dVar, odVar.f205185h, caVar);
                odVar.f205185h.setVisibility(0);
                odVar.f205186i.setText(dVar.g().getString(com.tencent.mm.R.string.epp, g17.f71262e));
                odVar.f205187j.setImageResource(com.tencent.mm.R.raw.app_brand_source_view_icon);
            } else {
                odVar.f205185h.setVisibility(8);
            }
            java.lang.String str6 = v17.f348730y;
            if (str6 == null || str6.length() <= 0) {
                odVar.f205181d.setVisibility(8);
            } else {
                G(dVar, odVar.f205181d, com.tencent.mm.ui.chatting.viewitems.er.a(v17.f348730y));
                odVar.f205181d.setVisibility(0);
            }
            odVar.f205179b.setClickable(true);
            android.os.Bundle a17 = com.tencent.mm.pluginsdk.ui.span.m1.a(dVar.D(), k01.d.a(f9Var.Q0()));
            android.os.Bundle c17 = com.tencent.mm.ui.chatting.viewitems.bo.c(f9Var, dVar, str);
            c17.putAll(a17);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = odVar.f205179b.getContext();
            boolean z17 = !com.tencent.mm.ui.chatting.viewitems.ld.a(f9Var);
            java.lang.String str7 = v17.f348654f;
            int textSize = (int) odVar.f205179b.getTextSize();
            le0.r rVar = le0.x.P0;
            int i19 = 10;
            int i27 = com.tencent.mm.storage.z3.L3(f9Var.y0()) ? 10 : 0;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString k17 = com.tencent.mm.pluginsdk.ui.span.c0.k(context, z17, str7, textSize, 1, c17, rVar, i27, true);
            odVar.f205179b.c(k17, android.widget.TextView.BufferType.SPANNABLE, null);
            final java.lang.String str8 = "yuanbao_text_link";
            final dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            final java.util.ArrayList arrayList = new java.util.ArrayList(4);
            if (com.tencent.mm.storage.z3.L3(dVar.x()) && !android.text.TextUtils.isEmpty(k17) && (z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) k17.getSpans(0, k17.length(), com.tencent.mm.pluginsdk.ui.span.z0.class)) != null && z0VarArr.length != 0) {
                int length = z0VarArr.length;
                while (i18 < length) {
                    com.tencent.mm.pluginsdk.ui.span.z0 z0Var = z0VarArr[i18];
                    if (z0Var.getHrefInfo().f369205n == i19) {
                        java.lang.String e17 = z0Var.getHrefInfo().e();
                        if (e17.startsWith("weixin://chatbot/")) {
                            android.net.Uri parse = android.net.Uri.parse(e17);
                            if ("/SetRedEnvelopeCover".equals(parse.getPath())) {
                                arrayList.add(parse);
                            }
                        }
                    }
                    i18++;
                    i19 = 10;
                }
            }
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.ld$$a
                @Override // java.lang.Runnable
                public final void run() {
                    for (android.net.Uri uri : arrayList) {
                        java.util.HashMap hashMap = new java.util.HashMap(16);
                        m3.d[] dVarArr = new m3.d[4];
                        yb5.d dVar3 = dVar;
                        dVarArr[0] = new m3.d("chat_name", dVar3.x());
                        dVarArr[1] = new m3.d("enter_sessionid", dVar3.f460722q);
                        dVarArr[2] = new m3.d("enter_type", java.lang.Integer.valueOf(vh0.l2.a(dVar3.k())));
                        com.tencent.mm.storage.f9 f9Var2 = f9Var;
                        dVarArr[3] = new m3.d("msgid", java.lang.Long.valueOf(f9Var2 != null ? f9Var2.I0() : 0L));
                        ((cy1.a) rVar2).Hj(str8, "view_exp", bm5.i0.a(hashMap, dVarArr), 34004);
                    }
                }
            }, "yb_txt_link_exp_rpt");
            int j17 = c01.ia.j(f9Var);
            boolean z18 = !com.tencent.mm.ui.chatting.viewitems.ld.a(f9Var);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = odVar.f205179b;
            com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) mMNeat7extView.getTag();
            com.tencent.mm.ui.chatting.viewitems.a0.p(j17, k17, mMNeat7extView, z18, erVar != null ? erVar.c() : null, new com.tencent.mm.ui.chatting.viewitems.md(dVar, k17));
        }
        odVar.f205179b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), odVar, null));
        odVar.f205179b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
        if (c01.d9.b().E() && v17 != null && v17.f348666i == 1) {
            if (odVar.f205183f == null) {
                android.app.Activity g18 = this.f205251s.g();
                rl5.r rVar3 = new rl5.r(g18, odVar.f205179b);
                odVar.f205183f = rVar3;
                rVar3.L = new com.tencent.mm.ui.chatting.viewitems.sd(this, odVar);
                boolean k18 = ti3.i.k(f9Var);
                boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
                rl5.r rVar4 = odVar.f205183f;
                rVar4.C = true;
                rVar4.Q = false;
                rVar4.f397355y = new com.tencent.mm.ui.chatting.viewitems.td(this, g18, odVar, isTeenMode, k18, f9Var);
                rVar4.f397354x = new com.tencent.mm.ui.chatting.viewitems.ud(this, odVar, g18, f9Var);
            }
            if (c01.ia.A(f9Var)) {
                odVar.f205179b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.FALSE);
                odVar.f205179b.setOnTouchListener(odVar.b(this.f205251s));
                odVar.f205179b.setOnLongClickListener(u(this.f205251s));
            } else {
                int i28 = c01.ia.i(f9Var);
                if (i28 <= 0 || i28 >= wl5.y.o(odVar.f205179b).length()) {
                    i28 = wl5.y.o(odVar.f205179b).length();
                }
                com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(this.f205251s);
                wl5.v x17 = x(u17);
                wl5.x xVar2 = odVar.f205184g;
                if (xVar2 != null) {
                    xVar2.c();
                }
                int[] iArr = new int[2];
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = odVar.f205179b;
                if (mMNeat7extView2 != null) {
                    mMNeat7extView2.getLocationInWindow(iArr);
                    i17 = iArr[0];
                    if (i17 == 0) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        odVar.f205179b.getGlobalVisibleRect(rect);
                        i17 = rect.left;
                    }
                } else {
                    i17 = 0;
                }
                wl5.o oVar = new wl5.o(odVar.f205179b, odVar.f205183f, x17, null, odVar.b(this.f205251s));
                oVar.f447123g = com.tencent.mm.R.color.a3y;
                oVar.f447124h = 18;
                oVar.f447122f = com.tencent.mm.R.color.f478860j6;
                if (i17 != 0) {
                    oVar.a(i17 + com.tencent.mm.ui.zk.e(odVar.f205179b.getContext(), com.tencent.mm.R.dimen.f479688cn));
                }
                wl5.x xVar3 = new wl5.x(oVar);
                odVar.f205184g = xVar3;
                com.tencent.mm.ui.chatting.viewitems.be beVar = new com.tencent.mm.ui.chatting.viewitems.be(xVar3);
                xVar3.f447159d = new com.tencent.mm.ui.chatting.viewitems.qd(this);
                u17.f205293h = new com.tencent.mm.ui.chatting.viewitems.rd(this, odVar);
                xVar3.C = i28;
                xVar3.Y = beVar;
            }
            odVar.f205179b.setOnDoubleClickListener(this);
        }
    }
}
