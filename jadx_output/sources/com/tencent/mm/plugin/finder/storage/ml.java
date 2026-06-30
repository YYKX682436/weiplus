package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ml extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ml f127203d = new com.tencent.mm.plugin.finder.storage.ml();

    public ml() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "3tab退出时仅缓存当前tab的feed", "FINDER_ONLY_CACHE_ACTIVE_TAB_FEED", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_only_cache_active_tab_feed_config, false, 2, null);
        return aVar;
    }
}
