package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nh0 f127255d = new com.tencent.mm.plugin.finder.storage.nh0();

    public nh0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "撤回预加载feed是否需要feed超过1个", "FINDER_REMOVE_CACHE_FEED_WHEN_SIZE_MORE_THAN_ONE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_remove_cacbe_feed_when_feed_size_more_than_one, false, 2, null);
        return aVar;
    }
}
