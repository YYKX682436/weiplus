package ro1;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397994d;

    public m(int i17) {
        this.f397994d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l lVar;
        java.util.List b17 = ro1.v.f398014a.b();
        ro1.t tVar = ro1.t.f398008d;
        java.util.List list = ro1.t.f398012h;
        boolean isEmpty = list.isEmpty();
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (isEmpty) {
            lVar = new jz5.l(p0Var, new java.util.ArrayList(b17));
        } else {
            java.util.ArrayList arrayList = (java.util.ArrayList) b17;
            if (arrayList.isEmpty()) {
                lVar = new jz5.l(new java.util.ArrayList(list), p0Var);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!arrayList.contains((po1.d) obj)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (!list.contains((po1.d) next)) {
                        arrayList3.add(next);
                    }
                }
                lVar = new jz5.l(arrayList2, arrayList3);
            }
        }
        java.util.List list2 = (java.util.List) lVar.f302833d;
        java.util.List list3 = (java.util.List) lVar.f302834e;
        if (list2.isEmpty() && list3.isEmpty()) {
            ro1.t.f398008d.a(this.f397994d + 1);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Found storage volumes changed: removed device(%s), added device(%s)", list2, list3);
        ((ku5.t0) ku5.t0.f312615d).B(new ro1.l(list3, list2));
        ro1.t.f398012h = b17;
    }
}
