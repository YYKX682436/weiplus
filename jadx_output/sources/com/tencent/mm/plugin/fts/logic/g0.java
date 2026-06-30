package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class g0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137544n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f137545o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137546p;

    public g0(com.tencent.mm.plugin.fts.logic.l lVar, java.lang.String str) {
        this.f137546p = lVar;
        this.f137544n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "MarkLabelDirtyByUsernameTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137546p;
        com.tencent.mm.plugin.fts.p pVar = (com.tencent.mm.plugin.fts.p) lVar.f137589h;
        pVar.getClass();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f137544n;
        com.tencent.mm.storage.z3 L = Bi.L(str);
        if (L == null) {
            L = new com.tencent.mm.storage.z3();
            android.database.Cursor e17 = pVar.e("SELECT contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0 AND (type & 0x1) > 0;", new java.lang.String[]{str}, 2);
            if (e17.moveToNext()) {
                L.r1(e17.getString(0));
            }
            e17.close();
        }
        java.lang.String D0 = L.D0();
        if (D0 != null && D0.endsWith("\u0000")) {
            D0 = D0.substring(0, D0.length() - 1);
        }
        java.util.regex.Pattern pattern = o13.c.f342214g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (D0 == null) {
            D0 = "";
        }
        java.lang.String[] split = pattern.split(D0);
        java.util.List u17 = lVar.u(str, split);
        java.util.HashSet hashSet = this.f137545o;
        if (u17 != null) {
            java.util.Iterator it = u17.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Long) it.next()).longValue();
                if (longValue != 0) {
                    hashSet.add(java.lang.Long.valueOf(longValue));
                }
            }
        }
        for (java.lang.String str2 : split) {
            long F1 = com.tencent.mm.sdk.platformtools.t8.F1(str2, 0L);
            if (F1 != 0) {
                hashSet.add(java.lang.Long.valueOf(F1));
            }
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            long longValue2 = ((java.lang.Long) it6.next()).longValue();
            if (longValue2 != 0 && !lVar.f137594p.containsKey(java.lang.Long.valueOf(longValue2))) {
                lVar.f137594p.put(java.lang.Long.valueOf(longValue2), lVar.f137588g.w(o13.d.f342226l, java.lang.String.valueOf(longValue2), 1));
            }
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "markLabelDirty: " + this.f137545o.toString();
    }
}
