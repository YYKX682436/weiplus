package ze5;

/* loaded from: classes9.dex */
public abstract class n0 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472101s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.u8 f472102t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.qe0 f472103u;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k0(ze5.n0 r16, java.lang.String r17, yb5.d r18, com.tencent.mm.storage.f9 r19, bw5.u8 r20, bw5.qe0 r21) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.n0.k0(ze5.n0, java.lang.String, yb5.d, com.tencent.mm.storage.f9, bw5.u8, bw5.qe0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r3 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l0(ze5.n0 r9, java.lang.String r10, bw5.u8 r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.n0.l0(ze5.n0, java.lang.String, bw5.u8):void");
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null || item.getItemId() != 111) {
            return false;
        }
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) && (v17 = ot0.q.v(f9Var.j())) != null) {
            android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_Msg_Type", 30);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            g17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        yb5.d dVar;
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null || (dVar = this.f472101s) == null) {
            return false;
        }
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String string = k17.getString(k17.f368365d + 0);
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(string, false, false)) && !com.tencent.mm.ui.chatting.n3.k(f9Var) && !c01.ia.x(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && !com.tencent.mm.ui.chatting.n3.D(f9Var)) {
            menu.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (c01.ia.A(f9Var)) {
            menu.clear();
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar.A()) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!dVar.F()) {
            menu.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.d(dVar);
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.j0(f9Var, dVar), ze5.k0.f472041d);
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((b00.r) ((c00.z2) c17)).f16757d.getClass();
        com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle ecsProductCardViewNewStyle = new com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle(context, null, 0, 6, null);
        if (M()) {
            ecsProductCardViewNewStyle.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
            ecsProductCardViewNewStyle.setForeground(ecsProductCardViewNewStyle.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481171me));
            android.view.View contentView = ecsProductCardViewNewStyle.getContentView();
            if (contentView != null) {
                contentView.setPadding(0, 0, i65.a.b(ecsProductCardViewNewStyle.getContext(), 5), 0);
            }
        } else {
            ecsProductCardViewNewStyle.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
            ecsProductCardViewNewStyle.setForeground(ecsProductCardViewNewStyle.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
            android.view.View contentView2 = ecsProductCardViewNewStyle.getContentView();
            if (contentView2 != null) {
                contentView2.setPadding(i65.a.b(ecsProductCardViewNewStyle.getContext(), 5), 0, 0, 0);
            }
        }
        return ecsProductCardViewNewStyle;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        r45.br2 br2Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.h0(holder, ui6, msg, str);
        this.f472101s = ui6;
        com.tencent.mm.ui.chatting.component.c0.f198856r.c(ui6, holder.convertView, msg);
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(holder.convertView, msg, "ecs_kf_card_product", -1);
        zy2.l lVar = (zy2.l) ot0.q.v(msg.U1()).y(zy2.l.class);
        if (lVar == null || (br2Var = lVar.f477449b) == null) {
            return;
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = holder.f472111c;
        if (mvvmView != null) {
            mvvmView.setTag(com.tencent.mm.R.id.ujc, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.b8.c(br2Var.getString(7))));
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope i17 = ui6.i();
        if (i17 != null) {
            kotlinx.coroutines.l.d(i17, null, null, new ze5.i0(br2Var, msg, ui6, holder, this, null), 3, null);
        }
        s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
        i95.m c17 = i95.n0.c(s40.b1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.feature.finder.live.t6) b1Var).Ui(br2Var, "expose_commodity_card", s40.b1.E3((s40.b1) c17, br2Var, null, ui6.D() ? "group" : "chat", null, ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msg), 8, null));
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        g00.c cVar;
        w05.b bVar;
        java.lang.String str2;
        w05.h hVar;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 msgInfo = msgData.f394254d.f445300b;
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String x17 = ui6.x();
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        ((b00.r) ((c00.z2) c17)).f16757d.getClass();
        java.lang.String U1 = msgInfo.U1();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_CONVERSATION;
        if (U1 == null) {
            cVar = new g00.c(null, x8Var);
        } else {
            l15.c cVar2 = new l15.c();
            cVar2.fromXml(U1);
            v05.b k17 = cVar2.k();
            if (k17 == null || (bVar = (w05.b) k17.getCustom(k17.f432315e + 54)) == null) {
                cVar = new g00.c(null, x8Var);
            } else {
                g00.c cVar3 = new g00.c(e00.l.c(bVar), x8Var);
                cVar3.f267388f = x17;
                java.lang.String y07 = msgInfo.y0();
                kotlin.jvm.internal.o.f(y07, "getFromUsername(...)");
                cVar3.f267389g = y07;
                java.lang.String T0 = msgInfo.T0();
                kotlin.jvm.internal.o.f(T0, "getToUsername(...)");
                cVar3.f267390h = T0;
                cVar3.f267391i = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msgInfo);
                v05.b k18 = cVar2.k();
                if (k18 == null || (hVar = (w05.h) k18.getCustom(k18.f432315e + 74)) == null || (str2 = hVar.A()) == null) {
                    str2 = "";
                }
                cVar3.f267392m = str2;
                cVar = cVar3;
            }
        }
        cVar.f267393n = new com.tencent.mm.ui.chatting.viewitems.h0(ui6, new ze5.m0(this, msgInfo, ui6, cVar));
        return cVar;
    }
}
