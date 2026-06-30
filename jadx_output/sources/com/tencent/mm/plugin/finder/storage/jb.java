package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jb f126999d = new com.tencent.mm.plugin.finder.storage.jb();

    public jb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "Profile首屏cache过期URL过滤", "FINDER_ENABLE_PROFILE_CACHE_URL_VALID_FILTER", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_enable_profile_cache_url_valid_filter, false, 2, null);
        return aVar;
    }
}
