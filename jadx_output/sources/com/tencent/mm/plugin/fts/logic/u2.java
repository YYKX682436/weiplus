package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class u2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashSet f137687n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f137688o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f137689p = com.tencent.wcdb.core.Database.DictDefaultMatchValue;

    /* renamed from: q, reason: collision with root package name */
    public long f137690q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f137691r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f137692s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f137693t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f137694u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137695v;

    public u2(com.tencent.mm.plugin.fts.logic.e3 e3Var, com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$1 fTS5SearchServiceNotifyLogic$1) {
        this.f137695v = e3Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildServiceNotifyIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        int i17;
        java.lang.String[] strArr;
        int i18;
        int i19 = 0;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_close_wxpay_search_recreate, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "BuildServiceNotifyIndexTask is disable by abtest");
            return false;
        }
        this.f137689p = ((com.tencent.mm.plugin.fts.o) this.f137695v.f137517h.f342198f).k(-201L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        this.f137690q = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0("");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Start building service notify index, last createTime: %s last from createTime: %s", java.lang.Long.valueOf(this.f137689p), java.lang.Long.valueOf(this.f137690q));
        int i27 = 2;
        if (this.f137687n == null) {
            this.f137687n = new java.util.HashSet();
            this.f137688o = new java.util.ArrayList();
            android.database.Cursor I = this.f137695v.f137517h.I(o13.d.f342219e, true, true, false, true, true);
            while (I.moveToNext()) {
                long j17 = I.getLong(0);
                long j18 = I.getLong(1);
                long j19 = I.getLong(2);
                if (I.getInt(3) == -1) {
                    this.f137688o.add(java.lang.Long.valueOf(j17));
                } else if (j19 <= this.f137689p) {
                    this.f137687n.add(new android.util.Pair(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19)));
                }
            }
            I.close();
        }
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        java.lang.String[] strArr2 = new java.lang.String[3];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i28 = Integer.MAX_VALUE;
        while (i28 >= 50) {
            strArr2[i19] = java.lang.Long.toString(this.f137689p);
            strArr2[1] = java.lang.Long.toString(this.f137690q);
            strArr2[i27] = java.lang.Integer.toString(this.f137691r);
            android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) this.f137695v.f137516g).e("SELECT msgId, createTime, content, type, isSend, talker FROM message WHERE (talker = 'notifymessage' OR talker = 'gh_3dfda90e39d6') AND createTime<=? AND createTime>? ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", strArr2);
            long j27 = 0;
            int i29 = i19;
            while (e17.moveToNext()) {
                com.tencent.mm.plugin.fts.logic.y2 y2Var = new com.tencent.mm.plugin.fts.logic.y2(this.f137695v, null);
                y2Var.f137744a = e17.getLong(i19);
                y2Var.f137746c = e17.getLong(1);
                y2Var.f137747d = e17.getString(i27);
                e17.getInt(3);
                e17.getInt(4);
                java.lang.String string = e17.getString(5);
                y2Var.f137745b = string;
                if ("gh_3dfda90e39d6".equals(string)) {
                    y2Var.f137748e = 57;
                } else if ("notifymessage".equals(y2Var.f137745b)) {
                    y2Var.f137748e = 56;
                }
                y2Var.a();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(y2Var.f137749f)) {
                    arrayList.add(y2Var);
                }
                j27 = y2Var.f137746c;
                i29++;
            }
            e17.close();
            if (java.lang.Thread.interrupted() || this.f351066f) {
                throw new java.lang.InterruptedException();
            }
            int size = arrayList.size();
            if (size == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "build msgRecList size %d offset %s", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(this.f137691r));
            } else {
                int i37 = size - 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "build msgRecList size %d Id FROM %d to %d Time FROM %s to %s offset %s", java.lang.Integer.valueOf(size), java.lang.Long.valueOf(((com.tencent.mm.plugin.fts.logic.y2) arrayList.get(i19)).f137744a), java.lang.Long.valueOf(((com.tencent.mm.plugin.fts.logic.y2) arrayList.get(i37)).f137744a), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, ((com.tencent.mm.plugin.fts.logic.y2) arrayList.get(i19)).f137746c / 1000), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, ((com.tencent.mm.plugin.fts.logic.y2) arrayList.get(i37)).f137746c / 1000), java.lang.Integer.valueOf(this.f137691r));
            }
            if (size > 0) {
                this.f137695v.f137517h.h();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.fts.logic.y2 y2Var2 = (com.tencent.mm.plugin.fts.logic.y2) it.next();
                    long j28 = y2Var2.f137744a;
                    java.lang.String[] strArr3 = strArr2;
                    long j29 = y2Var2.f137746c;
                    int i38 = i29;
                    if (j29 == this.f137689p) {
                        this.f137691r++;
                    } else {
                        this.f137689p = j29;
                        this.f137691r = 0;
                    }
                    if (!this.f137687n.remove(new android.util.Pair(java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29)))) {
                        try {
                            w13.j jVar = this.f137695v.f137517h;
                            int i39 = y2Var2.f137748e;
                            java.lang.String str = y2Var2.f137745b;
                            java.lang.String str2 = str == null ? "" : str;
                            java.lang.String str3 = y2Var2.f137749f;
                            java.lang.String str4 = str3 == null ? "" : str3;
                            java.lang.String str5 = y2Var2.f137750g;
                            jVar.N(524288, i39, j28, str2, j29, str4, str5 == null ? "" : str5);
                            this.f137692s++;
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e18, "Build message index failed with exception. \n%s", y2Var2.f137749f);
                            this.f137694u++;
                        }
                    }
                    strArr2 = strArr3;
                    i29 = i38;
                }
                strArr = strArr2;
                i18 = i29;
                this.f137695v.f137517h.j();
                this.f137695v.f137517h.L(-201L, this.f137689p);
            } else {
                strArr = strArr2;
                i18 = i29;
                this.f137689p = j27;
                this.f137691r = 0;
            }
            arrayList.clear();
            if (java.lang.Thread.interrupted() || this.f351066f) {
                throw new java.lang.InterruptedException();
            }
            strArr2 = strArr;
            i28 = i18;
            i19 = 0;
            i27 = 2;
        }
        java.util.Iterator it6 = this.f137687n.iterator();
        int i47 = 50;
        while (it6.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                this.f137695v.f137517h.j();
                throw new java.lang.InterruptedException();
            }
            if (i47 >= 50) {
                this.f137695v.f137517h.j();
                this.f137695v.f137517h.h();
                i47 = 0;
            }
            android.util.Pair pair = (android.util.Pair) it6.next();
            w13.j jVar2 = this.f137695v.f137517h;
            int[] iArr = o13.d.f342219e;
            long longValue = ((java.lang.Long) pair.first).longValue();
            long longValue2 = ((java.lang.Long) pair.second).longValue();
            jVar2.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) jVar2.f342198f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND entity_id=? AND timestamp=?;", jVar2.r()), new java.lang.String[]{java.lang.Long.toString(longValue), java.lang.Long.toString(longValue2)});
            while (true) {
                android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
                if (cursorWrapper.moveToNext()) {
                    arrayList2.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
                }
            }
            ((com.tencent.mm.plugin.fts.e) o17).close();
            jVar2.m(arrayList2);
            i47++;
            this.f137693t++;
            it6.remove();
        }
        this.f137695v.f137517h.j();
        java.util.ArrayList arrayList3 = this.f137688o;
        java.util.ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        int i48 = 50;
        while (listIterator.hasPrevious()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                this.f137695v.f137517h.j();
                throw new java.lang.InterruptedException();
            }
            if (i48 >= 50) {
                this.f137695v.f137517h.j();
                this.f137695v.f137517h.h();
                i17 = 0;
            } else {
                i17 = i48;
            }
            this.f137695v.f137517h.l(((java.lang.Long) listIterator.previous()).longValue());
            i48 = i17 + 1;
            this.f137693t++;
            listIterator.remove();
        }
        this.f137695v.f137517h.L(-201L, this.f137689p - 1);
        this.f137695v.f137517h.j();
        this.f137695v.f137518i = false;
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{new: %d removed: %d failed: %d}", java.lang.Integer.valueOf(this.f137692s), java.lang.Integer.valueOf(this.f137693t), java.lang.Integer.valueOf(this.f137694u));
    }

    @Override // p13.c
    public int k() {
        return 31;
    }
}
