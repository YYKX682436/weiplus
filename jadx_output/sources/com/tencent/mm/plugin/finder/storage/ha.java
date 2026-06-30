package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ha extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ha f126880d = new com.tencent.mm.plugin.finder.storage.ha();

    public ha() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "视频号屏蔽Feed中的公众号链接", "FINDER_DISABLE_FEED_MP_LINK", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_disable_feed_mp_link, false, 2, null);
        return aVar;
    }
}
