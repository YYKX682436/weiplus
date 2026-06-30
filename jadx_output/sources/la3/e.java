package la3;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final la3.e f317525a = new la3.e();

    public final la3.d a(int i17, java.util.Map map, la3.a aVar) {
        if (map == null) {
            return new la3.d(i17, "", 0, 0, 0, false, "", aVar);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!(map.isEmpty())) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (!(str == null || str.length() == 0) && value != null) {
                    linkedHashMap.put(str, value);
                }
            }
        }
        java.lang.Object obj = linkedHashMap.get("url");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = obj2 == null ? "" : obj2;
        java.lang.Object obj3 = linkedHashMap.get("appUuid");
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj3).intValue();
        java.lang.Object obj4 = linkedHashMap.get("pageId");
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((java.lang.Integer) obj4).intValue();
        java.lang.Object obj5 = linkedHashMap.get("nodeId");
        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue3 = ((java.lang.Integer) obj5).intValue();
        java.lang.Object obj6 = linkedHashMap.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT);
        boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1(obj6 instanceof java.lang.Boolean ? (java.lang.Boolean) obj6 : null);
        java.lang.Object obj7 = linkedHashMap.get("appId");
        java.lang.String obj8 = obj7 != null ? obj7.toString() : null;
        return new la3.d(i17, str2, intValue, intValue2, intValue3, n17, obj8 == null ? "" : obj8, aVar);
    }
}
