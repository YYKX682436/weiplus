package ou2;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final pu2.b f348935a = new pu2.b();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f348936b = new java.util.LinkedHashMap();

    public void a(ts5.m calculator, ts5.p uniqueTag, boolean z17) {
        java.util.List arrayList;
        kotlin.jvm.internal.o.g(calculator, "calculator");
        kotlin.jvm.internal.o.g(uniqueTag, "uniqueTag");
        ts5.a aVar = uniqueTag.f421741a;
        java.util.List list = (java.util.List) this.f348936b.remove(uniqueTag);
        if (!z17) {
            if (list == null || list.isEmpty()) {
                com.tencent.mars.xlog.Log.e("TraceWorker", "#calculateAndReport data stream not exist. uniqueTag=" + uniqueTag);
                return;
            }
        }
        if (list == null) {
            try {
                arrayList = new java.util.ArrayList();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("TraceWorker", e17.toString());
                return;
            }
        } else {
            arrayList = list;
        }
        org.json.JSONObject a17 = calculator.a(kotlin.jvm.internal.m0.b(arrayList), uniqueTag);
        int ordinal = aVar.ordinal();
        pu2.b bVar = this.f348935a;
        if (ordinal == 1) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("sample_size", java.lang.Integer.valueOf(list != null ? list.size() : 0));
            bVar.a(uniqueTag, new pu2.a(2002, 0, a17, linkedHashMap));
        } else if (ordinal == 2) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("sample_size", java.lang.Integer.valueOf(list != null ? list.size() : 0));
            bVar.a(uniqueTag, new pu2.a(2003, 0, a17, linkedHashMap2));
        } else {
            int ordinal2 = aVar.ordinal();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put("sample_size", java.lang.Integer.valueOf(list != null ? list.size() : 0));
            bVar.a(uniqueTag, new pu2.a(ordinal2, 0, a17, linkedHashMap3));
        }
    }
}
