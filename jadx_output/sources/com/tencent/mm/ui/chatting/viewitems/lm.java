package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class lm extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204494s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(inflater, com.tencent.mm.R.layout.f488518vq);
        com.tencent.mm.ui.chatting.viewitems.jm jmVar = new com.tencent.mm.ui.chatting.viewitems.jm();
        jmVar.a(xgVar, true);
        xgVar.setTag(jmVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
        if (msgData.f394254d.f445300b == null) {
            return true;
        }
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        yb5.d dVar = this.f204494s;
        kotlin.jvm.internal.o.d(dVar);
        menu.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        menu.removeItem(116);
        yb5.d dVar2 = this.f204494s;
        if (dVar2 != null) {
            kotlin.jvm.internal.o.d(dVar2);
            if (!dVar2.F()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if ((r8.f304017a.length() == 0) != false) goto L9;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r5, yb5.d r6, rd5.d r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.String r8 = "tag"
            kotlin.jvm.internal.o.g(r5, r8)
            java.lang.String r8 = "ui"
            kotlin.jvm.internal.o.g(r6, r8)
            java.lang.String r8 = "msgData"
            kotlin.jvm.internal.o.g(r7, r8)
            we5.a r8 = r7.f394254d
            com.tencent.mm.storage.f9 r8 = r8.f445300b
            r4.f204494s = r6
            com.tencent.mm.ui.chatting.viewitems.jm r5 = (com.tencent.mm.ui.chatting.viewitems.jm) r5
            android.view.View r0 = r5.clickArea
            int r1 = r5.f204277f
            r5.resetChatBubbleWidth(r0, r1)
            java.lang.Class<j41.y> r0 = j41.y.class
            i95.m r0 = i95.n0.c(r0)
            j41.y r0 = (j41.y) r0
            java.lang.String r8 = r8.j()
            l41.b2 r0 = (l41.b2) r0
            r0.getClass()
            k41.k0 r8 = k41.o0.b(r8)
            if (r8 == 0) goto L43
            java.lang.String r0 = r8.f304017a
            int r0 = r0.length()
            if (r0 != 0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 == 0) goto L4a
        L43:
            java.lang.String r0 = "MicroMsg.ChattingItemOpenIMKefuNameCard"
            java.lang.String r1 = "fillingOpenIMKefuCard content invalid"
            com.tencent.mars.xlog.Log.e(r0, r1)
        L4a:
            com.tencent.mm.ui.chatting.viewitems.nm r0 = com.tencent.mm.ui.chatting.viewitems.om.f205214a
            r0.a(r6, r8, r5)
            android.view.View r0 = r5.clickArea
            com.tencent.mm.ui.chatting.viewitems.er r1 = new com.tencent.mm.ui.chatting.viewitems.er
            boolean r2 = r6.D()
            if (r8 == 0) goto L5d
            java.lang.String r3 = r8.f304017a
            if (r3 != 0) goto L5f
        L5d:
            java.lang.String r3 = ""
        L5f:
            r1.<init>(r7, r2, r5, r3)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = r8.f304023g
            java.lang.String r2 = "kefu_card_ticket"
            r7.putString(r2, r8)
            r1.f203904J = r7
            r0.setTag(r1)
            android.view.View r7 = r5.clickArea
            com.tencent.mm.ui.chatting.viewitems.km r8 = new com.tencent.mm.ui.chatting.viewitems.km
            r8.<init>(r6)
            r7.setOnClickListener(r8)
            android.view.View r7 = r5.clickArea
            com.tencent.mm.ui.chatting.viewitems.q0 r8 = r4.u(r6)
            r7.setOnLongClickListener(r8)
            android.view.View r5 = r5.clickArea
            com.tencent.mm.ui.chatting.manager.c r6 = r6.f460708c
            java.lang.Class<sb5.z> r7 = sb5.z.class
            yn.e r6 = r6.a(r7)
            sb5.z r6 = (sb5.z) r6
            com.tencent.mm.ui.chatting.adapter.k r6 = (com.tencent.mm.ui.chatting.adapter.k) r6
            com.tencent.mm.ui.chatting.e6 r6 = r6.B1
            r5.setOnTouchListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.lm.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
