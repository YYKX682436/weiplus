package n81;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f335618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.Map map) {
        super(0);
        this.f335618d = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map map = this.f335618d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), java.lang.Long.valueOf(n81.p.a(n81.p.f335628a, (java.util.List) entry.getValue())));
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((java.lang.Number) entry2.getValue()).longValue() > 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
