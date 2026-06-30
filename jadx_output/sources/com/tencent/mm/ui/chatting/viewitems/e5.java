package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class e5 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488561xc);
        com.tencent.mm.ui.chatting.viewitems.c5 c5Var = new com.tencent.mm.ui.chatting.viewitems.c5();
        c5Var.a(xgVar, false);
        xgVar.setTag(c5Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r9, yb5.d r10, rd5.d r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.String r12 = "MicroMsg.ChattingItemTextTo"
            we5.a r0 = r11.f394254d
            com.tencent.mm.storage.f9 r0 = r0.f445300b
            r2 = r9
            com.tencent.mm.ui.chatting.viewitems.c5 r2 = (com.tencent.mm.ui.chatting.viewitems.c5) r2
            int r9 = r0.P0()
            r1 = 2
            r3 = 1
            r4 = 0
            if (r9 >= r1) goto L14
            r9 = r3
            goto L15
        L14:
            r9 = r4
        L15:
            r8.Z(r2, r9, r3)
            java.lang.String r9 = r0.j()
            ot0.q r9 = ot0.q.v(r9)     // Catch: java.lang.Exception -> L2b
            if (r9 == 0) goto L39
            java.lang.String r9 = r9.f348686n     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "UTF-8"
            java.lang.String r9 = java.net.URLDecoder.decode(r9, r1)     // Catch: java.lang.Exception -> L2b
            goto L3b
        L2b:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r1 = "getMsgContent error: %s"
            com.tencent.mars.xlog.Log.e(r12, r1, r9)
        L39:
            java.lang.String r9 = ""
        L3b:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            if (r1 == 0) goto L5a
            long r5 = r0.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            long r5 = r0.I0()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            java.lang.String r5 = "[carl] text to, content is null! why?? localid : %s, svrid : %s"
            com.tencent.mars.xlog.Log.e(r12, r5, r1)
        L5a:
            com.tencent.mm.ui.widget.MMTextView r12 = r2.f203697b
            r12.setMinWidth(r4)
            com.tencent.mm.ui.widget.MMTextView r12 = r2.f203697b
            r12.setText(r9)
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f203697b
            int r12 = r0.getType()
            java.lang.String r0 = r10.x()
            r1 = 301989937(0x12000031, float:4.0389914E-28)
            if (r12 == r1) goto L83
            java.lang.Class<le0.x> r12 = le0.x.class
            i95.m r12 = i95.n0.c(r12)
            le0.x r12 = (le0.x) r12
            ke0.e r12 = (ke0.e) r12
            r12.getClass()
            com.tencent.mm.pluginsdk.ui.span.c0.p(r9, r3, r3, r0)
        L83:
            r9.getText()
            boolean r9 = r10.D()
            com.tencent.mm.ui.chatting.viewitems.er r12 = new com.tencent.mm.ui.chatting.viewitems.er
            r12.<init>()
            r12.f203905a = r11
            r12.f203907c = r9
            r12.f203908d = r2
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f203697b
            r9.setTag(r12)
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f203697b
            com.tencent.mm.ui.chatting.viewitems.q0 r12 = r8.u(r10)
            r9.setOnLongClickListener(r12)
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f203697b
            com.tencent.mm.ui.chatting.manager.c r12 = r10.f460708c
            java.lang.Class<sb5.z> r0 = sb5.z.class
            yn.e r12 = r12.a(r0)
            sb5.z r12 = (sb5.z) r12
            com.tencent.mm.ui.chatting.adapter.k r12 = (com.tencent.mm.ui.chatting.adapter.k) r12
            com.tencent.mm.ui.chatting.d6 r12 = r12.D1
            r9.setOnDoubleClickLitsener(r12)
            java.lang.String r4 = r10.t()
            boolean r5 = r10.D()
            r1 = r8
            r3 = r11
            r6 = r10
            r7 = r8
            r1.V(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.e5.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
