package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class l extends o13.b {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.Set f137585z = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137586e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137587f;

    /* renamed from: g, reason: collision with root package name */
    public w13.b f137588g;

    /* renamed from: h, reason: collision with root package name */
    public o13.v f137589h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashSet f137590i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.HashMap f137591m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashMap f137592n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f137593o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f137594p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.reflect.Method f137595q;

    /* renamed from: r, reason: collision with root package name */
    public final l75.z0 f137596r = new com.tencent.mm.plugin.fts.logic.m(this);

    /* renamed from: s, reason: collision with root package name */
    public final l75.z0 f137597s = new com.tencent.mm.plugin.fts.logic.n(this);

    /* renamed from: t, reason: collision with root package name */
    public final l75.q0 f137598t = new com.tencent.mm.plugin.fts.logic.o(this);

    /* renamed from: u, reason: collision with root package name */
    public final l75.q0 f137599u = new com.tencent.mm.plugin.fts.logic.p(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137600v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137601w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f137602x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f137603y;

    static {
        java.lang.String[] split = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bll).split(";");
        if (split != null) {
            for (java.lang.String str : split) {
                f137585z.add(str);
            }
        }
    }

    public l() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137600v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$5
            {
                this.__eventId = -981145195;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent) {
                com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent2 = updateSearchIndexAtOnceEvent;
                long j17 = updateSearchIndexAtOnceEvent2.f54924g.f6419a;
                com.tencent.mm.plugin.fts.logic.l lVar = com.tencent.mm.plugin.fts.logic.l.this;
                if (j17 <= 0) {
                    ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(131093, new com.tencent.mm.plugin.fts.logic.b1(lVar, null));
                    return false;
                }
                if (!lVar.f137603y.e()) {
                    return false;
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var = lVar.f137603y;
                long j18 = updateSearchIndexAtOnceEvent2.f54924g.f6419a;
                b4Var.c(j18, j18);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "* Update contact at once triggered.");
                return false;
            }
        };
        this.f137601w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$6
            {
                this.__eventId = -1874260055;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateLanguageEvent updateLanguageEvent) {
                com.tencent.mm.plugin.fts.logic.l lVar = com.tencent.mm.plugin.fts.logic.l.this;
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.d0(lVar, o13.d.f342225k));
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(131093, new com.tencent.mm.plugin.fts.logic.b1(lVar, null));
                return false;
            }
        };
        this.f137602x = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.fts.logic.q(this), true);
        this.f137603y = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.fts.logic.r(this), false);
    }

    public static void n(p13.z zVar) {
        if (zVar == null || zVar.f351184b != 131075 || com.tencent.mm.sdk.platformtools.t8.K0(zVar.f351187e)) {
            return;
        }
        try {
            boolean z17 = true;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(zVar.f351187e, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                zVar.f351205w = n17.v2();
                if (c01.e2.I(zVar.f351187e)) {
                    z17 = false;
                }
                zVar.f351206x = z17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTS5SearchContactLogic", "fillChatroomSortFieldsIfNeeded failed for %s: %s", zVar.f351187e, th6.getMessage());
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c q0Var;
        int i17 = uVar.f351140b;
        if (i17 == 12) {
            q0Var = new com.tencent.mm.plugin.fts.logic.q0(this, uVar);
        } else if (i17 == 14) {
            q0Var = new com.tencent.mm.plugin.fts.logic.j0(this, uVar);
        } else if (i17 == 32) {
            q0Var = new com.tencent.mm.plugin.fts.logic.r0(this, uVar);
        } else if (i17 == 48) {
            q0Var = new com.tencent.mm.plugin.fts.logic.a1(this, uVar);
        } else if (i17 == 96) {
            q0Var = new com.tencent.mm.plugin.fts.logic.x0(this, uVar);
        } else if (i17 == 64) {
            q0Var = new com.tencent.mm.plugin.fts.logic.y0(this, uVar);
        } else if (i17 == 65) {
            q0Var = new com.tencent.mm.plugin.fts.logic.z0(this, uVar);
        } else if (i17 == 99) {
            q0Var = new com.tencent.mm.plugin.fts.logic.l0(this, uVar);
        } else if (i17 != 100) {
            switch (i17) {
                case 5:
                    q0Var = new com.tencent.mm.plugin.fts.logic.m0(this, uVar);
                    break;
                case 6:
                    q0Var = new com.tencent.mm.plugin.fts.logic.k0(this, uVar);
                    break;
                case 7:
                    q0Var = new com.tencent.mm.plugin.fts.logic.n0(this, uVar);
                    break;
                case 8:
                    q0Var = new com.tencent.mm.plugin.fts.logic.s0(this, uVar);
                    break;
                case 9:
                    q0Var = new com.tencent.mm.plugin.fts.logic.v0(this, uVar);
                    break;
                default:
                    switch (i17) {
                        case 16:
                            q0Var = new com.tencent.mm.plugin.fts.logic.w0(this, uVar);
                            break;
                        case 17:
                            q0Var = new com.tencent.mm.plugin.fts.logic.x(this, uVar);
                            break;
                        case 18:
                            q0Var = new com.tencent.mm.plugin.fts.logic.t0(this, uVar);
                            break;
                        default:
                            q0Var = new com.tencent.mm.plugin.fts.logic.i0(this, uVar);
                            break;
                    }
            }
        } else {
            q0Var = new com.tencent.mm.plugin.fts.logic.u0(this, uVar);
        }
        if (17 == uVar.f351140b) {
            ((com.tencent.mm.plugin.fts.t) this.f137587f).b(-131072, q0Var);
            return q0Var;
        }
        ((com.tencent.mm.plugin.fts.t) this.f137587f).b(-65536, q0Var);
        return q0Var;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchContactLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Success!");
        this.f137588g = (w13.b) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3);
        this.f137586e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137587f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        this.f137589h = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj();
        this.f137590i = new java.util.HashSet();
        this.f137591m = new java.util.HashMap();
        this.f137592n = new java.util.HashMap();
        this.f137593o = new java.util.HashMap();
        this.f137594p = new java.util.HashMap();
        try {
            java.lang.reflect.Method declaredMethod = dm.e2.class.getDeclaredMethod("parseBuff", new java.lang.Class[0]);
            this.f137595q = declaredMethod;
            declaredMethod.setAccessible(true);
            ((com.tencent.mm.plugin.fts.t) this.f137586e).b(131072, new com.tencent.mm.plugin.fts.logic.c0(this, null));
            ((com.tencent.mm.plugin.fts.t) this.f137586e).b(131082, new com.tencent.mm.plugin.fts.logic.t(this, null));
            ((com.tencent.mm.plugin.fts.t) this.f137586e).b(131092, new com.tencent.mm.plugin.fts.logic.v(this, null));
            ((com.tencent.mm.plugin.fts.t) this.f137586e).b(131095, new com.tencent.mm.plugin.fts.logic.w(this, null));
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this.f137598t);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f137597s);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.f137596r);
            l75.q0 q0Var = this.f137599u;
            ((l80.a) ((m80.i) i95.n0.c(m80.i.class))).f316989d.getClass();
            b93.r.wi().add(q0Var);
            this.f137602x.c(600000L, 600000L);
            this.f137600v.alive();
            this.f137601w.alive();
            return true;
        } catch (java.lang.NoSuchMethodException e17) {
            iz5.b bVar = new iz5.b("Can't find BaseContact.parseBuff method, class prototype has changed.");
            bVar.initCause(e17);
            throw bVar;
        }
    }

    @Override // o13.b
    public boolean i() {
        this.f137600v.dead();
        this.f137601w.dead();
        this.f137603y.d();
        this.f137602x.d();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f137597s);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().remove(this.f137598t);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.f137596r);
        l75.q0 q0Var = this.f137599u;
        ((l80.a) ((m80.i) i95.n0.c(m80.i.class))).f316989d.getClass();
        b93.r.wi().remove(q0Var);
        java.util.HashMap hashMap = this.f137591m;
        if (hashMap != null) {
            hashMap.clear();
        }
        java.util.HashSet hashSet = this.f137590i;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.f137588g = null;
        this.f137586e = null;
        this.f137587f = null;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(java.lang.String str, com.tencent.mm.storage.z3 z3Var, java.lang.String str2, java.lang.String[] strArr, byte[] bArr) {
        int i17;
        int i18;
        long j17;
        int i19;
        java.util.HashMap hashMap;
        java.lang.String str3;
        java.lang.String str4;
        int i27;
        java.lang.String[] strArr2 = strArr;
        java.lang.String str5 = "MicroMsg.FTS.FTS5SearchContactLogic";
        java.lang.String P0 = z3Var.P0();
        java.lang.String w07 = z3Var.w0();
        java.lang.String i28 = o13.n.i(w07, false);
        java.lang.String i29 = o13.n.i(w07, true);
        java.lang.String i37 = o13.n.i(P0, false);
        java.lang.String i38 = o13.n.i(P0, true);
        long b17 = ((com.tencent.mm.plugin.fts.p) this.f137589h).b(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(P0)) {
            i17 = 0;
        } else {
            this.f137588g.u(131075, 5, 0L, str, b17, P0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i37)) {
                i17 = 1;
            } else {
                this.f137588g.u(131075, 6, 0L, str, b17, i37);
                i17 = 2;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i38)) {
                this.f137588g.u(131075, 7, 0L, str, b17, i38);
                i17++;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            i18 = 0;
        } else {
            int i39 = 0;
            this.f137588g.u(131075, 1, 0L, str, b17, w07);
            i17++;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i37)) {
                this.f137588g.u(131075, 2, 0L, str, b17, i28);
                i17++;
            }
            i18 = i39;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i38)) {
                this.f137588g.u(131075, 3, 0L, str, b17, i29);
                i17++;
                i18 = i39;
            }
        }
        if (!(str2 == null ? "" : str2).contains(c01.z1.r())) {
            return i17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (strArr2 == null || strArr2.length <= 0) {
            j17 = 0;
            i19 = 0;
        } else {
            long length = strArr2.length;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            mo.a aVar = new mo.a();
            try {
                aVar.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e17, "parse chatroom data", new java.lang.Object[i18]);
            }
            java.util.Iterator it = aVar.f330239d.iterator();
            while (it.hasNext()) {
                mo.b bVar = (mo.b) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f330248e)) {
                    hashMap2.put(bVar.f330247d, bVar.f330248e);
                }
            }
            java.util.HashMap r17 = r(strArr2);
            int i47 = i18;
            int i48 = i47;
            boolean z17 = i18;
            while (i48 < strArr2.length) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str6 = strArr2[i48];
                com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) r17.get(str6);
                if (z3Var2 == null) {
                    com.tencent.mars.xlog.Log.i(str5, "can not get chatroomMemberContact data memberUsername:%s i:%s", str6, java.lang.Integer.valueOf(i48));
                    sb7.append("\u200b");
                    hashMap = r17;
                    str3 = str5;
                } else {
                    hashMap = r17;
                    java.lang.String w08 = z3Var2.w0();
                    java.lang.String P02 = z3Var2.P0();
                    java.lang.String i49 = o13.n.i(w08, z17);
                    java.lang.String i57 = o13.n.i(w08, true);
                    if (w08 == null) {
                        w08 = "\u2002";
                    }
                    sb7.append(w08);
                    sb7.append("\u200c");
                    str3 = str5;
                    sb7.append(i49 == null ? "\u2002" : i49);
                    sb7.append("\u200c");
                    sb7.append(i57 == null ? "\u2002" : i57);
                    sb7.append("\u200c");
                    java.lang.String i58 = o13.n.i(P02, false);
                    java.lang.String i59 = o13.n.i(P02, true);
                    if (P02 == null) {
                        P02 = "\u2002";
                    }
                    sb7.append(P02);
                    sb7.append("\u200c");
                    sb7.append(i58 == null ? "\u2002" : i58);
                    sb7.append("\u200c");
                    sb7.append(i59 == null ? "\u2002" : i59);
                    sb7.append("\u200c");
                    java.lang.String str7 = (java.lang.String) hashMap2.get(str6);
                    if (str7 == null) {
                        str7 = "\u2002";
                    }
                    sb7.append(str7);
                    sb7.append("\u200c");
                    s(z3Var2);
                    java.lang.String str8 = z3Var2.f236589y1;
                    if (str8 == null) {
                        str8 = "\u2002";
                    }
                    sb7.append(str8);
                    sb7.append("\u200c");
                    if (!z3Var2.r2() || (str4 = o13.n.f(str6, z3Var2.t0())) == null) {
                        str4 = "\u2002";
                    }
                    sb7.append(str4);
                    sb7.append("\u200c");
                    if (sb7.indexOf("\u200b") >= 0) {
                        sb7 = new java.lang.StringBuilder(sb7.toString().replace("\u200b", "\u2002"));
                        i27 = 1;
                    } else {
                        i27 = i47;
                    }
                    sb7.append("\u200b");
                    sb6.append((java.lang.CharSequence) sb7);
                    i47 = i27;
                }
                i48++;
                r17 = hashMap;
                strArr2 = strArr;
                str5 = str3;
                z17 = 0;
            }
            j17 = length;
            i19 = i47;
        }
        if (sb6.length() > 0) {
            sb6.setLength(sb6.length() - 1);
            this.f137588g.u(131075, 38, j17, str, b17, sb6.toString());
            i17++;
        }
        if (i19 != 0) {
            jx3.f.INSTANCE.idkeyStat(146L, 29L, 1L, false);
        }
        return i17;
    }

    public int k(com.tencent.mm.storage.z3 z3Var) {
        int i17;
        java.lang.String str;
        byte[] bArr;
        if (!com.tencent.mm.storage.z3.R4(z3Var.d1())) {
            return m(z3Var);
        }
        android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) this.f137589h).e(java.lang.String.format("SELECT memberlist, roomdata, chatroomStatus FROM %s WHERE chatroomname = ?", "chatroom"), new java.lang.String[]{z3Var.d1()}, 2);
        try {
            if (e17.moveToNext()) {
                java.lang.String string = e17.getString(0);
                byte[] blob = e17.getBlob(1);
                i17 = e17.getInt(2);
                bArr = blob;
                str = string;
            } else {
                i17 = 0;
                str = null;
                bArr = null;
            }
            e17.close();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && bArr != null) {
                l75.e0 e0Var = com.tencent.mm.storage.a3.f193742e2;
                if (!((((long) i17) & 2) == 2)) {
                    java.lang.String[] split = o13.c.f342208a.split(str);
                    java.util.Arrays.sort(split, new com.tencent.mm.plugin.fts.logic.s(this));
                    int t17 = t(z3Var.d1(), split);
                    if (t17 > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", z3Var.d1(), java.lang.Integer.valueOf(t17));
                    }
                    return j(z3Var.d1(), z3Var, str, split, bArr);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "error chatroom data %s", z3Var.d1());
            int t18 = t(z3Var.d1(), null);
            if (t18 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", z3Var.d1(), java.lang.Integer.valueOf(t18));
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            if (e17 != null) {
                e17.close();
            }
            throw th6;
        }
    }

    public int l(long j17, java.lang.String str, java.util.List list, long j18) {
        int i17;
        java.lang.String str2;
        int size = list.size();
        boolean z17 = false;
        java.lang.String i18 = o13.n.i(str, false);
        boolean z18 = true;
        java.lang.String i19 = o13.n.i(str, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i17 = 0;
        } else {
            long j19 = size;
            this.f137588g.u(2097172, 66, j19, java.lang.String.valueOf(j17), j18, str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
                i17 = 1;
            } else {
                this.f137588g.u(2097172, 67, j19, java.lang.String.valueOf(j17), j18, i18);
                i17 = 2;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i19)) {
                this.f137588g.u(2097172, 68, j19, java.lang.String.valueOf(j17), j18, i19);
                i17++;
            }
        }
        if (list.isEmpty()) {
            return i17;
        }
        list.sort(new com.tencent.mm.plugin.fts.logic.l$$a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap r17 = r((java.lang.String[]) list.toArray(new java.lang.String[0]));
        int i27 = 0;
        while (i27 < list.size()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String str3 = (java.lang.String) list.get(i27);
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) r17.get(str3);
            if (z3Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "can not get labelContact data labelUsername:%s i:%s", str3, java.lang.Integer.valueOf(i27));
                sb7.append("\u200b");
            } else {
                java.lang.String w07 = z3Var.w0();
                java.lang.String P0 = z3Var.P0();
                java.lang.String i28 = o13.n.i(w07, z17);
                java.lang.String i29 = o13.n.i(w07, z18);
                if (w07 == null) {
                    w07 = "\u2002";
                }
                sb7.append(w07);
                sb7.append("\u200c");
                if (i28 == null) {
                    i28 = "\u2002";
                }
                sb7.append(i28);
                sb7.append("\u200c");
                sb7.append(i29 == null ? "\u2002" : i29);
                sb7.append("\u200c");
                java.lang.String i37 = o13.n.i(P0, z17);
                java.lang.String i38 = o13.n.i(P0, true);
                if (P0 == null) {
                    P0 = "\u2002";
                }
                sb7.append(P0);
                sb7.append("\u200c");
                if (i37 == null) {
                    i37 = "\u2002";
                }
                sb7.append(i37);
                sb7.append("\u200c");
                sb7.append(i38 == null ? "\u2002" : i38);
                sb7.append("\u200c");
                sb7.append("\u2002");
                sb7.append("\u200c");
                s(z3Var);
                java.lang.String str4 = z3Var.f236589y1;
                if (str4 == null) {
                    str4 = "\u2002";
                }
                sb7.append(str4);
                sb7.append("\u200c");
                if (!z3Var.r2() || (str2 = o13.n.f(str3, z3Var.t0())) == null) {
                    str2 = "\u2002";
                }
                sb7.append(str2);
                sb7.append("\u200c");
                if (sb7.indexOf("\u200b") >= 0) {
                    sb7 = new java.lang.StringBuilder(sb7.toString().replace("\u200b", "\u2002"));
                }
                sb7.append("\u200b");
                sb6.append((java.lang.CharSequence) sb7);
            }
            i27++;
            z17 = false;
            z18 = true;
        }
        if (sb6.length() <= 0) {
            return i17;
        }
        sb6.setLength(sb6.length() - 1);
        this.f137588g.u(2097172, 69, size, java.lang.String.valueOf(j17), j18, sb6.toString());
        return i17 + 1;
    }

    public int m(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        long j17;
        java.lang.String str6;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        int i29;
        int i37;
        int i38;
        android.database.Cursor cursor;
        java.util.ArrayList arrayList;
        long j18 = z3Var.E2;
        java.lang.String d17 = z3Var.d1();
        java.lang.String t07 = z3Var.t0();
        java.lang.String P0 = z3Var.P0();
        int i39 = 0;
        java.lang.String i47 = o13.n.i(P0, false);
        java.lang.String i48 = o13.n.i(P0, true);
        java.lang.String w07 = z3Var.w0();
        java.lang.String i49 = o13.n.i(w07, false);
        java.lang.String i57 = o13.n.i(w07, true);
        java.lang.String str20 = z3Var.f236589y1;
        java.lang.String D0 = z3Var.D0();
        if (D0 != null && D0.endsWith("\u0000")) {
            D0 = D0.substring(0, D0.length() - 1);
        }
        java.lang.String str21 = z3Var.E1;
        int f17 = z3Var.f1();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
        if ((f17 & 8) != 0) {
            int i58 = z3Var.m2() ? 2097171 : z3Var.l2() ? 2097173 : 131076;
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).getClass();
            try {
                arrayList = r01.q3.cj().b1(d17).D0(false).b().f364087a;
            } catch (java.lang.Exception unused) {
                arrayList = new java.util.ArrayList();
            }
            i17 = i58;
            str = "\u200b";
            str2 = str21;
            str3 = str20;
            str4 = w07;
            str5 = P0;
            j17 = currentTimeMillis;
            i18 = 0;
            str6 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, "\u200b");
        } else {
            if (com.tencent.mm.storage.z3.m4(d17)) {
                str = "\u200b";
                str2 = str21;
                str3 = str20;
                str4 = w07;
                str5 = P0;
                i27 = 131081;
            } else {
                currentTimeMillis = ((com.tencent.mm.plugin.fts.p) this.f137589h).b(d17);
                java.util.regex.Pattern pattern = o13.c.f342214g;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                u(d17, pattern.split(D0 == null ? "" : D0));
                if (com.tencent.mm.sdk.platformtools.t8.K0(D0)) {
                    str = "\u200b";
                    str2 = str21;
                    str3 = str20;
                    str4 = w07;
                    str5 = P0;
                    j17 = currentTimeMillis;
                    str6 = "";
                    i17 = 131072;
                    i18 = 0;
                } else {
                    java.util.List d18 = ((com.tencent.mm.plugin.fts.p) this.f137589h).d(D0);
                    if (((java.util.ArrayList) d18).isEmpty()) {
                        str = "\u200b";
                        str2 = str21;
                        str3 = str20;
                        str4 = w07;
                        str5 = P0;
                        i19 = 0;
                    } else {
                        str = "\u200b";
                        str2 = str21;
                        str3 = str20;
                        str4 = w07;
                        str5 = P0;
                        i19 = 0;
                        this.f137588g.u(131072, 11, j18, d17, currentTimeMillis, com.tencent.mm.sdk.platformtools.t8.c1(d18, "\u200b"));
                        i39 = 1;
                    }
                    i39 += i19;
                    i27 = 131072;
                }
            }
            i17 = i27;
            j17 = currentTimeMillis;
            i18 = i39;
            str6 = "";
        }
        java.lang.String f18 = o13.n.f(d17, t07);
        if (f18 == null || f18.length() == 0) {
            i28 = i17;
            str7 = str6;
        } else {
            i28 = i17;
            str7 = str6;
            this.f137588g.u(i17, 15, j18, d17, j17, f18);
            i18++;
        }
        if (str4 == null || str4.length() == 0) {
            str8 = i47;
            str9 = i48;
            str10 = str5;
            str11 = null;
            str12 = null;
            str13 = null;
        } else {
            str13 = i47;
            str11 = i48;
            str8 = i49;
            str9 = i57;
            str10 = str4;
            str12 = str5;
        }
        if (str10 == null || str10.length() == 0) {
            str14 = str11;
            str15 = str12;
            str16 = str13;
        } else {
            java.lang.String str22 = str10.equalsIgnoreCase(str8) ? null : str8;
            java.lang.String str23 = (str22 == null || str22.length() == 0 || str22.equalsIgnoreCase(str9)) ? null : str9;
            java.lang.String str24 = str22;
            str14 = str11;
            str15 = str12;
            str16 = str13;
            this.f137588g.u(i28, 1, j18, d17, j17, str10);
            if (str24 != null && str24.length() != 0) {
                this.f137588g.u(i28, 2, j18, d17, j17, str24);
            }
            if (str23 != null && str23.length() != 0) {
                this.f137588g.u(i28, 3, j18, d17, j17, str23);
            }
            i18 += 3;
        }
        if (str15 != null && str15.length() != 0) {
            java.lang.String str25 = str16;
            java.lang.String str26 = str15.equalsIgnoreCase(str25) ? null : str25;
            if (str26 == null || str26.length() == 0 || str26.equalsIgnoreCase(str14)) {
                str14 = null;
            }
            java.lang.String str27 = str26;
            this.f137588g.u(i28, 5, j18, d17, j17, str15);
            if (str27 != null && str27.length() != 0) {
                this.f137588g.u(i28, 6, j18, d17, j17, str27);
            }
            if (str14 != null && str14.length() != 0) {
                this.f137588g.u(i28, 7, j18, d17, j17, str14);
            }
            i18 += 3;
        }
        if (str3 != null && str3.length() > 0) {
            this.f137588g.u(i28, 4, j18, d17, j17, str3);
            i18++;
        }
        int i59 = i28;
        if (i59 == 131072) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str17 = str;
                android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) this.f137589h).e("SELECT moblie FROM addr_upload2 WHERE username=?;", new java.lang.String[]{d17}, 2);
                if (e17.moveToFirst()) {
                    cursor = e17;
                    this.f137588g.u(i59, 16, j18, d17, j17, e17.getString(0));
                    i18++;
                } else {
                    cursor = e17;
                }
                cursor.close();
            } else {
                str17 = str;
                this.f137588g.u(i59, 16, j18, d17, j17, str2.replace(z3Var.K1 == 0 ? "," : "，", str17));
                i18++;
            }
            java.lang.String str28 = z3Var.W;
            java.lang.String str29 = ((java.util.HashSet) f137585z).contains(str28) ? "" : str28;
            if (str29 != null && str29.length() != 0) {
                this.f137588g.u(i59, 18, j18, d17, j17, str29);
                i18++;
            }
            java.lang.String str30 = z3Var.X;
            if (str30 != null && str30.length() != 0) {
                this.f137588g.u(i59, 17, j18, d17, j17, str30);
                i18++;
            }
        } else {
            str17 = str;
        }
        if ((i59 == 131076 || i59 == 2097171 || i59 == 2097173) && !com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            java.lang.String str31 = str7;
            this.f137588g.u(i59, 19, j18, d17, j17, str31);
            i18++;
            java.lang.String i66 = o13.n.i(str31, false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i66)) {
                str18 = str17;
                str19 = str31;
            } else {
                str18 = str17;
                str19 = str31;
                this.f137588g.u(i59, 20, j18, d17, j17, i66);
                i18++;
            }
            java.lang.String i67 = o13.n.i(str19, true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i67)) {
                i29 = 1;
            } else {
                i29 = 1;
                this.f137588g.u(i59, 21, j18, d17, j17, i67);
                i18++;
            }
        } else {
            str18 = str17;
            i29 = 1;
        }
        if (i59 != 131081) {
            return i18;
        }
        java.lang.String str32 = z3Var.J1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str32)) {
            i37 = 0;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(str32).optJSONArray("custom_info");
                if (optJSONArray != null) {
                    for (int i68 = 0; i68 < optJSONArray.length(); i68++) {
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i68);
                        j41.d0 d0Var = new j41.d0();
                        d0Var.a(jSONObject);
                        linkedList.add(d0Var);
                    }
                }
                i37 = 0;
            } catch (org.json.JSONException e18) {
                i37 = 0;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMCustomDetail", e18, "parse", new java.lang.Object[0]);
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (int i69 = i37; i69 < linkedList.size(); i69++) {
                java.util.Iterator it = ((j41.d0) linkedList.get(i69)).f297618b.iterator();
                while (it.hasNext()) {
                    java.lang.String a17 = ((j41.e0) it.next()).a(z3Var.Q0());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                        stringBuffer.append(a17);
                        stringBuffer.append("\u200c");
                    }
                }
                stringBuffer.append(str18);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringBuffer.toString())) {
                this.f137588g.u(131081, 51, z3Var.E2, z3Var.d1(), j17, stringBuffer.toString());
                i38 = i29;
                return i18 + i38;
            }
        }
        i38 = i37;
        return i18 + i38;
    }

    public boolean o(java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.endsWith("@stranger") || str.endsWith("@qqim") || str.endsWith("@app") || com.tencent.mm.storage.z3.p4(str) || str.contains(",") || str.endsWith("@gamelifesess") || str.endsWith("@gamelife") || str.endsWith("@gamelifehistory")) ? false : true;
    }

    public boolean p(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String d17 = z3Var.d1();
        if (!q(z3Var) || !o(d17) || com.tencent.mm.storage.z3.S3(d17) || com.tencent.mm.storage.z3.U3(d17)) {
            return false;
        }
        if (z3Var.r2()) {
            return true;
        }
        if (z3Var.q2() || z3Var.k2()) {
            return false;
        }
        com.tencent.mm.plugin.fts.p pVar = (com.tencent.mm.plugin.fts.p) this.f137589h;
        pVar.getClass();
        android.database.Cursor e17 = pVar.e(java.lang.String.format("SELECT 1 FROM rconversation WHERE username = ?", new java.lang.Object[0]), new java.lang.String[]{d17}, 2);
        try {
            boolean moveToNext = e17.moveToNext();
            e17.close();
            return moveToNext;
        } catch (java.lang.Throwable th6) {
            if (e17 != null) {
                e17.close();
            }
            throw th6;
        }
    }

    public boolean q(com.tencent.mm.storage.z3 z3Var) {
        if ((z3Var.u2() && !"notifymessage".equals(z3Var.d1())) || z3Var.o2() || z3Var.F0() != 0) {
            return false;
        }
        if (z3Var.r2()) {
            return true;
        }
        return (z3Var.q2() || z3Var.k2()) ? false : true;
    }

    public final java.util.HashMap r(java.lang.String[] strArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT rowid, username, alias, conRemark, nickname , lvbuff, type FROM rcontact WHERE username IN ");
        java.util.HashMap hashMap2 = o13.n.f342241a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(256);
        sb7.append('(');
        for (java.lang.String str : strArr) {
            sb7.append(android.database.DatabaseUtils.sqlEscapeString(str) + ',');
        }
        sb7.setCharAt(sb7.length() - 1, ')');
        sb6.append(sb7.toString());
        sb6.append(";");
        android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) this.f137589h).e(sb6.toString(), null, 2);
        while (e17.moveToNext()) {
            try {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(e17);
                hashMap.put(z3Var.d1(), z3Var);
            } catch (java.lang.Throwable th6) {
                if (e17 != null) {
                    e17.close();
                }
                throw th6;
            }
        }
        e17.close();
        return hashMap;
    }

    public void s(com.tencent.mm.storage.z3 z3Var) {
        try {
            this.f137595q.invoke(z3Var, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e17, "Failed parsing RContact LVBuffer.", new java.lang.Object[0]);
        }
    }

    public int t(java.lang.String str, java.lang.String[] strArr) {
        int i17;
        java.lang.String[] strArr2 = (java.lang.String[]) this.f137592n.get(str);
        this.f137588g.h();
        if (strArr2 == null) {
            w13.b bVar = this.f137588g;
            bVar.f442205t.bindString(1, str);
            bVar.f442205t.execute();
            i17 = ((int) this.f137588g.f442209x.simpleQueryForLong()) + 0;
            if (strArr != null) {
                this.f137588g.N(str, strArr);
                this.f137592n.put(str, strArr);
                i17 += strArr.length;
            }
        } else if (strArr == null) {
            w13.b bVar2 = this.f137588g;
            bVar2.f442205t.bindString(1, str);
            bVar2.f442205t.execute();
            i17 = ((int) this.f137588g.f442209x.simpleQueryForLong()) + 0;
            this.f137592n.remove(str);
        } else {
            java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(strArr2));
            int i18 = 0;
            for (java.lang.String str2 : strArr) {
                if (!hashSet.remove(str2)) {
                    w13.b bVar3 = this.f137588g;
                    bVar3.f442203r.bindString(1, str);
                    bVar3.f442203r.bindString(2, str2);
                    bVar3.f442203r.execute();
                    i18++;
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                w13.b bVar4 = this.f137588g;
                bVar4.f442204s.bindString(1, str);
                bVar4.f442204s.bindString(2, str3);
                bVar4.f442204s.execute();
                i18++;
            }
            this.f137592n.put(str, strArr);
            i17 = i18;
        }
        this.f137588g.j();
        return i17;
    }

    public final java.util.List u(java.lang.String str, java.lang.String[] strArr) {
        java.util.ArrayList arrayList;
        if (strArr.length != 0) {
            arrayList = new java.util.ArrayList(strArr.length);
            for (java.lang.String str2 : strArr) {
                arrayList.add(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V(str2, 0L)));
            }
        } else {
            arrayList = null;
        }
        java.util.List list = (java.util.List) this.f137593o.get(str);
        if (list == null) {
            w13.b bVar = this.f137588g;
            bVar.f442208w.bindString(1, str);
            bVar.f442208w.execute();
            if (arrayList != null && !arrayList.isEmpty()) {
                w13.b bVar2 = this.f137588g;
                bVar2.getClass();
                if (!arrayList.isEmpty()) {
                    boolean m17 = ((com.tencent.mm.plugin.fts.o) bVar2.f342198f).m();
                    if (!m17) {
                        ((com.tencent.mm.plugin.fts.o) bVar2.f342198f).a();
                    }
                    bVar2.f442206u.bindString(1, str);
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bVar2.f442206u.bindLong(2, ((java.lang.Long) it.next()).longValue());
                        bVar2.f442206u.execute();
                    }
                    if (!m17) {
                        ((com.tencent.mm.plugin.fts.o) bVar2.f342198f).d();
                    }
                }
                this.f137593o.put(str, arrayList);
            }
            return arrayList;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            w13.b bVar3 = this.f137588g;
            bVar3.f442208w.bindString(1, str);
            bVar3.f442208w.execute();
            this.f137593o.remove(str);
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet(list);
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            long longValue = ((java.lang.Long) it6.next()).longValue();
            if (!hashSet.remove(java.lang.Long.valueOf(longValue))) {
                w13.b bVar4 = this.f137588g;
                bVar4.f442206u.bindString(1, str);
                bVar4.f442206u.bindLong(2, longValue);
                bVar4.f442206u.execute();
                arrayList2.add(java.lang.Long.valueOf(longValue));
            }
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            long longValue2 = ((java.lang.Long) it7.next()).longValue();
            w13.b bVar5 = this.f137588g;
            bVar5.f442207v.bindString(1, str);
            bVar5.f442207v.bindLong(2, longValue2);
            bVar5.f442207v.execute();
        }
        arrayList2.addAll(hashSet);
        this.f137593o.put(str, arrayList);
        return arrayList2;
    }
}
