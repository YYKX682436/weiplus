package com.tencent.mm.wexnet;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.wexnet.v f214379a = new com.tencent.mm.wexnet.v();

    public final boolean a() {
        java.lang.String lowerCase = b("ro.soc.model").toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        com.tencent.mm.wexnet.x xVar = com.tencent.mm.wexnet.y.f214380a;
        return com.tencent.mm.wexnet.y.f214382c.keySet().contains(lowerCase);
    }

    public final java.lang.String b(java.lang.String str) {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class);
            kotlin.jvm.internal.o.f(method, "getMethod(...)");
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, str);
            if (invoke == null) {
                return "";
            }
            java.lang.String obj = invoke.toString();
            return obj == null ? "" : obj;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UDRXNetNPULibsHelper", " getBuildPropByReflect: " + th6);
            return "";
        }
    }

    public final java.lang.String c() {
        java.lang.String b17 = b("ro.soc.model");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = b17.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        com.tencent.mm.wexnet.x xVar = com.tencent.mm.wexnet.y.f214380a;
        java.util.Map map = com.tencent.mm.wexnet.y.f214382c;
        if (!map.keySet().contains(lowerCase)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", " [getNPULibDir]: cannot support ro_soc_model=".concat(lowerCase));
            return "";
        }
        java.lang.String str = (java.lang.String) map.get(lowerCase);
        if (str == null) {
            str = "";
        }
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_57353131", str);
        java.lang.Long l17 = (java.lang.Long) com.tencent.mm.wexnet.y.f214381b.get(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" [getNPULibDir]: resName=");
        sb6.append(str);
        sb6.append(" localResVersion=");
        sb6.append(l17);
        sb6.append("  resourceVersion=");
        sb6.append(Ui != null ? Ui.f217590e : -1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", sb6.toString());
        if (Ui != null) {
            long j17 = Ui.f217590e;
            if (l17 != null && j17 == l17.longValue()) {
                ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).getClass();
                java.lang.String o17 = new com.tencent.mm.vfs.r6(Ui.c(), "unpack").o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                return o17;
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_xnet_npu_udr_switch, 0) != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", " [CheckResourceTask]: clicfg_android_xnet_npu_udr_switch=false");
        } else {
            java.lang.String lowerCase2 = b("ro.soc.model").toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
            if (a()) {
                long j18 = com.tencent.mm.sdk.platformtools.o4.L().getLong("key_last_xnet_udr_check_resource_time", 0L);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (java.lang.System.currentTimeMillis() - j18 < 43200000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", " [CheckResourceTask]: not reach time interval. lastCheckResourceTime=" + j18 + " check_resource_time_interval=43200000");
                } else {
                    com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
                    qVar.c("ilinkres_57353131");
                    java.util.LinkedList linkedList = qVar.f217548e;
                    if (linkedList != null) {
                        java.lang.String str3 = (java.lang.String) map.get(lowerCase2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        linkedList.add(str3);
                    }
                    java.util.LinkedList linkedList2 = qVar.f217549f;
                    if (linkedList2 != null) {
                        linkedList2.addAll(d());
                    }
                    ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new com.tencent.mm.wexnet.u());
                    com.tencent.mm.sdk.platformtools.o4.L().putLong("key_last_xnet_udr_check_resource_time", java.lang.System.currentTimeMillis());
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", " [CheckResourceTask]: cannot support ro_soc_model=".concat(lowerCase2));
            }
        }
        return "";
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
        vVar.d("ro_soc_model");
        java.lang.String lowerCase = b("ro.soc.model").toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        vVar.f217583i = lowerCase;
        vVar.f217584m[6] = true;
        vVar.e(4);
        arrayList.add(vVar);
        return arrayList;
    }
}
