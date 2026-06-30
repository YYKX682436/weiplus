package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class uw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uw f128156d = new com.tencent.mm.plugin.finder.storage.uw();

    public uw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3600, "同城tab预加载缓存过期时间", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_timeline_lbs_samecity_tab_preload_cache_expried_time_sec, false, 2, null);
        aVar.a("FINDER_TIMELINE_LBS_SAMECITY_PRELOAD_CACHE_EXPRIED_TIME", kz5.c0.i(60, 3600), kz5.c0.i("60秒", "3600秒"));
        return aVar;
    }
}
