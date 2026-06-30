package w0;

/* loaded from: classes10.dex */
public final class u implements w0.s {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f441863a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f441864b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f441865c;

    public u(java.util.Map map, yz5.l canBeSaved) {
        kotlin.jvm.internal.o.g(canBeSaved, "canBeSaved");
        this.f441863a = canBeSaved;
        java.util.Map t17 = map == null ? null : kz5.c1.t(map);
        this.f441864b = t17 == null ? new java.util.LinkedHashMap() : t17;
        this.f441865c = new java.util.LinkedHashMap();
    }

    @Override // w0.s
    public java.util.Map a() {
        java.util.Map t17 = kz5.c1.t(this.f441864b);
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f441865c).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            int i17 = 0;
            if (list.size() == 1) {
                java.lang.Object invoke = ((yz5.a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!b(invoke)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    t17.put(str, kz5.c0.d(invoke));
                }
            } else {
                int size = list.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                while (i17 < size) {
                    int i18 = i17 + 1;
                    java.lang.Object invoke2 = ((yz5.a) list.get(i17)).invoke();
                    if (invoke2 != null && !b(invoke2)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                    i17 = i18;
                }
                t17.put(str, arrayList);
            }
        }
        return t17;
    }

    @Override // w0.s
    public boolean b(java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        return ((java.lang.Boolean) this.f441863a.invoke(value)).booleanValue();
    }

    @Override // w0.s
    public java.lang.Object c(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Map map = this.f441864b;
        java.util.List list = (java.util.List) map.remove(key);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            map.put(key, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // w0.s
    public w0.r d(java.lang.String key, yz5.a valueProvider) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(valueProvider, "valueProvider");
        if (!(!r26.n0.N(key))) {
            throw new java.lang.IllegalArgumentException("Registered key is empty or blank".toString());
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f441865c;
        java.lang.Object obj = linkedHashMap.get(key);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(key, obj);
        }
        ((java.util.List) obj).add(valueProvider);
        return new w0.t(this, key, valueProvider);
    }
}
