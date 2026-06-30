package com.tencent.mm.protobuf;

/* loaded from: classes8.dex */
public final class m extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f192169d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f192170e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f192171f;

    public m(yz5.a onClear, yz5.q onPut, yz5.p onRemove) {
        kotlin.jvm.internal.o.g(onClear, "onClear");
        kotlin.jvm.internal.o.g(onPut, "onPut");
        kotlin.jvm.internal.o.g(onRemove, "onRemove");
        this.f192169d = onClear;
        this.f192170e = onPut;
        this.f192171f = onRemove;
    }

    public final void a(java.lang.Iterable entries) {
        kotlin.jvm.internal.o.g(entries, "entries");
        java.util.Iterator it = entries.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            super.put(lVar.f302833d, lVar.f302834e);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f192169d.invoke();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.f192170e.invoke(obj, obj2, java.lang.Boolean.valueOf(get(obj) != 0));
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map from) {
        kotlin.jvm.internal.o.g(from, "from");
        for (java.util.Map.Entry entry : from.entrySet()) {
            java.lang.Object key = entry.getKey();
            this.f192170e.invoke(key, entry.getValue(), java.lang.Boolean.valueOf(get(key) != 0));
        }
        super.putAll(from);
    }

    @Override // java.util.HashMap, java.util.Map
    public java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        if (get(obj) == 0) {
            this.f192170e.invoke(obj, obj2, java.lang.Boolean.FALSE);
        }
        return super.putIfAbsent(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object obj2 = get(obj);
        if (obj2 != null) {
            this.f192171f.invoke(obj, obj2);
        }
        return super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        this.f192171f.invoke(obj, obj2);
        return super.remove(obj, obj2);
    }
}
