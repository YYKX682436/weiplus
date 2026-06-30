package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class mm extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204586s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(inflater, com.tencent.mm.R.layout.x_);
        com.tencent.mm.ui.chatting.viewitems.jm jmVar = new com.tencent.mm.ui.chatting.viewitems.jm();
        jmVar.a(xgVar, false);
        xgVar.setTag(jmVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.om.f205214a.b(ui6, f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null) {
            return true;
        }
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        yb5.d dVar = this.f204586s;
        kotlin.jvm.internal.o.d(dVar);
        menu.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        menu.removeItem(116);
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204586s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())) {
            yb5.d dVar2 = this.f204586s;
            kotlin.jvm.internal.o.d(dVar2);
            if (!dVar2.A()) {
                menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                return true;
            }
        }
        yb5.d dVar3 = this.f204586s;
        if (dVar3 != null) {
            kotlin.jvm.internal.o.d(dVar3);
            if (!dVar3.F()) {
                menu.c(d17, 100, 0, v17.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.A0() == 1 && msg.getType() == 67) {
            msg.unsetOmittedFailResend();
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(msg.getMsgId(), msg, true);
            com.tencent.mm.ui.chatting.component.li liVar = (com.tencent.mm.ui.chatting.component.li) ((sb5.k1) ui6.f460708c.a(sb5.k1.class));
            liVar.getClass();
            if (msg.K2()) {
                if (!kotlin.jvm.internal.o.b(liVar.f198580d.x(), "medianote")) {
                    ((e21.z0) c01.d9.b().w()).c(new e21.n(msg.Q0(), msg.I0()));
                }
                com.tencent.mm.ui.chatting.ic.b(msg);
                liVar.f198580d.L(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if ((r8.f304017a.length() == 0) != false) goto L9;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r8, yb5.d r9, rd5.d r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r11 = "tag"
            kotlin.jvm.internal.o.g(r8, r11)
            java.lang.String r11 = "ui"
            kotlin.jvm.internal.o.g(r9, r11)
            java.lang.String r11 = "msgData"
            kotlin.jvm.internal.o.g(r10, r11)
            we5.a r11 = r10.f394254d
            com.tencent.mm.storage.f9 r11 = r11.f445300b
            r7.f204586s = r9
            r1 = r8
            com.tencent.mm.ui.chatting.viewitems.jm r1 = (com.tencent.mm.ui.chatting.viewitems.jm) r1
            android.view.View r8 = r1.clickArea
            int r0 = r1.f204277f
            r1.resetChatBubbleWidth(r8, r0)
            java.lang.Class<j41.y> r8 = j41.y.class
            i95.m r8 = i95.n0.c(r8)
            j41.y r8 = (j41.y) r8
            java.lang.String r0 = r11.j()
            l41.b2 r8 = (l41.b2) r8
            r8.getClass()
            k41.k0 r8 = k41.o0.b(r0)
            r0 = 0
            r2 = 1
            if (r8 == 0) goto L46
            java.lang.String r3 = r8.f304017a
            int r3 = r3.length()
            if (r3 != 0) goto L43
            r3 = r2
            goto L44
        L43:
            r3 = r0
        L44:
            if (r3 == 0) goto L4d
        L46:
            java.lang.String r3 = "MicroMsg.ChattingItemOpenIMKefuNameCard"
            java.lang.String r4 = "fillingOpenIMKefuCard content invalid"
            com.tencent.mars.xlog.Log.e(r3, r4)
        L4d:
            com.tencent.mm.ui.chatting.viewitems.nm r3 = com.tencent.mm.ui.chatting.viewitems.om.f205214a
            r3.a(r9, r8, r1)
            android.view.View r3 = r1.clickArea
            com.tencent.mm.ui.chatting.viewitems.er r4 = new com.tencent.mm.ui.chatting.viewitems.er
            boolean r5 = r9.D()
            if (r8 == 0) goto L60
            java.lang.String r6 = r8.f304017a
            if (r6 != 0) goto L62
        L60:
            java.lang.String r6 = ""
        L62:
            r4.<init>(r10, r5, r1, r6)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r8 = r8.f304023g
            java.lang.String r6 = "kefu_card_ticket"
            r5.putString(r6, r8)
            r4.f203904J = r5
            r3.setTag(r4)
            android.view.View r8 = r1.clickArea
            com.tencent.mm.ui.chatting.viewitems.km r3 = new com.tencent.mm.ui.chatting.viewitems.km
            r3.<init>(r9)
            r8.setOnClickListener(r3)
            android.view.View r8 = r1.clickArea
            com.tencent.mm.ui.chatting.viewitems.q0 r3 = r7.u(r9)
            r8.setOnLongClickListener(r3)
            android.view.View r8 = r1.clickArea
            com.tencent.mm.ui.chatting.manager.c r3 = r9.f460708c
            java.lang.Class<sb5.z> r4 = sb5.z.class
            yn.e r3 = r3.a(r4)
            sb5.z r3 = (sb5.z) r3
            com.tencent.mm.ui.chatting.adapter.k r3 = (com.tencent.mm.ui.chatting.adapter.k) r3
            com.tencent.mm.ui.chatting.e6 r3 = r3.B1
            r8.setOnTouchListener(r3)
            int r8 = r11.P0()
            r11 = 2
            if (r8 >= r11) goto La4
            r0 = r2
        La4:
            r7.Z(r1, r0, r2)
            java.lang.String r3 = r9.t()
            boolean r4 = r9.D()
            r0 = r7
            r2 = r10
            r5 = r9
            r6 = r7
            r0.V(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mm.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
