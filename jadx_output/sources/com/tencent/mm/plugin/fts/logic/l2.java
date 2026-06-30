package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class l2 extends o13.b implements xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137606e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137607f;

    /* renamed from: g, reason: collision with root package name */
    public o13.v f137608g;

    /* renamed from: h, reason: collision with root package name */
    public w13.h f137609h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f137610i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.logic.g4 f137611m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137612n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137613o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137614p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137615q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137616r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f137617s;

    /* renamed from: t, reason: collision with root package name */
    public final p13.n f137618t;

    public l2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137612n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeNativeMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$1
            {
                this.__eventId = 690552614;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent) {
                com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent2 = revokeNativeMsgEvent;
                if (!(revokeNativeMsgEvent2 instanceof com.tencent.mm.autogen.events.RevokeNativeMsgEvent)) {
                    return false;
                }
                com.tencent.mm.plugin.fts.logic.l2 l2Var = com.tencent.mm.plugin.fts.logic.l2.this;
                l2Var.f137611m.a(revokeNativeMsgEvent2.f54714g.f6496a);
                ((com.tencent.mm.plugin.fts.t) l2Var.f137606e).b(65576, new com.tencent.mm.plugin.fts.logic.y1(l2Var, revokeNativeMsgEvent2.f54714g.f6496a));
                return false;
            }
        };
        this.f137613o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$2
            {
                this.__eventId = 675629679;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
                com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent2 = revokeMsgEvent;
                if (!(revokeMsgEvent2 instanceof com.tencent.mm.autogen.events.RevokeMsgEvent)) {
                    return false;
                }
                com.tencent.mm.plugin.fts.logic.l2 l2Var = com.tencent.mm.plugin.fts.logic.l2.this;
                l2Var.f137611m.a(revokeMsgEvent2.f54713g.f6394a);
                ((com.tencent.mm.plugin.fts.t) l2Var.f137606e).b(65576, new com.tencent.mm.plugin.fts.logic.y1(l2Var, revokeMsgEvent2.f54713g.f6394a));
                return false;
            }
        };
        this.f137614p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$3
            {
                this.__eventId = -1138058494;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent voiceTransTextCompletedEvent) {
                boolean z17;
                com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent voiceTransTextCompletedEvent2 = voiceTransTextCompletedEvent;
                am.t00 t00Var = voiceTransTextCompletedEvent2.f54940g;
                if (t00Var.f7959f) {
                    com.tencent.mm.plugin.fts.logic.l2.this.f137611m.a(t00Var.f7954a);
                    com.tencent.mm.plugin.fts.logic.l2 l2Var = com.tencent.mm.plugin.fts.logic.l2.this;
                    ((com.tencent.mm.plugin.fts.t) l2Var.f137606e).b(65576, new com.tencent.mm.plugin.fts.logic.y1(l2Var, voiceTransTextCompletedEvent2.f54940g.f7954a));
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(t00Var.f7956c)) {
                    r45.lo0 lo0Var = new r45.lo0();
                    am.t00 t00Var2 = voiceTransTextCompletedEvent2.f54940g;
                    lo0Var.f379669d = t00Var2.f7954a;
                    lo0Var.f379670e = t00Var2.f7955b;
                    lo0Var.f379671f = t00Var2.f7956c;
                    lo0Var.f379672g = t00Var2.f7957d;
                    lo0Var.f379673h = t00Var2.f7958e;
                    com.tencent.mm.plugin.fts.logic.g4 g4Var = com.tencent.mm.plugin.fts.logic.l2.this.f137611m;
                    synchronized (g4Var) {
                        java.util.LinkedList waitingList = g4Var.f137552a.f378875d;
                        kotlin.jvm.internal.o.f(waitingList, "waitingList");
                        if (!waitingList.isEmpty()) {
                            java.util.Iterator it = waitingList.iterator();
                            while (it.hasNext()) {
                                if (((r45.lo0) it.next()).f379669d == lo0Var.f379669d) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        z17 = false;
                        if (z17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.VoiceTransTaskMgr", "add: msgId %d already in list, skip", java.lang.Long.valueOf(lo0Var.f379669d));
                        } else {
                            g4Var.f137552a.f378875d.add(lo0Var);
                            synchronized (g4Var) {
                                java.lang.Object value = ((jz5.n) com.tencent.mm.plugin.fts.logic.g4.f137551c).getValue();
                                kotlin.jvm.internal.o.f(value, "getValue(...)");
                                ((com.tencent.mm.sdk.platformtools.o4) value).H(com.tencent.mm.plugin.fts.logic.g4.f137550b, g4Var.f137552a.toByteArray());
                                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.VoiceTransTaskMgr", "add: msgId %d, list size: %d", java.lang.Long.valueOf(lo0Var.f379669d), java.lang.Integer.valueOf(g4Var.f137552a.f378875d.size()));
                            }
                        }
                    }
                    com.tencent.mm.plugin.fts.logic.l2 l2Var2 = com.tencent.mm.plugin.fts.logic.l2.this;
                    ((com.tencent.mm.plugin.fts.t) l2Var2.f137606e).b(65576, new com.tencent.mm.plugin.fts.logic.a2(l2Var2, lo0Var));
                }
                return false;
            }
        };
        this.f137615q = new com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$4(this, a0Var);
        this.f137616r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$5
            {
                this.__eventId = -1435144905;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivateEvent activateEvent) {
                com.tencent.mm.autogen.events.ActivateEvent activateEvent2 = activateEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "backgroundIndexListener %s", java.lang.Boolean.valueOf(activateEvent2.f53964g.f6412a));
                boolean z17 = activateEvent2.f53964g.f6412a;
                com.tencent.mm.plugin.fts.logic.l2 l2Var = com.tencent.mm.plugin.fts.logic.l2.this;
                if (z17) {
                    l2Var.f137617s.d();
                    return false;
                }
                l2Var.f137617s.c(60000L, 60000L);
                return false;
            }
        };
        this.f137617s = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.fts.logic.u1(this), false);
        this.f137618t = new com.tencent.mm.plugin.fts.logic.v1(this);
    }

    public static boolean b(com.tencent.mm.plugin.fts.logic.l2 l2Var, com.tencent.mm.plugin.fts.logic.b2 b2Var, java.util.HashSet hashSet) {
        l2Var.getClass();
        if (b2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(b2Var.f137465b)) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b2Var.f137467d)) {
            if (!(b2Var.f137468e == 34)) {
                return false;
            }
        }
        if (b2Var.f137465b.contains(",") || b2Var.f137465b.endsWith("@bottle") || com.tencent.mm.storage.z3.K3(b2Var.f137465b) || b2Var.f137465b.contains(",") || b2Var.f137465b.equals("msginfo@fakeuser")) {
            return false;
        }
        int i17 = b2Var.f137468e;
        if (!(i17 == 1 || i17 == 1107296305)) {
            if (!((65535 & i17) == 49)) {
                if (!(i17 == 48)) {
                    if (!(i17 == 47)) {
                        if (!(i17 == 42 || i17 == 66)) {
                            if (!(i17 == 34) || hashSet == null || !hashSet.contains(java.lang.Long.valueOf(b2Var.f137464a))) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r2.E2() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r2.Q0().equals("msginfo@fakeuser") != false) goto L41;
     */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r7, xg3.l0 r8) {
        /*
            r6 = this;
            boolean r7 = z65.c.f470458d
            if (r7 == 0) goto L5
            return
        L5:
            java.lang.String r7 = r8.f454411b
            java.lang.String r0 = "insert"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = 0
            r1 = r0
        L16:
            java.util.ArrayList r2 = r8.f454412c
            int r3 = r2.size()
            if (r1 >= r3) goto La0
            java.lang.Object r2 = r2.get(r1)
            com.tencent.mm.storage.f9 r2 = (com.tencent.mm.storage.f9) r2
            if (r2 == 0) goto L96
            java.lang.String r3 = r2.Q0()
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto L96
            java.lang.String r3 = r2.j()
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 == 0) goto L3b
            goto L96
        L3b:
            java.lang.String r3 = r2.Q0()
            java.lang.String r4 = "@bottle"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L48
            goto L96
        L48:
            java.lang.String r3 = r2.Q0()
            boolean r3 = com.tencent.mm.storage.z3.K3(r3)
            if (r3 == 0) goto L53
            goto L96
        L53:
            java.lang.String r3 = r2.Q0()
            java.lang.String r4 = ","
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L60
            goto L96
        L60:
            int r3 = r2.getType()
            r4 = 1
            if (r3 == r4) goto L89
            int r3 = r2.getType()
            r5 = 1107296305(0x42000031, float:32.000187)
            if (r3 == r5) goto L89
            boolean r3 = r2.k2()
            if (r3 != 0) goto L89
            boolean r3 = r2.L2()
            if (r3 != 0) goto L89
            boolean r3 = r2.C2()
            if (r3 != 0) goto L89
            boolean r3 = r2.E2()
            if (r3 != 0) goto L89
            goto L96
        L89:
            java.lang.String r3 = r2.Q0()
            java.lang.String r5 = "msginfo@fakeuser"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L97
        L96:
            r4 = r0
        L97:
            if (r4 == 0) goto L9c
            r7.add(r2)
        L9c:
            int r1 = r1 + 1
            goto L16
        La0:
            int r8 = r7.size()
            if (r8 <= 0) goto Lb5
            o13.y r8 = r6.f137606e
            com.tencent.mm.plugin.fts.logic.z1 r0 = new com.tencent.mm.plugin.fts.logic.z1
            r0.<init>(r6, r7)
            com.tencent.mm.plugin.fts.t r8 = (com.tencent.mm.plugin.fts.t) r8
            r7 = 65576(0x10028, float:9.1892E-41)
            r8.b(r7, r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.logic.l2.c0(xg3.m0, xg3.l0):void");
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchMessageLogic";
    }

    @Override // o13.b
    public boolean h() {
        java.util.ArrayList arrayList;
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Success!");
        this.f137609h = (w13.h) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(4);
        this.f137606e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137607f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        this.f137608g = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj();
        this.f137616r.alive();
        this.f137615q.alive();
        this.f137613o.alive();
        this.f137612n.alive();
        this.f137614p.alive();
        r45.ko0 ko0Var = null;
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
        ((com.tencent.mm.plugin.fts.t) this.f137606e).b(131112, new com.tencent.mm.plugin.fts.logic.x1(this, null));
        com.tencent.mm.plugin.fts.logic.g4 g4Var = new com.tencent.mm.plugin.fts.logic.g4();
        this.f137611m = g4Var;
        synchronized (g4Var) {
            java.lang.String str = com.tencent.mm.plugin.fts.logic.g4.f137550b;
            java.lang.Object value = ((jz5.n) com.tencent.mm.plugin.fts.logic.g4.f137551c).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) value).j(com.tencent.mm.plugin.fts.logic.g4.f137550b);
            r45.ko0 ko0Var2 = new r45.ko0();
            if (j17 != null) {
                try {
                    ko0Var2.parseFrom(j17);
                    ko0Var = ko0Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (ko0Var != null) {
                g4Var.f137552a = ko0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.VoiceTransTaskMgr", "restore, pendingList size: %d", java.lang.Integer.valueOf(g4Var.f137552a.f378875d.size()));
        }
        com.tencent.mm.plugin.fts.logic.g4 g4Var2 = this.f137611m;
        synchronized (g4Var2) {
            arrayList = new java.util.ArrayList(g4Var2.f137552a.f378875d);
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "rebuild voice trans text index, pending count: %d", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.fts.t) this.f137606e).b(131112, new com.tencent.mm.plugin.fts.logic.a2(this, (r45.lo0) it.next()));
            }
        }
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        this.f137616r.dead();
        this.f137615q.dead();
        this.f137613o.dead();
        this.f137612n.dead();
        this.f137614p.dead();
        this.f137609h = null;
        this.f137606e = null;
        this.f137607f = null;
        this.f137617s.d();
        return true;
    }

    public void k(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "triggerBuildMessageIndex %s %s", java.lang.Boolean.valueOf(this.f137610i), java.lang.Integer.valueOf(i17));
        if (this.f137610i) {
            return;
        }
        this.f137610i = true;
        o13.y yVar = this.f137606e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.fts.t) yVar).b(131112, new com.tencent.mm.plugin.fts.logic.w1(this, null));
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c j2Var;
        if (uVar.f351148j == null) {
            uVar.f351148j = new java.util.HashSet();
        }
        uVar.f351148j.add("msginfo@fakeuser");
        int i17 = uVar.f351140b;
        if (i17 == 1) {
            o13.o oVar = o13.p.f342249b;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "total message count %d", java.lang.Long.valueOf(oVar.f342246d));
            if (oVar.f342246d >= 1000000) {
                j2Var = new com.tencent.mm.plugin.fts.logic.g2(this, uVar);
            } else {
                j2Var = new com.tencent.mm.plugin.fts.logic.j2(this, uVar);
            }
        } else if (i17 != 3) {
            if (i17 != 114) {
                if (i17 == 256) {
                    j2Var = new com.tencent.mm.plugin.fts.logic.k2(this, uVar);
                } else if (i17 != 770) {
                    if (i17 == 772) {
                        j2Var = new com.tencent.mm.plugin.fts.logic.c2(this, uVar);
                    } else if (i17 == 10) {
                        j2Var = new com.tencent.mm.plugin.fts.logic.i2(this, uVar);
                    } else if (i17 != 11) {
                        j2Var = new com.tencent.mm.plugin.fts.logic.j2(this, uVar);
                    } else {
                        j2Var = new com.tencent.mm.plugin.fts.logic.d2(this, uVar);
                    }
                }
            }
            j2Var = new com.tencent.mm.plugin.fts.logic.h2(this, uVar);
        } else {
            j2Var = new com.tencent.mm.plugin.fts.logic.e2(this, uVar);
        }
        ((com.tencent.mm.plugin.fts.t) this.f137607f).b(-65536, j2Var);
        return j2Var;
    }
}
