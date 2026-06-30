package eg4;

/* loaded from: classes11.dex */
public final class t extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f252808e;

    public t(yz5.p pVar) {
        this.f252808e = pVar;
    }

    public static final void n(eg4.t tVar, android.content.Context context, y35.r rVar) {
        tVar.getClass();
        com.tencent.mm.storage.z3 f17 = y35.r.f(r21.w.Ai().b1(rVar.f459232a));
        r35.a aVar = new r35.a(context, new eg4.f(rVar, f17, context));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(rVar.f459234c));
        aVar.m(f17.F1);
        aVar.b(rVar.f459232a, linkedList, true, "");
    }

    public static final void o(eg4.t tVar, android.content.Context context, y35.r rVar) {
        tVar.getClass();
        com.tencent.mm.storage.p7 b17 = r21.w.Ai().b1(rVar.f459232a);
        if ((b17 != null ? b17.field_msgContent : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "lastRecvFmsg is null, verify fail, talker = " + rVar.f459232a);
            return;
        }
        com.tencent.mm.storage.e9 H9 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).H9(b17.field_msgContent);
        if (H9.C == 1) {
            db5.e1.C(context, H9.D, null, context.getString(com.tencent.mm.R.string.fbi), context.getString(com.tencent.mm.R.string.f490347sg), true, new eg4.s(context, b17), null);
            return;
        }
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(rVar.f459232a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", rVar.f459232a);
        intent.putExtra("Contact_Nick", rVar.f459235d);
        if (z07 != null) {
            intent.putExtra("Contact_RemarkName", z07.field_conRemark);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(H9.f193884z)) {
            com.tencent.mm.storage.a3 z08 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(H9.f193884z);
            if (z08 != null) {
                intent.putExtra("Contact_RoomNickname", z08.z0(H9.f193859a));
                intent.putExtra("room_name", H9.f193884z);
            }
        }
        intent.putExtra("Contact_Scene", H9.f193866h);
        intent.putExtra("Verify_ticket", H9.f193878t);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        java.lang.String str = (com.tencent.mm.storage.z3.m4(rVar.f459232a) || Ni != 1) ? (com.tencent.mm.storage.z3.m4(rVar.f459232a) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
        if ((com.tencent.mm.storage.z3.m4(rVar.f459232a) || com.tencent.mm.storage.z3.n4(rVar.f459232a)) && !com.tencent.mm.sdk.platformtools.f9.ContactNewFriendWeWeCom.k(context, null)) {
            return;
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, str, intent, null);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dyk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        y35.r b17;
        eg4.i2 item = (eg4.i2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vln);
        if (textView != null) {
            java.lang.String str = item.f252733e;
            if (str != null) {
                textView.setVisibility(0);
                textView.setText(str);
            } else {
                textView.setVisibility(8);
            }
        }
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.storage.m7 m7Var = item.f252732d;
        boolean z18 = true;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(m7Var.field_talker, true);
        java.lang.String str2 = m7Var.field_displayName;
        java.lang.String w07 = n17 != null ? n17.w0() : null;
        if (w07 != null && w07.length() != 0) {
            z18 = false;
        }
        if (!z18 && (str2 = n17.g2()) == null) {
            str2 = "";
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vlp);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        if (m7Var.field_fmsgSysRowId <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "getView, fconv fmsgSysRowId is invalid, try getLastFmsg");
            com.tencent.mm.storage.p7 W0 = r21.w.Ai().W0(m7Var.field_talker);
            if (W0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "getView, lastFmsg is null, talker = " + m7Var.field_talker);
                android.view.View p17 = holder.p(com.tencent.mm.R.id.g9u);
                if (p17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p18 = holder.p(com.tencent.mm.R.id.vlq);
                if (p18 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            b17 = y35.r.c(context, W0);
        } else {
            b17 = y35.r.b(context, m7Var);
        }
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "getView, fProvider is null, talker = " + m7Var.field_talker);
            android.view.View p19 = holder.p(com.tencent.mm.R.id.g9u);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.vlq);
            if (p27 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordOldItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kjp);
        if (textView3 != null) {
            if (com.tencent.mm.storage.z3.m4(m7Var.field_talker)) {
                textView3.setText((com.tencent.mm.sdk.platformtools.t8.K0(b17.f459239h) || com.tencent.mm.sdk.platformtools.t8.K0(b17.f459240i)) ? t41.g.a(n17) : t41.g.c(b17.f459239h, b17.f459240i));
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        }
        b17.f459234c = m7Var.field_addScene;
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484096t40);
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vlo);
        if (textView5 != null) {
            java.lang.String str3 = b17.f459233b;
            textView5.setText(str3 != null ? str3 : "");
        } else {
            textView5 = null;
        }
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        if (textView4 != null) {
            textView4.setOnClickListener(new eg4.o(textView4, textView5));
        }
        if (textView5 != null) {
            textView5.post(new eg4.p(textView5, textView4));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.vll);
        if (imageView != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, m7Var.field_talker, null);
        }
        kotlin.jvm.internal.o.d(context);
        p(context, holder, m7Var, b17);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.vlm);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new eg4.q(context, m7Var));
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.vlm);
        if (viewGroup2 != null) {
            viewGroup2.setOnLongClickListener(new eg4.r(this, item));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0683  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.content.Context r35, in5.s0 r36, com.tencent.mm.storage.m7 r37, y35.r r38) {
        /*
            Method dump skipped, instructions count: 3313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.t.p(android.content.Context, in5.s0, com.tencent.mm.storage.m7, y35.r):void");
    }
}
