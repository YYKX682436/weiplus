package rx3;

/* loaded from: classes10.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final rx3.s a(int i17, java.lang.Object obj) {
        if (i17 == 0) {
            return null;
        }
        if (obj == null) {
            return (rx3.s) ((java.util.LinkedHashMap) rx3.s.f401053c).get(java.lang.Integer.valueOf(i17));
        }
        java.util.Map map = rx3.s.f401054d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj2 = linkedHashMap.get(valueOf);
        if (obj2 == null) {
            obj2 = new java.util.LinkedHashSet();
            linkedHashMap.put(valueOf, obj2);
        }
        java.util.Set set = (java.util.Set) obj2;
        set.add(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataLoader", "obtain type:" + i17 + ", holder:" + obj + ", refCount:" + set.size());
        java.util.Map map2 = rx3.s.f401053c;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map2;
        java.lang.Object obj3 = linkedHashMap2.get(valueOf2);
        if (obj3 == null) {
            obj3 = i17 == 1 ? new rx3.z() : new rx3.u();
            linkedHashMap2.put(valueOf2, obj3);
        }
        return (rx3.s) obj3;
    }
}
