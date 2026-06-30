package kc2;

/* loaded from: classes15.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.q f306467d;

    public p(kc2.q qVar) {
        this.f306467d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        kc2.q qVar = this.f306467d;
        qVar.e(concurrentHashMap, linkedList, linkedList2);
        int i17 = 0;
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            int i18 = 0;
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue();
                kc2.l[] lVarArr = kc2.l.f306452d;
                if (intValue == 1) {
                    i18++;
                }
            }
            i17 = i18;
        }
        qVar.f306476g = i17;
        concurrentHashMap.forEach(new kc2.o(qVar));
        qVar.f306475f.clear();
        qVar.f306475f.addAll(linkedList);
        qVar.f306477h.clear();
        qVar.f306477h.addAll(linkedList2);
        com.tencent.mars.xlog.Log.i(qVar.f306472c, "updateBusinessInfo businessCnt=" + qVar.f306476g + ",businessSeq=" + qVar.f306475f);
    }
}
