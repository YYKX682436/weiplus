package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class w1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137721n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f137722o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f137723p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f137724q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137725r;

    public w1(com.tencent.mm.plugin.fts.logic.l2 l2Var, com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$1 fTS5SearchMessageLogic$1) {
        this.f137725r = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildMessageIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        java.util.HashSet hashSet;
        java.lang.String[] strArr;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        long j17;
        long k17 = ((com.tencent.mm.plugin.fts.o) this.f137725r.f137609h.f342198f).k(-200L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0("");
        if (k17 > m07) {
            this.f137725r.f137609h.L(-310L, java.lang.System.currentTimeMillis());
            this.f137725r.f137609h.L(-311L, o45.wf.f343029g);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Start building message index, last createTime: %s last from createTime: %s", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(m07));
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$1 fTS5SearchMessageLogic$1 = null;
        android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) this.f137725r.f137608g).e("SELECT msgId FROM VoiceTransText", null);
        int i17 = 0;
        if (e17 != null) {
            while (e17.moveToNext()) {
                hashSet2.add(java.lang.Long.valueOf(e17.getLong(0)));
            }
            e17.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "voiceTransMsgIdSet size: %d", java.lang.Integer.valueOf(hashSet2.size()));
        java.lang.String[] strArr2 = new java.lang.String[3];
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i18 = Integer.MAX_VALUE;
        while (i18 >= 50) {
            strArr2[i17] = java.lang.Long.toString(k17);
            strArr2[1] = java.lang.Long.toString(m07);
            strArr2[2] = java.lang.Integer.toString(this.f137721n);
            android.database.Cursor e18 = ((com.tencent.mm.plugin.fts.p) this.f137725r.f137608g).e("SELECT msgId, talker, createTime, content, type, isSend FROM message WHERE createTime<=? AND createTime>? AND (type = 1 OR (type & 0xFFFF = 49) OR type = 34) ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", strArr2);
            long j18 = 0;
            int i19 = i17;
            while (e18.moveToNext()) {
                long j19 = m07;
                com.tencent.mm.plugin.fts.logic.b2 b2Var = new com.tencent.mm.plugin.fts.logic.b2(this.f137725r, fTS5SearchMessageLogic$1);
                b2Var.f137464a = e18.getLong(i17);
                b2Var.f137465b = e18.getString(1);
                b2Var.f137466c = e18.getLong(2);
                b2Var.f137467d = e18.getString(3);
                b2Var.f137468e = e18.getInt(4);
                b2Var.f137470g = e18.getInt(5);
                b2Var.f137469f = 41;
                if (com.tencent.mm.plugin.fts.logic.l2.b(this.f137725r, b2Var, hashSet2)) {
                    b2Var.a();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(b2Var.f137471h)) {
                        arrayList2.add(b2Var);
                    } else {
                        arrayList3.add(b2Var);
                    }
                } else {
                    arrayList3.add(b2Var);
                }
                i19++;
                j18 = b2Var.f137466c;
                m07 = j19;
                i17 = 0;
                fTS5SearchMessageLogic$1 = null;
            }
            long j27 = m07;
            e18.close();
            if (java.lang.Thread.interrupted() || this.f351066f) {
                throw new java.lang.InterruptedException();
            }
            int size = arrayList2.size();
            if (size == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (!arrayList3.isEmpty()) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        sb6.append(((com.tencent.mm.plugin.fts.logic.b2) it6.next()).f137464a);
                        sb6.append(",");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "build msgRecList size %d offset %s filterLastMsgCreateTime %s skipMsgInfo %s", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(this.f137721n), java.lang.Long.valueOf(j18), sb6.toString());
            } else {
                int i27 = size - 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "build msgRecList size %d Id FROM %d to %d Time FROM %s to %s offset %s", java.lang.Integer.valueOf(size), java.lang.Long.valueOf(((com.tencent.mm.plugin.fts.logic.b2) arrayList2.get(0)).f137464a), java.lang.Long.valueOf(((com.tencent.mm.plugin.fts.logic.b2) arrayList2.get(i27)).f137464a), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, ((com.tencent.mm.plugin.fts.logic.b2) arrayList2.get(0)).f137466c / 1000), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, ((com.tencent.mm.plugin.fts.logic.b2) arrayList2.get(i27)).f137466c / 1000), java.lang.Integer.valueOf(this.f137721n));
            }
            if (size > 0) {
                long j28 = ((com.tencent.mm.plugin.fts.logic.b2) arrayList2.get(0)).f137466c;
                long j29 = ((com.tencent.mm.plugin.fts.logic.b2) arrayList2.get(arrayList2.size() - 1)).f137466c;
                w13.h hVar = this.f137725r.f137609h;
                hVar.getClass();
                p75.n0 n0Var = dm.h3.f237332n;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                hashSet = hashSet2;
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                strArr = strArr2;
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                arrayList = arrayList3;
                linkedList.add(dm.h3.f237333o);
                p75.d dVar = dm.h3.f237334p;
                linkedList.add(dVar);
                p75.m c17 = dVar.w(java.lang.Long.valueOf(j28)).c(dVar.o(java.lang.Long.valueOf(j29)));
                p75.i0 g17 = dm.h3.f237332n.g(linkedList);
                g17.f352657d = c17;
                g17.f352659f = linkedList2;
                g17.f352660g = linkedList3;
                java.util.List k18 = g17.a().k(((com.tencent.mm.plugin.fts.o) hVar.f342198f).l(), dm.h3.class);
                java.util.HashSet hashSet3 = new java.util.HashSet();
                java.util.Iterator it7 = ((java.util.ArrayList) k18).iterator();
                while (it7.hasNext()) {
                    dm.h3 h3Var = (dm.h3) it7.next();
                    hashSet3.add(new android.util.Pair(java.lang.Long.valueOf(h3Var.t0()), java.lang.Long.valueOf(h3Var.u0())));
                }
                this.f137725r.f137609h.h();
                java.util.Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    com.tencent.mm.plugin.fts.logic.b2 b2Var2 = (com.tencent.mm.plugin.fts.logic.b2) it8.next();
                    long j37 = b2Var2.f137464a;
                    long j38 = b2Var2.f137466c;
                    if (j38 == k17) {
                        this.f137721n++;
                    } else {
                        this.f137721n = 0;
                        k17 = j38;
                    }
                    if (hashSet3.remove(new android.util.Pair(java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38)))) {
                        it = it8;
                        j17 = k17;
                    } else {
                        try {
                            it = it8;
                            try {
                                j17 = k17;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                j17 = k17;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchMessageLogic", e, "Build message index failed with exception. \n%s", b2Var2.f137471h);
                                this.f137724q++;
                                it8 = it;
                                k17 = j17;
                            }
                            try {
                                this.f137725r.f137609h.N(65536, b2Var2.f137469f, j37, b2Var2.f137465b, j38, b2Var2.f137471h, b2Var2.f137472i);
                                this.f137722o++;
                            } catch (java.lang.Exception e27) {
                                e = e27;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchMessageLogic", e, "Build message index failed with exception. \n%s", b2Var2.f137471h);
                                this.f137724q++;
                                it8 = it;
                                k17 = j17;
                            }
                        } catch (java.lang.Exception e28) {
                            e = e28;
                            it = it8;
                        }
                    }
                    it8 = it;
                    k17 = j17;
                }
                java.util.Iterator it9 = hashSet3.iterator();
                while (it9.hasNext()) {
                    android.util.Pair pair = (android.util.Pair) it9.next();
                    w13.h hVar2 = this.f137725r.f137609h;
                    int[] iArr = o13.d.f342215a;
                    long longValue = ((java.lang.Long) pair.first).longValue();
                    long longValue2 = ((java.lang.Long) pair.second).longValue();
                    hVar2.getClass();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(4);
                    android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) hVar2.f342198f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND entity_id=? AND timestamp=?;", hVar2.r()), new java.lang.String[]{java.lang.Long.toString(longValue), java.lang.Long.toString(longValue2)});
                    while (true) {
                        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
                        if (cursorWrapper.moveToNext()) {
                            arrayList4.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
                        }
                    }
                    ((com.tencent.mm.plugin.fts.e) o17).close();
                    hVar2.m(arrayList4);
                    this.f137723p++;
                    it9.remove();
                }
                this.f137725r.f137609h.j();
                this.f137725r.f137609h.L(-200L, k17);
            } else {
                hashSet = hashSet2;
                strArr = strArr2;
                arrayList = arrayList3;
                if (k17 == j18) {
                    this.f137721n += i19;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchMessageLogic", "same last create time, increase queryCount %s mCreateTimeOffset %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f137721n));
                } else {
                    this.f137721n = 0;
                    k17 = j18;
                }
            }
            arrayList2.clear();
            arrayList.clear();
            if (java.lang.Thread.interrupted() || this.f351066f) {
                throw new java.lang.InterruptedException();
            }
            i18 = i19;
            m07 = j27;
            hashSet2 = hashSet;
            strArr2 = strArr;
            arrayList3 = arrayList;
            i17 = 0;
            fTS5SearchMessageLogic$1 = null;
        }
        w13.h hVar3 = this.f137725r.f137609h;
        hVar3.getClass();
        p75.n0 n0Var2 = dm.h3.f237332n;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        linkedList4.add(dm.h3.f237333o);
        p75.m0 i28 = dm.h3.f237335q.i(-1);
        p75.i0 g18 = dm.h3.f237332n.g(linkedList4);
        g18.f352657d = i28;
        g18.f352659f = linkedList5;
        g18.f352660g = linkedList6;
        java.util.List k19 = g18.a().k(((com.tencent.mm.plugin.fts.o) hVar3.f342198f).l(), dm.h3.class);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it10 = ((java.util.ArrayList) k19).iterator();
        while (it10.hasNext()) {
            arrayList5.add(java.lang.Long.valueOf(((dm.h3) it10.next()).t0()));
        }
        java.util.ListIterator listIterator = arrayList5.listIterator(arrayList5.size());
        int i29 = 50;
        while (listIterator.hasPrevious()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                this.f137725r.f137609h.j();
                throw new java.lang.InterruptedException();
            }
            if (i29 >= 50) {
                this.f137725r.f137609h.j();
                this.f137725r.f137609h.h();
                i29 = 0;
            }
            this.f137725r.f137609h.l(((java.lang.Long) listIterator.previous()).longValue());
            i29++;
            this.f137723p++;
            listIterator.remove();
        }
        this.f137725r.f137609h.L(-200L, k17 - 1);
        this.f137725r.f137609h.j();
        this.f137725r.f137610i = false;
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{new: %d removed: %d failed: %d}", java.lang.Integer.valueOf(this.f137722o), java.lang.Integer.valueOf(this.f137723p), java.lang.Integer.valueOf(this.f137724q));
    }

    @Override // p13.c
    public int k() {
        return 4;
    }
}
