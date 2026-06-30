package dk2;

/* loaded from: classes12.dex */
public final class fb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f233463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f233464e;

    public fb(java.util.List list, dk2.tb tbVar) {
        this.f233463d = list;
        this.f233464e = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.List list = this.f233463d;
        int size = list.size();
        dk2.tb tbVar = this.f233464e;
        if (size == ((java.util.LinkedList) tbVar.f234124e).size()) {
            java.util.Iterator it = list.iterator();
            z17 = true;
            while (it.hasNext()) {
                if (!((java.util.LinkedList) tbVar.f234124e).contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()))) {
                    z17 = false;
                }
            }
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "enableCmdIds old: " + tbVar.d(tbVar.f234124e) + " new:" + tbVar.d(list) + ' ' + tbVar.c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int intValue = ((java.lang.Number) obj).intValue();
            if (!((java.util.LinkedList) tbVar.f234124e).contains(java.lang.Integer.valueOf(intValue))) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            tbVar.g(((java.lang.Number) it6.next()).intValue(), false, true);
        }
        java.util.List list2 = tbVar.f234124e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (!list.contains(java.lang.Integer.valueOf(((java.lang.Number) obj2).intValue()))) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            tbVar.g(((java.lang.Number) it7.next()).intValue(), true, false);
        }
        ((java.util.LinkedList) tbVar.f234124e).clear();
        ((java.util.LinkedList) tbVar.f234124e).addAll(list);
        dk2.tb.b(tbVar);
    }
}
