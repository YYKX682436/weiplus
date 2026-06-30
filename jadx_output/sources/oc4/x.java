package oc4;

/* loaded from: classes4.dex */
public final class x extends java.util.TreeMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f344373d;

    public x(int i17) {
        super(oc4.w.f344372d);
        this.f344373d = i17;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean containsKey = super.containsKey((java.lang.String) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return containsKey;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof oc4.s)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean containsValue = super.containsValue((oc4.s) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return containsValue;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ java.util.Set entrySet() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("entrySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEntries", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        java.util.Set entrySet = super.entrySet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEntries", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("entrySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return entrySet;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        oc4.s sVar = (oc4.s) super.get((java.lang.String) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return sVar;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return obj2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        oc4.s sVar = (oc4.s) super.getOrDefault((java.lang.String) obj, (oc4.s) obj2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOrDefault", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return sVar;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ java.util.Set keySet() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("keySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKeys", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        java.util.Set keySet = super.keySet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeys", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keySet", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return keySet;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        oc4.s sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        java.lang.String key = (java.lang.String) obj;
        oc4.s value = (oc4.s) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(key, "18446744073709551615") || r26.n0.B(key, "*", false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            sVar = null;
        } else {
            sVar = (oc4.s) super.put(key, value);
            if (size() > this.f344373d) {
                java.util.Set keySet = keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                remove(kz5.n0.h0(keySet));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return sVar;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        oc4.s sVar = (oc4.s) super.remove((java.lang.String) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return sVar;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("size", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSize", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        int size = super.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSize", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("size", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return size;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ java.util.Collection values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValues", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        java.util.Collection values = super.values();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValues", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return values;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        if (!(obj == null ? true : obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        if (!(obj2 != null ? obj2 instanceof oc4.s : true)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        boolean remove = super.remove((java.lang.String) obj, (oc4.s) obj2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap");
        return remove;
    }
}
