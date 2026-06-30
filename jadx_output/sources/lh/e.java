package lh;

/* loaded from: classes12.dex */
public final class e implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.AccPowerStats f318593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318594b;

    public e(com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats, int i17) {
        this.f318593a = accPowerStats;
        this.f318594b = i17;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        java.util.Map asMutable;
        java.util.Map asMutable2;
        java.util.Map stringListMap = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(stringListMap, "stringListMap");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : stringListMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            for (m3.d dVar : (java.util.List) entry.getValue()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.Class cls = (java.lang.Class) dVar.f323092a;
                sb6.append(cls == gi.y1.class ? "ThreadPool" : cls == gi.g1.class ? "MMHanlder" : cls == gi.v0.class ? "Ipc" : cls == kh.k1.class ? "Looper" : cls.getSimpleName());
                sb6.append('-');
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                java.lang.Long l17 = (java.lang.Long) hashMap.get(sb7);
                long longValue = l17 != null ? l17.longValue() : 0L;
                java.lang.Object obj2 = dVar.f323093b;
                kotlin.jvm.internal.o.d(obj2);
                java.lang.Number number = ((rh.f) ((rh.o2) obj2).f395486c).f395377g.f395552a;
                kotlin.jvm.internal.o.f(number, "get(...)");
                hashMap.put(sb7, java.lang.Long.valueOf(longValue + number.longValue()));
            }
        }
        java.lang.String g17 = ri.i.g(bm5.f1.a());
        com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = this.f318593a;
        asMutable = accPowerStats.asMutable(accPowerStats.getAccTaskStats());
        kotlin.jvm.internal.o.d(g17);
        java.lang.Object obj3 = asMutable.get(g17);
        if (obj3 == null) {
            obj3 = new java.util.LinkedHashMap();
            asMutable.put(g17, obj3);
        }
        java.util.Map map = (java.util.Map) obj3;
        for (java.util.Map.Entry entry2 : kz5.n0.K0(((java.util.LinkedHashMap) wh.m.B(hashMap, lh.d.f318592d)).entrySet(), this.f318594b)) {
            asMutable2 = accPowerStats.asMutable(map);
            java.lang.Object key = entry2.getKey();
            java.lang.Object obj4 = map.get(entry2.getKey());
            if (obj4 == null) {
                obj4 = 0L;
            }
            asMutable2.put(key, java.lang.Long.valueOf(((java.lang.Number) obj4).longValue() + ((java.lang.Number) entry2.getValue()).longValue()));
        }
    }
}
