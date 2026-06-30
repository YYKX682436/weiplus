package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b00 f126493d = new com.tencent.mm.plugin.finder.storage.b00();

    public b00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "赞行为触发轮播开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_carousel_trigger_android, false, 2, null);
        aVar.a("FinderLikeToPlayCarouselType", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("0-不触发", "1-拇指赞触发", "2-爱心赞触发", "3-拇指赞爱心赞均可触发"));
        return aVar;
    }
}
