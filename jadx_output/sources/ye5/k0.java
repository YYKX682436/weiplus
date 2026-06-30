package ye5;

/* loaded from: classes9.dex */
public final class k0 {
    public k0(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.v a(ye5.k0 k0Var, yb5.d dVar, rd5.d dVar2, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        we5.s0 s0Var;
        java.util.List list;
        k0Var.getClass();
        z01.v vVar = new z01.v();
        java.util.ArrayList arrayList = null;
        qd5.i iVar = dVar2 instanceof qd5.i ? (qd5.i) dVar2 : null;
        java.lang.String n07 = ((com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) dVar.f460708c.a(sb5.b0.class))).n0(dVar2.f394254d.f445300b);
        vVar.f469166d = n07;
        if (iVar != null && (s0Var = iVar.f361911o) != null && (list = s0Var.f445387a) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!((rd5.d) obj).f394254d.f445300b.P2()) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                rd5.d dVar3 = (rd5.d) it.next();
                b11.f fVar = new b11.f();
                fVar.q(dVar3.f394254d.f445300b.getMsgId());
                fVar.s(dVar3.f394254d.f445300b.Q0());
                fVar.o(((com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) dVar.f460708c.a(sb5.b0.class))).n0(dVar3.f394254d.f445300b));
                ic5.e eVar = ic5.f.f290437c;
                java.lang.String v17 = dVar3.v();
                if (v17 == null) {
                    v17 = "";
                }
                fVar.p(v17);
                fVar.n(dVar3.f394254d.f445300b.getCreateTime());
                boolean z17 = true;
                if (dVar3.f394254d.f445300b.A0() != 1) {
                    z17 = false;
                }
                fVar.r(z17);
                arrayList3.add(new b11.e(jz5.h.b(new ye5.g0(dVar3, dVar, a0Var, fVar)), fVar));
            }
            arrayList = arrayList3;
        }
        vVar.f469167e = arrayList;
        vVar.f469168f = a0Var.M() ? z01.t.f469163f : z01.t.f469161d;
        vVar.f469170h = new ye5.m(dVar, n07);
        vVar.f469171i = new ye5.n(dVar, iVar);
        vVar.f469172m = new ye5.o(dVar2, dVar);
        return vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[EDGE_INSN: B:23:0x004f->B:24:0x004f BREAK  A[LOOP:0: B:10:0x001c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[LOOP:0: B:10:0x001c->B:39:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ye5.j b(ye5.k0 r3, rd5.d r4) {
        /*
            r3.getClass()
            boolean r3 = r4 instanceof qd5.i
            r0 = 0
            if (r3 == 0) goto Lb
            qd5.i r4 = (qd5.i) r4
            goto Lc
        Lb:
            r4 = r0
        Lc:
            if (r4 != 0) goto L10
            goto L6b
        L10:
            we5.s0 r3 = r4.f361911o
            if (r3 == 0) goto L6b
            java.util.List r3 = r3.f445387a
            if (r3 == 0) goto L6b
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r3.next()
            r1 = r4
            rd5.d r1 = (rd5.d) r1
            we5.a r1 = r1.f394254d
            com.tencent.mm.storage.f9 r1 = r1.f445300b
            com.tencent.mm.storage.a9 r1 = r1.f193927g2
            boolean r2 = r1 instanceof ze5.ma
            if (r2 == 0) goto L36
            ze5.ma r1 = (ze5.ma) r1
            goto L37
        L36:
            r1 = r0
        L37:
            if (r1 != 0) goto L3a
            goto L4a
        L3a:
            wd5.b r1 = r1.a()
            if (r1 == 0) goto L45
            r15.i r1 = r1.j()
            goto L46
        L45:
            r1 = r0
        L46:
            if (r1 == 0) goto L4a
            r1 = 1
            goto L4b
        L4a:
            r1 = 0
        L4b:
            if (r1 == 0) goto L1c
            goto L4f
        L4e:
            r4 = r0
        L4f:
            rd5.d r4 = (rd5.d) r4
            if (r4 == 0) goto L6b
            we5.a r3 = r4.f394254d
            com.tencent.mm.storage.f9 r3 = r3.f445300b
            if (r3 == 0) goto L6b
            com.tencent.mm.storage.a9 r4 = r3.f193927g2
            boolean r1 = r4 instanceof ze5.ma
            if (r1 == 0) goto L62
            ze5.ma r4 = (ze5.ma) r4
            goto L63
        L62:
            r4 = r0
        L63:
            if (r4 != 0) goto L66
            goto L6b
        L66:
            ye5.j r0 = new ye5.j
            r0.<init>(r3, r4)
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye5.k0.b(ye5.k0, rd5.d):ye5.j");
    }

    public static final boolean c(ye5.k0 k0Var, db5.g4 g4Var, android.view.View view, rd5.d dVar, yb5.d dVar2) {
        boolean z17;
        we5.s0 s0Var;
        java.util.List list;
        we5.s0 s0Var2;
        java.util.List list2;
        k0Var.getClass();
        boolean z18 = dVar instanceof qd5.i;
        qd5.i iVar = z18 ? (qd5.i) dVar : null;
        if (iVar != null && (s0Var2 = iVar.f361911o) != null && (list2 = s0Var2.f445387a) != null && !list2.isEmpty()) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                z17 = true;
                if (!g95.e0.h(((rd5.d) it.next()).f394254d.f445300b)) {
                    break;
                }
            }
        }
        z17 = false;
        g4Var.b(176, com.tencent.mm.R.string.nj9, com.tencent.mm.R.raw.expand_content_filled);
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ri() && z17) {
            g4Var.b(177, com.tencent.mm.R.string.f492836i24, com.tencent.mm.R.raw.icons_filled_share);
        }
        if (z17) {
            g4Var.b(122, com.tencent.mm.R.string.b3u, com.tencent.mm.R.raw.icons_filled_multiple_choice);
        }
        qd5.i iVar2 = z18 ? (qd5.i) dVar : null;
        if (iVar2 != null && (s0Var = iVar2.f361911o) != null && (list = s0Var.f445387a) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(((rd5.d) it6.next()).f394254d.f445300b);
            }
            kc5.s sVar = (kc5.s) ((wg3.i) i95.n0.c(wg3.i.class));
            sVar.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("collection_album_msg_press_menu", "view_exp", sVar.wi(arrayList), 37491);
        }
        return false;
    }

    public static final void d(ye5.k0 k0Var, android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        we5.s0 s0Var;
        java.util.List list;
        k0Var.getClass();
        qd5.i iVar = dVar2 instanceof qd5.i ? (qd5.i) dVar2 : null;
        if (iVar == null || (s0Var = iVar.f361911o) == null || (list = s0Var.f445387a) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rd5.d) it.next()).f394254d.f445300b);
        }
        int itemId = menuItem.getItemId();
        if (itemId == 122) {
            kc5.s sVar = (kc5.s) ((wg3.i) i95.n0.c(wg3.i.class));
            sVar.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("collection_album_msg_press_mult_select", "view_clk", sVar.wi(arrayList), 37491);
            return;
        }
        if (itemId == 176) {
            ((com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) dVar.f460708c.a(sb5.b0.class))).m0(dVar2);
            ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ai(dVar2.f394254d.f445300b);
            sb5.a0 a0Var = (sb5.a0) dVar.f460708c.a(sb5.a0.class);
            if (a0Var != null) {
                ((com.tencent.mm.ui.chatting.component.o4) a0Var).m0(dVar2.f394254d.f445300b);
            }
            kc5.s sVar2 = (kc5.s) ((wg3.i) i95.n0.c(wg3.i.class));
            sVar2.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("collection_album_msg_press_unfold", "view_clk", sVar2.wi(arrayList), 37491);
            return;
        }
        if (itemId != 177) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) next;
            if (!(g95.e0.h(f9Var) || f9Var.P2())) {
                arrayList2.add(next);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onSelectedLongClickMenu retransmit, original size: " + arrayList.size() + ", forwardable size: " + arrayList2.size());
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onSelectedLongClickMenu retransmit, no forwardable msg, return");
            return;
        }
        if (arrayList2.size() < 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onSelectedLongClickMenu retransmit, forwardable < 3, fallback to multi forward");
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334121e = true;
            rVar.f334122f = false;
            rVar.f334120d.f334139a = 1;
            rVar.f334127k = 1;
            ld5.b bVar = new ld5.b();
            java.lang.String Q0 = dVar2.f394254d.f445300b.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            bVar.set(bVar.f43702d + 1, Q0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                arrayList3.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it7.next()).getMsgId()));
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            kz5.n0.O0(arrayList3, linkedList);
            bVar.o(linkedList);
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(dVar.g(), bVar, rVar);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onSelectedLongClickMenu retransmit, forwardable >= 3, continue media group forward");
            n13.r rVar2 = new n13.r();
            rVar2.f334117a = true;
            rVar2.f334121e = true;
            rVar2.f334122f = false;
            rVar2.f334120d.f334139a = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.b(dVar2.f394254d.f445300b.Q0());
            rVar2.f334127k = 1;
            jd5.b bVar2 = new jd5.b();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) it8.next();
                g45.a aVar = g45.b.f268846a;
                n13.r rVar3 = rVar2;
                com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(dVar2.f394254d.f445300b.Q0(), f9Var2.getMsgId());
                if (k17 == null) {
                    return;
                }
                arrayList4.add(aVar.b(k17));
                rVar2 = rVar3;
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            kz5.n0.O0(arrayList4, linkedList2);
            bVar2.k(linkedList2);
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(dVar.g(), bVar2, rVar2);
        }
        kc5.s sVar3 = (kc5.s) ((wg3.i) i95.n0.c(wg3.i.class));
        sVar3.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("collection_album_msg_press_forward", "view_clk", sVar3.wi(arrayList), 37491);
    }
}
