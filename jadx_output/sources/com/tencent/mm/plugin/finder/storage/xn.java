package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xn f128320d = new com.tencent.mm.plugin.finder.storage.xn();

    public xn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "预加载过滤已读剩下feed数则丢弃", null, null, 12, null);
        aVar.b("FinderPrefetchFilterMinFeedCount");
        aVar.a("FINDER_PREFETCH_FILTER_MIN_FEED_COUNT", kz5.c0.i(1, 3, 6), kz5.c0.i("1", "3", "6"));
        return aVar;
    }
}
