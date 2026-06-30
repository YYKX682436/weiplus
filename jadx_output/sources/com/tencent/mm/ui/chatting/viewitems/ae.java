package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ae extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6, com.tencent.neattextview.textview.view.f {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203348s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f203349t = "";

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488556x1);
        com.tencent.mm.ui.chatting.viewitems.od odVar = new com.tencent.mm.ui.chatting.viewitems.od();
        odVar.a(xgVar, true);
        xgVar.setTag(odVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            java.lang.String str = ot0.q.v(f9Var.j()).f348654f;
            com.tencent.mm.sdk.platformtools.b0.e(str);
            w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.tencent.mm.sdk.platformtools.t8.o0(str));
            return false;
        }
        if (itemId != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", f9Var.j());
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            intent.putExtra("weAppSourceUserName", d17);
        }
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (!c01.ia.x(f9Var)) {
            g4Var.c(d17, 102, 0, this.f203348s.s().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
            g4Var.c(d17, 111, 0, this.f203348s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, this.f203348s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if (!f9Var.t2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f203348s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!this.f203348s.F()) {
            g4Var.c(d17, 100, 0, this.f203348s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        return com.tencent.mm.ui.chatting.viewitems.ld.b(this.f203348s, view);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        boolean z17;
        java.lang.String str2;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.od odVar = (com.tencent.mm.ui.chatting.viewitems.od) g0Var;
        this.f203348s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        int i17 = 0;
        if (v17 == null || v17.f348666i != 1) {
            z17 = true;
        } else {
            android.os.Bundle a17 = com.tencent.mm.pluginsdk.ui.span.m1.a(dVar.D(), k01.d.a(f9Var.Q0()));
            android.os.Bundle c17 = com.tencent.mm.ui.chatting.viewitems.bo.c(f9Var, dVar, str);
            c17.putAll(a17);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = odVar.f205179b.getContext();
            boolean z18 = !com.tencent.mm.ui.chatting.viewitems.ld.a(f9Var);
            java.lang.String str3 = v17.f348654f;
            int textSize = (int) odVar.f205179b.getTextSize();
            le0.r rVar = le0.x.P0;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString k17 = com.tencent.mm.pluginsdk.ui.span.c0.k(context, z18, str3, textSize, 4, c17, rVar, 0, true);
            odVar.f205179b.c(k17, android.widget.TextView.BufferType.SPANNABLE, null);
            odVar.f205179b.setClickable(true);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = v17.f348646d;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str4);
            java.lang.String str5 = (h17 == null || (str2 = h17.field_appName) == null || str2.trim().length() <= 0) ? v17.H : h17.field_appName;
            java.lang.String str6 = v17.f348646d;
            if (str6 == null || str6.length() <= 0 || !com.tencent.mm.ui.chatting.w5.y(str5)) {
                odVar.f205180c.setVisibility(8);
            } else {
                odVar.f205180c.setText(dVar.s().getString(com.tencent.mm.R.string.f490891b65, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), h17, str5)));
                odVar.f205180c.setVisibility(0);
                com.tencent.mm.ui.chatting.w5.r(dVar, odVar.f205180c, v17.f348646d);
                com.tencent.mm.ui.chatting.w5.w(dVar, odVar.f205180c, v17.f348646d);
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
            Z(odVar, f9Var.P0() < 2, true);
            z17 = true;
            V(odVar, dVar2, dVar.t(), dVar.D(), dVar, this);
            int j17 = c01.ia.j(f9Var);
            boolean z19 = !com.tencent.mm.ui.chatting.viewitems.ld.a(f9Var);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = odVar.f205179b;
            com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) mMNeat7extView.getTag();
            com.tencent.mm.ui.chatting.viewitems.a0.p(j17, k17, mMNeat7extView, z19, erVar != null ? erVar.c() : null, new com.tencent.mm.ui.chatting.viewitems.md(dVar, k17));
        }
        odVar.f205179b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), odVar, null));
        odVar.f205179b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
        if (c01.d9.b().E() && v17 != null && v17.f348666i == z17) {
            if (odVar.f205183f == null) {
                android.app.Activity g18 = this.f203348s.g();
                rl5.r rVar2 = new rl5.r(g18, odVar.f205179b);
                odVar.f205183f = rVar2;
                rVar2.L = new com.tencent.mm.ui.chatting.viewitems.xd(this, odVar);
                boolean k18 = ti3.i.k(f9Var);
                boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
                rl5.r rVar3 = odVar.f205183f;
                rVar3.C = z17;
                rVar3.Q = false;
                rVar3.f397355y = new com.tencent.mm.ui.chatting.viewitems.yd(this, g18, odVar, isTeenMode, k18, f9Var);
                rVar3.f397354x = new com.tencent.mm.ui.chatting.viewitems.zd(this, odVar, g18, f9Var);
            }
            if (c01.ia.A(f9Var)) {
                odVar.f205179b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.FALSE);
                odVar.f205179b.setOnTouchListener(odVar.b(this.f203348s));
                odVar.f205179b.setOnLongClickListener(u(this.f203348s));
            } else {
                int i18 = c01.ia.i(f9Var);
                if (i18 <= 0 || i18 >= wl5.y.o(odVar.f205179b).length()) {
                    i18 = wl5.y.o(odVar.f205179b).length();
                }
                com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(this.f203348s);
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
                }
                wl5.o oVar = new wl5.o(odVar.f205179b, odVar.f205183f, x17, null, odVar.b(this.f203348s));
                oVar.f447123g = com.tencent.mm.R.color.a3y;
                oVar.f447124h = 18;
                oVar.f447122f = com.tencent.mm.R.color.f478860j6;
                if (i17 != 0) {
                    oVar.a(i17 + com.tencent.mm.ui.zk.e(odVar.f205179b.getContext(), com.tencent.mm.R.dimen.f479688cn));
                }
                wl5.x xVar3 = new wl5.x(oVar);
                odVar.f205184g = xVar3;
                com.tencent.mm.ui.chatting.viewitems.be beVar = new com.tencent.mm.ui.chatting.viewitems.be(xVar3);
                xVar3.f447159d = new com.tencent.mm.ui.chatting.viewitems.vd(this);
                u17.f205293h = new com.tencent.mm.ui.chatting.viewitems.wd(this, odVar);
                xVar3.C = i18;
                xVar3.Y = beVar;
            }
            odVar.f205179b.setOnDoubleClickListener(this);
        }
    }
}
