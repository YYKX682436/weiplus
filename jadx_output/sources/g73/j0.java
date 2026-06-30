package g73;

/* loaded from: classes15.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.util.List list) {
        super(0);
        this.f269279d = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HandOffService", "restore from multiTaskInfoList");
        g73.o0.f269314g.clear();
        g73.o0.f269315h.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f269279d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.handoff.model.HandOff a17 = h73.a.f279484a.a((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next());
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) it6.next();
            arrayList2.add(new jz5.l(handOff.getKey(), handOff));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f269314g;
        kz5.c1.r(arrayList2, concurrentHashMap);
        try {
            g73.m2 m2Var = g73.o0.f269320p;
            java.util.Collection values = concurrentHashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            m2Var.e(values);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HandOffService", e17, "restoreFromMultiTaskInfoList fail, exp:%s", e17);
        }
        return jz5.f0.f302826a;
    }
}
