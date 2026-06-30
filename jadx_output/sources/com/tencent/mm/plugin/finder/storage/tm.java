package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class tm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.tm f128093d = new com.tencent.mm.plugin.finder.storage.tm();

    public tm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号poi详情页是否跳转地图页", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_poi_redirect_to_map, false, 2, null);
        aVar.a("FINDER_POI_REDIRECT_TO_MAP", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
