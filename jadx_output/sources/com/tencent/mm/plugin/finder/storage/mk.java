package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mk f127202d = new com.tencent.mm.plugin.finder.storage.mk();

    public mk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(7, "附近双流预加载阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_nearby_feed_stream_preload_threshold_count, false, 2, null);
        aVar.a("FINDER_NEARBY_FEED_STREAM_PRELOAD_THRESHLOD_COUNT", kz5.c0.i(3, 5, 7, 9), kz5.c0.i("3", "5", "7", "9"));
        return aVar;
    }
}
