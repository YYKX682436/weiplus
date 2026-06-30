package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class uh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uh f128139d = new com.tencent.mm.plugin.finder.storage.uh();

    public uh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "LoaderStateStore的缓存是否改为LruCache", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_loader_state_store_lru_cache, false, 2, null);
        aVar.a("FINDER_LOADER_STATE_STORE_LRU_CACHE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
