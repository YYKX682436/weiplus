package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class i7 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204169s;

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
            if (r0 != 0) goto L30
        L8:
            com.tencent.mm.ui.chatting.viewitems.xg r4 = new com.tencent.mm.ui.chatting.viewitems.xg
            java.lang.Class<m40.k0> r0 = m40.k0.class
            i95.m r0 = i95.n0.c(r0)
            m40.k0 r0 = (m40.k0) r0
            c61.p7 r0 = (c61.p7) r0
            int r0 = r0.Ri()
            r1 = 1
            if (r0 != r1) goto L1f
            r0 = 2131493853(0x7f0c03dd, float:1.8611198E38)
            goto L22
        L1f:
            r0 = 2131493852(0x7f0c03dc, float:1.8611196E38)
        L22:
            r4.<init>(r3, r0)
            com.tencent.mm.ui.chatting.viewitems.e7 r3 = new com.tencent.mm.ui.chatting.viewitems.e7
            r3.<init>()
            r3.b(r4, r1)
            r4.setTag(r3)
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.i7.F(android.view.LayoutInflater, android.view.View):android.view.View");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.j7.b(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null && !z17) {
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f204169s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            if (!c01.ia.A(f9Var)) {
                g4Var.c(d17, 116, 0, this.f204169s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204169s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204169s.A()) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        zy2.i iVar;
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
            intent.putExtra("key_source_comment_scene", iVar.f477411b.getInteger(29));
            if (iVar.f477411b.getByteString(26) != null) {
                intent.putExtra("key_share_byp_data", iVar.f477411b.getByteString(26).f192156a);
            }
            intent.putExtra("key_to_user_name", ki0.a.b(f9Var));
            intent.putExtra("tab_type", 6);
            if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ak()) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 2, 162, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.t(dVar.g(), intent);
            } else {
                com.tencent.mm.ui.chatting.viewitems.j7.c(view, dVar, iVar, intent, true, com.tencent.mm.storage.z3.R4(f9Var.Q0()), f9Var);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            if (z17 == null || z17.second != null) {
                c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            }
            dVar.L(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0467  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r34, yb5.d r35, rd5.d r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.i7.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
