package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pe f127367d = new com.tencent.mm.plugin.finder.storage.pe();

    public pe() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号接入全局缓存自动清理框架", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_global_cache_cleaner_enable, false, 2, null);
        aVar.a("FINDER_GLOBAL_CACHE_CLEANER_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "开启"));
        return aVar;
    }
}
