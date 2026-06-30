package g73;

/* loaded from: classes15.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.w f269337d = new g73.w();

    public w() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f269314g;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((com.tencent.mm.plugin.handoff.model.HandOff) entry.getValue()).getHandOffType() == 2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it6 = linkedHashMap.keySet().iterator();
        while (it6.hasNext()) {
            g73.o0.f269314g.remove((java.lang.String) it6.next());
        }
        if (!linkedHashMap.isEmpty()) {
            g73.m2 m2Var = g73.o0.f269320p;
            java.util.Collection handOffList = linkedHashMap.values();
            m2Var.getClass();
            kotlin.jvm.internal.o.g(handOffList, "handOffList");
            java.util.Iterator it7 = handOffList.iterator();
            while (it7.hasNext()) {
                m2Var.d((com.tencent.mm.plugin.handoff.model.HandOff) it7.next());
            }
        }
        return jz5.f0.f302826a;
    }
}
