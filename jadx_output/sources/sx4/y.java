package sx4;

/* loaded from: classes8.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f413667a = new java.util.HashMap();

    public static java.lang.String a(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        int intValue = ((java.lang.Integer) java.util.Collections.max(map.keySet())).intValue();
        int min = java.lang.Math.min(intValue, 200);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int intValue2 = ((java.lang.Integer) java.util.Collections.min(map.keySet())).intValue(); intValue2 <= min; intValue2++) {
            java.lang.Object obj = map.get(java.lang.Integer.valueOf(intValue2));
            if (obj == null) {
                stringBuffer.append("");
            } else {
                stringBuffer.append(obj);
            }
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(java.lang.String str, sx4.z zVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(new sx4.x());
        if (zVar != null) {
            java.util.Map M1 = zVar.M1();
            if (M1 != null) {
                treeMap.putAll(M1);
            }
            java.util.Map w57 = zVar.w5();
            if (w57 != null) {
                treeMap.putAll(w57);
            }
        }
        java.util.Map map = (java.util.Map) ((java.util.HashMap) f413667a).remove(str);
        if (map != 0) {
            map.putAll(treeMap);
            treeMap = map;
        }
        boolean booleanValue = treeMap.containsKey(1000) ? ((java.lang.Boolean) treeMap.remove(1000)).booleanValue() : true;
        java.lang.String a17 = a(treeMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebReport", "report web performance. isReportNow: %b, reportData: [%s]", java.lang.Boolean.valueOf(booleanValue), a17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.f(16142, a17, booleanValue, false);
    }
}
