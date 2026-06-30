package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class v extends p13.c {
    public int A;
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l B;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashSet f137698p;

    /* renamed from: y, reason: collision with root package name */
    public int f137707y;

    /* renamed from: z, reason: collision with root package name */
    public int f137708z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f137696n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f137697o = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f137699q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public long f137700r = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f137701s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f137702t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f137703u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f137704v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f137705w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f137706x = 0;

    public v(com.tencent.mm.plugin.fts.logic.l lVar, com.tencent.mm.plugin.fts.logic.m mVar) {
        this.B = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildContactIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building contact index.");
        o("start");
        java.util.HashSet hashSet = this.f137698p;
        java.util.HashSet hashSet2 = this.f137697o;
        java.util.HashMap hashMap = this.f137696n;
        com.tencent.mm.plugin.fts.logic.l lVar = this.B;
        if (hashSet == null) {
            this.f137698p = new java.util.HashSet();
            android.database.Cursor I = lVar.f137588g.I(o13.d.f342224j, true, false, true, false, true);
            while (I.moveToNext()) {
                java.lang.String string = I.getString(1);
                int i18 = I.getInt(2);
                long j17 = I.getLong(0);
                if (i18 == 1) {
                    java.util.List list = (java.util.List) hashMap.get(string);
                    if (list == null) {
                        list = new java.util.ArrayList(16);
                        hashMap.put(string, list);
                    }
                    list.add(java.lang.Long.valueOf(j17));
                } else {
                    this.f137698p.add(string);
                    if (i18 == 2) {
                        hashSet2.add(string);
                    }
                }
            }
            I.close();
            this.f137707y = hashMap.size();
            this.f137708z = hashSet2.size();
            int size = this.f137698p.size();
            this.A = size;
            if (size < 5) {
                this.f351068h |= 1;
            }
        }
        o("getBuildContact");
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        if (!hashMap.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((java.util.List) it.next());
            }
            hashMap.clear();
            lVar.f137588g.m(arrayList);
        }
        o("deleteDirtyContact");
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        if (!hashSet2.isEmpty()) {
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                lVar.f137588g.M(str, ((com.tencent.mm.plugin.fts.p) lVar.f137589h).b(str));
            }
            hashSet2.clear();
        }
        o("updateTimestampContact");
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).e("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE ROWID > ? AND deleteFlag=0 ORDER BY ROWID;", new java.lang.String[]{java.lang.Long.toString(this.f137700r)}, 2);
        int i19 = 50;
        while (true) {
            boolean moveToNext = e17.moveToNext();
            java.util.HashMap hashMap2 = this.f137699q;
            if (!moveToNext) {
                e17.close();
                lVar.f137588g.j();
                o("buildWXContact");
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    throw new java.lang.InterruptedException();
                }
                android.database.Cursor e18 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).e("SELECT rowid, chatroomname, memberlist, roomdata FROM chatroom WHERE ROWID > ? ORDER BY ROWID;", new java.lang.String[]{java.lang.Long.toString(this.f137701s)}, 2);
                int i27 = 50;
                while (e18.moveToNext()) {
                    if (java.lang.Thread.interrupted() || this.f351066f) {
                        e18.close();
                        lVar.f137588g.j();
                        throw new java.lang.InterruptedException();
                    }
                    this.f137701s = e18.getLong(0);
                    java.lang.String string2 = e18.getString(1);
                    if (!this.f137698p.remove(string2)) {
                        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) hashMap2.get(string2);
                        if (z3Var == null) {
                            this.f137706x++;
                        } else {
                            java.lang.String string3 = e18.getString(2);
                            byte[] blob = e18.getBlob(3);
                            try {
                                java.lang.String[] split = o13.c.f342208a.split(string3);
                                java.util.Arrays.sort(split, new com.tencent.mm.plugin.fts.logic.u(this));
                                i27 = i27 + lVar.t(string2, split) + this.B.j(string2, z3Var, string3, split, blob);
                                this.f137702t++;
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e19, "Build contact index failed with exception.\n", new java.lang.Object[0]);
                                this.f137706x++;
                            }
                            if (i27 >= 50) {
                                lVar.f137588g.j();
                                lVar.f137588g.h();
                                i27 = 0;
                            }
                        }
                    }
                }
                e18.close();
                lVar.f137588g.j();
                o("buildChatroomContact");
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    throw new java.lang.InterruptedException();
                }
                this.f137704v = this.f137698p.size();
                java.util.Iterator it7 = this.f137698p.iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it7.next();
                    w13.b bVar = lVar.f137588g;
                    int[] iArr = o13.d.f342224j;
                    bVar.m0(iArr, str2);
                    ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).ij().f137634g.m0(iArr, str2);
                }
                this.f137698p.clear();
                hashMap2.clear();
                o("deleteUnusedContact");
                return true;
            }
            if (java.lang.Thread.interrupted() || this.f351066f) {
                break;
            }
            long j18 = e17.getLong(0);
            this.f137700r = j18;
            com.tencent.mm.storage.z3 z3Var2 = new com.tencent.mm.storage.z3();
            z3Var2.E2 = j18;
            z3Var2.X1(e17.getString(1));
            z3Var2.k1(e17.getString(2));
            z3Var2.n1(e17.getString(3));
            z3Var2.M1(e17.getString(4));
            z3Var2.Z1(e17.getInt(5));
            z3Var2.l3(e17.getInt(6));
            z3Var2.L1(e17.getBlob(7));
            z3Var2.r1(e17.getString(8));
            z3Var2.z1(0);
            if (com.tencent.mm.storage.z3.R4(z3Var2.d1())) {
                hashMap2.put(z3Var2.d1(), z3Var2);
            } else if (lVar.p(z3Var2) && !this.f137698p.remove(z3Var2.d1())) {
                if (i19 >= 50) {
                    lVar.f137588g.j();
                    lVar.f137588g.h();
                    i17 = 0;
                } else {
                    i17 = i19;
                }
                try {
                    if (!com.tencent.mm.storage.z3.R4(z3Var2.d1())) {
                        lVar.s(z3Var2);
                        z3Var2.Z4();
                    }
                    i17 += lVar.m(z3Var2);
                    this.f137703u++;
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e27, "Build contact index failed with exception.\n", new java.lang.Object[0]);
                    this.f137705w++;
                }
                i19 = i17;
            }
        }
        e17.close();
        lVar.f137588g.j();
        throw new java.lang.InterruptedException();
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{build: %d newContact: %d, newChatroom: %d, remove: %d, dirty: %d, timestamp: %d, failContact: %d, failChatroom}", java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(this.f137703u), java.lang.Integer.valueOf(this.f137702t), java.lang.Integer.valueOf(this.f137704v), java.lang.Integer.valueOf(this.f137707y), java.lang.Integer.valueOf(this.f137708z), java.lang.Integer.valueOf(this.f137705w), java.lang.Integer.valueOf(this.f137706x));
    }

    @Override // p13.c
    public int k() {
        return 1;
    }
}
