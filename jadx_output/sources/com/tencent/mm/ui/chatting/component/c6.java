package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b5 f198873d;

    public c6(com.tencent.mm.ui.chatting.component.b5 b5Var) {
        this.f198873d = b5Var;
    }

    public final void a(java.util.HashSet hashSet) {
        if (hashSet.isEmpty()) {
            this.f198873d.f198580d.q().post(new com.tencent.mm.ui.chatting.component.y5(this));
        }
    }

    public final void b(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent) {
        ot0.q v17;
        java.lang.String str;
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f198873d;
        java.util.List<com.tencent.mm.storage.f9> p07 = b5Var.p0();
        java.util.Iterator it = p07.iterator();
        while (it.hasNext()) {
            if (!com.tencent.mm.ui.chatting.la.a((com.tencent.mm.storage.f9) it.next())) {
                db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.c96), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.l_e), null);
                return;
            }
        }
        long g17 = ip.c.g();
        d40.n nVar = (d40.n) ((e40.v) i95.n0.c(e40.v.class));
        if (nVar.wi()) {
            g17 = nVar.Ai();
        }
        com.tencent.mm.ui.chatting.e3 e3Var = com.tencent.mm.ui.chatting.e3.f200454a;
        if (e3Var.a(p07, g17)) {
            db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.f491233cf1, com.tencent.mm.sdk.platformtools.t8.f0(g17)), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.l_e), null);
            return;
        }
        long i17 = ip.c.i();
        if (e3Var.b(p07, i17)) {
            db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.f491234cf2, com.tencent.mm.sdk.platformtools.t8.f0(i17)), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.l_e), null);
            return;
        }
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6324j = b5Var.f198580d.f460717l;
        c4Var.f6327m = 41;
        c4Var.f6330p = new com.tencent.mm.ui.chatting.component.t5(this);
        doFavoriteEvent.e();
        am.d4 d4Var = doFavoriteEvent.f54091h;
        int i18 = d4Var.f6433a == 0 ? 1 : 2;
        long i19 = com.tencent.mm.sdk.platformtools.t8.i1();
        for (com.tencent.mm.storage.f9 f9Var : p07) {
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && v17.f348666i == 5 && !com.tencent.mm.sdk.platformtools.t8.K0(v17.f348674k)) {
                int i27 = f9Var.t2() ? 1 : 2;
                try {
                    str = java.net.URLEncoder.encode(v17.f348674k, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingMoreBtnBarHelper", e17, "", new java.lang.Object[0]);
                    str = "";
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13378, str, java.lang.Long.valueOf(i19), java.lang.Integer.valueOf(i27), 2, java.lang.Integer.valueOf(i18));
            }
        }
        tb5.i0 i0Var = tb5.i0.f417055a;
        i0Var.c(p07, "fav", b5Var.f198580d.x(), b5Var.f198703q);
        if (d4Var.f6433a == 0) {
            am.c4 c4Var2 = doFavoriteEvent.f54090g;
            if (14 != c4Var2.f6317c) {
                return;
            }
            r45.sq0 sq0Var = c4Var2.f6316b;
            if (sq0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMoreBtnBarHelper", "want to report record fav, but type count is null");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f385906d), java.lang.Integer.valueOf(c4Var2.f6316b.f385907e), java.lang.Integer.valueOf(c4Var2.f6316b.f385908f), java.lang.Integer.valueOf(c4Var2.f6316b.f385909g), java.lang.Integer.valueOf(c4Var2.f6316b.f385910h), java.lang.Integer.valueOf(c4Var2.f6316b.f385911i), java.lang.Integer.valueOf(c4Var2.f6316b.f385912m), java.lang.Integer.valueOf(c4Var2.f6316b.f385913n), java.lang.Integer.valueOf(c4Var2.f6316b.f385914o), java.lang.Integer.valueOf(c4Var2.f6316b.f385915p), java.lang.Integer.valueOf(c4Var2.f6316b.f385916q), java.lang.Integer.valueOf(c4Var2.f6316b.f385917r), java.lang.Integer.valueOf(c4Var2.f6316b.f385918s), java.lang.Integer.valueOf(c4Var2.f6316b.f385919t), java.lang.Integer.valueOf(c4Var2.f6316b.f385920u));
            int size = ((java.util.LinkedList) p07).size();
            r45.sq0 sq0Var2 = c4Var2.f6316b;
            pm0.v.K(null, new yd5.l(3L, size, sq0Var2.f385906d + sq0Var2.f385907e + sq0Var2.f385908f + sq0Var2.f385909g + sq0Var2.f385910h + sq0Var2.f385911i + sq0Var2.f385912m + sq0Var2.f385913n + sq0Var2.f385914o + sq0Var2.f385915p + sq0Var2.f385916q + sq0Var2.f385917r + sq0Var2.f385918s + sq0Var2.f385919t + sq0Var2.f385920u, ((com.tencent.mm.ui.chatting.component.a1) ((sb5.l) b5Var.f198580d.f460708c.a(sb5.l.class))).A, ((com.tencent.mm.ui.chatting.component.a1) ((sb5.l) b5Var.f198580d.f460708c.a(sb5.l.class))).B, 1L));
            java.util.List p08 = b5Var.p0();
            tb5.g0 state = b5Var.f198703q;
            kotlin.jvm.internal.o.g(state, "state");
            i0Var.b("multi_select_msg_fav_succ", p08, state);
            if (com.tencent.mm.storage.z3.L3(b5Var.f198580d.x())) {
                b5Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                for (com.tencent.mm.storage.f9 f9Var2 : p07) {
                    ot0.q v18 = ot0.q.v(f9Var2.j());
                    int i28 = v18 == null ? 0 : v18.f348666i;
                    sb6.append(f9Var2.I0());
                    sb7.append(f9Var2.getType());
                    sb8.append(i28);
                    sb6.append("|");
                    sb7.append("|");
                    sb8.append("|");
                }
                int k17 = b5Var.f198580d.k();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("msgid", sb6.toString());
                hashMap.put("msgtype", sb7.toString());
                hashMap.put("submsgtype", sb8.toString());
                hashMap.put("chat_name", b5Var.f198580d.x());
                hashMap.put("enter_sessionid", b5Var.f198580d.f460722q);
                hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
                hashMap.put("view_id", "yuanbao_msg_collect");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x021b, code lost:
    
        if (com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(r3, bm5.f0.f22562g, m11.c0.d(r4).f322637e, "", "")) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026d  */
    /* JADX WARN: Type inference failed for: r13v3, types: [m11.j] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r25) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.c6.onClick(android.view.View):void");
    }
}
