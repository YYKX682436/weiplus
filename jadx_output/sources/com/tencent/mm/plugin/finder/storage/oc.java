package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class oc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oc f127305d = new com.tencent.mm.plugin.finder.storage.oc();

    public oc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "Feed描述区POI置灰不可点开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_finder_feed_poi_gray_disable, false, 2, null);
        aVar.a("FINDER_FEED_POI_GRAY_DISABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
