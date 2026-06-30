package nl0;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        nl0.d dVar = nl0.c.f338159a;
        dVar.getClass();
        dVar.f338163d.A("KeyNodeInfo", "DELETE FROM KeyNodeInfo where happen_time<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        nl0.a aVar = nl0.c.f338160b;
        aVar.getClass();
        java.lang.String str = "DELETE FROM FewShotLearning where time<=" + (java.lang.System.currentTimeMillis() - 15552000000L);
        l75.k0 k0Var = aVar.f338158d;
        k0Var.A("FewShotLearning", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("MomentVideo");
        arrayList.add("LiveHomeRedDot");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            int i17 = 0;
            int y07 = aVar.y0(str2, 0);
            int y08 = aVar.y0(str2, 1);
            int i18 = y07 > 1500 ? y07 - 1500 : 0;
            if (y08 > 1500) {
                i17 = y08 - 1500;
            }
            k0Var.A("FewShotLearning", "DELETE FROM FewShotLearning WHERE rowid IN (SELECT rowid FROM FewShotLearning WHERE label=0 AND model=='" + str2 + "' ORDER BY time LIMIT " + i18 + ");");
            k0Var.A("FewShotLearning", "DELETE FROM FewShotLearning WHERE rowid IN (SELECT rowid FROM FewShotLearning WHERE label=1 AND model=='" + str2 + "' ORDER BY time LIMIT " + i17 + ");");
        }
        nl0.f fVar = nl0.c.f338161c;
        fVar.getClass();
        java.lang.String str3 = "DELETE FROM PredictResultCache where save_time<=" + (java.lang.System.currentTimeMillis() - 86400000);
        l75.k0 k0Var2 = fVar.f338167d;
        kotlin.jvm.internal.o.d(k0Var2);
        k0Var2.A("PredictResultCache", str3);
    }
}
