package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class kh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.kh0 f127075d = new com.tencent.mm.plugin.finder.storage.kh0();

    public kh0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "撤回红点时是否删除预加载feed", "FINDER_REMOVE_CACHE_FEED_WHEN_REVOKE_REDDOT_ALL_PATH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_remove_cacbe_feed_when_revoke_reddot_all_path, false, 2, null);
        return aVar;
    }
}
