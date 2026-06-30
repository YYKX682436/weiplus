package mt1;

/* loaded from: classes12.dex */
public final class m implements wu5.j {
    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "CalcWxNewService.EventRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList<jz5.l> arrayList;
        long K1 = mt1.b0.f331191a.n().K1();
        java.util.HashSet hashSet = mt1.b0.f331196f;
        synchronized (hashSet) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((java.lang.Number) ((jz5.l) next).f302834e).longValue() > K1) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(next);
                }
            }
            mt1.b0.f331196f.clear();
            mt1.b0.f331197g = false;
        }
        try {
            ot1.j n17 = mt1.b0.f331191a.n();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (jz5.l lVar : arrayList) {
                arrayList2.add(new m3.d(lVar.f302833d, lVar.f302834e));
            }
            n17.z0(new java.util.HashSet(arrayList2), true, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CalcWxNewService", e17, "Mark dirty failed: " + arrayList, new java.lang.Object[0]);
        }
    }
}
