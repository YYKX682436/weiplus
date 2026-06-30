package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class d5 extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488520vt);
        com.tencent.mm.ui.chatting.viewitems.c5 c5Var = new com.tencent.mm.ui.chatting.viewitems.c5();
        c5Var.a(xgVar, true);
        xgVar.setTag(c5Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r8, yb5.d r9, rd5.d r10, java.lang.String r11) {
        /*
            r7 = this;
            we5.a r11 = r10.f394254d
            com.tencent.mm.storage.f9 r11 = r11.f445300b
            com.tencent.mm.ui.chatting.viewitems.c5 r8 = (com.tencent.mm.ui.chatting.viewitems.c5) r8
            java.lang.String r0 = r11.j()
            java.lang.String r1 = r9.x()
            java.lang.Class<sb5.f> r2 = sb5.f.class
            com.tencent.mm.ui.chatting.manager.c r3 = r9.f460708c
            yn.e r2 = r3.a(r2)
            sb5.f r2 = (sb5.f) r2
            boolean r4 = r9.D()
            r5 = 1
            if (r4 == 0) goto L47
            com.tencent.mm.ui.chatting.component.biz.a r2 = (com.tencent.mm.ui.chatting.component.biz.a) r2
            boolean r2 = r2.f198753r
            if (r2 != 0) goto L47
            int r2 = c01.w9.t(r0)
            r4 = -1
            if (r2 == r4) goto L47
            r4 = 0
            java.lang.String r4 = r0.substring(r4, r2)
            java.lang.String r4 = r4.trim()
            if (r4 == 0) goto L3e
            int r6 = r4.length()
            if (r6 <= 0) goto L3e
            r1 = r4
        L3e:
            int r2 = r2 + r5
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = r0.trim()
        L47:
            ot0.q r0 = ot0.q.v(r0)     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.f348686n     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r2)     // Catch: java.lang.Exception -> L56
            goto L68
        L56:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.ChattingItemTextFrom"
            java.lang.String r4 = "getMsgContent error: %s"
            com.tencent.mars.xlog.Log.e(r2, r4, r0)
        L66:
            java.lang.String r0 = ""
        L68:
            r7.n(r8, r9, r11, r1)
            r7.m(r8, r9, r1, r11)
            com.tencent.mm.ui.widget.MMTextView r1 = r8.f203697b
            r1.setText(r0)
            com.tencent.mm.ui.widget.MMTextView r0 = r8.f203697b
            int r11 = r11.getType()
            java.lang.String r1 = r9.x()
            r2 = 301989937(0x12000031, float:4.0389914E-28)
            if (r11 == r2) goto L92
            java.lang.Class<le0.x> r11 = le0.x.class
            i95.m r11 = i95.n0.c(r11)
            le0.x r11 = (le0.x) r11
            ke0.e r11 = (ke0.e) r11
            r11.getClass()
            com.tencent.mm.pluginsdk.ui.span.c0.p(r0, r5, r5, r1)
        L92:
            r0.getText()
            boolean r11 = r9.D()
            com.tencent.mm.ui.chatting.viewitems.er r0 = new com.tencent.mm.ui.chatting.viewitems.er
            r0.<init>()
            r0.f203905a = r10
            r0.f203907c = r11
            r0.f203908d = r8
            com.tencent.mm.ui.widget.MMTextView r10 = r8.f203697b
            r10.setTag(r0)
            com.tencent.mm.ui.widget.MMTextView r10 = r8.f203697b
            com.tencent.mm.ui.chatting.viewitems.q0 r9 = r7.u(r9)
            r10.setOnLongClickListener(r9)
            com.tencent.mm.ui.widget.MMTextView r8 = r8.f203697b
            java.lang.Class<sb5.z> r9 = sb5.z.class
            yn.e r9 = r3.a(r9)
            sb5.z r9 = (sb5.z) r9
            com.tencent.mm.ui.chatting.adapter.k r9 = (com.tencent.mm.ui.chatting.adapter.k) r9
            com.tencent.mm.ui.chatting.d6 r9 = r9.D1
            r8.setOnDoubleClickLitsener(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.d5.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
