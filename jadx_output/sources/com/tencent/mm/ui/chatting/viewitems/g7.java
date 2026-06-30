package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class g7 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204018s;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r0 == null) goto L5;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View F(android.view.LayoutInflater r3, android.view.View r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L8
            java.lang.Object r0 = r4.getTag()
            if (r0 != 0) goto L31
        L8:
            com.tencent.mm.ui.chatting.viewitems.xg r4 = new com.tencent.mm.ui.chatting.viewitems.xg
            java.lang.Class<m40.k0> r0 = m40.k0.class
            i95.m r0 = i95.n0.c(r0)
            m40.k0 r0 = (m40.k0) r0
            c61.p7 r0 = (c61.p7) r0
            int r0 = r0.Ri()
            r1 = 1
            if (r0 != r1) goto L1f
            r0 = 2131493769(0x7f0c0389, float:1.8611027E38)
            goto L22
        L1f:
            r0 = 2131493768(0x7f0c0388, float:1.8611025E38)
        L22:
            r4.<init>(r3, r0)
            com.tencent.mm.ui.chatting.viewitems.e7 r3 = new com.tencent.mm.ui.chatting.viewitems.e7
            r3.<init>()
            r0 = 0
            r3.b(r4, r0)
            r4.setTag(r3)
        L31:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.g7.F(android.view.LayoutInflater, android.view.View):android.view.View");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(dVar.g(), null)) {
            return true;
        }
        com.tencent.mm.ui.chatting.viewitems.j7.b(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null) {
            j45.l.g("favorite");
            if (!z17) {
                if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                    g4Var.c(d17, 111, 0, this.f204018s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                }
                if (!c01.ia.A(f9Var)) {
                    g4Var.c(d17, 116, 0, this.f204018s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        zy2.i iVar;
        if (!com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(view.getContext(), null)) {
            return true;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null && (iVar = (zy2.i) v17.y(zy2.i.class)) != null) {
            android.content.Intent intent = new android.content.Intent();
            if ((iVar.f477411b.getInteger(25) & 4) > 0) {
                intent.putExtra("member_username", iVar.f477411b.getString(1));
            }
            intent.putExtra("feed_object_id", pm0.v.Z(iVar.f477411b.getString(0)));
            intent.putExtra("feed_object_nonceId", iVar.f477411b.getString(8));
            intent.putExtra("business_type", 0);
            intent.putExtra("finder_user_name", iVar.f477411b.getString(1));
            if (com.tencent.mm.storage.z3.p4(f9Var.Q0())) {
                intent.putExtra("report_scene", 58);
            } else if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                intent.putExtra("report_scene", 2);
            } else {
                intent.putExtra("report_scene", 1);
            }
            intent.putExtra("from_user", f9Var.Q0());
            intent.putExtra("key_from_user_name", ki0.a.a(f9Var));
            intent.putExtra("key_ec_source", iVar.f477411b.getString(24));
            intent.putExtra("key_to_user_name", ki0.a.b(f9Var));
            intent.putExtra("tab_type", 6);
            intent.putExtra("key_source_comment_scene", iVar.f477411b.getInteger(29));
            if (iVar.f477411b.getByteString(26) != null) {
                intent.putExtra("key_share_byp_data", iVar.f477411b.getByteString(26).f192156a);
            }
            if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ak()) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 2, 162, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.t(dVar.g(), intent);
            } else {
                com.tencent.mm.ui.chatting.viewitems.j7.c(view, dVar, iVar, intent, false, com.tencent.mm.storage.z3.R4(f9Var.Q0()), f9Var);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204018s = dVar;
        com.tencent.mm.ui.chatting.viewitems.e7 e7Var = (com.tencent.mm.ui.chatting.viewitems.e7) g0Var;
        e7Var.f203855l.animate().cancel();
        e7Var.f203855l.setTag(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
            if (iVar != null) {
                boolean z17 = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri() == 1;
                ym5.a1.h(e7Var.convertView, new com.tencent.mm.ui.chatting.viewitems.f7(this, dVar, iVar, str, f9Var));
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l lVar = ya2.l.f460502a;
                a17.c(lVar.e(iVar.f(), com.tencent.mm.plugin.finder.storage.y90.f128356f), e7Var.f203845b, g1Var.h(mn2.f1.f329962p));
                android.widget.TextView textView = e7Var.f203846c;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String g18 = iVar.g();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, g18));
                android.view.ViewGroup.LayoutParams layoutParams = e7Var.f203846c.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
                    e7Var.f203846c.setLayoutParams(layoutParams);
                }
                if (e7Var.f203861r != null) {
                    e7Var.f203861r.setContentDescription(iVar.g() + " " + iVar.f477411b.getString(4));
                }
                java.util.LinkedList list = iVar.f477411b.getList(7);
                if (!list.isEmpty()) {
                    com.tencent.mm.ui.chatting.viewitems.j7.a(e7Var, list, iVar.f477411b);
                    r45.iv2 iv2Var = (r45.iv2) list.get(0);
                    java.lang.String string = iv2Var.getString(6);
                    java.lang.String string2 = (iv2Var.getString(8) == null || iv2Var.getString(8).isEmpty()) ? iv2Var.getString(2) : iv2Var.getString(8);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    lVar.f(string2, e7Var.f203847d, e7Var.f203861r.getLayoutParams().width, e7Var.f203861r.getLayoutParams().height);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        lVar.h(string, null, mn2.f1.B);
                    }
                }
                if (iVar.f477411b.getInteger(5) == 1) {
                    e7Var.f203848e.setVisibility(8);
                    e7Var.f203847d.setVisibility(8);
                    android.widget.TextView textView2 = e7Var.f203849f;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g19 = dVar.g();
                    java.lang.String string3 = iVar.f477411b.getString(4);
                    ((ke0.e) xVar2).getClass();
                    textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g19, string3));
                    e7Var.f203849f.setVisibility(0);
                } else {
                    e7Var.f203848e.setVisibility(8);
                    e7Var.f203847d.setVisibility(0);
                    e7Var.f203849f.setVisibility(8);
                    if (iVar.f477411b.getInteger(5) == 4 || iVar.f477411b.getInteger(5) == 6) {
                        e7Var.f203852i.setVisibility(0);
                        e7Var.f203854k.setVisibility(8);
                    } else if (iVar.f477411b.getInteger(5) == 2) {
                        e7Var.f203852i.setVisibility(8);
                        e7Var.f203854k.setVisibility(0);
                        e7Var.f203854k.f170651e = java.lang.Math.min(list.size(), ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ui());
                    } else {
                        e7Var.f203852i.setVisibility(8);
                    }
                }
                if (z17) {
                    android.view.View view = e7Var.f203857n;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = e7Var.f203857n;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.LinearLayout linearLayout = e7Var.f203856m;
                if (linearLayout != null) {
                    ho.b.b(linearLayout, com.tencent.mm.R.drawable.aci, z17 ? com.tencent.mm.R.drawable.ach : com.tencent.mm.R.drawable.acg);
                }
                if ((iVar.f477411b.getInteger(25) & 4) > 0) {
                    android.view.View view3 = e7Var.f203858o;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View view4 = e7Var.f203858o;
                    if (view4 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.widget.LinearLayout linearLayout2 = e7Var.f203856m;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                android.view.View view5 = e7Var.f203859p;
                if (view5 != null) {
                    if (z17) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView3 = (android.widget.TextView) e7Var.f203859p.findViewById(com.tencent.mm.R.id.bnp);
                        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                        android.app.Activity g27 = dVar.g();
                        java.lang.String g28 = iVar.g();
                        ((ke0.e) xVar3).getClass();
                        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g27, g28));
                        textView3.setVisibility(0);
                        textView3.setTextSize(1, 14.0f);
                    }
                }
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) e7Var.f203857n.findViewById(com.tencent.mm.R.id.f483666bn3);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
                layoutParams2.topMargin = com.tencent.mm.ui.zk.a(e7Var.f203845b.getContext(), 8);
                linearLayout3.setLayoutParams(layoutParams2);
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) e7Var.f203845b.getLayoutParams();
                layoutParams3.width = com.tencent.mm.ui.zk.a(e7Var.f203845b.getContext(), 20);
                layoutParams3.height = com.tencent.mm.ui.zk.a(e7Var.f203845b.getContext(), 20);
                e7Var.f203845b.setLayoutParams(layoutParams3);
                e7Var.f203850g.setVisibility(8);
                android.widget.FrameLayout frameLayout = e7Var.f203860q;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            e7Var.f203861r.setOnClickListener(w(dVar));
            e7Var.f203861r.setOnLongClickListener(u(dVar));
            e7Var.f203861r.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            e7Var.f203861r.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f204018s.D(), e7Var, null));
        }
    }
}
