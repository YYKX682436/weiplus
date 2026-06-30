package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class e1 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.f1 f137512q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.fts.logic.f1 f1Var, p13.u uVar, com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$1 fTS5SearchFeatureLogic$1) {
        super(uVar);
        this.f137512q = f1Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchFeatureTask";
    }

    @Override // p13.c
    public int k() {
        return 12;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        boolean z17;
        p13.u uVar = this.f351135n;
        vVar.f351159d = p13.r.b(uVar.f351141c, true);
        vVar.f351160e = new java.util.ArrayList();
        boolean z18 = vVar.f351159d.f351130b.getBytes(java.nio.charset.StandardCharsets.UTF_8).length >= 4;
        com.tencent.mm.plugin.fts.logic.f1 f1Var = this.f137512q;
        if (z18 && uVar.f351140b == 97) {
            android.database.Cursor H = f1Var.f137530g.H(vVar.f351159d, o13.d.f342217c, null, java.lang.String.valueOf(39), false, false);
            try {
                z17 = !H.moveToFirst();
            } finally {
                H.close();
            }
        } else {
            z17 = true;
        }
        if (z17) {
            java.util.HashSet hashSet = new java.util.HashSet();
            android.database.Cursor H2 = f1Var.f137530g.H(vVar.f351159d, o13.d.f342217c, uVar.f351146h, null, true, true);
            while (H2.moveToNext()) {
                p13.z zVar = new p13.z();
                zVar.c(H2);
                if (!hashSet.contains(java.lang.Long.valueOf(zVar.f351186d)) && !uVar.f351148j.contains(zVar.f351187e)) {
                    zVar.a();
                    vVar.f351160e.add(zVar);
                    hashSet.add(java.lang.Long.valueOf(zVar.f351186d));
                }
            }
            H2.close();
            java.util.Comparator comparator = uVar.f351150l;
            if (comparator != null) {
                java.util.Collections.sort(vVar.f351160e, comparator);
            }
            for (p13.y yVar : vVar.f351160e) {
                yVar.f351197o = f1Var.f137530g.N((int) yVar.f351186d);
            }
        }
        java.util.Set Ui = ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ui();
        if (f1Var.f137531h != null) {
            java.util.HashSet hashSet2 = (java.util.HashSet) Ui;
            if (hashSet2.isEmpty()) {
                return;
            }
            android.database.Cursor R = f1Var.f137531h.R(vVar.f351159d, new int[]{131072});
            java.util.HashSet hashSet3 = new java.util.HashSet(uVar.f351148j);
            java.util.Iterator it = vVar.f351160e.iterator();
            while (it.hasNext()) {
                hashSet3.add(((p13.y) it.next()).f351187e);
            }
            while (R.moveToNext()) {
                java.lang.String string = R.getString(4);
                if (hashSet2.contains(string) && !hashSet3.contains(string)) {
                    hashSet3.add(string);
                    p13.z zVar2 = new p13.z();
                    zVar2.c(R);
                    zVar2.f351184b = 262144;
                    zVar2.a();
                    p13.f fVar = new p13.f();
                    fVar.field_featureId = 98;
                    fVar.field_title = o13.n.d(string);
                    fVar.field_actionType = 1;
                    zVar2.f351197o = fVar;
                    vVar.f351160e.add(zVar2);
                }
            }
            R.close();
        }
    }
}
