package wy5;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f450655a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f450656b = new java.util.HashMap();

    public final java.util.HashMap a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = this.f450656b;
        if (!hashMap2.isEmpty()) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            for (java.lang.String str : hashMap2.keySet()) {
                hashMap3.put(str, hashMap2.get(str));
            }
            hashMap.put("params", hashMap3);
        }
        java.util.ArrayList arrayList = this.f450655a;
        if (!arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wy5.b bVar = (wy5.b) it.next();
                bVar.getClass();
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("route_type", java.lang.Integer.valueOf(bVar.f450657a));
                hashMap4.put("route_rule", java.lang.Integer.valueOf(bVar.f450658b));
                hashMap4.put("is_rt_report", java.lang.Boolean.valueOf(bVar.f450659c));
                hashMap4.put("is_batch_report", java.lang.Boolean.valueOf(bVar.f450660d));
                arrayList2.add(hashMap4);
            }
            hashMap.put("bind_route_infos", arrayList2);
        }
        return hashMap;
    }
}
