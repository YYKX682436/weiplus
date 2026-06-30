package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class bg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.bg f126528d = new com.tencent.mm.plugin.finder.storage.bg();

    public bg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "热门loading时不展示本地缓存占位", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_hot_show_no_cache_when_loading, false, 2, null);
        aVar.a("FINDER_HOT_SHOW_NO_CACHE_WHEN_LOADING", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
