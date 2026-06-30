package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class f6 extends i95.w implements com.tencent.mm.plugin.magicbrush.f4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f147937d;

    public f6() {
        jz5.l lVar = new jz5.l("MagicSimpleDemo", kz5.p0.f313996d);
        jz5.l lVar2 = new jz5.l("MagicLiveCard", kz5.c0.i(new md3.s(), new ce3.a("MagicLiveCard"), new ce3.d("MagicLiveCard"), new rd3.k(), new rd3.j(), new sd3.c(), new sd3.b(), new md3.o(), new md3.m()));
        kd3.c cVar = kd3.c.f306874a;
        jz5.l lVar3 = new jz5.l("MagicBrandService", cVar.a("MagicBrandService"));
        jz5.l lVar4 = new jz5.l("MagicAdBrandService", cVar.a("MagicAdBrandService"));
        jz5.l lVar5 = new jz5.l("MagicSclDemo", cVar.a("MagicAdBrandService"));
        jz5.l lVar6 = new jz5.l("MagicAdLandPage", kz5.n0.t0(kz5.c0.i(new ce3.a("MagicAdLandPage"), new ce3.d("MagicAdLandPage"), new rd3.k(), new rd3.j(), new sd3.c(), new sd3.b(), new vd3.d(), new vd3.f()), kz5.c0.i(new md3.a0(), new md3.b0(), new md3.c(), new md3.o(), new qd3.b(), new md3.t(), new md3.s())));
        jz5.l lVar7 = new jz5.l("MagicReward", kz5.c0.i(new vd3.f(), new vd3.d()));
        ld3.b bVar = ld3.b.f318104a;
        this.f147937d = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, new jz5.l("MagicFinderCard", bVar.a()), new jz5.l("MagicNativeFinderCard", bVar.a()), new jz5.l("MagicGameLoading", kz5.c0.i(new ce3.d("MagicGameLoading"), new ce3.a("MagicGameLoading"), new vd3.f(), new vd3.d())), new jz5.l("MagicAdPublicService", kz5.c0.i(new ce3.d("MagicAdPublicService"), new ce3.a("MagicAdPublicService"), new vd3.f(), new vd3.d())), new jz5.l("MagicSclPublicService", kz5.c0.i(new vd3.f(), new vd3.d())), new jz5.l("MagicSclNativeDemo", kz5.c0.i(new ce3.d("MagicSclNativeDemo"), new ce3.a("MagicSclNativeDemo"), new vd3.f(), new vd3.d())), new jz5.l("MagicWxGameDynamicCard", kz5.c0.i(new ce3.d("MagicWxGameDynamicCard"), new ce3.a("MagicWxGameDynamicCard"), new vd3.f(), new vd3.d(), new rd3.k(), new rd3.j(), new sd3.c(), new rd3.e(), new sd3.b(), new md3.o(), new md3.t(), new md3.s(), new md3.a0(), new md3.b0(), new md3.z(), new be3.b(), new nd3.b())), new jz5.l("MagicAdMiniProgram", kz5.c0.i(new vd3.f(), new vd3.d(), new vd3.c(), new rd3.k(), new rd3.j(), new md3.o(), new md3.t(), new md3.c(), new md3.a0(), new ce3.a("MagicAdMiniProgram"), new md3.b0(), new lq0.d(), new lq0.g(), new lq0.e(), new lq0.a(), new md3.s(), new ld3.a())), new jz5.l("MagicEcsKFDynamicCard", kz5.c0.i(new ce3.d("MagicEcsKFDynamicCard"), new ce3.a("MagicEcsKFDynamicCard"), new vd3.f(), new vd3.d(), new md3.q(), new md3.u(), new md3.l(), new md3.t(), new rd3.k(), new sd3.c(), new sd3.b(), new md3.a0(), new md3.b0(), new md3.c(), new rd3.j(), new md3.o(), new qd3.b(), new vd3.c(), new rd3.e())), new jz5.l("MagicEcsTimeline", cVar.a("MagicEcsTimeline")), new jz5.l("MagicEcsShop", cVar.a("MagicEcsShop")), new jz5.l("MagicEcsTimelineSubscribe", cVar.a("MagicEcsTimelineSubscribe")));
    }

    public final java.util.List Ai() {
        return kz5.c0.i(new gd3.b(), new zd3.k(), new zd3.o(), new zd3.c(), new zd3.f(), new zd3.m());
    }

    public final java.util.List Bi() {
        return kz5.c0.i(new fd3.b(id3.c.class), new fd3.b(id3.e.class), new fd3.b(id3.i.class), new fd3.b(id3.g.class), new fd3.b(id3.m.class), new fd3.b(id3.k.class));
    }

    public final java.util.List Di() {
        return kz5.c0.i(new pd3.d(), new pd3.f(), new pd3.b(), new pd3.e());
    }

    public java.util.List Ni(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.List list = (java.util.List) this.f147937d.get(key);
        return list == null ? kz5.p0.f313996d : list;
    }

    public final java.util.List Ri() {
        return kz5.c0.i(new ud3.o(), new ud3.g(), new ud3.j(), new ud3.p(), new ud3.l(), new ud3.k(), new ud3.e(), new ud3.f(), new ud3.m(), new ud3.n(), new ud3.h(), new ud3.i());
    }

    public final java.util.List wi() {
        return kz5.c0.i(new hd3.b(), new hd3.e(), new hd3.i(), new hd3.l(), new ed3.b(), new hd3.a(), new wd3.a(), new wd3.b(), new td3.a(), new td3.b());
    }
}
