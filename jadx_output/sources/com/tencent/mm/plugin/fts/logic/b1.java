package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class b1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137459n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f137460o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f137461p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f137462q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137463r;

    public b1(com.tencent.mm.plugin.fts.logic.l lVar, com.tencent.mm.plugin.fts.logic.m mVar) {
        this.f137463r = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "UpdateDirtyAndTimestampContactTask";
    }

    @Override // p13.c
    public boolean i() {
        o("start");
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137463r;
        java.util.Iterator it = lVar.f137591m.entrySet().iterator();
        int i17 = 50;
        while (it.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                lVar.f137588g.j();
                throw new java.lang.InterruptedException();
            }
            if (i17 >= 50) {
                lVar.f137588g.j();
                lVar.f137588g.h();
                i17 = 0;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.Iterator it6 = ((java.util.List) entry.getValue()).iterator();
            while (it6.hasNext()) {
                lVar.f137588g.l(((java.lang.Long) it6.next()).longValue());
                i17++;
            }
            java.lang.String str = (java.lang.String) entry.getKey();
            com.tencent.mm.storage.z3 a17 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).a(str);
            if (a17.d1().length() > 0 && lVar.p(a17)) {
                i17 += lVar.k(a17);
            }
            it.remove();
            lVar.f137590i.remove(str);
            this.f137459n++;
        }
        o("dirtyContact");
        java.util.Iterator it7 = lVar.f137590i.iterator();
        while (it7.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                lVar.f137588g.j();
                throw new java.lang.InterruptedException();
            }
            if (i17 >= 50) {
                lVar.f137588g.j();
                lVar.f137588g.h();
                i17 = 0;
            }
            java.lang.String str2 = (java.lang.String) it7.next();
            long b17 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).b(str2);
            com.tencent.mm.storage.z3 a18 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).a(str2);
            if (a18.d1().length() > 0 && lVar.p(a18)) {
                lVar.f137588g.M(str2, b17);
                i17++;
            }
            it7.remove();
            this.f137461p++;
        }
        lVar.f137588g.j();
        o("timestampContact");
        com.tencent.mm.plugin.fts.logic.m3 ij6 = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).ij();
        ij6.f137635h.clear();
        this.f137462q = ij6.f137634g.O();
        o("topHits");
        java.util.Map a19 = w13.d.f442210a.a(lVar.f137593o);
        java.util.Iterator it8 = lVar.f137594p.entrySet().iterator();
        while (it8.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f351066f) {
                lVar.f137588g.j();
                throw new java.lang.InterruptedException();
            }
            if (i17 >= 50) {
                lVar.f137588g.j();
                lVar.f137588g.h();
                i17 = 0;
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it8.next();
            java.util.Iterator it9 = ((java.util.List) entry2.getValue()).iterator();
            while (it9.hasNext()) {
                lVar.f137588g.l(((java.lang.Long) it9.next()).longValue());
                i17++;
            }
            long longValue = ((java.lang.Long) entry2.getKey()).longValue();
            try {
                p13.k c17 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).c(longValue);
                if (c17 != null) {
                    java.util.List list = (java.util.List) ((java.util.LinkedHashMap) a19).get(java.lang.Long.valueOf(longValue));
                    if (list == null) {
                        list = new java.util.ArrayList();
                    }
                    i17 += this.f137463r.l(longValue, c17.f351108b, list, c17.f351109c);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e17, "update label index failed with exception.\n", new java.lang.Object[0]);
            }
            it8.remove();
            this.f137460o++;
        }
        lVar.f137588g.j();
        o("dirtyLabel");
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{DirtyContact: %d Timestamp: %d tophitsCount: %d DirtyLabel: %d}", java.lang.Integer.valueOf(this.f137459n), java.lang.Integer.valueOf(this.f137461p), java.lang.Integer.valueOf(this.f137462q), java.lang.Integer.valueOf(this.f137460o));
    }

    @Override // p13.c
    public int k() {
        return 16;
    }
}
