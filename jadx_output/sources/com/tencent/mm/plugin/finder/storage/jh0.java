package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jh0 f127012d = new com.tencent.mm.plugin.finder.storage.jh0();

    public jh0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "撤回红点时是否删除3tab流的预加载数据", "FINDER_REMOVE_CACHE_FEED_WHEN_REVOKE_REDDOT", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_remove_cacbe_feed_when_revoke_reddot, false, 2, null);
        return aVar;
    }
}
