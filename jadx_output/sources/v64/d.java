package v64;

/* loaded from: classes4.dex */
public class d implements java.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f433539d;

    public d() {
        this.f433539d = new android.util.ArrayMap();
    }

    public java.lang.Object a(java.lang.String str, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        try {
            java.lang.Object obj2 = ((android.util.ArrayMap) this.f433539d).get(str);
            if (obj2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
                return obj2;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return obj;
    }

    public java.lang.Object b(java.lang.String str, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (str == null || obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return null;
        }
        java.lang.Object put = ((android.util.ArrayMap) this.f433539d).put(str, obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return put;
    }

    @Override // java.util.Map
    public void clear() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        ((android.util.ArrayMap) this.f433539d).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean z17 = false;
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return false;
        }
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (str != null) {
            z17 = ((android.util.ArrayMap) this.f433539d).containsKey(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return z17;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containsValue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean containsValue = ((android.util.ArrayMap) this.f433539d).containsValue(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containsValue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return containsValue;
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("entrySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.util.Set entrySet = ((android.util.ArrayMap) this.f433539d).entrySet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("entrySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return entrySet;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return null;
        }
        java.lang.Object obj2 = ((android.util.ArrayMap) this.f433539d).get(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return obj2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean isEmpty = ((android.util.ArrayMap) this.f433539d).isEmpty();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return isEmpty;
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("keySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.util.Set keySet = ((android.util.ArrayMap) this.f433539d).keySet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return keySet;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.lang.Object b17 = b((java.lang.String) obj, obj2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return b17;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putAll", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (a84.b0.f(map)) {
            ((android.util.ArrayMap) this.f433539d).putAll(map);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putAll", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (obj instanceof java.lang.String) {
            ((android.util.ArrayMap) this.f433539d).remove(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return null;
    }

    @Override // java.util.Map
    public int size() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("size", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        int size = ((android.util.ArrayMap) this.f433539d).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("size", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return size;
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.util.Collection values = ((android.util.ArrayMap) this.f433539d).values();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return values;
    }

    public d(java.lang.String str, java.lang.Object obj) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        this.f433539d = arrayMap;
        arrayMap.put(str, obj);
    }
}
