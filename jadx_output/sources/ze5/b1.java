package ze5;

/* loaded from: classes9.dex */
public abstract class b1 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f471832s;

    /* renamed from: t, reason: collision with root package name */
    public w05.a f471833t;

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
            intent.putExtra("Retr_Msg_Type", 37);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            g17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
        if (f9Var == null || (dVar = this.f471832s) == null) {
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

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.d(dVar);
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.x0(f9Var, dVar), ze5.y0.f472305d);
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        bw5.g9 g9Var;
        bw5.g9 g9Var2;
        java.lang.String d17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.h0(holder, ui6, msg, str);
        this.f471832s = ui6;
        com.tencent.mm.mvvm.MvvmView mvvmView = holder.f472111c;
        if (mvvmView != null) {
            c00.k4 k4Var = (c00.k4) mvvmView.getViewModel();
            if (((k4Var == null || (g9Var2 = ((g00.f) k4Var).f267398d) == null || (d17 = g9Var2.d()) == null) ? 0 : com.tencent.mm.storage.m2.a(d17)) != 0) {
                c00.k4 k4Var2 = (c00.k4) mvvmView.getViewModel();
                java.lang.String c17 = (k4Var2 == null || (g9Var = ((g00.f) k4Var2).f267398d) == null) ? null : g9Var.c();
                if (!(c17 == null || c17.length() == 0)) {
                    mvvmView.setPadding(i65.a.b(mvvmView.getContext(), 5), 0, i65.a.b(mvvmView.getContext(), 5), 0);
                }
            }
            if (M()) {
                mvvmView.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
                mvvmView.setForeground(mvvmView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481171me));
                android.view.View contentView = mvvmView.getContentView();
                if (contentView != null) {
                    contentView.setPadding(0, 0, i65.a.b(mvvmView.getContext(), 5), 0);
                }
            } else {
                mvvmView.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
                mvvmView.setForeground(mvvmView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
                android.view.View contentView2 = mvvmView.getContentView();
                if (contentView2 != null) {
                    contentView2.setPadding(i65.a.b(mvvmView.getContext(), 5), 0, 0, 0);
                }
            }
        }
        com.tencent.mm.ui.chatting.component.c0.f198856r.c(ui6, holder.convertView, msg);
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(holder.f472111c, msg, "ecs_kf_card_shop", -1);
        l15.c cVar = new l15.c();
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        this.f471833t = k17 != null ? (w05.a) k17.getCustom(k17.f432315e + 56) : null;
        android.view.View view = holder.convertView;
        if (view != null) {
            ym5.a1.h(view, new ze5.t0(this, msg));
        }
        java.lang.String x17 = ui6.x();
        java.lang.String d18 = g95.e0.d(msg);
        java.lang.Integer valueOf = ui6.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(ui6.x())) : null;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.convertView, "chatting_item_appmsg_new_finder_shop_container_view");
        aVar.Ai(holder.convertView, new ze5.u0(this));
        android.view.View view2 = holder.convertView;
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("card_id", java.lang.Long.valueOf(msg.I0()));
        lVarArr[1] = new jz5.l("card_type", 1);
        w05.a aVar2 = this.f471833t;
        lVarArr[2] = new jz5.l("app_query", aVar2 != null ? aVar2.B() : null);
        lVarArr[3] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, ui6.D() ? "2" : "1");
        lVarArr[4] = new jz5.l("chatroomid", x17);
        lVarArr[5] = new jz5.l("share_username", d18);
        lVarArr[6] = new jz5.l("chatroomuv", valueOf);
        java.util.Map k18 = kz5.c1.k(lVarArr);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : k18.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        aVar.gk(view2, linkedHashMap);
        aVar.Tj(holder.convertView, 40, 12, false);
        w05.a aVar3 = this.f471833t;
        java.lang.String finderUsername = aVar3 != null ? aVar3.getFinderUsername() : null;
        if (finderUsername == null) {
            com.tencent.mars.xlog.Log.e("ChattingItemAppMsgEcShopMvvm", "refreshShopCardInfo, finderUsername is null!");
            return;
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = holder.f472111c;
        if (mvvmView2 != null) {
            mvvmView2.setTag(com.tencent.mm.R.id.ujc, finderUsername);
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope i17 = ui6.i();
        if (i17 != null) {
            kotlinx.coroutines.l.d(i17, null, null, new ze5.w0(msg, ui6, holder, finderUsername, this, null), 3, null);
        }
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        g00.f fVar;
        w05.a aVar;
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
            fVar = new g00.f(null, x8Var);
        } else {
            l15.c cVar = new l15.c();
            cVar.fromXml(U1);
            v05.b k17 = cVar.k();
            if (k17 == null || (aVar = (w05.a) k17.getCustom(k17.f432315e + 56)) == null) {
                fVar = new g00.f(null, x8Var);
            } else {
                g00.f fVar2 = new g00.f(e00.l.f(aVar), x8Var);
                fVar2.f267400f = x17;
                java.lang.String y07 = msgInfo.y0();
                kotlin.jvm.internal.o.f(y07, "getFromUsername(...)");
                fVar2.f267401g = y07;
                java.lang.String T0 = msgInfo.T0();
                kotlin.jvm.internal.o.f(T0, "getToUsername(...)");
                fVar2.f267402h = T0;
                fVar2.f267403i = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msgInfo);
                fVar = fVar2;
            }
        }
        fVar.f267405n = new com.tencent.mm.ui.chatting.viewitems.h0(ui6, new ze5.a1(ui6, msgInfo, fVar, this));
        return fVar;
    }
}
