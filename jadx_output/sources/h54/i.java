package h54;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h54.i f279096a = new h54.i();

    public final java.util.Map a(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toMapWithoutNullKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (map == null || map.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMapWithoutNullKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
            return linkedHashMap;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!(str == null || str.length() == 0) && value != null) {
                linkedHashMap.put(str, value);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMapWithoutNullKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        return linkedHashMap;
    }
}
