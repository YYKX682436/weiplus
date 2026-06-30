package g73;

/* loaded from: classes15.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.handoff.model.HandOff f269339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        super(0);
        this.f269339d = handOff;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g73.o0.f269316i.removeMessages(1);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f269314g;
        com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f269339d;
        com.tencent.mm.plugin.handoff.model.HandOff handOff2 = (com.tencent.mm.plugin.handoff.model.HandOff) concurrentHashMap.get(handOff.getKey());
        if (handOff2 != null && handOff2.update(handOff)) {
            g73.o0 o0Var = g73.o0.f269311d;
            if (g73.o0.wi(o0Var) || g73.o0.Ai(o0Var, handOff)) {
                g73.m2 m2Var = g73.o0.f269320p;
                m2Var.getClass();
                com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "mod " + handOff2.getId());
                java.util.Map map = m2Var.f269300q;
                if (!map.containsKey(handOff2.getKey())) {
                    map.put(handOff2.getKey(), java.lang.Boolean.TRUE);
                    m2Var.f269301r.put(handOff2.getKey(), handOff2.getId());
                }
                m2Var.f269299p.remove(handOff2.getKey());
                java.util.Map map2 = m2Var.f269297n;
                if (map2.containsKey(handOff2.getKey())) {
                    java.lang.Object obj = ((java.util.LinkedHashMap) map2).get(handOff2.getKey());
                    kotlin.jvm.internal.o.d(obj);
                    ((com.tencent.mm.plugin.handoff.model.HandOff) obj).update(handOff2);
                } else {
                    m2Var.f269298o.put(handOff2.getKey(), handOff2);
                }
                m2Var.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
