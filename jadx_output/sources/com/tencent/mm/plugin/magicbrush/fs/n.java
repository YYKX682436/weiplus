package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.fs.s f147986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.magicbrush.fs.s sVar, java.lang.String str) {
        super(0);
        this.f147986d = sVar;
        this.f147987e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.fs.s sVar = this.f147986d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f147996c;
        java.lang.String str = this.f147987e;
        com.tencent.mm.plugin.magicbrush.fs.a aVar = (com.tencent.mm.plugin.magicbrush.fs.a) concurrentHashMap.get(str);
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = aVar != null ? aVar.f147944a : null;
        if (y8Var != null) {
            return y8Var;
        }
        for (java.util.Map.Entry entry : sVar.f147996c.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.magicbrush.fs.a aVar2 = (com.tencent.mm.plugin.magicbrush.fs.a) entry.getValue();
            if (r26.i0.A(str2, str, false, 2, null)) {
                return aVar2.f147944a;
            }
        }
        return null;
    }
}
