package va1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final va1.b f434229a = new va1.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f434230b = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    public final void a(java.lang.String instanceId, java.lang.String str, java.lang.String name, long j17, long j18, java.lang.String str2) {
        java.lang.String str3;
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuditsUtil", "instanceId: %s, appId: %s, name: %s, start: %d, end : %d, args: %s", instanceId, str, name, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str2);
        com.tencent.mm.plugin.appbrand.performance.l lVar = new com.tencent.mm.plugin.appbrand.performance.l();
        lVar.f87356a = str;
        lVar.f87357b = "Native";
        lVar.f87359d = name;
        lVar.f87358c = "X";
        lVar.f87360e = j17;
        lVar.f87361f = j18;
        if (str2 == null || (str3 = fp.s0.a(str2)) == null) {
            str3 = "";
        }
        lVar.f87362g = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuditsUtil", "traceEvent, instanceId: %s, appId: %s, name: %s, start: %d, end : %d, args: %s", instanceId, str, name, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str2);
        java.util.Map auditsTraceExtraDataMap = f434230b;
        kotlin.jvm.internal.o.f(auditsTraceExtraDataMap, "auditsTraceExtraDataMap");
        synchronized (auditsTraceExtraDataMap) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuditsUtil", "addEventToMap, event is " + lVar);
            if (!auditsTraceExtraDataMap.containsKey(instanceId)) {
                auditsTraceExtraDataMap.put(instanceId, new java.util.ArrayList());
            }
            java.util.List list = (java.util.List) auditsTraceExtraDataMap.get(instanceId);
            if (list != null) {
                list.add(lVar);
            }
        }
    }
}
