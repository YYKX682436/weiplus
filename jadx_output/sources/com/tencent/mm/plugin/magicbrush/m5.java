package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class m5 extends i95.w implements com.tencent.mm.plugin.magicbrush.d4 {
    public jc3.k0 Ai(java.lang.String instanceName, java.lang.String pkgPath, java.lang.String customName, java.lang.String str) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        kotlin.jvm.internal.o.g(customName, "customName");
        com.tencent.mm.plugin.magicbrush.fs.k kVar = com.tencent.mm.plugin.magicbrush.fs.k.f147979a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        jc3.k0 k0Var = (jc3.k0) com.tencent.mm.plugin.magicbrush.fs.k.f147980b.get(lowerCase);
        if (k0Var != null) {
            k0Var.Vf(pkgPath, customName, str);
        }
        return k0Var;
    }

    public java.lang.String Bi(java.lang.String instanceName, java.lang.String nonFlattenFilePath) {
        java.lang.String X3;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(nonFlattenFilePath, "nonFlattenFilePath");
        com.tencent.mm.plugin.magicbrush.fs.k kVar = com.tencent.mm.plugin.magicbrush.fs.k.f147979a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        jc3.k0 k0Var = (jc3.k0) com.tencent.mm.plugin.magicbrush.fs.k.f147980b.get(lowerCase);
        return (k0Var == null || (X3 = k0Var.X3(nonFlattenFilePath)) == null) ? "" : X3;
    }

    public bf3.p Di(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new bf3.z(context);
    }

    public lc3.b0 Ni(com.tencent.mm.plugin.appbrand.jsapi.f jsapi, java.lang.String appId) {
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return new bf3.q0(jsapi, appId);
    }

    public void wi(java.lang.String instanceName) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        com.tencent.mm.plugin.magicbrush.fs.k kVar = com.tencent.mm.plugin.magicbrush.fs.k.f147979a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.util.HashMap hashMap = com.tencent.mm.plugin.magicbrush.fs.k.f147980b;
        if (hashMap.containsKey(lowerCase)) {
            jc3.k0 k0Var = (jc3.k0) hashMap.get(lowerCase);
            if (k0Var != null) {
                k0Var.s7(lowerCase);
                return;
            }
            return;
        }
        java.util.HashMap hashMap2 = com.tencent.mm.plugin.magicbrush.fs.k.f147981c;
        if (hashMap2.containsKey(lowerCase)) {
            jc3.k0 k0Var2 = (jc3.k0) hashMap2.get(lowerCase);
            if (k0Var2 != null) {
                k0Var2.s7(lowerCase);
            }
            synchronized (kVar) {
                hashMap2.remove(lowerCase);
            }
        }
    }
}
