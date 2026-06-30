package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class w extends p13.c {

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashSet f137712o;

    /* renamed from: t, reason: collision with root package name */
    public int f137717t;

    /* renamed from: u, reason: collision with root package name */
    public int f137718u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137719v;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f137711n = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public long f137713p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f137714q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f137715r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f137716s = 0;

    public w(com.tencent.mm.plugin.fts.logic.l lVar, com.tencent.mm.plugin.fts.logic.m mVar) {
        this.f137719v = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildLabelIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        java.util.HashSet hashSet = this.f137712o;
        java.util.HashMap hashMap = this.f137711n;
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137719v;
        if (hashSet == null) {
            this.f137712o = new java.util.HashSet();
            android.database.Cursor I = lVar.f137588g.I(o13.d.f342226l, true, false, true, false, true);
            while (I.moveToNext()) {
                long j17 = I.getLong(0);
                java.lang.String string = I.getString(1);
                int i17 = I.getInt(2);
                long V = com.tencent.mm.sdk.platformtools.t8.V(string, 0L);
                if (i17 == 1) {
                    java.util.List list = (java.util.List) hashMap.get(java.lang.Long.valueOf(V));
                    if (list == null) {
                        list = new java.util.ArrayList(2);
                        hashMap.put(java.lang.Long.valueOf(V), list);
                    }
                    list.add(java.lang.Long.valueOf(j17));
                } else {
                    this.f137712o.add(java.lang.Long.valueOf(V));
                }
            }
            I.close();
            this.f137717t = hashMap.size();
            this.f137718u = this.f137712o.size();
        }
        o("getBuildLabel");
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
        o("deleteDirtyLabel");
        java.util.Map a17 = w13.d.f442210a.a(lVar.f137593o);
        android.database.Cursor e17 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).e("SELECT rowid, labelID, labelName, lastUseTime FROM ContactLabel WHERE ROWID > ? ORDER BY ROWID;", new java.lang.String[]{java.lang.Long.toString(this.f137713p)}, 2);
        int i18 = 50;
        while (e17.moveToNext()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                e17.close();
                lVar.f137588g.j();
                throw new java.lang.InterruptedException();
            }
            this.f137713p = e17.getLong(0);
            long j18 = e17.getLong(1);
            if (!this.f137712o.remove(java.lang.Long.valueOf(j18))) {
                java.lang.String string2 = e17.getString(2);
                long j19 = e17.getLong(3);
                try {
                    java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) a17).get(java.lang.Long.valueOf(j18));
                    if (list2 == null) {
                        list2 = new java.util.ArrayList();
                    }
                    i18 += this.f137719v.l(j18, string2, list2, j19);
                    this.f137714q++;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e18, "Build label index failed with exception.\n", new java.lang.Object[0]);
                    this.f137716s++;
                }
                if (i18 >= 50) {
                    lVar.f137588g.j();
                    lVar.f137588g.h();
                    i18 = 0;
                }
            }
        }
        e17.close();
        lVar.f137588g.j();
        o("buildLabel");
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        this.f137715r = this.f137712o.size();
        java.util.Iterator it6 = this.f137712o.iterator();
        while (it6.hasNext()) {
            lVar.f137588g.m0(o13.d.f342226l, java.lang.String.valueOf(((java.lang.Long) it6.next()).longValue()));
        }
        this.f137712o.clear();
        o("deleteUnusedLabel");
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{build: %d newLabel: %d, remove: %d, dirty: %d, failContact: %d}", java.lang.Integer.valueOf(this.f137718u), java.lang.Integer.valueOf(this.f137714q), java.lang.Integer.valueOf(this.f137715r), java.lang.Integer.valueOf(this.f137717t), java.lang.Integer.valueOf(this.f137716s));
    }

    @Override // p13.c
    public int k() {
        return 2;
    }
}
