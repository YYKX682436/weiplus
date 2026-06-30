package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.fs.k f147979a = new com.tencent.mm.plugin.magicbrush.fs.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f147980b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f147981c = new java.util.HashMap();

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushFileSystemFactory", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public static /* synthetic */ jc3.k0 b(com.tencent.mm.plugin.magicbrush.fs.k kVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            list = null;
        }
        return kVar.a(str, str2, str3, u1Var, list);
    }

    public final jc3.k0 a(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list) {
        jc3.k0 eVar;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.util.HashMap hashMap = f147980b;
        if (hashMap.containsKey(lowerCase)) {
            eVar = (jc3.k0) hashMap.get(lowerCase);
            if (eVar == null) {
                synchronized (this) {
                    hashMap.remove(lowerCase);
                }
                eVar = new com.tencent.mm.plugin.magicbrush.fs.e(lowerCase, str, str2, u1Var, list);
                synchronized (this) {
                    hashMap.put(lowerCase, eVar);
                }
            } else {
                eVar.J(lowerCase, str, str2, u1Var, list);
            }
        } else {
            eVar = new com.tencent.mm.plugin.magicbrush.fs.e(lowerCase, str, str2, u1Var, list);
            synchronized (this) {
                hashMap.put(lowerCase, eVar);
            }
        }
        return eVar;
    }
}
