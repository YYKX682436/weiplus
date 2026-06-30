package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class y5 extends i95.w implements com.tencent.mm.plugin.magicbrush.q4 {
    public com.tencent.mm.plugin.appbrand.appstorage.u1 wi(java.lang.String instanceName) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        com.tencent.mm.plugin.magicbrush.fs.k kVar = com.tencent.mm.plugin.magicbrush.fs.k.f147979a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.util.HashMap hashMap = com.tencent.mm.plugin.magicbrush.fs.k.f147980b;
        if (hashMap.containsKey(lowerCase)) {
            return (jc3.k0) hashMap.get(lowerCase);
        }
        java.util.HashMap hashMap2 = com.tencent.mm.plugin.magicbrush.fs.k.f147981c;
        if (hashMap2.containsKey(lowerCase)) {
            return (jc3.k0) hashMap2.get(lowerCase);
        }
        return null;
    }
}
