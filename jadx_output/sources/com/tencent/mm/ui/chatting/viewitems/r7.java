package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f205410a;

    /* renamed from: b, reason: collision with root package name */
    public yb5.d f205411b;

    public r7(boolean z17) {
        this.f205410a = z17;
    }

    public final void a(com.tencent.mm.ui.chatting.viewitems.a0 chattingItem, com.tencent.mm.ui.chatting.viewitems.o7 o7Var, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        java.lang.String string;
        java.lang.String str2;
        java.lang.String str3;
        zy2.d dVar;
        kotlin.jvm.internal.o.g(chattingItem, "chattingItem");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (o7Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveThemeDelegate", "filling not AppMsgFinderLiveThemeHolder");
            return;
        }
        this.f205411b = ui6;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        r45.hd2 hd2Var = (v17 == null || (dVar = (zy2.d) v17.y(zy2.d.class)) == null) ? null : dVar.f477371b;
        android.widget.TextView textView = o7Var.f205143f;
        if (textView != null) {
            textView.setMaxLines(3);
        }
        android.widget.TextView textView2 = o7Var.f205143f;
        java.lang.String str4 = "";
        if (textView2 != null) {
            if (hd2Var == null || (str3 = hd2Var.getString(1)) == null) {
                str3 = "";
            }
            textView2.setText(str3);
        }
        android.widget.TextView textView3 = o7Var.f205149l;
        if (textView3 != null) {
            textView3.setMaxLines(2);
        }
        android.widget.TextView textView4 = o7Var.f205149l;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        android.widget.TextView textView5 = o7Var.f205149l;
        if (textView5 != null) {
            if (hd2Var == null || (str2 = hd2Var.getString(0)) == null) {
                str2 = "";
            }
            textView5.setText(str2);
        }
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
        fVar.f342101y = com.tencent.mm.ui.chatting.viewitems.j1.k();
        fVar.f342079c = true;
        fVar.f342083g = tv.a.a();
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        fVar.f342086j = b17;
        fVar.f342087k = b18;
        fVar.f342077a = true;
        fVar.f342096t = true;
        fVar.f342097u = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
        n11.a b19 = n11.a.b();
        if (hd2Var != null && (string = hd2Var.getString(2)) != null) {
            str4 = string;
        }
        b19.h(str4, o7Var.f205141d, fVar.a());
        o7Var.b(o7Var.f205142e);
        android.widget.TextView textView6 = o7Var.f205143f;
        if (textView6 != null) {
            textView6.setTextColor(ui6.g().getResources().getColor(com.tencent.mm.R.color.t_));
        }
        com.tencent.mm.ui.MMImageView mMImageView = o7Var.f205141d;
        if (mMImageView != null) {
            mMImageView.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = o7Var.f205160w;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        android.widget.TextView textView7 = o7Var.f205143f;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        o7Var.b(o7Var.f205151n);
        o7Var.b(o7Var.f205153p);
        o7Var.b(o7Var.f205152o);
        o7Var.b(o7Var.f205162y);
        o7Var.b(o7Var.f205163z);
        o7Var.b(o7Var.f205146i);
        o7Var.b(o7Var.f205147j);
        android.view.View view = o7Var.f205161x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$AppMsgFinderLiveThemeHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$AppMsgFinderLiveThemeHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o7Var.b(o7Var.B);
        o7Var.b(o7Var.C);
        o7Var.resetChatBubbleWidth(o7Var.clickArea, ((java.lang.Number) ((jz5.n) o7Var.D).getValue()).intValue());
        o7Var.b(o7Var.A);
        android.view.View view2 = o7Var.f205161x;
        int i17 = com.tencent.mm.R.drawable.f481182mi;
        boolean z17 = this.f205410a;
        if (view2 != null) {
            view2.setBackgroundResource(z17 ? com.tencent.mm.R.drawable.f481182mi : com.tencent.mm.R.drawable.f481244ob);
        }
        android.view.View view3 = o7Var.clickArea;
        if (view3 != null) {
            if (!z17) {
                i17 = com.tencent.mm.R.drawable.f481244ob;
            }
            view3.setBackgroundResource(i17);
        }
        android.view.View view4 = o7Var.f205161x;
        if (view4 != null) {
            view4.setPadding(0, ui6.g().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx), 0, 0);
        }
        o7Var.b(o7Var.f205148k);
        o7Var.b(o7Var.f205144g);
        o7Var.b(o7Var.f205145h);
        o7Var.b(o7Var.f205155r);
        android.widget.ImageView imageView = o7Var.f205154q;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        o7Var.b(o7Var.f205154q);
        android.widget.LinearLayout linearLayout = o7Var.f205157t;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        o7Var.b(o7Var.f205150m);
        android.widget.LinearLayout linearLayout2 = o7Var.f205159v;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        o7Var.b(o7Var.f205158u);
        o7Var.b(o7Var.f205156s);
        o7Var.clickArea.setOnClickListener(chattingItem.w(ui6));
        o7Var.clickArea.setOnLongClickListener(chattingItem.u(ui6));
        android.view.View view5 = o7Var.clickArea;
        sb5.z zVar = (sb5.z) ui6.f460708c.a(sb5.z.class);
        view5.setOnTouchListener(zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null);
        o7Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(msgData, ui6.D(), o7Var, null));
        android.widget.ImageView imageView2 = o7Var.f205140c;
        if (imageView2 != null) {
            kotlin.jvm.internal.o.d(imageView2);
            imageView2.setVisibility(8);
        }
        chattingItem.Z(o7Var, f9Var.P0() < 2, true);
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        boolean z17 = this.f205410a;
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, z17 ? com.tencent.mm.R.layout.e1h : com.tencent.mm.R.layout.e1w);
        com.tencent.mm.ui.chatting.viewitems.o7 o7Var = new com.tencent.mm.ui.chatting.viewitems.o7();
        o7Var.a(xgVar, !z17);
        xgVar.setTag(o7Var);
        return xgVar;
    }

    public final boolean c(android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (menuItem == null || dVar == null || menuItem.getItemId() != 111) {
            return false;
        }
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(msg.j()) && (v17 = ot0.q.v(msg.j())) != null) {
            android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", msg.getMsgId());
            intent.putExtra("Retr_MsgTalker", msg.Q0());
            intent.putExtra("Retr_Msg_Type", 38);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            g17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    public final boolean d(com.tencent.mm.ui.chatting.viewitems.a0 chattingItem, db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        kotlin.jvm.internal.o.g(chattingItem, "chattingItem");
        com.tencent.mm.storage.f9 f9Var = dVar != null ? dVar.f394254d.f445300b : null;
        if (g4Var == null || view == null) {
            return false;
        }
        yb5.d dVar2 = this.f205411b;
        if (dVar2 != null) {
            if (this.f205410a) {
                java.lang.Object tag = view.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
                if (f9Var != null && !c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                    g4Var.c(d17, 111, 0, dVar2.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                }
            } else {
                java.lang.Object tag2 = view.getTag();
                kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int d18 = ((com.tencent.mm.ui.chatting.viewitems.er) tag2).d();
                if (f9Var != null) {
                    if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                        g4Var.c(d18, 111, 0, dVar2.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                    }
                    if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar2) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar2.A()) {
                        g4Var.c(d18, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                    }
                }
            }
        }
        return true;
    }
}
