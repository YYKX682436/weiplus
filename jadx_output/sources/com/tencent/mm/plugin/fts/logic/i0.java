package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class i0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137561q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137561q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchContactLogic.SearchTask";
    }

    @Override // p13.c
    public int k() {
        return 11;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        boolean z17;
        p13.y yVar;
        p13.u uVar = this.f351135n;
        p13.r b17 = p13.r.b(uVar.f351141c, true);
        vVar.f351159d = b17;
        android.database.Cursor H = this.f137561q.f137588g.H(b17, uVar.f351145g, uVar.f351146h, null, true, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        while (H.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(H);
            if (!uVar.f351148j.contains(zVar.f351187e)) {
                int[] iArr = o13.d.f342224j;
                int i17 = zVar.f351184b;
                java.util.HashMap hashMap3 = o13.n.f342241a;
                boolean z18 = false;
                int i18 = 0;
                while (true) {
                    if (i18 >= 6) {
                        z17 = false;
                        break;
                    } else {
                        if (iArr[i18] == i17) {
                            z17 = true;
                            break;
                        }
                        i18++;
                    }
                }
                if (z17) {
                    p13.y yVar2 = (p13.y) hashMap.get(zVar.f351187e);
                    if (yVar2 == null || o13.n.b(o13.d.f342232r, zVar.f351185c, yVar2.f351185c) < 0) {
                        hashMap.put(zVar.f351187e, zVar);
                    }
                } else {
                    int[] iArr2 = o13.d.f342227m;
                    int i19 = zVar.f351184b;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= 2) {
                            break;
                        }
                        if (iArr2[i27] == i19) {
                            z18 = true;
                            break;
                        }
                        i27++;
                    }
                    if (z18 && ((yVar = (p13.y) hashMap2.get(java.lang.Long.valueOf(zVar.f351186d))) == null || o13.n.b(o13.d.f342232r, zVar.f351185c, yVar.f351185c) < 0)) {
                        hashMap2.put(java.lang.Long.valueOf(zVar.f351186d), zVar);
                    }
                }
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    H.close();
                    throw new java.lang.InterruptedException();
                }
            }
        }
        H.close();
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        vVar.f351160e = new java.util.ArrayList(hashMap.size());
        for (p13.z zVar2 : hashMap.values()) {
            zVar2.a();
            zVar2.b(vVar.f351159d);
            com.tencent.mm.plugin.fts.logic.l.n(zVar2);
            vVar.f351160e.add(zVar2);
        }
        vVar.f351160e.addAll(hashMap2.values());
        if (java.lang.Thread.interrupted() || this.f351066f) {
            throw new java.lang.InterruptedException();
        }
        java.util.Comparator comparator = uVar.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f351160e, comparator);
        }
    }
}
