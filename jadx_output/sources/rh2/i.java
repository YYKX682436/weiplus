package rh2;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final rh2.i f395653d = new rh2.i();

    @Override // java.lang.Runnable
    public final void run() {
        rh2.j jVar = rh2.j.f395654a;
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        kotlin.jvm.internal.o.d(e0Var);
        jVar.a(e0Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : rh2.j.f395655b) {
            if (((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_4e2919fe", (java.lang.String) ((jz5.l) obj).f302833d) == null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KWSResourceLoader", "[prefetch] all resources cached locally");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[prefetch] triggering UDR download: ");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) ((jz5.l) it.next()).f302833d);
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i("MicroMsg.KWSResourceLoader", sb6.toString());
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_4e2919fe");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            jz5.l lVar = (jz5.l) it6.next();
            java.util.LinkedList linkedList = qVar.f217548e;
            if (linkedList != null) {
                linkedList.add(lVar.f302833d);
            }
        }
        ((com.tencent.mm.udr.a1) e0Var).Di(qVar, new rh2.h(e0Var));
    }
}
