package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes6.dex */
public final class z6 extends i95.w implements com.tencent.mm.plugin.magicbrush.k4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f148226d = kz5.c1.i(new jz5.l("MagicSclPublicService", com.tencent.mm.plugin.magicbrush.w6.f148191d), new jz5.l("MagicEcsPublicService", com.tencent.mm.plugin.magicbrush.x6.f148207d), new jz5.l("MagicAdPublicService", com.tencent.mm.plugin.magicbrush.y6.f148211d));

    public jc3.a0 wi(java.lang.String serviceId) {
        kotlin.jvm.internal.o.g(serviceId, "serviceId");
        com.tencent.mars.xlog.Log.i("MagicBrushPublicService", "providePublicServiceDelegate for ".concat(serviceId));
        yz5.a aVar = (yz5.a) this.f148226d.get(serviceId);
        jc3.a0 a0Var = aVar != null ? (jc3.a0) aVar.invoke() : null;
        if (a0Var != null) {
            return a0Var;
        }
        com.tencent.mars.xlog.Log.e("MagicBrushPublicService", "provide service delegate not found");
        return new com.tencent.mm.plugin.magicbrush.v6();
    }
}
