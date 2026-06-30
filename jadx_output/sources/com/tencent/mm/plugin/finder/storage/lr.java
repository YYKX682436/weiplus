package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lr f127151d = new com.tencent.mm.plugin.finder.storage.lr();

    public lr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "搜索预加载延迟秒数", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_rel_search_preload, false, 2, null);
        aVar.a("FINDER_SEARCH_PRELOAD_DELAY_SEC", kz5.c0.i(0, 5, 10, -1), kz5.c0.i("立即预加载", "延迟5s", "延迟10s", "无预加载"));
        return aVar;
    }
}
