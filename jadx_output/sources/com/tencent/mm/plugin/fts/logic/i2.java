package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class i2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137565q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.fts.logic.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f137565q = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTalkerMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 28;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        p13.u uVar = this.f351135n;
        java.lang.String str = uVar.f351141c;
        com.tencent.mm.plugin.fts.logic.l2 l2Var = this.f137565q;
        vVar.f351159d = p13.r.c(str, false, l2Var.f137618t);
        p13.r b17 = p13.r.b(uVar.f351143e, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor Q = ((w13.b) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(b17, null, o13.d.f342225k, o13.d.f342229o);
        while (Q.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.f351187e = Q.getString(0);
            zVar.f351184b = Q.getInt(1);
            zVar.f351185c = Q.getInt(2);
            zVar.f351203u = b17;
            zVar.f351197o = 1;
            if (!hashMap.containsKey(zVar.f351187e)) {
                hashMap.put(zVar.f351187e, zVar);
            }
            if (hashMap.size() > 100) {
                break;
            }
        }
        Q.close();
        o("findHitContact");
        android.database.Cursor O = l2Var.f137609h.O(vVar.f351159d, null, hashMap.keySet());
        java.util.HashMap hashMap2 = new java.util.HashMap();
        while (((android.database.CursorWrapper) O).moveToNext()) {
            p13.z zVar2 = new p13.z();
            zVar2.d(O);
            zVar2.f351203u = vVar.f351159d;
            zVar2.f351197o = 1;
            java.util.HashMap hashMap3 = hashMap2.containsKey(zVar2.f351189g) ? (java.util.HashMap) hashMap2.get(zVar2.f351189g) : new java.util.HashMap();
            if (hashMap3.containsKey(zVar2.f351187e)) {
                p13.y yVar = (p13.y) hashMap3.get(zVar2.f351187e);
                int intValue = ((java.lang.Integer) yVar.f351197o).intValue() + 1;
                if (yVar.f351188f < zVar2.f351188f) {
                    zVar2.f351197o = java.lang.Integer.valueOf(intValue);
                    hashMap3.put(zVar2.f351187e, zVar2);
                } else {
                    yVar.f351197o = java.lang.Integer.valueOf(intValue);
                    hashMap3.put(yVar.f351187e, yVar);
                }
            } else {
                hashMap3.put(zVar2.f351187e, zVar2);
            }
            hashMap2.put(zVar2.f351189g, hashMap3);
        }
        ((com.tencent.mm.plugin.fts.e) O).close();
        vVar.f351160e = new java.util.ArrayList();
        for (p13.y yVar2 : hashMap.values()) {
            if (hashMap2.containsKey(yVar2.f351187e)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(((java.util.HashMap) hashMap2.get(yVar2.f351187e)).values());
                java.util.Collections.sort(arrayList, uVar.f351150l);
                yVar2.f351197o = arrayList;
                yVar2.f351188f = ((p13.y) arrayList.get(0)).f351188f;
                vVar.f351160e.add(yVar2);
            }
        }
        java.util.Collections.sort(vVar.f351160e, uVar.f351150l);
        o("findHitMessage");
    }
}
