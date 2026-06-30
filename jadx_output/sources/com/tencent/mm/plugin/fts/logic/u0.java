package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class u0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137685q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137685q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchContactLabelTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        p13.r b17 = p13.r.b(uVar.f351141c, true);
        vVar.f351159d = b17;
        android.database.Cursor R = this.f137685q.f137588g.R(b17, uVar.f351145g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet(uVar.f351148j);
        int i17 = 0;
        while (R.moveToNext()) {
            if (hashSet.add(R.getString(4))) {
                p13.z zVar = new p13.z();
                zVar.c(R);
                if (i17 >= zVar.f351185c) {
                    arrayList.add(zVar);
                } else {
                    if (arrayList.size() > uVar.f351147i) {
                        break;
                    }
                    i17 = zVar.f351185c;
                    arrayList.add(zVar);
                }
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    R.close();
                    throw new java.lang.InterruptedException("Task is Cancel: " + uVar.f351141c);
                }
            }
        }
        R.close();
        vVar.f351160e = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.z zVar2 = (p13.z) it.next();
            zVar2.a();
            vVar.f351160e.add(zVar2);
        }
    }
}
