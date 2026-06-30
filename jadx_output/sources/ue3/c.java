package ue3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ue3.c f426892a = new ue3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f426893b = new java.util.HashMap();

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushStorageFactory", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public final synchronized jc3.t a(java.lang.String bizName, java.lang.String str) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        com.tencent.mm.plugin.magicbrush.d6 d6Var = (com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class));
        if (d6Var.f147911d == 0) {
            d6Var.f147911d = com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.b().h() : gm0.m.i();
        }
        int i17 = d6Var.f147911d;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushStorageFactory", "getOrCreateBizStorage uin invalid bizName:%s", bizName);
            return null;
        }
        jc3.u0 u0Var = jc3.u0.f298996a;
        if (!jc3.u0.f298999d.contains(bizName) || str == null) {
            return b(bizName, i17);
        }
        synchronized (this) {
            java.util.List list = (java.util.List) f426893b.get(bizName);
            if (list == null || !list.contains(str)) {
                return null;
            }
            return b(str, i17);
        }
    }

    public final jc3.t b(java.lang.String bizName, int i17) {
        java.util.Map map = ue3.f.f426898c;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String str = i17 + '-' + bizName;
        java.util.Map map2 = ue3.f.f426898c;
        synchronized (map2) {
            if (!((java.util.LinkedHashMap) map2).keySet().contains(str)) {
                map2.put(str, new ue3.f(i17, bizName, "MagicBrushMMKVStorage#" + bizName + '#'));
            }
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) map2).get(str);
        kotlin.jvm.internal.o.d(obj);
        return (ue3.f) obj;
    }
}
