package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ty extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ty f128104d = new com.tencent.mm.plugin.finder.storage.ty();

    public ty() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否使用Lru优化FinderWxProfileManager缓存", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_wx_profile_manager_lru_cache, false, 2, null);
        aVar.a("FINDER_WX_PROFILE_MANAGER_OPT", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
