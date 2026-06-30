package gt;

/* loaded from: classes7.dex */
public class j5 implements hm0.w {
    @Override // hm0.w
    public void onNetworkChange(int i17) {
        if (gm0.j1.a()) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                java.util.List k17 = com.tencent.mm.plugin.appbrand.task.u0.C().k();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : k17) {
                    if (!((com.tencent.mm.plugin.appbrand.task.k) obj).k()) {
                        arrayList.add(obj);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) it.next();
                    java.util.Iterator it6 = ((java.util.ArrayList) kVar.g()).iterator();
                    while (it6.hasNext()) {
                        com.tencent.luggage.sdk.processes.h.q(kVar, new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNetworkChangeMessage((java.lang.String) it6.next()), null, 2, null);
                    }
                }
            }
            q81.z.i().j();
        }
    }
}
