package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.fs.s f147990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.magicbrush.fs.s sVar, java.lang.String str) {
        super(0);
        this.f147990d = sVar;
        this.f147991e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.fs.s sVar = this.f147990d;
        sVar.getClass();
        java.lang.String str = this.f147991e;
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
        if (!y8Var.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushPkgMergeDirReader", "guardedMergeModule readInfo file, customName:" + sVar.f147994a + ", pkgPath:" + str);
        }
        com.tencent.mm.plugin.magicbrush.fs.o oVar = new com.tencent.mm.plugin.magicbrush.fs.o(sVar);
        for (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info : y8Var.j()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f147996c;
            java.lang.String fileName = wxaPkg$Info.f75389e;
            kotlin.jvm.internal.o.f(fileName, "fileName");
            com.tencent.mm.plugin.magicbrush.fs.a aVar = new com.tencent.mm.plugin.magicbrush.fs.a();
            aVar.f147944a = y8Var;
            aVar.f147945b = y8Var.b();
            aVar.f147946c = wxaPkg$Info.f75389e;
            aVar.f147947d = wxaPkg$Info.f75390f;
            aVar.f147948e = wxaPkg$Info.f75391g;
            oVar.invoke(aVar);
            concurrentHashMap.put(fileName, aVar);
        }
        return jz5.f0.f302826a;
    }
}
