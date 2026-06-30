package ud3;

/* loaded from: classes7.dex */
public final class c {
    public final java.util.HashMap a(lc3.a0 data, java.lang.String metaInstanceName) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String optString = data.optString("key");
        java.lang.String str3 = null;
        java.lang.String optString2 = data.optString("instanceName", null);
        com.tencent.mars.xlog.Log.i("MBGetLocalDataImpl", "key:" + optString + ",instanceName:" + optString2);
        try {
            jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString2 != null ? r26.n0.s0(optString2, "-", optString2) : null);
            if (wi6 == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", lc3.y.f317939a);
                return hashMap;
            }
            java.lang.Object[] b17 = ((ue3.f) wi6).b(optString);
            java.lang.Object obj = b17[0];
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
            lc3.z zVar = (lc3.z) obj;
            lc3.z zVar2 = lc3.x.f317934a;
            if (kotlin.jvm.internal.o.b(zVar, zVar2)) {
                java.lang.Object obj2 = b17[1];
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (java.lang.String) obj2;
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.o.b(zVar, zVar2)) {
                java.lang.Object obj3 = b17[2];
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                str2 = (java.lang.String) obj3;
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.o.b(zVar, zVar2)) {
                java.lang.Object obj4 = b17[3];
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                str3 = (java.lang.String) obj4;
            }
            if (kotlin.jvm.internal.o.b(zVar, zVar2) && str != null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("error", zVar2);
                hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
                hashMap2.put("type", str2);
                hashMap2.put("size", str3);
                return hashMap2;
            }
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("error", zVar);
            return hashMap3;
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.e("MBGetLocalDataImpl", "get local data oom, reason:" + e17.getMessage());
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("error", lc3.y.f317943e);
            return hashMap4;
        }
    }
}
